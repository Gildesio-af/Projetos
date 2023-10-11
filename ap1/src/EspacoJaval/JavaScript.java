package EspacoJaval;

public class JavaScript extends Mundo implements Configuracao{
	public JavaScript(String nome, int posX, int posY) {
		this.setNome(nome);
		getCordenadas().setPosX(posX);
		getCordenadas().setPosY(posY);
		configurar();
	}
	
	@Override
    public void configurar() {
		getCordenadas().setEixoNorte(10);
		getCordenadas().setEixoOeste(6);
		getCordenadas().setEixoSul(6);
		getCordenadas().setEixoLeste(10);
		this.setvTranslacao(3);
		this.setTamOrbita(16);
		this.setvRotacao(10);
		this.setVivo(true);
		this.setResumo("JavaScript (JS) eh uma linguagem de programacao interpretada estruturada, de script em alto nivel com tipagem dinamica\n "
				+ "fraca e multiparadigma. Juntamente com HTML e CSS, o JavaScript eh uma das tres principais tecnologias da World Wide Web.\n"
				+ "JavaScript permite paginas da Web interativas e, portanto, eh uma parte essencial dos aplicativos da web. A grande maioria \n"
				+ "dos sites usa, e todos os principais navegadores tem um mecanismo JavaScript dedicado para executa-lo");
	}
}
