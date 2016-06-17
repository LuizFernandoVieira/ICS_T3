
import java.io.*;
import sintese.*;

public class CriaJava {

	public CriaJava(){}

	static public void criaJava(Polifonia polifonia, String nome) throws IOException{
		Instrumentos ins = new Instrumentos();
		File java = new File(nome+".java");
		FileWriter fp = new FileWriter(java);
		fp.write("import sintese.*;");
		fp.write(System.lineSeparator());
		fp.write("public class "+nome+"{");//  classe{
		fp.write(System.lineSeparator());
		/**  inicializador **/
		fp.write("public "+nome+"()"+"{");//   inicializador{{
			fp.write("InstrumentoAditivo i1,i2,i3;");
			fp.write(System.lineSeparator());
			fp.write("Curva[][] curvas;");
			fp.write("Envoltoria[][] envoltorias;");
			fp.write("UnidadeH[][] unidades;");
			fp.write(System.lineSeparator());
			fp.write("curvas = new Curva[3][5];");
			fp.write("envoltorias = new Envoltoria[3][5];");
			fp.write("unidades = new UnidadeH[3][5];");
			fp.write(System.lineSeparator());
			fp.write("/*****  	Instrumento 1  *****/");
			fp.write(System.lineSeparator());
			fp.write("curvas[0][0] = new Curva(720);");
			fp.write("curvas[0][0].addPonto(0, 0);");
			fp.write("curvas[0][0].addPonto(30, 1000);");
			fp.write("curvas[0][0].addPonto(600,700);");
			fp.write("curvas[0][0].addPonto(720, 0);");
			fp.write(System.lineSeparator());
			fp.write("curvas[0][1] = new Curva(720);");
			fp.write("curvas[0][1].addPonto(0, 0);");
			fp.write("curvas[0][1].addPonto(50, 1000);");
			fp.write("curvas[0][1].addPonto(590,600);");
			fp.write("curvas[0][1].addPonto(720, 0);");
			fp.write(System.lineSeparator());
			fp.write("curvas[0][2] = new Curva(720);");
			fp.write("curvas[0][2].addPonto(0, 0);");
			fp.write("curvas[0][2].addPonto(40, 1000);");
			fp.write("curvas[0][2].addPonto(620,800);");
			fp.write("curvas[0][2].addPonto(720, 0);");
			fp.write(System.lineSeparator());
			fp.write("envoltorias[0][0] = new Envoltoria();");
			fp.write("envoltorias[0][0].setCURVA(curvas[0][0]);");
			fp.write("envoltorias[0][1] = new Envoltoria();");
			fp.write("envoltorias[0][1].setCURVA(curvas[0][1]);");
			fp.write("envoltorias[0][2] = new Envoltoria();");
			fp.write("envoltorias[0][2].setCURVA(curvas[0][2]);");
			fp.write(System.lineSeparator());
			fp.write("unidades[0][0] = new UnidadeH();");
			fp.write("unidades[0][0].setEnvoltoria(envoltorias[0][0]);");
			fp.write("unidades[0][0].setH(1);");
			fp.write("unidades[0][0].setLambda(0.5);");
			fp.write("unidades[0][0].setFase(0);");
			fp.write("unidades[0][0].setGanho(1f);");
			fp.write(System.lineSeparator());
			fp.write("unidades[0][1] = new UnidadeH();");
			fp.write("unidades[0][1].setEnvoltoria(envoltorias[0][1]);");
			fp.write("unidades[0][1].setH(2);");
			fp.write("unidades[0][1].setLambda(0.5);");
			fp.write("unidades[0][1].setFase(0);");
			fp.write("unidades[0][1].setGanho(0.7f);");
			fp.write(System.lineSeparator());
			fp.write("unidades[0][2] = new UnidadeH();");
			fp.write("unidades[0][2].setEnvoltoria(envoltorias[0][2]);");
			fp.write("unidades[0][2].setH(3);");
			fp.write("unidades[0][2].setLambda(0.5);");
			fp.write("unidades[0][2].setFase(0);");
			fp.write("unidades[0][2].setGanho(0.75f);");
			fp.write(System.lineSeparator());
			fp.write(System.lineSeparator());
			fp.write("i1 = new InstrumentoAditivo();");
			fp.write("i1.addUnidade(unidades[0][0]);");
			fp.write("i1.addUnidade(unidades[0][1]);");
			fp.write("i1.addUnidade(unidades[0][2]);");
			fp.write("i1.setGanho(0.7f);");
			fp.write(System.lineSeparator());
			fp.write("/*****  Instrumento 2  *****/");
			fp.write(System.lineSeparator());
			fp.write("curvas[1][0] = new Curva(720);");
			fp.write("curvas[1][0].addPonto(0, 0);");
			fp.write("curvas[1][0].addPonto(30, 1000);");
			fp.write("curvas[1][0].addPonto(600,700);");
			fp.write("curvas[1][0].addPonto(720, 0);");
			fp.write(System.lineSeparator());
			fp.write("curvas[1][1] = new Curva(720);");
			fp.write("curvas[1][1].addPonto(0, 0);");
			fp.write("curvas[1][1].addPonto(40, 1000);");
			fp.write("curvas[1][1].addPonto(400,600);");
			fp.write("curvas[1][1].addPonto(720, 0);");
			fp.write(System.lineSeparator());
			fp.write("curvas[1][2] = new Curva(720);");
			fp.write("curvas[1][2].addPonto(0, 0);");
			fp.write("curvas[1][2].addPonto(50, 1000);");
			fp.write("curvas[1][2].addPonto(620,700);");
			fp.write("curvas[1][2].addPonto(720, 0);");
			fp.write(System.lineSeparator());
			fp.write(System.lineSeparator());
			fp.write("envoltorias[1][0] = new Envoltoria();");
			fp.write("envoltorias[1][0].setCURVA(curvas[1][0]);");
			fp.write("envoltorias[1][1] = new Envoltoria();");
			fp.write("envoltorias[1][1].setCURVA(curvas[1][1]);");
			fp.write("envoltorias[1][2] = new Envoltoria();");
			fp.write("envoltorias[1][2].setCURVA(curvas[1][2]);");
			fp.write(System.lineSeparator());
			fp.write("unidades[1][0] = new UnidadeH();");
			fp.write("unidades[1][0].setEnvoltoria(envoltorias[1][0]);");
			fp.write("unidades[1][0].setH(1);");
			fp.write("unidades[1][0].setLambda(0.5);");
			fp.write("unidades[1][0].setFase(0);");
			fp.write("unidades[1][0].setGanho(1f);");
			fp.write(System.lineSeparator());
			fp.write("unidades[1][1] = new UnidadeH();");
			fp.write("unidades[1][1].setEnvoltoria(envoltorias[1][1]);");
			fp.write("unidades[1][1].setH(1.5);");
			fp.write("unidades[1][1].setLambda(0.5);");
			fp.write("unidades[1][1].setFase(0);");
			fp.write("unidades[1][1].setGanho(0.7f);");
			fp.write(System.lineSeparator());
			fp.write("unidades[1][2] = new UnidadeH();");
			fp.write("unidades[1][2].setEnvoltoria(envoltorias[1][2]);");
			fp.write("unidades[1][2].setH(3);");
			fp.write("unidades[1][2].setLambda(0.5);");
			fp.write("unidades[1][2].setFase(0);");
			fp.write("unidades[1][2].setGanho(0.6f);");
			fp.write(System.lineSeparator());
			fp.write("i2 = new InstrumentoAditivo();");
			fp.write("i2.addUnidade(unidades[1][0]);");
			fp.write("i2.addUnidade(unidades[1][1]);");
			fp.write("i2.addUnidade(unidades[1][2]);");
			fp.write("i2.setGanho(0.7f);");
			fp.write(System.lineSeparator());
			fp.write("/*****  	Instrumento 3  *****/");
			fp.write(System.lineSeparator());
			fp.write("curvas[2][0] = new Curva(720);");
			fp.write("curvas[2][0].addPonto(0, 0);");
			fp.write("curvas[2][0].addPonto(30,1000);");
			fp.write("curvas[2][0].addPonto(200,700);");
			fp.write("curvas[2][0].addPonto(720,0);");
			fp.write(System.lineSeparator());
			fp.write("curvas[2][1] = new Curva(720);");
			fp.write("curvas[2][1].addPonto(0, 0);");
			fp.write("curvas[2][1].addPonto(15,1000);");
			fp.write("curvas[2][1].addPonto(100,600);");
			fp.write("curvas[2][1].addPonto(720,0);");
			fp.write(System.lineSeparator());
			fp.write("curvas[2][2] = new Curva(720);");
			fp.write("curvas[2][2].addPonto(0,0);");
			fp.write("curvas[2][2].addPonto(10,1000);");
			fp.write("curvas[2][2].addPonto(60,500);");
			fp.write("curvas[2][2].addPonto(720,0);");
			fp.write(System.lineSeparator());
			fp.write(System.lineSeparator());
			fp.write("envoltorias[2][0] = new Envoltoria();");
			fp.write("envoltorias[2][0].setCURVA(curvas[2][0]);");
			fp.write("envoltorias[2][1] = new Envoltoria();");
			fp.write("envoltorias[2][1].setCURVA(curvas[2][1]);");
			fp.write("envoltorias[2][2] = new Envoltoria();");
			fp.write("envoltorias[2][2].setCURVA(curvas[2][2]);");
			fp.write(System.lineSeparator());
			fp.write("unidades[2][0] = new UnidadeH();");
			fp.write("unidades[2][0].setEnvoltoria(envoltorias[2][0]);");
			fp.write("unidades[2][0].setH(1);");
			fp.write("unidades[2][0].setLambda(0.5);");
			fp.write("unidades[2][0].setFase(0);");
			fp.write("unidades[2][0].setGanho(1);");
			fp.write(System.lineSeparator());
			fp.write("unidades[2][1] = new UnidadeH();");
			fp.write("unidades[2][1].setEnvoltoria(envoltorias[2][1]);");
			fp.write("unidades[2][1].setH(3);");
			fp.write("unidades[2][1].setLambda(0.5);");
			fp.write("unidades[2][1].setFase(0);");
			fp.write("unidades[2][1].setGanho(1f);");
			fp.write(System.lineSeparator());
			fp.write("unidades[2][2] = new UnidadeH();");
			fp.write("unidades[2][2].setEnvoltoria(envoltorias[2][2]);");
			fp.write("unidades[2][2].setH(5);");
			fp.write("unidades[2][2].setLambda(0.5);");
			fp.write("unidades[2][2].setFase(0);");
			fp.write("unidades[2][2].setGanho(0.5f);");
			fp.write(System.lineSeparator());
			fp.write("i3 = new InstrumentoAditivo();");
			fp.write("i3.addUnidade(unidades[2][0]);");
			fp.write("i3.addUnidade(unidades[2][1]);");
			fp.write("i3.addUnidade(unidades[2][2]);");
			fp.write("i3.setGanho(0.7f);");

			/** polifonia **/

			fp.write("Polifonia pol = new Polifonia();");
			fp.write(System.lineSeparator());
			fp.write("int numVoz = "+polifonia.getNumeroDeVozes()+";");
			fp.write(System.lineSeparator());
			fp.write("Voz[] vozes = new Voz[numVoz];");
			fp.write(System.lineSeparator());
			fp.write("Melodia mel = new Melodia();");
			fp.write(System.lineSeparator());
			int i = 0;

			while (i<polifonia.getNumeroDeVozes()){

				Melodia melodia = polifonia.getVoz(i).getMelodia(0);//fora
				Dispositivo id = polifonia.getVoz(i).getInstrumento();
				String inst = "i1";
				if(id == ins.i1)
					inst = "i1";
				if(id == ins.i2)
					inst = "i2";
				if(id == ins.i3)
					inst = "i3";
				fp.write("vozes["+i+"] = new Voz("+inst+");");
				fp.write(System.lineSeparator());
				fp.write("mel = new Melodia();");
				fp.write(System.lineSeparator());
				int j = 0;
				int numNota = melodia.getNumeroDeNotas();

				while (j<numNota){
					Nota nota = melodia.getNota(j);
					fp.write("mel.addNota(new Nota("+nota.getDuracao()+","+nota.getFrequencia()+","+nota.getAmplitude()+"));");
					fp.write(System.lineSeparator());
					j++;
				}
				fp.write("vozes["+i+"].addMelodia(mel);");
				i++;
			}
			fp.write("int i = 0;");
			fp.write(System.lineSeparator());
			fp.write("while (i<numVoz){");
			fp.write(System.lineSeparator());
			fp.write("pol.addVoz(vozes[i]);");
			fp.write(System.lineSeparator());
			fp.write("i++;");
			fp.write(System.lineSeparator());
			fp.write("}");
			fp.write(System.lineSeparator());
			fp.write("pol.setGanho(1f);");
			fp.write(System.lineSeparator());
			fp.write("Som som = pol.getSom();");
			fp.write(System.lineSeparator());
			fp.write("som.salvawave();");
			fp.write(System.lineSeparator());
			fp.write("som.visualiza();");
			fp.write(System.lineSeparator());
		fp.write("}");
		fp.write(System.lineSeparator());
		/** main **/
		fp.write("public static void main(String[] args) {");
		fp.write(System.lineSeparator());
			fp.write("new "+nome+"();");
			fp.write(System.lineSeparator());
		fp.write("}");
		fp.write(System.lineSeparator());
		fp.write("}");
		fp.write(System.lineSeparator());
		fp.close();
	}
}
