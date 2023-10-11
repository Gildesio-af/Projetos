package EspacoJaval;

public class Dev extends Personagens{
	private int identificacao = 2;
	
	@Override
	public void mudarVelocidade(Mundo m) {
		m.setvTranslacao(m.getvTranslacao() + 1);
		
	}
	
	public int getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}

}
