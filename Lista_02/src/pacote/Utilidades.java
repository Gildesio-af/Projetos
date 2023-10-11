package pacote;

import java.text.DecimalFormat;
import java.util.Iterator;

public class Utilidades {
	public int somatorio (int[] vet) {
		int soma = 0;
		if(vet.length < 3) {
			System.out.println("O somatorio nao pode ser realizado.");
		}else {
			for(int i = 1; i < vet.length - 1; i++) {
				soma += vet[i];
			}
		}
		return soma;
	}
	public void numeorosPares(int nInicial, int nFinal) {
		for(int i = nInicial; i <= nFinal; i++)
			if(i % 2 == 0) {
				System.out.println(i);
		}
	}
	
	public float media(int vet[], int vet2[] ) {
		float media = 0f, soma = 0f, soma1 = 0f, denominador = 0f;
		for(int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		for(int i = 0; i < vet2.length; i++) {
			soma1 += vet2[i];
		}
		denominador = vet.length + vet2.length;
		media = (soma + soma1)/denominador;
		System.out.println(soma + " " + soma1 + " " + denominador + " "
				+ media);
		
		return media;
	}
	
	public float mediaPonderada(float vetNotas[], float vetPesos[]) {
		float sNotaPeso = 0f, sPesos = 0f, mediaP = 0f;
		if(vetNotas.length == vetPesos.length) {
			for(int i = 0; i < vetNotas.length; i++) {
			sNotaPeso += vetNotas[i] * vetPesos[i];
			sPesos += vetPesos[i];
			}
		}else {
			System.out.println("Falta alguma informacao!");
		}
		mediaP = sNotaPeso / sPesos;
		return mediaP;
	}
	
	public int contagemElementos(int vet1[], int vet2[], int nContado) {
		int contador = 0;
		for(int i = 0; i < vet1.length; i++) {
			if(vet1[i] == nContado) {
				contador++;
			}
		}
		for(int j = 0; j < vet2.length; j++) {
			if(vet1[j] == nContado) {
				contador++;
			}
		}
		return contador;
	}
	
	public int[] copiaVetor(int vet[]) {
		int copia[] = new int[vet.length];
		for(int i = 0; i < vet.length;i++) {
			copia[i] = vet[i];
		}
		

		return copia;
	}
	
	public int[] ordenacaoCrescente (int vet[]) {
		int ordenado[] = new int[vet.length];
		int menor = 1000000000, y = 0;
		for(int i = 0;  i < vet.length; i++) {
			for(int j = 0; j < vet.length; j++) {
				if(vet[j] < menor) {
					menor = vet[j];					
				}
			}
			ordenado[i] = menor;			
		}

		return ordenado;
	}
	
	public boolean verificacaoOrdenacao(int vet[]) {
		int menor = vet[0];
		boolean teste = true;
		for(int i = 1; i < vet.length; i++) {
			if(menor < vet[i]) {
				teste = true;
			}else {
				teste = false;
				break;
			}
		}
		return teste;
	}
	
	public int kMaiorValor(int vet[]) {
		int maior = vet[0];
		for(int i = 1; i < vet.length; i++) {
			if(maior < vet[i]) {
				maior = vet[i];
			}
		}		
		return maior;
	}
	
	public int kMenorValor(int vet[]) {
		int menor = vet[0];
		for(int i = 1; i < vet.length ; i++) {
			if( menor > vet[i]) {
				menor = vet[i];
			}
		}		
		return menor;
	}
	
	public boolean verificacaoIgualdade(int vet[], int vet2[]) {
		boolean teste = false;
		if(vet.length == vet2.length) {
			for(int i = 0; i < vet.length; i++) {
				if(vet[i] == vet2[i]) {
					teste = true;
				}else {
					teste = false;
				}
			}		
		}else
			teste = false;
		
		return teste;
	}
	
	public float potenciacao(float base, float expoente) {
		float resultado = base;
		for(int i = 0; i < expoente-1; i++){
			resultado *= base;
		}
		return resultado;
	}
	
	public void primo(int num) {
		boolean teste = true;
		if(num == 2) {
			teste = true;
		}else {
			for(int i = 3; i < num; i++) {
				if(num % i == 0) {
					teste = true;
					break;
				}else 
					teste = false;
			}
		}
	}
	
	public int[] buscaPorOcorrencia(int vet[], int vet2[]) {
		int concatenado[] = new int[vet.length + vet2.length];
		for(int i = 0; i < vet.length ; i++) {
			concatenado[i] = vet[i];
		}
		int segundaMetade = vet.length  ;
		for (int i = 0; i < vet2.length; i++) {
			concatenado[segundaMetade] = vet2[i];
			segundaMetade++;
		}
		for (int i : concatenado) {
			System.out.println(i);
		}
		return concatenado;
	}
	
	public int[] remocaoeElemento(int vet[], int remove) {
		int contador = 0, j = 0;
		for(int i = 0; i < vet.length; i++) {
			if(remove == vet[i]) {
				contador++;
			}
		}
		int removido[] = new int[vet.length - contador];
		for(int i = 0; i < vet.length ; i++) {
			if(remove != vet[i]) {
				removido[j] = vet[i];
				j++;
			}
		}
		for(int i: removido) {
			System.out.println(i);
		}
		return removido;
	}
	
	public boolean palindromo(String palavra) {
		boolean teste = false;
		StringBuilder string = new StringBuilder();
		string.append(palavra);
		string = string.reverse();
		String invertida = string.toString();
		if(invertida == palavra) {
			teste = true;
		}
		return teste;
	}
	
	public boolean testePrimo(int num) {
		boolean teste = true;
		if(num == 2) {
			teste = true;
		}else {
			for(int i = 3; i < num; i++) {
				if(num % i == 0) {
					teste = true;
					break;
				}else 
					teste = false;
			}
		}
		return teste;
	}
	
	public String inversaoString (String string) {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append(string);
		sBuilder = sBuilder.reverse();
		String invertida = sBuilder.toString();
		
		return invertida;
	}
	
	public float calculoJcomposto (float valor, float juros, int tempo) {
		
		float montante = valor * potenciacao(1+ juros, tempo);
		
		return montante;
	}
	
	public boolean verificacaoNumeroPerfeito(int num) {
		boolean teste = false;
		int somaDivisores = 0;
		if(num == 0 || num == 1 || num == 2 || num == -1 || num == -2) {
			teste = false;
		}else {
			for(int i = 1; i < num; i++) {
				if(num % i == 0) {
					somaDivisores += i;
				}	
			}
		}
		if(somaDivisores == num)
			teste = true;
		
		return teste;
	}
	
	public void diminuicaoVetor (int tamVetor) {
		for(int i = tamVetor; i > 0; i --) {
			int vet[] = new int[i];
		}
	}
	
	public void impElementosA(int linha) {
		for(int i = 0; i <= linha; i++) {
			for (int j = 0; j < i; j++ ) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public void impElementosB(int linha) {
		char teste = '*';
		if(linha % 2 == 0) {
			for(int i = 0; i < linha; i++) {
				for (int j = 0; j < linha / 2; j++ ) {
						if(teste == '*') {
							System.out.print("@   *   ");
						}else {
							System.out.print("*   @   ");
						}
				}
				//Teste para a alternancia da impressao
				if (teste == '*') {
					teste = '@';
				}else {
					teste = '*';
				}
			System.out.println();
			}
		}else {
			for(int i = 0; i < linha; i++) {
				for (int j = 0; j < (linha - 1) / 2; j++ ) {
						if(teste == '*') {
							System.out.print("@   *   ");
							if(j == ((linha - 1) / 2) - 1) {
								System.out.print("@");
							}
						}else {
							System.out.print("*   @   ");
							if(j == ((linha - 1) / 2) - 1) {
								System.out.print("*");
							}
						}
			
				}
				if (teste == '*') {
					teste = '@';
				}else {
					teste = '*';
				}
				System.out.println();
			}
		}
	}
	
	public void impElementosC(int linha) {
		int testeCentroPar = (linha / 2);
		int testeCentroImpar = (linha + 1) / 2;
		char teste = '3', testeCentro = '0';
		if (linha % 2 != 0) {
			for(int i = 0;  i < linha; i++) {
				for(int j = 0; j < (linha + 1) / 2; j++) {
					if (testeCentroImpar == j - 2) {
						System.out.print("@   ");
					}else {
						if(teste == '3') 
							System.out.print("4   3   ");
						else
							System.out.print("0   1   ");
					}
				}
				if(teste == '3') {
					teste = '0';
				}else {
					teste = '3';
				}
				System.out.println();
			}
		}else {
			
		}
	}
	
	public static void impElementosD(int linha) {
		int vet1[] = new int[linha],  vet2[] = new int[linha];
		int a = 1, b = linha;
		for(int i = 0; i < linha; i++) {
			vet1[i] = a;
			a++;
			vet2[i] = b;
			b--;
		}
		
			for(int i = 0; i < linha ; i++){
				System.out.print(vet1[i] + "   ");
			}
			a = 1;
			System.out.println();
			for(int i = 0; i < linha - 2; i++) {
				for(int j = 0; j < 1; j++) {
						System.out.print(a + "   ");
						a++;
						for(int x = 0; x < linha - 2; x++){
							System.out.print("*   ");
						}
						System.out.print(a + "   ");
				}
				System.out.println();
			}
			for(int t: vet2) {
				System.out.print(t + "   ");
			}
	}

	public static void impElementosE(int linha){

		String vetIgual[] = new String[linha];
		for(int i = 0; i < linha; i ++){
			vetIgual[i] = "=";
		}
		vetIgual[(linha - 1) / 2] = "||";
		if(linha % 2 != 0){
			for(int i = 0; i < (linha - 1) / 2; i++){
				for(int j = 0; j < (linha - 1) / 2; j++){
					System.out.print("#   ");
				}

				System.out.print("||   ");

				for(int k = 0; k < (linha - 1) / 2; k++){
					System.out.print("!   ");
				} 
				System.out.println();
			}

			for(String l: vetIgual){
				System.out.print(l + "   ");
			}

			System.out.println();

			for(int i = 0; i < (linha - 1) / 2; i++){
				for(int j = 0; j < (linha - 1) / 2; j++){
					System.out.print("*   ");
				}

				System.out.print("||   ");

				for(int k = 0; k < (linha - 1) / 2; k++){
					System.out.print("%   ");
				}
				System.out.println();
			}
		}else{
			vetIgual[(linha) / 2] = "||";
			for(int i = 0; i < (linha - 1) / 2; i++){
				for(int j = 0; j < (linha - 1) / 2; j++){
					System.out.print("#   ");
				}

				System.out.print("||   ||   ");

				for(int k = 0; k < (linha - 1) / 2; k++){
					System.out.print("!   ");
				} 
				System.out.println();
			}

			for(String l: vetIgual){
				System.out.print(l + "   ");
			}

			System.out.println();

			for(int i = 0; i < (linha - 1) / 2; i++){
				for(int j = 0; j < (linha - 1) / 2; j++){
					System.out.print("*   ");
				}

				System.out.print("||   ||   ");

				for(int k = 0; k < (linha - 1) / 2; k++){
					System.out.print("%   ");
				}
				System.out.println();
			}
		}
	}

	public static void impElementosF(int linha){
		int numFim = linha - 1, numInicio = 0;

		String elementos[] = new String[linha];
		for (int i = 0; i < linha; i++) {
			
			for (int j = 0; j < elementos.length; j++) {
				elementos[j] = "*";
			}
			elementos[i] = Integer.toString(numInicio);
				elementos[numFim] = Integer.toString(numFim);
				numFim--;
				numInicio++;

			for (String string : elementos) {
				System.out.print(string+ "   ");
			}
			System.out.println();
		}
		
	}

}