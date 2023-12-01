package EspacoJaval;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public abstract class Personagens {
	public List<Integer> posX = new ArrayList<>();
	public List<Integer> posY = new ArrayList<>();
	List<Integer[]> posDisponivel = new ArrayList<Integer[]>();
	double x , y;
	
	private boolean intacto;
	
	//gerar posições disponiveis
	public void gerarPosicoesDisponiveis() {
		for (int i = 1; i <= 15; i++) {
			for (int j = 1; j <= 15; j++) {
				posDisponivel.add(new Integer[] {i,j});
			}
		}
		//posicao do java
		posDisponivel.remove(113);
	}

	public void gerarPosicoes(List<Mundo> mundos, int quantidade) {
		gerarPosicoesDisponiveis();
		List<Integer[]> copiaPosDisp = new ArrayList<Integer[]>(posDisponivel);
		Random random = new Random();
		
		//metodo para remoção das coordenadas dos planetas
		removerPos(mundos, copiaPosDisp);
		//metodo para remoção das coordenadas dos devs/bugs
		removerPos(this, copiaPosDisp);
		for (int i = 0; i < quantidade; i++) {
			int posAleatoria = random.nextInt(copiaPosDisp.size());
			this.posX.add(copiaPosDisp.get(posAleatoria)[0]);
			this.posY.add(copiaPosDisp.get(posAleatoria)[1]);
			copiaPosDisp.remove(posAleatoria);
		}
		
	}
	
	private void removerPos(List<Mundo> mundos, List<Integer[]> copia) {
		for (int i = 0; i < mundos.size(); i++) {
			for (int j = 0; j < copia.size(); j++) {
				if(mundos.get(i).getCordenadas().getPosX() == copia.get(j)[0] && mundos.get(i).getCordenadas().getPosY() == copia.get(j)[1]) {
					copia.remove(j);
				}
			}
		}
	}       
	
	private void removerPos(Personagens p, List<Integer[]> copia) {
		for (int i = 0; i <p.posX.size(); i++) {
			for (int j = 0; j < copia.size(); j++) {
				if(p.posX.get(i) == copia.get(j)[0] && p.posY.get(i) == copia.get(j)[1]) {
					copia.remove(j);
				}
			}
		}
	}  
	
	public void imprimirPosicoes() {
	    for (Integer[] posicao : posDisponivel) {
	        int x = posicao[0]; // Primeiro indice do vetor
	        int y = posicao[1]; // Segundo indice do vetor
	        System.out.println("x: " + x + ", y: " + y);
	    }
	}
	
	
	public abstract void mudarVelocidade(Mundo m);

	public boolean isIntacto() {
		return intacto;
	}

	public void setIntacto(boolean intacto) {
		this.intacto = intacto;
	}
}
