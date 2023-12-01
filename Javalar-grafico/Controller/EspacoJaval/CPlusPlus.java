package EspacoJaval;

public class CPlusPlus extends Mundo implements Configuracao{
	
	public CPlusPlus(String nome, int posX, int posY) {
		this.setNome(nome);
		getCordenadas().setPosX(posX);
		getCordenadas().setPosY(posY);
		configurar();
	}
	
	@Override
	public void configurar() {
		getCordenadas().setEixoNorte(14);
		getCordenadas().setEixoOeste(2);
		getCordenadas().setEixoSul(2);
		getCordenadas().setEixoLeste(14);
		this.setvTranslacao(2);
		this.setTamOrbita(48);
		this.setvRotacao(0.5f);
		this.setVivo(true);
		this.setResumo("C++ eh uma linguagem de programacao que foi lançada em 1985. Surgiu como uma expansao de C para inserir \n"
				+ "o paradigma de programacao orientada a objetos, tanto que inicialmente seu nome era “C com classes”.Eh uma linguagem \n"
				+ "de uso geral que permite acesso a recursos de baixo nível como ponteiros e recursos de alto nivel como construcao de novos\n"
				+ "tipos usando orientacao a objetos (classes) e recursos de programacao generica (templates).");
	}
}
