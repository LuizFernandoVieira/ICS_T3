import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Gui extends Frame implements ActionListener {

	Button traduz; 
	Button escolhe;
	Button arquiva;
	Button toca;
	JFileChooser chooser;
	TextField mensagem;
	TextArea dadosMidi;
	JOptionPane option;
	Frame frame;
	Facade fachada;

	public Gui(Facade facade){
		this.fachada = facade;
		
		setLayout(new FlowLayout());

		mensagem = new TextField("tradutor inicializado", 30);
		mensagem.setEditable(false);
		add(mensagem);

		dadosMidi = new TextArea("Dados do arquivo MIDI:" + System.lineSeparator() + "selecione um arquivo",12, 40);
		dadosMidi.setEditable(false);
		add(dadosMidi);

		chooser = new JFileChooser(System.getProperty("user.dir"));
		FileFilter filter = new FileNameExtensionFilter("MIDI file","mid");
		chooser.addChoosableFileFilter(filter);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		chooser.setFileFilter(filter);

		frame = new Frame();
		frame.setTitle("Nome do arquivo");
		
		escolhe = new Button("escolher arquivo MIDI");
		escolhe.addActionListener(this);
		
		traduz = new Button("traduzir arquivo");
		traduz.addActionListener(this);

		arquiva = new Button("criar arquivo .java");
		arquiva.addActionListener(this);

		toca = new Button("tocar som gerado");
		toca.addActionListener(this);
		
		add(escolhe);
		add(traduz);
		add(arquiva);
		add(toca);

		addWindowListener(new WindowAdapter(){
		  	public void windowClosing(WindowEvent e){
		  		System.exit(0);
		  	}
		});

		setTitle("Tradutor de arquivos MIDI");
		setSize(550,320);
		setVisible(true);
		setLocationRelativeTo(null);
		setBackground(new Color(198, 253, 255));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if (source == traduz) {
			fachada.traduz(this);
		} else if (source == arquiva) {
			fachada.geraArquivoJava(this);
		} else if (source == escolhe) {
			fachada.escolheArquivoMidi(this);
		} else if (source == toca) {
			fachada.toca(this);
		}
	}

}
