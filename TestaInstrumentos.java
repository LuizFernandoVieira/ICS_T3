import sintese.*;

public class TestaInstrumentos {
	public Instrumentos ins;
	
	public TestaInstrumentos(){
		ins = new Instrumentos();
		Som s1 = new Som(ins.i1);
		s1.salvawave();
		s1.tocawave();
		s1 = new Som(ins.i2);
		s1.salvawave();
		s1.tocawave();
		s1 = new Som(ins.i3);
		s1.salvawave();
		s1.tocawave();
		s1 = new Som(ins.i4);
		s1.salvawave();
		s1.tocawave();
	}
	
	public static void main(String[] args){
		new TestaInstrumentos();
	}
}

