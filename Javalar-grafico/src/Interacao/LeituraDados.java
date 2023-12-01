package Interacao;

import java.util.Scanner;

public class LeituraDados {
	private int qntBugs, qntDevs, qntInstantes, teste, qntInstantesTotal;
	private int[] bugs, devs, instantes, python, js, ruby, php, cSharp, cPlusPlus, c;
	protected Scanner teclado = new Scanner(System.in);
	
	//Remover dps
	public LeituraDados() {
		
	}

	public void limparBuffer() {
		teclado.nextLine();
	}
	
	public void lerBugs() throws java.util.InputMismatchException{
			this.setQntBugs(teclado.nextInt());	
		
	}

	public void lerDevs() {
		this.setQntDevs(teclado.nextInt());
	}
	
	public void lerInstantes() {
		this.setQntInstantes(teclado.nextInt());
	}
	
	public void lerTeste() {
		this.setTeste(teclado.nextInt());
	}
	
	public void getDados(String[][] dataMatrix) {
		startMatrix(dataMatrix);//incializa as arrays de strings 
			try {
				for (int i = 0; i < dataMatrix.length; i++) {
					bugs[i] = Integer.parseInt(dataMatrix[i][8]);
					devs[i] = Integer.parseInt(dataMatrix[i][9]);
					instantes[i] = Integer.parseInt(dataMatrix[i][0]);
					python[i] = Integer.parseInt(dataMatrix[i][1]);
					js[i] = Integer.parseInt(dataMatrix[i][2]);
					ruby[i] = Integer.parseInt(dataMatrix[i][3]);
					php[i] = Integer.parseInt(dataMatrix[i][4]);
					cSharp[i] = Integer.parseInt(dataMatrix[i][5]);
					cPlusPlus[i] = Integer.parseInt(dataMatrix[i][6]);
					c[i] = Integer.parseInt(dataMatrix[i][7]);
	
				}
			} catch (Exception e) {
				for (int i = 0; i < dataMatrix.length -1; i++) {
					bugs[i] = Integer.parseInt(dataMatrix[i][8]);
					devs[i] = Integer.parseInt(dataMatrix[i][9]);
					instantes[i] = Integer.parseInt(dataMatrix[i][0]);
					python[i] = Integer.parseInt(dataMatrix[i][1]);
					js[i] = Integer.parseInt(dataMatrix[i][2]);
					ruby[i] = Integer.parseInt(dataMatrix[i][3]);
					php[i] = Integer.parseInt(dataMatrix[i][4]);
					cSharp[i] = Integer.parseInt(dataMatrix[i][5]);
					cPlusPlus[i] = Integer.parseInt(dataMatrix[i][6]);
					c[i] = Integer.parseInt(dataMatrix[i][7]);
				}
			}
//				for (int i = 0; i < dataMatrix.length; i++) {
//					bugs[i] = Integer.parseInt(dataMatrix[i][8]);
//					devs[i] = Integer.parseInt(dataMatrix[i][9]);
//					instantes[i] = Integer.parseInt(dataMatrix[i][0]);
//					python[i] = Integer.parseInt(dataMatrix[i][1]);
//					js[i] = Integer.parseInt(dataMatrix[i][2]);
//					ruby[i] = Integer.parseInt(dataMatrix[i][3]);
//					php[i] = Integer.parseInt(dataMatrix[i][4]);
//					cSharp[i] = Integer.parseInt(dataMatrix[i][5]);
//					cPlusPlus[i] = Integer.parseInt(dataMatrix[i][6]);
//					c[i] = Integer.parseInt(dataMatrix[i][7]);
//	
//			}else {
//			for (int i = 0; i < dataMatrix.length -1; i++) {
//				bugs[i] = Integer.parseInt(dataMatrix[i][8]);
//				devs[i] = Integer.parseInt(dataMatrix[i][9]);
//				instantes[i] = Integer.parseInt(dataMatrix[i][0]);
//				python[i] = Integer.parseInt(dataMatrix[i][1]);
//				js[i] = Integer.parseInt(dataMatrix[i][2]);
//				ruby[i] = Integer.parseInt(dataMatrix[i][3]);
//				php[i] = Integer.parseInt(dataMatrix[i][4]);
//				cSharp[i] = Integer.parseInt(dataMatrix[i][5]);
//				cPlusPlus[i] = Integer.parseInt(dataMatrix[i][6]);
//				c[i] = Integer.parseInt(dataMatrix[i][7]);
//			}
//		}	
	}
	
	
	public void startMatrix(String[][] dataMatrix) {
		bugs = new int[dataMatrix.length];
		devs = new int[dataMatrix.length];
		instantes = new int[dataMatrix.length];
		python = new int[dataMatrix.length];
		js = new int[dataMatrix.length];
		ruby = new int[dataMatrix.length];
		php = new int[dataMatrix.length];
		cSharp = new int[dataMatrix.length];
		cPlusPlus = new int[dataMatrix.length];
		c = new int[dataMatrix.length];
	}
	
	public void setBug(int n) {
		this.qntBugs += n;
	}
	
	public void setDev( int n) {
		this.qntDevs += n;
	}
	
	
//	public void lerTesteTryCatch() {
//		while(teste != 1 && teste!= 2) {
//			lerTeste();
//		}
//	}
	
	//Get e set
	public int getQntBugs() {
		return qntBugs;
	}

	public void setQntBugs(int qntBugs) {
		this.qntBugs = qntBugs;
	}

	public int getQntDevs() {
		return qntDevs;
	}

	public void setQntDevs(int qntDevs) {
		this.qntDevs = qntDevs;
	}

	public int getQntInstantes() {
		return qntInstantes;
	}

	public void setQntInstantes(int qntInstantes) {
		this.qntInstantes = qntInstantes;
	}

	public int getTeste() {
		return teste;
	}

	public void setTeste(int teste) {
		this.teste = teste;
	}

	public int getQntInstantesTotal() {
		return qntInstantesTotal;
	}

	public void setQntInstantesTotal(int qntInstantesTotal) {
		this.qntInstantesTotal = qntInstantesTotal;
	}

	public int[] getBugs() {
		return bugs;
	}

	public int[] getDevs() {
		return devs;
	}

	public int[] getInstantes() {
		return instantes;
	}

	public int[] getPython() {
		return python;
	}

	public int[] getJs() {
		return js;
	}

	public int[] getRuby() {
		return ruby;
	}

	public int[] getPhp() {
		return php;
	}

	public int[] getcSharp() {
		return cSharp;
	}

	public int[] getcPlusPlus() {
		return cPlusPlus;
	}

	public int[] getC() {
		return c;
	}
	
	
	
}
