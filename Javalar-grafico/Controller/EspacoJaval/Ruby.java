package EspacoJaval;

public class Ruby extends Mundo implements Configuracao{
	public Ruby(String nome, int posX, int posY) {
		this.setNome(nome);
		getCordenadas().setPosX(posX);
		getCordenadas().setPosY(posY);
		configurar();
	}
	
	@Override
	public void configurar() {

		getCordenadas().setEixoNorte(11);
		getCordenadas().setEixoOeste(5);
		getCordenadas().setEixoSul(5);
		getCordenadas().setEixoLeste(11);
		this.setvTranslacao(2);
		this.setTamOrbita(24);
		this.setvRotacao(48);
		this.setVivo(true);
		this.setResumo("Ruby eh uma linguagem de programacao interpretada multiparadigma, de tipagem dinamica e forte, \n"
				+ "com gerenciamento de memoria automatico, originalmente planejada e desenvolvida no Japao em 1995, \n "
				+ "por Yukihiro \"Matz\" Matsumoto, para ser usada como linguagem de script. Ruby suporta programacao \n"
				+ "funcional, orientada a objetos, imperativa e reflexiva. Foi inspirada principalmente por Python.");
	}
}
