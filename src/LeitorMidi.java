import java.io.File;
import java.io.IOException;

import javax.sound.midi.*;

public class LeitorMidi {
	
	File midiFile;
	Sequencer sequenciador;
	Sequence sequencia;
	
	public LeitorMidi(){
		try{
			sequenciador = MidiSystem.getSequencer();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public void setArquivo(String nome){
		if ((midiFile!=null)&&(midiFile.getName().equals(nome)))
			return;
		midiFile = new File(nome);
		novaSequencia();
	}
	public void setArquivo(File file){
		if (midiFile == file)
			return;
		midiFile = file;
		novaSequencia();
	}
	public void novaSequencia(){
		try{
			sequencia = MidiSystem.getSequence(midiFile);
			sequenciador.setSequence(sequencia);
		}catch(IOException e1){
			e1.printStackTrace();
			sequencia = null;
		}catch(InvalidMidiDataException e2){
			e2.printStackTrace();
			sequencia = null;
		}
	}
	public Sequence getSequencia(){
		return sequencia;
	}
}
