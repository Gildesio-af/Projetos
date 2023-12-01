package verificacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import EspacoJaval.Bug;
import EspacoJaval.Dev;
import EspacoJaval.Mundo;
import Interacao.Impressao;
import data.DataBase;
import view.Frame;

public class Verificacoes {
	private boolean testeColisao;
	public ArrayList<Integer> posX;
	public ArrayList<Integer> posY;
	private int[] numBugQuadrante = new int[4];
	private int[] numDevQuadrante = new int[4];
	private int[] nMortes = new int[7];
	List<DataBase> listData;
	
	private int planetasNorte , planetasSul, planetaEquador, b1 = 0,b2 = 0,b3 = 0,b4 = 0, d1 = 0,d2 = 0,d3 = 0,d4 = 0;
	
	public Verificacoes() {
		posX = new ArrayList<Integer>();
		posY = new ArrayList<Integer>();
	}
	
//	Verificar colis]oes dos planetas com os bugs
	public boolean verificarColisao(List<Mundo> mundos, Bug bug, Frame frame) {
		for (int i = 0; i < mundos.size(); i++) {
			for (int j = 0; j < bug.posX.size(); j++) {
				if(mundos.get(i).getCordenadas().getPosX() == bug.posX.get(j) && mundos.get(i).getCordenadas().getPosY() == bug.posY.get(j)) {
					posX.add(bug.posX.get(j));
					posY.add(bug.posY.get(j));
					System.out.println(mundos.get(i).getNome() + " Colidiu com um bug x: " + bug.posX.get(j) + " y: " + bug.posY.get(j));
					mundos.get(i).colidirBug(bug, j);
					
					frame.getMesh().removeBug(mundos.get(i).getCordenadas().getPosX(), mundos.get(i).getCordenadas().getPosY());
					
//					frame.getMesh().removeBug(bug.posX.get(j), bug.posY.get(j));
//					frame.getMesh().revalidate(bug.posX.get(j), bug.posY.get(j));
//					frame.getMesh().repaint(bug.posX.get(j), bug.posY.get(j));
					testeColisao = true;
				}
			}
		}
		return testeColisao;
	}
	
//	public boolean verificarColisao(List<Mundo> mundos, Bug bug) {
//		for (int i = 0; i < mundos.size(); i++) {
//			for (int j = 0; j < bug.posX.size(); j++) {
//				if(mundos.get(i).getCordenadas().getPosX() == bug.posX.get(j) && mundos.get(i).getCordenadas().getPosY() == bug.posY.get(j)) {
//					System.out.println(mundos.get(i).getNome() +" Colidiu com um bug x: " + bug.posX.get(j) + " y: " + bug.posY.get(j));
//					mundos.get(i).colidirBug(bug, j);
//
//					testeColisao = true;
//				}
//			}
//		}
//		return testeColisao;
//	}
	
	public boolean verificarColisao(List<Mundo> mundos, Dev dev, Frame frame) {
		for (int i = 0; i < mundos.size(); i++) {
			for (int j = 0; j < dev.posX.size(); j++) {
				if(mundos.get(i).getCordenadas().getPosX() == dev.posX.get(j) && mundos.get(i).getCordenadas().getPosY() == dev.posY.get(j)) {
					System.out.println(mundos.get(i).getNome() + " colidiu com um dev x: " + dev.posX.get(j) + " y:" + dev.posY.get(j));
					mundos.get(i).colidirDev(dev, j);
					posX.add(dev.posX.get(j));
					posY.add(dev.posY.get(j));
					
					
					frame.getMesh().removeDev(mundos.get(i).getCordenadas().getPosX(), mundos.get(i).getCordenadas().getPosY());

					
//					frame.getMesh().removeDev(dev.posX.get(j), dev.posY.get(j));
//					frame.getMesh().revalidate(dev.posX.get(j), dev.posY.get(j));
//					frame.getMesh().repaint(dev.posX.get(j), dev.posY.get(j));
					testeColisao = true;
				}
			}
		}
		return testeColisao;
	}
	
