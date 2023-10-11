package pacote;

public class Executar {

	public static void main(String[] args) {
		int vet[] = {1,3,9};
		int vet2[] = {1,3,9};
		Utilidades util = new Utilidades();
		
		util.buscaPorOcorrencia(vet, vet2);
		//util.ordenacaoCrescente(vet2);
	}
}
