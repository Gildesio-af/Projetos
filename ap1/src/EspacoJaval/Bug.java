package EspacoJaval;

public class Bug extends Personagens{
	private int identificacao = 1;
	

	@Override
	public void mudarVelocidade(Mundo m) {
		m.setvTranslacao(m.getvTranslacao() - 1);
	}
	
	
	public int getIdentificacao() {
		this.posX.add(7);
		this.posY.add(9);
		return identificacao;
	}

	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}

}