	public void verificarQuadrante(Bug bug) {
		for (int i = 0; i < bug.posX.size(); i++) {
			if(bug.posX.get(i) > 8 && bug.posY.get(i) > 7) {
				b1++;
			}else if(bug.posX.get(i) < 9 && bug.posY.get(i) > 7) {
				b2++;
			}else if(bug.posX.get(i) > 8 && bug.posY.get(i) < 8) {
				b3++;
			}else {
				b4++;
			}
		}
	}
	
//	public void separateNames() {
//		int x = 0; // Posicão que vai ser adicionado o próximo nome
//		List<String> nomes = new ArrayList<String>();
//
//		
//		nomes.add(listData.get(0).getNome());  //Pegar o primeiro nome
//		for (int i = 0; i < listData.size(); i++) {
//			if( !(nomes.get(x).equals(listData.get(i).getNome()))) {//Testar para não pegar nomes repetidos
//				x++;
//				nomes.add(listData.get(i).getNome());
//			}
//		}
//		
//		int[] posicoes = new int[nomes.size()];
//
//		for (int i = 0; i < posicoes.length; i++) {
//			for (int j = 0; j < listData.size(); j++) {
//				if(nomes.get(i).equals(listData.get(j).getNome())) {//Pega o numero de repetiçoes que um nome se repetiu
//					posicoes[i]++; 
//					
//				}
//			}
//		}
//
//		
//		String nome = nomes.get(getPosicaoMaior(posicoes));
//		System.out.println(nome);
//		
//	}
//	
	
	public String separateNames(List<String[]> datasRead) {
		int x = 0; // Posicão que vai ser adicionado o próximo nome
		List<String> nomes = new ArrayList<String>();

		
		nomes.add(datasRead.get(0)[0]);  //Pegar o primeiro nome
		
		
		for (int i = 0; i < datasRead.size(); i++) {
			if(!(nomes.get(x).equalsIgnoreCase(datasRead.get(i)[0]))) {//Testar para não pegar nomes repetidos
				nomes.add(datasRead.get(i)[0]);
				x++;
			}
		}
		System.out.println("Tamanho pelo x:" + x);
		System.out.println("Quantidade de nomes: " + nomes.size());
		
		
		
//		for (int i = 0; i < nomes.size(); i++) {
//			System.out.println(nomes.get(i));
//		}
		
		int[] posicoes = new int[nomes.size()];

		for (int i = 0; i < posicoes.length; i++) {
			for (int j = 0; j < datasRead.size(); j++) {
				if(nomes.get(i).equals(datasRead.get(j)[0])) {//Pega o numero de repetiçoes que um nome se repetiu
					posicoes[i]++; 
					
				}
			}
		}
		
		return nomes.get(getPosicaoMaior(posicoes));
		
	}
	
	
	public int getPosicaoMaior(int[] array) {
      if (array == null || array.length == 0) {
      // Lida com arrays vazios ou nulos
    	  return -1;
      }
      
      int posMaior = 0;
      int nMaior = array[0];
      
      for (int i = 0; i < array.length; i++) {
    	if (array[i] > nMaior) {
    		nMaior = array[i];
    		posMaior = i;
    	}
      }
      
      return posMaior;
	}
	
	public int getPosicaoMenor(int[] array) {
		int posMenor = 0;
		int nMenor = array[0];
		
	      for (int i = 0; i > array.length; i++) {
	      	if (array[i] < nMenor) {
	      		nMenor = array[i];
	      		posMenor = i;
	      	}
	       }
		
		return posMenor;
	}
	
	
	
	public int[] getQuantidadeMortes(List<String[]> datasRead) {
		int python = 0, js = 0, ruby = 0, php = 0, cSharp = 0, cMais = 0, c = 0;
		
		for (int i = 0; i < datasRead.size(); i++) {
			if(Integer.parseInt(datasRead.get(i)[17]) == 0) 
				python++;
			if(Integer.parseInt(datasRead.get(i)[18]) == 0)
				js++;	
			if(Integer.parseInt(datasRead.get(i)[19]) == 0)
				ruby++;
			if(Integer.parseInt(datasRead.get(i)[20]) == 0) 
				php++;
			if (Integer.parseInt(datasRead.get(i)[21]) == 0) 
				cSharp++;
			if(Integer.parseInt(datasRead.get(i)[22]) == 0)
				cMais++;
			if(Integer.parseInt(datasRead.get(i)[23]) == 0)
				c++;
		}
		
		int [] nMortes = {python, js, ruby,php, cSharp, cMais, c};
//		for (int i = 0; i < nMortes.length; i++) {
//			System.out.println(nMortes[i]);
//		}
		return nMortes;
	}
	
