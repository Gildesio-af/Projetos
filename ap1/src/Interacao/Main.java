package Interacao;

public class Main {
	public static void main(String[] args) {
		Execucao execute = new Execucao();
		do {
			execute.executar();
		} while (execute.leitura.getTeste() == 1);
	}
}
