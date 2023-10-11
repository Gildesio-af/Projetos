package Interacao;

import java.util.Scanner;

public class LeituraDados {
	private int qntBugs, qntDevs, qntInstantes, teste, qntInstantesTotal;
	protected Scanner teclado = new Scanner(System.in);
	
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
	
}