	public String getMaisMorreu(int[] nMortes) {
		
		int posMaior = getPosicaoMaior(nMortes);
		
		if(posMaior == 0) {
			return "Python";
		}else if(posMaior == 1) {
			return "Java Script";
		}else if(posMaior == 2) {
			return "Ruby on Rails";
		}else if(posMaior == 3) {
			return "PHP";
		}else if(posMaior == 4) {
			return "C Sharp";
		}else if(posMaior == 5) {
			return "C++";
		}else {
			return "C";
		}
	}
	
	public String getMenosMorreu(int[] nMortes) {
		int posMenor = getPosicaoMenor(nMortes);
		
		if(posMenor== 0) {
			return "Python";
		}else if(posMenor== 1) {
			return "Java Script";
		}else if(posMenor== 2) {
			return "Ruby on Rails";
		}else if(posMenor== 3) {
			return "PHP";
		}else if(posMenor== 4) {
			return "C Sharp";
		}else if(posMenor== 5) {
			return "C++";
		}else {
			return "C";
		}
	}
	
	
	//Tava aqui kdjlaffdssadfasjfkjkajskkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
	public String getQuadranteBug(List<String[]> datasRead) {
		int q1 = 0, q2 = 0, q3 = 0, q4 = 0;
		
		for (int i = 0; i < datasRead.size(); i++) {
			try {
				q1 += Integer.parseInt(datasRead.get(i)[38]);
				q2 += Integer.parseInt(datasRead.get(i)[39]);
				q3 += Integer.parseInt(datasRead.get(i)[40]);
				q4 += Integer.parseInt(datasRead.get(i)[41]);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			
		}
		int[] qntPorQuadrante = {q1,q2,q3,q4};
		numBugQuadrante = qntPorQuadrante;
		int posMaior = getPosicaoMaior(qntPorQuadrante);
		
		if(posMaior == 0) {
			return "Quadrante 1";
		}else if(posMaior == 1) {
			return "Quadrante 2";
		}else if(posMaior == 2) {
			return "Quadrante 3";
		}else {
			return "Quadrante 4";
		}
	}
	
	//Multiplicar pelo tam da Orbita
	public int[] verificarVMedia(List<String[]> datasRead, List<Mundo> mundos) {
		
		int vTotalPython = 0, vTotalJs = 0, vTotalRuby = 0, vTotalPhp = 0, vTotalCSharp = 0,
			vTotalCMais = 0, vTotalC = 0;
		
		for (int i = 0; i < datasRead.size(); i++) {
			try {
				vTotalPython += Integer.parseInt(datasRead.get(i)[17]);
				vTotalJs += Integer.parseInt(datasRead.get(i)[18]);
				vTotalRuby += Integer.parseInt(datasRead.get(i)[19]);
				vTotalPhp += Integer.parseInt(datasRead.get(i)[20]);
				vTotalCSharp += Integer.parseInt(datasRead.get(i)[21]);
				vTotalCMais += Integer.parseInt(datasRead.get(i)[22]);
				vTotalC += Integer.parseInt(datasRead.get(i)[23]);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("V total p: :" + vTotalPython);
		
		
		
		int[] totAnos = getQuantidadeAnosTotais(datasRead);
		System.out.println("Anos " + totAnos[1]);
		int[] velocidadesMedias = {totAnos[0] * mundos.get(0).getTamOrbita() / totAnos[0], totAnos[1] * mundos.get(1).getTamOrbita() / totAnos[1],
				 totAnos[2] * mundos.get(2).getTamOrbita() / totAnos[2], totAnos[3] * mundos.get(3).getTamOrbita()/ totAnos[3],
				 totAnos[4] * mundos.get(4).getTamOrbita() / totAnos[4], totAnos[5] * mundos.get(5).getTamOrbita() / totAnos[5], 
				 totAnos[6] * mundos.get(6).getTamOrbita() / totAnos[6]};
		
		return velocidadesMedias;
		
	}
	
	public int getQuantidadeBug() {
		int totBug = 0;
		for (int i = 0; i < numBugQuadrante.length; i++) {
			totBug += numBugQuadrante[i];
		}
		return totBug;
	}
	
	public int getQuantidadeDev() {
		int totDev = 0;
		for (int i = 0; i < numDevQuadrante.length; i++) {
			totDev += numDevQuadrante[i];
		}
		
		return totDev;
	}
	
	
	public int getQuantidadeHoras(List<String[]> datasRead) {
		//Variaveis para as velocidadades
		int python = 0, js = 0, ruby = 0, php = 0, cSharp = 0, cMais = 0, c = 0;
		for (int i = 0; i < nMortes.length; i++) {
			python += Integer.parseInt(datasRead.get(i)[24]);
			js += Integer.parseInt(datasRead.get(i)[25]);
			ruby += Integer.parseInt(datasRead.get(i)[26]);
			php += Integer.parseInt(datasRead.get(i)[27]);
			cSharp += Integer.parseInt(datasRead.get(i)[28]);
			cMais += Integer.parseInt(datasRead.get(i)[39]);
			c += Integer.parseInt(datasRead.get(i)[30]);
		}
		
		int totHoras = (python + ruby + php + cSharp + cMais + c) * 24;
		 
		return totHoras;
	}
	
	
	public int[] getQuantidadeAnosTotais(List<String[]> datasRead) {
		//Variaveis para os anos
		int python = 0, js = 0, ruby = 0, php = 0, cSharp = 0, cMais = 0, c = 0;
		try {
			for (int i = 0; i < datasRead.size(); i++) {
				python += Integer.parseInt(datasRead.get(i)[31]);
				js += Integer.parseInt(datasRead.get(i)[32]);
				ruby += Integer.parseInt(datasRead.get(i)[33]);
				php += Integer.parseInt(datasRead.get(i)[34]);
				cSharp += Integer.parseInt(datasRead.get(i)[35]);
				cMais += Integer.parseInt(datasRead.get(i)[36]);
				c += Integer.parseInt(datasRead.get(i)[37]);
			}
		} catch (Exception e) {
			System.out.println("Dados vazios nos anos");
		}
		
		int[] anos = {python, js, ruby, php, cSharp, cMais, c};
		return anos;
	}
 	
	public String getQuadranteDev(List<String[]> datasRead) {
		int q1 = 0, q2 = 0, q3 = 0, q4 = 0;
		int dadosNullDev = 0;
		
		for (int i = 0; i < datasRead.size(); i++) {
			try {
				q1 += Integer.parseInt(datasRead.get(i)[42]);
				q2 += Integer.parseInt(datasRead.get(i)[43]);
				q3 += Integer.parseInt(datasRead.get(i)[44]);
	 			q4 += Integer.parseInt(datasRead.get(i)[45]);
			} catch (NumberFormatException e) {
				dadosNullDev++;
			}
		}
		System.out.println("Numeros de devs vazios: " + dadosNullDev);
		int[] qntPorQuadrante = {q1,q2,q3,q4}; 
		numDevQuadrante = qntPorQuadrante;
		int posMaior = getPosicaoMaior(qntPorQuadrante);
		
		if(posMaior == 0) {
			return "Quadrante 1";
		}else if(posMaior == 1) {
			return "Quadrante 2";
		}else if(posMaior == 2) {
			return "Quadrante 3";
		}else {
			return "Quadrante 4";
		}
	}
	
	public int[] getQuantidadeAnosPorDia(List<String[]> datasRead) {
		//Variaveis para pegar a quantidade de dias
		int python = 0, js = 0, ruby = 0, php = 0, cSharp = 0, cMais = 0, c = 0;
		try {
			for (int i = 0; i < datasRead.size(); i++) {
				python += Integer.parseInt(datasRead.get(i)[24]);
				js += Integer.parseInt(datasRead.get(i)[25]);
				ruby += Integer.parseInt(datasRead.get(i)[26]);
				php += Integer.parseInt(datasRead.get(i)[27]);
				cSharp += Integer.parseInt(datasRead.get(i)[28]);
				cMais += Integer.parseInt(datasRead.get(i)[29]);
				c += Integer.parseInt(datasRead.get(i)[30]);
			}
		} catch (Exception e) {
			System.out.println("Dados vazios nos dias!");
		}
		
		int[] totAnos = {python * 365, js * 365, ruby * 365, php * 365, cSharp * 365, cMais * 365, c * 365};
		
		return totAnos;
	}
	
	
	
	
	
	public void verificarQuadrante(Dev dev) {

		for (int i = 0; i < dev.posX.size(); i++) {
			if(dev.posX.get(i) > 8 && dev.posY.get(i) > 7) {
				d1++;
			}else if(dev.posX.get(i) < 9 && dev.posY.get(i) > 7) {
				d2++;
			}else if(dev.posX.get(i) > 8 && dev.posY.get(i) < 8) {
				d3++;
			}else {
				d4++;
			}
		}
	}
	
//	public boolean verificarColisao(List<Mundo> mundos, Dev dev) {
//		for (int i = 0; i < mundos.size(); i++) {
//			for (int j = 0; j < dev.posX.size(); j++) {
//				if(mundos.get(i).getCordenadas().getPosX() == dev.posX.get(j) && mundos.get(i).getCordenadas().getPosY() == dev.posY.get(j)) {
//					System.out.println(mundos.get(i).getNome() + " colidiu com um dev x: " + dev.posX.get(j) + " y:" + dev.posY.get(j));
//					mundos.get(i).colidirDev(dev, j);				
//					testeColisao = true;
//				}
//			}
//		}
//		return testeColisao;
//	}
	
	public void testeAlinhado(Mundo mundo){
        if((mundo.getCordenadas().getPosX() == mundo.getCordenadas().getEixoOeste() && mundo.getCordenadas().getPosY() == mundo.getCordenadas().getEixoNorte()) ){
            mundo.setAlinhado(true);
        }else if(mundo.getCordenadas().getPosX() == mundo.getCordenadas().getEixoOeste() &&  mundo.getCordenadas().getEixoSul() == mundo.getCordenadas().getPosY()) {
        	mundo.setAlinhado(true);
        }else if(mundo.getCordenadas().getPosY() == mundo.getCordenadas().getEixoSul() && mundo.getCordenadas().getPosX() == mundo.getCordenadas().getEixoLeste()){
        	mundo.setAlinhado(true);
        }else if(mundo.getCordenadas().getPosY() == mundo.getCordenadas().getEixoNorte() && mundo.getCordenadas().getPosX() == mundo.getCordenadas().getEixoLeste()){
        	mundo.setAlinhado(true);
        }else if(mundo.getCordenadas().getPosX() == 8){
        	mundo.setAlinhado(true);
        }
    }
            
	
	public void testeNorteSul(Mundo mundo) {
		
		if(mundo.getCordenadas().getPosY() > 8) {
			mundo.setPosicao("norte");
			planetasNorte++;
		}else if(mundo.getCordenadas().getPosY() < 8) {
			mundo.setPosicao("sul");
			planetasSul++;
		}else {
			mundo.setPosicao("equador");
			planetaEquador++;
		}
	}
	
    public int findIndex(int x, int y) {
    	int index = (15 - y) * 15 + (15 - x);
       	return index;
    }

	public int getPlanetasNorte() {
		return planetasNorte;
	}

	public void setPlanetasNorte(int planetasNorte) {
		this.planetasNorte = planetasNorte;
	}

	public int getPlanetasSul() {
		return planetasSul;
	}

	public void setPlanetasSul(int planetasSul) {
		this.planetasSul = planetasSul;
	}

	public int getPlanetaEquador() {
		return planetaEquador;
	}

	public void setPlanetaEquador(int planetaEquador) {
		this.planetaEquador = planetaEquador;
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
	
	public void setListData(List<DataBase> listData) {
		this.listData = listData;
	}
}
