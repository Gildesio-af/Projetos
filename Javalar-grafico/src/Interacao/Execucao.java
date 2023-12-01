package Interacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

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
import data.DataBase;
import model.Conexao;
import model.FileCsv;
import model.RelatorioDao;
import verificacao.Verificacoes;
import view.EditImage;
import view.EnumImage;
import view.Frame;
import view.FrameFile;
import view.Mesh;
import view.PanelImage;

public class Execucao {
	
	public static Impressao imprimir = new Impressao();
	private FileCsv dataFile = new FileCsv();
	public LeituraDados leitura = new LeituraDados();
	public static Calcular calculo = new Calcular();
	private Verificacoes verificar;
	Dev dev;
	Bug bug;
	private FrameFile frameFile; 
	public int numberLines = 0;
	private List<String[]> datasRead;
	private List<DataBase> listData;
	private List<Mundo> mundos;
	private Frame frame = new Frame();
	RelatorioDao setDatas;
	private DataBase datas;
	
	int indexLine;
	
	public void addActionButton() {
		
		
		// Rodar os instantes
        frame.getPanelButtons().getButtons().get(0).addActionListener(new ActionListener() {
			
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					frame.getMesh().addBug(bug);
					frame.getMesh().addDev(dev);
					verificar.verificarColisao(mundos, bug,frame);
					verificar.verificarColisao(mundos, dev, frame);
					verificar.verificarQuadrante(bug);
					verificar.verificarQuadrante(dev);
					
					for (Mundo mundo : mundos) {
						
					 	mundo.rotacionar();
					 	mundo.contarAnos();
					 	verificar.testeNorteSul(mundo);
					 	verificar.testeAlinhado(mundo);
					}
					calculo.calcVelocidadeMedia(mundos);

					frame.getMesh().move(mundos);

					assignData(indexLine);
					leitura.setBug(indexLine);

					if(indexLine < numberLines ) {//Pulando para próxima linha do arquivo
						indexLine++;
					}
					if(indexLine == numberLines && numberLines != 0) {//Resetar o indexLine e avisar que o arquivo chgou ao final
						indexLine = 0;
						JOptionPane.showMessageDialog(frame, "O arquivo chegou ao final");
					}
					
					datas.getDatas();
					
				} catch (NullPointerException e2) {
					JOptionPane.showMessageDialog(null, "Primeiro leia o arquivo!");
					e2.printStackTrace();
				}
				
			}
		});
        
        
        //Ler arquivo
        frame.getPanelButtons().getButtons().get(1).addActionListener(ActionListener -> {
        	frameFile = new FrameFile();
        	addActionButtonChoice();

        });
        
        
        //Inserir dados
        frame.getPanelButtons().getButtons().get(2).addActionListener(ActionListener -> { 
        	
        	setDatas.createRelatorio(datas);
        });
        
        
        //Pegar dados
        frame.getPanelButtons().getButtons().get(3).addActionListener(ActionListener -> {
        	datasRead = setDatas.selectDados();
        	listData = new ArrayList<DataBase>();
       
        	verificar.separateNames(datasRead);
        	System.out.println("Mais morreu: " + verificar.getMaisMorreu(verificar.getQuantidadeMortes(datasRead)));
        	System.out.println("Mais viveu: " + verificar.getMenosMorreu(verificar.getQuantidadeMortes(datasRead)));
        	System.out.println("Mais bugs no " + verificar.getQuadranteBug(datasRead));
        	System.out.println("Mais devs no " + verificar.getQuadranteDev(datasRead));
        	
        });
        
        frame.getPanelButtons().getButtons().get(4).addActionListener(ActionListener -> {
        	imprimir.criarArquivo(verificar, datasRead, mundos);
        });
        

	}
	
	public void addActionButtonChoice() {
        frameFile.getPanelFile().getButton().addActionListener(ActionListener -> {
        	indexLine = 0;
        	int size = Integer.parseInt((String)frameFile.getPanelFile().getComboBox().getSelectedItem());
        	leitura.getDados(dataFile.identifyDataMatrix(size));
        	datas.setNameFile(size);
        	frameFile.setVisible(false);
        	this.numberLines = size;

        });
	}
	

	public Execucao() {
		imprimir.boasVindas();
//		Java estrela = new Java();
		mundos = instancias();
		frame.setMundos(mundos);
		verificar = new Verificacoes();
		dev = new Dev();
		bug = new Bug();
		
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
	
	public void assignDataPlanets(int line) {
		for (Mundo mundo : mundos) {
			if(mundo.getNome().equalsIgnoreCase("C")){
				mundo.setInstantes(leitura.getC()[line]);
			}else if(mundo.getNome().equalsIgnoreCase("CPlusPlus")) {
				mundo.setInstantes(leitura.getcPlusPlus()[line]);
			}else if(mundo.getNome().equalsIgnoreCase("C Sharp")) {
				mundo.setInstantes(leitura.getcSharp()[line]);
			}else if(mundo.getNome().equalsIgnoreCase("PHP")) {
				mundo.setInstantes(leitura.getPhp()[line]);
			}else if(mundo.getNome().equalsIgnoreCase("Ruby on rails")) {
				mundo.setInstantes(leitura.getRuby()[line]);
			}else if(mundo.getNome().equalsIgnoreCase("JavaScript")) {
				mundo.setInstantes(leitura.getJs()[line]);
			}else if(mundo.getNome().equalsIgnoreCase("Python")){
				mundo.setInstantes(leitura.getPython()[line]);
			}
			
			mundo.transladar();
		}		
	}
	
	//Interação com o usuario

	
	public  void executarTeste() {
		imprimir.imprimirMenu();
		try {
			leitura.lerTeste();
		} catch (java.util.InputMismatchException e) {
			imprimir.impMenuTryCatch(leitura);
			leitura.limparBuffer();
		}
	}
	
	//Passa os dados dos arquivos para as classes
	public void assignData(int line) {
		assignDataPlanets(line);
		dev.gerarPosicoes(mundos, leitura.getDevs()[line]);
		leitura.setDev(leitura.getDevs()[line]);
		bug.gerarPosicoes(mundos, leitura.getBugs()[line]);
		leitura.setBug(leitura.getBugs()[line]);
	}
	

	public  void executar(){
		
		setDatas = new RelatorioDao();
		
		frame.setDev(dev);
		frame.setBug(bug);
		
		for (Mundo mundo : mundos) {
			
		 	mundo.rotacionar();
		 	mundo.contarAnos();
		 	verificar.testeNorteSul(mundo);
		 	verificar.testeAlinhado(mundo);
		}
		
		
		datas = new DataBase(mundos, verificar);
		
		for (int i = 0; i < leitura.getQntDevs() - 1; i++) {
			for (int j = 0; j < leitura.getQntBugs() - 1; j++) {
				if(dev.posX.get(i) == bug.posX.get(j) && dev.posY.get(i) == bug.posY.get(j)) {
					System.out.println("IGUAL!!!");
					System.out.println(dev.posX.get(i) + "," + dev.posY.get(i));
				}
			}
		}
		
		addActionButton();
		
		
		executarTeste();
		if(leitura.getTeste() != 1) {
//			imprimir.printRelatorioFinal(mundos);
		} 
	}
	

	
	
	
	//Preenche o ArrayList  com todos os dados
	public void passarDados(List<String[]> datasRead) {
		DataBase receber = new DataBase();
    	for (int i = 0; i < datasRead.size(); i++) {
			receber.setNome(datasRead.get(i)[0]);
//			System.out.println("Passando: " + datasRead.get(i)[0]);
			receber.setMatricula(datasRead.get(i)[1]);
			receber.setNomeArquivo(datasRead.get(i)[2]);
			try {
				receber.setbPython(Integer.parseInt(datasRead.get(i)[3]));
				receber.setbJS(Integer.parseInt(datasRead.get(i)[4]));
				receber.setbRuby(Integer.parseInt(datasRead.get(i)[5]));
				receber.setbPhp(Integer.parseInt(datasRead.get(i)[6]));
				receber.setbCSharp(Integer.parseInt(datasRead.get(i)[7]));
				receber.setbCPlusPlus(Integer.parseInt(datasRead.get(i)[8]));
				receber.setbC(Integer.parseInt(datasRead.get(i)[9]));
				receber.setdPython(Integer.parseInt(datasRead.get(i)[10]));
				receber.setdJS(Integer.parseInt(datasRead.get(i)[11]));
				receber.setdRuby(Integer.parseInt(datasRead.get(i)[12]));
				receber.setdPhp(Integer.parseInt(datasRead.get(i)[13]));
				receber.setdCSharp(Integer.parseInt(datasRead.get(i)[14]));
				receber.setdCPlusPlus(Integer.parseInt(datasRead.get(i)[15]));
				receber.setdC(Integer.parseInt(datasRead.get(i)[16]));
				receber.setvPython(Integer.parseInt(datasRead.get(i)[17]));
				receber.setvJS(Integer.parseInt(datasRead.get(i)[18]));
				receber.setvRuby(Integer.parseInt(datasRead.get(i)[19]));
				receber.setvPhp(Integer.parseInt(datasRead.get(i)[20]));
				receber.setvCSharp(Integer.parseInt(datasRead.get(i)[21]));
				receber.setvCPlusPlus(Integer.parseInt(datasRead.get(i)[22]));
				receber.setvC(Integer.parseInt(datasRead.get(i)[23]));
				receber.setDiasPython(Integer.parseInt(datasRead.get(i)[24]));
				receber.setDiasJS(Integer.parseInt(datasRead.get(i)[25]));
				receber.setDiasRuby(Integer.parseInt(datasRead.get(i)[26]));
				receber.setDiasPhp(Integer.parseInt(datasRead.get(i)[27]));
				receber.setDiasCSharp(Integer.parseInt(datasRead.get(i)[28]));
				receber.setDiasCPlusPlus(Integer.parseInt(datasRead.get(i)[29]));
				receber.setDiasC(Integer.parseInt(datasRead.get(i)[30]));
				receber.setaPython(Integer.parseInt(datasRead.get(i)[31]));
				receber.setaJS(Integer.parseInt(datasRead.get(i)[32]));
				receber.setaRuby(Integer.parseInt(datasRead.get(i)[33]));
				receber.setaPhp(Integer.parseInt(datasRead.get(i)[34]));
				receber.setaCSharp(Integer.parseInt(datasRead.get(i)[35]));
				receber.setaCPlusPlus(Integer.parseInt(datasRead.get(i)[36]));
				receber.setaC(Integer.parseInt(datasRead.get(i)[37]));
				receber.setB1(Integer.parseInt(datasRead.get(i)[38]));
				receber.setB2(Integer.parseInt(datasRead.get(i)[39]));
				receber.setB3(Integer.parseInt(datasRead.get(i)[40]));
				receber.setB4(Integer.parseInt(datasRead.get(i)[41]));
				receber.setD1(Integer.parseInt(datasRead.get(i)[38]));
				receber.setD2(Integer.parseInt(datasRead.get(i)[39]));
				receber.setD3(Integer.parseInt(datasRead.get(i)[40]));
				receber.setD4(Integer.parseInt(datasRead.get(i)[41]));
				listData.add(receber);
			} catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("Erro no formato do número");
			}
		}
    	
	}
		 
	public  void comunicacao() {
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

}

