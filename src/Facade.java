import javax.swing.*;
import java.io.File;

import javax.sound.midi.*;

import sintese.*;

public class Facade {
	
	LeitorMidi leitor;
	Tradutor tradutor;
	Sequence sequencia;
	Polifonia polifonia;
	Som som;
	
	public Facade() {
		leitor = new LeitorMidi();
		tradutor = new Tradutor();
	}
	
	public void traduz(Gui gui) {
		if(sequencia == null)
			gui.mensagem.setText("nao ha arquivo MIDI selecionado!");
		else{
			polifonia = tradutor.traduz(sequencia);
			gui.mensagem.setText("Polifonia gerada com sucesso");
		}
	}
	
	public void geraArquivoJava(Gui gui) {
		if(sequencia == null)
			gui.mensagem.setText("nao ha arquivo MIDI selecionado!");
		else if (polifonia == null)
			gui.mensagem.setText("arquivo nao foi traduzido!");
		else{
			String nome = JOptionPane.showInputDialog("Nome do arquivo(sem extencao):");
			if(nome==null){
				gui.mensagem.setText("nome do arquivo nao foi inserido!");
				return;
			}
			try{
				CriaArquivoJava.criaJava(polifonia, nome);
			}catch (Exception e){
				e.printStackTrace();
			}
			gui.mensagem.setText("arquivo Java criado com sucesso!");
		}
	}
	
	public void escolheArquivoMidi(Gui gui) {
		int result = gui.chooser.showOpenDialog(gui);
		if (result == JFileChooser.APPROVE_OPTION){
			File file = gui.chooser.getSelectedFile();
			leitor.setArquivo(file);
			sequencia = leitor.getSequencia();
			som = null;
			gui.mensagem.setText("arquivo selecionado com sucesso");
			gui.dadosMidi.setText("Dados do arquivo MIDI:"+System.lineSeparator()+"Nome: "+file.getName()+System.lineSeparator());
			DadosMidi dm = new DadosMidi();
			dm.exibirDados(sequencia, gui);	
		}
	}
	
	public void toca(Gui gui) {
		if(sequencia == null)
			gui.mensagem.setText("nao ha arquivo MIDI selecionado!");
		else if (polifonia == null)
			gui.mensagem.setText("arquivo nao foi traduzido!");
		else{
			if(som == null)
				som = polifonia.getSom();
			som.salvawave();
			som.visualiza();
		}
	}
}
