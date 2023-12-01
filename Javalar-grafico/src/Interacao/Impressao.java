package Interacao;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import Calculos.Calcular;
import EspacoJaval.Bug;
import EspacoJaval.Dev;
import EspacoJaval.Mundo;
import verificacao.Verificacoes;

public class Impressao {
	private int nRelatorio = 1;
	public Calcular calculo = new Calcular();
	
	
	public void criarArquivo(Verificacoes verificar, List<String[]> datasRead, List<Mundo> mundos){
		int[] qtdMortes = verificar.getQuantidadeMortes(datasRead);
		int[] vPlanetas = verificar.verificarVMedia(datasRead, mundos);
		String caminhoArquivo = "C:\\Users\\gilde\\OneDrive\\Área de Trabalho\\Arquivos javalar\\arquivo.txt";
		String conteudo = verificar.separateNames(datasRead) + ", " + verificar.getMaisMorreu(qtdMortes) + ", " + verificar.getMenosMorreu(qtdMortes)+ 
				", " + verificar.getQuadranteBug(datasRead)+ ", " + verificar.getQuadranteDev(datasRead)+ ", " + datasRead.size() + ", Python: " + 
				vPlanetas[0]+ ",JavaScript: " + vPlanetas[1] + ", Ruby: " + vPlanetas[2] + ",\n Php: " + vPlanetas[3] + ", CSharp: " + vPlanetas[4] + 
				", C++: " + vPlanetas[5]  + ", C: " + vPlanetas[6] + ", " + verificar.getQuantidadeBug() + ", " + verificar.getQuantidadeDev() + ", " 
				+ verificar.getQuantidadeHoras(datasRead) + ", " + verificar.getQuantidadeAnosPorDia(datasRead);
		
		try {
			
			FileWriter escritor = new FileWriter(caminhoArquivo);
			escritor.write(conteudo);
			escritor.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void printRelatorioFinal(List<Mundo> mundos) {
		System.out.println("\\\\\\\\\\ Relatorio Final ///////////");
		
		for (Mundo mundo : mundos) {
			imprimirSeparacao();
			System.out.println("Nome: "  + mundo.getNome());
			System.out.println("Bugs colididos: " + mundo.getnBugs());
			System.out.println("Desensvolvedores colididos: " + mundo.getnDesenvolvedores());
			System.out.println("Velocidade de rotacao: " + mundo.getvRotacao());
//			System.out.printf("Velocidade media de translacao: %.2f \n", mundo.getvMedia());
			if(mundo.isVivo() == false)
				System.out.println( mundo.getNome() + " explodiu ao longo da execucao");
			System.out.println("Numero de voltas realizadas em torno de java: " + mundo.getAnos());
			System.out.printf("Numero de horas passadas: %.2f \n", mundo.getDias());
			System.out.println("Resumo: " + mundo.getResumo());
			imprimirSeparacao();
		}
	}
	
	public void msgInicial() {
		System.out.println("Seja bem-vindo ao Javalar!");
		System.out.println("Digite a quantidade de instantes que deseja:");
	}
	
	public void perguntaDev() {
		System.out.println("Digite a quantidade de desevolvedores: ");
	}
	
	public void perguntarInstantes() {
		System.out.println("Digite a quantidade de instantes que deseja: ");
	}
	public void perguntarBug() {
		System.out.println("Digite a quantidade de bugs desejada: ");
	}
	
	public void numeroInvalido() {
		System.out.println("Numero invalido, digite outro.");
	}
	
	public void boasVindas() {
		System.out.println("Seja bem-vindo(a) ao JavaLar!");
	}
	
	public void printPos(Dev d) {
		for (int i = 0; i < d.posX.size(); i++) {
			System.out.println("x:" + d.posX.get(i) + ", y:" + d.posY.get(i));
		}
	}
	
	public void printPos(Bug b) {
		for (int i = 0; i < b.posX.size(); i++) {
			System.out.println("x: " + b.posX.get(i) + ", y: " + b.posY.get(i));
		}
	}
	
	public void relatar(List<Mundo> mundos, LeituraDados leitura, Dev devs, Bug bug, Verificacoes verificar) {
		System.out.printf("----------- Relatorio_%d -----------\n", nRelatorio);
		System.out.println("O numero de desenvolvedores inseridos foi: " + leitura.getQntDevs());
		System.out.println("O numero de bugs inseridos foi: " + leitura.getQntBugs());
		imprimirSeparacao();
		System.out.println("Posicoes dos desenvolvedores: ");
		printPos(devs);
		imprimirSeparacao();
		System.out.println("Posicoes dos bugs: ");
		printPos(bug);
		imprimirSeparacao();
		imprimirVMedia(mundos);
//		imprimirNorteSul(verificar);
//		imprimirSeparacao(); 
//		imprimirAlinhamento(mundos);
//		imprimirSeparacao();
//		imprimirArea(mundos);
//		imprimirSeparacao();
//		imprimirDistancia(mundos);
		imprimirSeparacao();
		imprimirVelocidade(mundos);
		nRelatorio++;
	}
	
	public void imprimirArea(List<Mundo> mundos) {
		for (int i = 0; i < mundos.size() - 1; i++) {
            for (int j = i + 1; j < mundos.size(); j++) {
                Mundo mundo1 = mundos.get(i);
                Mundo mundo2 = mundos.get(j);
                int area = calculo.calcArea(mundo1, mundo2);               
                System.out.println("A area entre " + mundo1.getNome() + " e " + mundo2.getNome() + " eh de: " + area);
            }
        }
	}
	
	public void imprimirDistancia(List<Mundo> mundos) {
		for (int i = 0; i < mundos.size() - 1; i++) {
            for (int j = i + 1; j < mundos.size(); j++) {
                Mundo mundo1 = mundos.get(i);
                Mundo mundo2 = mundos.get(j);
                double distancia = calculo.calcDistancia(mundo1, mundo2);              
                System.out.printf("A distancia euclidiana entre " + mundo1.getNome() + " e " + mundo2.getNome() + " eh de: %.2f \n", distancia );
            }
        }
	}
	
	public void imprimirNorteSul(Verificacoes verificar) {
		System.out.println("O numero de planetas no norte eh: " + verificar.getPlanetasNorte());
		System.out.println("O numero de planetas no sul eh: " + verificar.getPlanetasSul());
		System.out.println("Ha " + verificar.getPlanetaEquador() + " planeta(s) alinhado na horizontal com java");
	}
	
	public void imprimirVMedia(List<Mundo> mundos) {
		for (Mundo mundo : mundos) {
			System.out.println("Velocidade media de" + mundo.getNome() + ": " + mundo.getvMedia());
		}
	}
	
	public void imprimirAlinhamento(List<Mundo> mundos) {
		for (Mundo mundo : mundos) {
			if(mundo.isAlinhado())
			System.out.println(mundo.getNome() + " esta alinhado com java.");
		}
	}
	
	public void imprimirVelocidade(List<Mundo> mundos) {
		for (Mundo mundo : mundos) {
			System.out.println(mundo.getNome() + " tem uma velocidade de translacao de: " + mundo.getvTranslacao());
		}
	}
	
	public void imprimirMenu() {
		System.out.println("\nDeseja continuar? Digite 1 para continuar e 2 para sair.");
	}
	
	public void impMenuTryCatch(LeituraDados leitura) {
		while (leitura.getTeste() != 1 && leitura.getTeste() != 2) {
			try {
				leitura.lerTeste();
			} catch (Exception e) {
				imprimirSeparacao();
				System.out.println("Caractere digitado invalido!");
				imprimirMenu();
				leitura.limparBuffer();
			}
		}
	}
	
	public void imprimirSeparacao() {
		System.out.println("-----------------------------------------------");
	}
}
