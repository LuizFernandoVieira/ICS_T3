import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Gui extends Frame {

	Button traduz, escolhe, arquiva, toca;
	JFileChooser chooser;
	TextField mensagem;
	TextArea dadosMidi;
	JOptionPane opt;
	Frame frame;

	public Gui(Facade facade){
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
		escolhe.addActionListener(facade);
		
		traduz = new Button("traduzir arquivo");
		traduz.addActionListener(facade);

		arquiva = new Button("criar arquivo .java");
		arquiva.addActionListener(facade);

		toca = new Button("tocar som gerado");
		toca.addActionListener(facade);
		
		add(escolhe);
		add(traduz);
		add(arquiva);
		add(toca);

		addWindowListener(new WindowAdapter(){
		  	public void windowClosing(WindowEvent e){
		  		System.exit(0);
		  	}
		});

		setTitle("Tradutor MIDI");
		setSize(550,320);
		setVisible(true);
		setLocationRelativeTo(null);
		setBackground(new Color(198, 253, 255));
	}

}
