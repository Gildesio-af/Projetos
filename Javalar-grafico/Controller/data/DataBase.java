package data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import EspacoJaval.Mundo;
import verificacao.Verificacoes;

public class DataBase {
	private int id;
	private String nome;
	private String nomeArquivo;
	private String matricula;
	private int bPython;
	private int bJS;
	private int bRuby;
	private int bPhp;
	private int bCSharp;
	private int bCPlusPlus;
	private int bC;
	private int dPython;
	private int dJS;
	private int dRuby;
	private int dPhp;
	private int dCSharp;
	private int dCPlusPlus;
	private int dC;
	private int vPython;
	private int vJS;
	private int vRuby;
	private int vPhp;
	private int vCSharp;
	private int vCPlusPlus;
	private int vC;
	private int diasPython;
	private int diasJS;
	private int diasRuby;
	private int diasPhp;
	private int diasCSharp;
	private int diasCPlusPlus;
	private int diasC;
	private int aPython;
	private int aJS;
	private int aRuby;
	private int aPhp;
	private int aCSharp;
	private int aCPlusPlus;
	private int aC;
	private int b1;
	private int b2;
	private int b3;
	private int b4;
	private int d1;
	private int d2;
	private int d3;
	private int d4;
	
	public List<Mundo> mundos;
	Verificacoes verificacao;
	
	public DataBase(List<Mundo> mundos, Verificacoes verificacao) {
		super();
		this.nome = "Gildesio Araujo";
		this.matricula = "554210";
		this.nomeArquivo = "AE_50.csv";
		this.mundos = mundos;
		this.verificacao = verificacao;
		getDatas();
	}
	
	public DataBase() {
		
	}
	
	public void getDatas() {
		getDataPlanets();
		getDataQuadrante();
	}
	
