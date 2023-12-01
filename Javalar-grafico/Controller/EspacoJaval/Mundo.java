package EspacoJaval;

public abstract class Mundo{
	private int vTranslacao, nBugs = 0, nDesenvolvedores = 0, tamOrbita = 0, contVoltas = 0, instantes, deslocamento;
    private int dias = 0, anos = 0;
    private float vRotacao;
    private int vMedia;
    private String resumo, nome, posicao;
    private boolean vivo = true, alinhado = false;
    private ParOrdenado cordenadas;

    public Mundo() {
		cordenadas = new ParOrdenado();
	} 

	//testar
    public void rotacionar(){
        for (int i = 0; i < instantes; i++) {
            this.dias += this.vRotacao;
        }
        this.setDias((int) this.getDias());
    }
     //testado
	public  void transladar(){

        for (int i = 0; i < instantes; i++) {

            for (int j = 0; j < this.getvTranslacao(); j++) {
                //Primeira condicao: verifica em qual eixo esta, segunda: verifica se esta na curva
                
                if(cordenadas.getPosY() == cordenadas.getEixoNorte() && cordenadas.getPosX() != cordenadas.getEixoOeste() ){//mover no norte
                    cordenadas.moverNorte();
                    contVoltas++;
                    continue;

                }else if(cordenadas.getPosY() == cordenadas.getEixoNorte() && cordenadas.getPosX() == cordenadas.getEixoOeste() ){//fazer curva
                    cordenadas.moverOeste();
                    contVoltas++;
                    continue;

                }else if(cordenadas.getPosX() == cordenadas.getEixoOeste() && cordenadas.getPosY() != cordenadas.getEixoSul()){//mover no oeste
                    cordenadas.moverOeste();
                    contVoltas++;
                    continue;

                }else if(cordenadas.getPosX() == cordenadas.getEixoOeste() && cordenadas.getPosY() == cordenadas.getEixoSul()){//fazer curva
                    cordenadas.moverSul();
                    contVoltas++;
                    continue;

                }else if(cordenadas.getPosY() == cordenadas.getEixoSul() && cordenadas.getPosX() != cordenadas.getEixoNorte()){//mover no sul
                    cordenadas.moverSul();
                    contVoltas++;
                    continue;

                }else if(cordenadas.getPosY() == cordenadas.getEixoSul() && cordenadas.getPosX() == cordenadas.getEixoLeste()){//fazer curva
                    cordenadas.moverLeste();
                    contVoltas++;
                    continue;

                }else if(cordenadas.getPosX() == cordenadas.getEixoLeste() && cordenadas.getPosY() != cordenadas.getEixoNorte()){//mover no leste
                    cordenadas.moverLeste();
                    contVoltas++;
                    continue;

                }else if(cordenadas.getPosX() == cordenadas.getEixoLeste() && cordenadas.getPosY() == cordenadas.getEixoNorte())
                    cordenadas.moverNorte();
                	contVoltas++;
                	continue;
            } 
        }
        
        deslocamento = instantes * getvTranslacao();
//        System.out.println(this.nome + ": " + "(" + cordenadas.getPosX() +"," + cordenadas.getPosY()+ ")" + "-" + vTranslacao);
    }
	
	//testado
	public void contarAnos() {
		this.setAnos(this.getContVoltas() / this.getTamOrbita());
	}

    //novo
	 public void morrer() {
			 this.setVivo(false);
//			 cordenadas.setPosX(0);
//			 cordenadas.setPosY(0);
		 
	 }
	 
	 //Fazer um teste das posicoes antes,dps testat a identificacao
	 public void colidirBug (Bug bug, int posicao) {

		this.setvTranslacao(this.getvTranslacao() - 1);
		this.setnBugs(this.getnBugs() + 1);
		if(this.getvTranslacao() <= 0) {
				this.morrer();
			}
		
		bug.posX.remove(posicao);
		bug.posY.remove(posicao);
	 }
	 
	 public void colidirDev (Dev dev, int posicao) {
	
		this.setvTranslacao(this.getvTranslacao() + 1);
		this.setnDesenvolvedores(this.getnDesenvolvedores() + 1);	
		dev.posX.remove(posicao);
		dev.posY.remove(posicao);
	 }
	 
	 
	 
//	 public void colidir

    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//gets e setters
    public int getvTranslacao() {
        return vTranslacao;
    }
    public void setvTranslacao(int vTranslacao) {
        this.vTranslacao = vTranslacao;
    }
    public float getvRotacao() {
        return vRotacao;
    }
    public void setvRotacao(float vRotacao) {
        this.vRotacao = vRotacao;
    }
    public int getnBugs() {
        return nBugs;
    }
    public void setnBugs(int nBugs) {
        this.nBugs = nBugs;
    }
    public int getnDesenvolvedores() {
        return nDesenvolvedores;
    }
    public void setnDesenvolvedores(int nDesenvolvedores) {
        this.nDesenvolvedores = nDesenvolvedores;
    }
    public float getDias() {
        return dias;
    }
    public void setDias(int dias) {
        this.dias = dias;
    }
    public float getAnos() {
        return anos;
    }
    public void setAnos(float anos) {
        this.anos += anos;
    }
    public String getResumo() {
        return resumo;
    }
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    public boolean isVivo() {
        return vivo;
    }
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public int getTamOrbita() {
        return tamOrbita;
    }

    public void setTamOrbita(int tamOrbita) {
        this.tamOrbita = tamOrbita;
    }

    public boolean isAlinhado() {
        return alinhado;
    }

    public void setAlinhado(boolean alinhado) {
        this.alinhado = alinhado;
    }

	public int getContVoltas() {
		return contVoltas;
	}

	public void setContVoltas(int contVoltas) {
		this.contVoltas = contVoltas;
	}

	public ParOrdenado getCordenadas() {
		return cordenadas;
	}

	public void setCordenadas(ParOrdenado cordenadas) {
		this.cordenadas = cordenadas;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public double getvMedia() {
		return vMedia;
	}

	public void setvMedia(int vMedia) {
		this.vMedia = vMedia;
	}
	
	
	public void setInstantes(int instantes) {
		this.instantes = instantes;
	}
	
//	public void setSomaInstantes(int somaInstantes) {
//		this.deslocamento += somaInstantes;
//	}

	public int getInstantes() {
		return instantes;
	}
	
	public int getDeslocamento() {
		return deslocamento;
	}
	
}
