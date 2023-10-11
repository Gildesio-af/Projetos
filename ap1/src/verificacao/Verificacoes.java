package verificacao;

import java.util.ArrayList;
import java.util.List;

import EspacoJaval.Bug;
import EspacoJaval.Dev;
import EspacoJaval.Mundo;
import Interacao.Impressao;

public class Verificacoes {
	private boolean testeColisao;
	private int planetasNorte , planetasSul, planetaEquador;
	
	//Verificar colis]oes dos planetas com os bugs
	public boolean verificarColisao(List<Mundo> mundos, Bug bug) {
		for (int i = 0; i < mundos.size(); i++) {
			for (int j = 0; j < bug.posX.size(); j++) {
				if(mundos.get(i).getCordenadas().getPosX() == bug.posX.get(j) && mundos.get(i).getCordenadas().getPosY() == bug.posY.get(j)) {
					System.out.println(mundos.get(i).getNome() +" Colidiu com um bug x: " + bug.posX.get(j) + " y: " + bug.posY.get(j));
					mundos.get(i).colidirBug(bug, j);
					
					testeColisao = true;
				}
			}
		}
		return testeColisao;
	}
	
	public boolean verificarColisao(List<Mundo> mundos, Dev dev) {
		for (int i = 0; i < mundos.size(); i++) {
			for (int j = 0; j < dev.posX.size(); j++) {
				if(mundos.get(i).getCordenadas().getPosX() == dev.posX.get(j) && mundos.get(i).getCordenadas().getPosY() == dev.posY.get(j)) {
					System.out.println(mundos.get(i).getNome() + " colidiu com um dev x: " + dev.posX.get(j) + " y:" + dev.posY.get(j));
					mundos.get(i).colidirDev(dev, j);
					
					testeColisao = true;
				}
			}
		}
		return testeColisao;
	}
	
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
	
}
