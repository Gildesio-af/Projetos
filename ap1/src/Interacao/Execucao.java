package Interacao;

import java.util.ArrayList;
import java.util.List;

import Calculos.Calcular;
import EspacoJaval.Bug;
import EspacoJaval.C;
import EspacoJaval.CPlusPlus;
import EspacoJaval.CSharp;
import EspacoJaval.Dev;
import EspacoJaval.Java;
import EspacoJaval.JavaScript;
import EspacoJaval.Mundo;
import EspacoJaval.PHP;
import EspacoJaval.Python;
import EspacoJaval.Ruby;
import verificacao.Verificacoes;

public class Execucao {
	
	public static Impressao imprimir = new Impressao();
	public static LeituraDados leitura = new LeituraDados();
	public static Calcular calculo = new Calcular();
	
	public Execucao() {
		imprimir.boasVindas();
		Java estrela = new Java();
	}
	
	//Fazer instancias
	public static List<Mundo> instancias(){
		List<Mundo> mundos = new ArrayList<Mundo>();
		mundos.add(new Python("Python", 8, 9));
		mundos.add(new JavaScript("JavaScript", 8, 10));
		mundos.add(new Ruby("Ruby on Rails", 8, 11));
		mundos.add(new PHP("PHP", 8, 12));
		mundos.add(new CSharp("C Sharp", 8, 13));
		mundos.add(new CPlusPlus("CPlusPlus", 8, 14));
		mundos.add(new C("C", 8, 15));
		
		return mundos;
	}
	
	//calcular area entre de todos para todos
	public static void areaTodos(List<Mundo> mundos) {
		for (int i = 0; i < mundos.size() - 1; i++) {
            for (int j = i + 1; j < mundos.size(); j++) {
                Mundo elemento1 = mundos.get(i);
                Mundo elemento2 = mundos.get(j);
                System.out.println("(" + elemento1.getNome() + ", " + elemento2.getNome() + ")");
            }
        }
	}
	
	//Interação com o usuario
	public static void comunicacao() {
		imprimir.perguntarInstantes();
		try {
			leitura.lerInstantes();
		} catch (java.util.InputMismatchException e) {;
			int n = (int)(1 + Math.random() * 50);
			System.out.println("Caractere digitado invalido o numero de instantes vai ser: " + n);
			leitura.setQntInstantes(n);
			leitura.limparBuffer();
		}
		
		imprimir.perguntaDev();
		try {
			leitura.lerDevs();
		} catch (java.util.InputMismatchException e) {
			int n = (int)(1 + Math.random() * 125);
			System.out.println("Caractere digitado invalido o numero de desenvolvedores vai ser: " + n);
			leitura.setQntDevs(n);
			leitura.limparBuffer();
		}
		
		imprimir.perguntarBug();
		try {
			leitura.lerBugs();
		} catch (java.util.InputMismatchException e) {
			int n = (int)(1 + Math.random() * 125);
			System.out.println("Caractere digitado invalido o numero de bugs vai ser: " + n);
			leitura.setQntBugs(n);
			leitura.limparBuffer();
		}
	}
	
	public static void executarTeste() {
		imprimir.imprimirMenu();
		try {
			leitura.lerTeste();
		} catch (java.util.InputMismatchException e) {
			imprimir.impMenuTryCatch(leitura);
			leitura.limparBuffer();
		}
	}
	

	public static void executar(){
		
		Verificacoes verificar = new Verificacoes();
		Dev dev = new Dev();
		Bug bug = new Bug();
		
		
		//Criar lista para ficar mais organizado
		List<Mundo> mundos = instancias();
		
		comunicacao();
		dev.gerarPosicoes(mundos, leitura.getQntDevs());
		bug.gerarPosicoes(mundos, leitura.getQntBugs());
		
		for (Mundo mundo : mundos) {
			mundo.transladar(leitura.getQntInstantes());
		 	mundo.rotacionar(leitura.getQntInstantes());
		 	mundo.contarAnos();
		 	verificar.testeNorteSul(mundo);
		 	verificar.testeAlinhado(mundo);
		}

		verificar.verificarColisao(mundos, bug);
		verificar.verificarColisao(mundos, dev);
		imprimir.relatar(mundos, leitura, dev, bug, verificar);
		
		
		executarTeste();
		if(leitura.getTeste() != 1) {
			imprimir.printRelatorioFinal(mundos);
		} 
	}
}

