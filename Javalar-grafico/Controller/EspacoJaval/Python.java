package EspacoJaval;

public class Python extends Mundo implements Configuracao{
	
	public Python(String nome, int posX, int posY) {
		this.setNome(nome);
		getCordenadas().setPosX(posX);
		getCordenadas().setPosY(posY);
		configurar();
	}
	@Override
	public void configurar() {
		getCordenadas().setEixoNorte(9);
		getCordenadas().setEixoOeste(7);
		getCordenadas().setEixoSul(7);
		getCordenadas().setEixoLeste(9);
		this.setvTranslacao(4);
		this.setTamOrbita(8);
		this.setvRotacao(24);
		this.setVivo(true);
		this.setResumo("Python eh uma linguagem de programacao de alto nivel, foi lançado no inicio da decada de 90 pelo programador\n"
				+ "e matematico holandes Guido Van Rossum. A linguagem oferece recursos como tipagem dinamica e forte , orientacao a objetos,\n"
				+ "multiparadigmas (programacao funcional e imperativa), alem de recursos poderosos em biblioteca padrao e via modulos e frameworks\n"
				+ "desenvolvidos pela comunidade. Seu codigo eh aberto e a utilizacao eh gratuita, rodando em praticamente qualquer sistema operacional.");
	}
}