	public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome do Arquivo: " + nomeArquivo);
        System.out.println("Bugs - Python: " + bPython);
        System.out.println("Bugs - JavaScript: " + bJS);
        System.out.println("Bugs - Ruby: " + bRuby);
        System.out.println("Bugs - PHP: " + bPhp);
        System.out.println("Bugs - C#: " + bCSharp);
        System.out.println("Bugs - C++: " + bCPlusPlus);
        System.out.println("Bugs - C: " + bC);
        System.out.println("Desenvolvedores - Python: " + dPython);
        System.out.println("Desenvolvedores - JavaScript: " + dJS);
        System.out.println("Desenvolvedores - Ruby: " + dRuby);
        System.out.println("Desenvolvedores - PHP: " + dPhp);
        System.out.println("Desenvolvedores - C#: " + dCSharp);
        System.out.println("Desenvolvedores - C++: " + dCPlusPlus);
        System.out.println("Desenvolvedores - C: " + dC);
        System.out.println("Velocidade - Python: " + vPython);
        System.out.println("Velocidade - JavaScript: " + vJS);
        System.out.println("Velocidade - Ruby: " + vRuby);
        System.out.println("Velocidade - PHP: " + vPhp);
        System.out.println("Velocidade - C#: " + vCSharp);
        System.out.println("Velocidade - C++: " + vCPlusPlus);
        System.out.println("Velocidade - C: " + vC);
        System.out.println("Dias - Python: " + diasPython);
        System.out.println("Dias - JavaScript: " + diasJS);
        System.out.println("Dias - Ruby: " + diasRuby);
        System.out.println("Dias - PHP: " + diasPhp);
        System.out.println("Dias - C#: " + diasCSharp);
        System.out.println("Dias - C++: " + diasCPlusPlus);
        System.out.println("Dias - C: " + diasC);
        System.out.println("Avaliação - Python: " + aPython);
        System.out.println("Avaliação - JavaScript: " + aJS);
        System.out.println("Avaliação - Ruby: " + aRuby);
        System.out.println("Avaliação - PHP: " + aPhp);
        System.out.println("Avaliação - C#: " + aCSharp);
        System.out.println("Avaliação - C++: " + aCPlusPlus);
        System.out.println("Avaliação - C: " + aC);
        System.out.println("Bug Q1: " + b1);
        System.out.println("Bug Q2: " + b2);
        System.out.println("Bug Q3: " + b3);
        System.out.println("Bug Q4: " + b4);
        System.out.println("Desenvolvimento Q1: " + d1);
        System.out.println("Desenvolvimento Q2: " + d2);
        System.out.println("Desenvolvimento Q3: " + d3);
        System.out.println("Desenvolvimento Q4: " + d4);
    }
	
	public void getDataPlanets() {
		for (Mundo mundo : mundos) {
			switch (mundo.getNome()) {
			case "Python":
				bPython = mundo.getnBugs();
				dPython = mundo.getnDesenvolvedores();
				vPython =(int) mundo.getvMedia();
				diasPython =(int) mundo.getDias();
				aPython = (int)mundo.getAnos();
				
				break;
				
			case "JavaScript":
				bJS = mundo.getnBugs();
				dJS = mundo.getnDesenvolvedores();
				vJS=(int) mundo.getvMedia();
				diasJS=(int) mundo.getDias();
				aJS = (int)mundo.getAnos();
				break;
			
			case "Ruby on Rails":
				bRuby = mundo.getnBugs();
				dRuby = mundo.getnDesenvolvedores();
				vRuby =(int) mundo.getvMedia();
				diasRuby =(int) mundo.getDias();
				aRuby = (int)mundo.getAnos();
				break;
				
			case "PHP":
				bPhp = mundo.getnBugs();
				dPhp = mundo.getnDesenvolvedores();
				vPhp =(int) mundo.getvMedia();
				diasPhp =(int) mundo.getDias();
				aPhp = (int)mundo.getAnos();
				break;
				
			case "C Sharp":
				bCSharp = mundo.getnBugs();
				dCSharp = mundo.getnDesenvolvedores();
				vCSharp =(int) mundo.getvMedia();
				diasCSharp =(int) mundo.getDias();
				aCSharp = (int)mundo.getAnos();
				break;
				
			case "CPlusPlus":
				bCPlusPlus = mundo.getnBugs();
				dCPlusPlus = mundo.getnDesenvolvedores();
				vCPlusPlus =(int) mundo.getvMedia();
				diasCPlusPlus =(int) mundo.getDias();
				aCPlusPlus = (int)mundo.getAnos();
				break;
				
			case "C":
				bC = mundo.getnBugs();
				dC = mundo.getnDesenvolvedores();
				vC =(int) mundo.getvMedia();
				diasC =(int) mundo.getDias();
				aC = (int)mundo.getAnos();
				break;
							
			default:
				break;
			}
		}
	}
	
	public void getDataQuadrante() {
		b1 = verificacao.getB1();
		b2 = verificacao.getB2();
		b3 = verificacao.getB3();
		b4 = verificacao.getB4();
		d1 = verificacao.getD1();
		d2 = verificacao.getD2();
		d3 = verificacao.getD3();
		d4 = verificacao.getD4();
	}
	
	public void setNameFile(int num) {
		switch (num) {
		case 10:
			nomeArquivo = "AE_10.csv";
			break;
			
		case 50:
			nomeArquivo = "AE_50.csv";
			break;
		case 100:
			nomeArquivo = "AE_100.csv";
			break;
		case 500:
			nomeArquivo = "AE_500.csv";
			break;
		case 1000:
			nomeArquivo = "AE_1000.csv";
			break;
		case 1500:
			nomeArquivo = "AE_1500.csv";
			break;
		case 2000:
			nomeArquivo = "AE_2000.csv";
			break;

		default:
			break;
		}
	}
	
	public void impDados() {
		for (Mundo mundo : mundos) {
			switch (mundo.getNome()) {
			case "Python":
				System.out.println("Python: ");
				System.out.println(mundo.getnBugs() + "," + mundo.getnDesenvolvedores() + "," + vPython + "," +diasPython + "," +aPython);
				
				break;
				
			case "JavaScript":
				System.out.println("Java Script: ");
				System.out.println(mundo.getnBugs() + "," + mundo.getnDesenvolvedores() + "," + vJS + "," + diasJS + "," + aJS);
				break;
			
			case "Ruby on Rails":
				System.out.println("Ruby: ");
				System.out.println(mundo.getnBugs() + "," + mundo.getnDesenvolvedores() + "," + vRuby + "," + diasRuby + "," + aRuby);
				break;
				
			case "PHP":
				System.out.println("PHP: ");
				System.out.println(mundo.getnBugs() + "," + mundo.getnDesenvolvedores() + "," + vPhp + "," + diasPhp + "," + aPhp);
				break;
				
			case "C Sharp":
				System.out.println("C Sharp: ");
				System.out.println(mundo.getnBugs() + "," + mundo.getnDesenvolvedores() + "," + vCSharp + "," + diasCSharp + "," + aCSharp);
				break;
				
			case "CPlusPlus":
				System.out.println("CPlusPlus: ");
				System.out.println(mundo.getnBugs() + "," + mundo.getnDesenvolvedores() + "," + vCPlusPlus + "," + diasCPlusPlus + "," + aCPlusPlus);
				break;
				
			case "C":
				System.out.println("C: ");
				System.out.println(mundo.getnBugs() + "," + mundo.getnDesenvolvedores() + "," + vC + "," + diasC + "," + aC);
				break;
							
			default:
				break;
			}
		}
	}
	
	
	
	
	public String getNome() {
		return nome;
	}
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	public String getMatricula() {
		return matricula;
	}
	public int getbPython() {
		return bPython;
	}
	public int getbJS() {
		return bJS;
	}
	public int getbRuby() {
		return bRuby;
	}
	public int getbPhp() {
		return bPhp;
	}
	public int getbCSharp() {
		return bCSharp;
	}
	public int getbCPlusPlus() {
		return bCPlusPlus;
	}
	public int getbC() {
		return bC;
	}
	public int getdPython() {
		return dPython;
	}
	public int getdJS() {
		return dJS;
	}
	public int getdRuby() {
		return dRuby;
	}
	public int getdPhp() {
		return dPhp;
	}
	public int getdCSharp() {
		return dCSharp;
	}
	public int getdCPlusPlus() {
		return dCPlusPlus;
	}
	public int getdC() {
		return dC;
	}
	public int getvPython() {
		return vPython;
	}
	public int getvJS() {
		return vJS;
	}
	public int getvRuby() {
		return vRuby;
	}
	public int getvPhp() {
		return vPhp;
	}
	public int getvCSharp() {
		return vCSharp;
	}
	public int getvCPlusPlus() {
		return vCPlusPlus;
	}
	public int getvC() {
		return vC;
	}
	public int getDiasPython() {
		return diasPython;
	}
	public int getDiasJS() {
		return diasJS;
	}
	public int getDiasRuby() {
		return diasRuby;
	}
	public int getDiasPhp() {
		return diasPhp;
	}
	public int getDiasCSharp() {
		return diasCSharp;
	}
	public int getDiasCPlusPlus() {
		return diasCPlusPlus;
	}
	public int getDiasC() {
		return diasC;
	}
	public int getaPython() {
		return aPython;
	}
	public int getaJS() {
		return aJS;
	}
	public int getaRuby() {
		return aRuby;
	}
	public int getaPhp() {
		return aPhp;
	}
	public int getaCSharp() {
		return aCSharp;
	}
	public int getaCPlusPlus() {
		return aCPlusPlus;
	}
	public int getaC() {
		return aC;
	}
	public int getB1() {
		return b1;
	}
	public int getB2() {
		return b2;
	}
	public int getB3() {
		return b3;
	}
	public int getB4() {
		return b4;
	}
	public int getD1() {
		return d1;
	}
	public int getD2() {
		return d2;
	}
	public int getD3() {
		return d3;
	}
	public int getD4() {
		return d4;
	}
	public List<Mundo> getMundos() {
		return mundos;
	}
	public Verificacoes getVerificacao() {
		return verificacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setbPython(int bPython) {
		this.bPython = bPython;
	}

	public void setbJS(int bJS) {
		this.bJS = bJS;
	}

	public void setbRuby(int bRuby) {
		this.bRuby = bRuby;
	}

	public void setbPhp(int bPhp) {
		this.bPhp = bPhp;
	}

	public void setbCSharp(int bCSharp) {
		this.bCSharp = bCSharp;
	}

	public void setbCPlusPlus(int bCPlusPlus) {
		this.bCPlusPlus = bCPlusPlus;
	}

	public void setbC(int bC) {
		this.bC = bC;
	}

	public void setdPython(int dPython) {
		this.dPython = dPython;
	}

	public void setdJS(int dJS) {
		this.dJS = dJS;
	}

	public void setdRuby(int dRuby) {
		this.dRuby = dRuby;
	}

	public void setdPhp(int dPhp) {
		this.dPhp = dPhp;
	}

	public void setdCSharp(int dCSharp) {
		this.dCSharp = dCSharp;
	}

	public void setdCPlusPlus(int dCPlusPlus) {
		this.dCPlusPlus = dCPlusPlus;
	}

	public void setdC(int dC) {
		this.dC = dC;
	}

	public void setvPython(int vPython) {
		this.vPython = vPython;
	}

	public void setvJS(int vJS) {
		this.vJS = vJS;
	}

	public void setvRuby(int vRuby) {
		this.vRuby = vRuby;
	}

	public void setvPhp(int vPhp) {
		this.vPhp = vPhp;
	}

	public void setvCSharp(int vCSharp) {
		this.vCSharp = vCSharp;
	}

	public void setvCPlusPlus(int vCPlusPlus) {
		this.vCPlusPlus = vCPlusPlus;
	}

	public void setvC(int vC) {
		this.vC = vC;
	}

	public void setDiasPython(int diasPython) {
		this.diasPython = diasPython;
	}

	public void setDiasJS(int diasJS) {
		this.diasJS = diasJS;
	}

	public void setDiasRuby(int diasRuby) {
		this.diasRuby = diasRuby;
	}

	public void setDiasPhp(int diasPhp) {
		this.diasPhp = diasPhp;
	}

	public void setDiasCSharp(int diasCSharp) {
		this.diasCSharp = diasCSharp;
	}

	public void setDiasCPlusPlus(int diasCPlusPlus) {
		this.diasCPlusPlus = diasCPlusPlus;
	}

	public void setDiasC(int diasC) {
		this.diasC = diasC;
	}

	public void setaPython(int aPython) {
		this.aPython = aPython;
	}

	public void setaJS(int aJS) {
		this.aJS = aJS;
	}

	public void setaRuby(int aRuby) {
		this.aRuby = aRuby;
	}

	public void setaPhp(int aPhp) {
		this.aPhp = aPhp;
	}

	public void setaCSharp(int aCSharp) {
		this.aCSharp = aCSharp;
	}

	public void setaCPlusPlus(int aCPlusPlus) {
		this.aCPlusPlus = aCPlusPlus;
	}

	public void setaC(int aC) {
		this.aC = aC;
	}

	public void setB1(int b1) {
		this.b1 = b1;
	}

	public void setB2(int b2) {
		this.b2 = b2;
	}

	public void setB3(int b3) {
		this.b3 = b3;
	}

	public void setB4(int b4) {
		this.b4 = b4;
	}

	public void setD1(int d1) {
		this.d1 = d1;
	}

	public void setD2(int d2) {
		this.d2 = d2;
	}

	public void setD3(int d3) {
		this.d3 = d3;
	}

	public void setD4(int d4) {
		this.d4 = d4;
	}

	public void setMundos(List<Mundo> mundos) {
		this.mundos = mundos;
	}

	public void setVerificacao(Verificacoes verificacao) {
		this.verificacao = verificacao;
	}
	
	
	
	
}
