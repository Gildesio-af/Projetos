package EspacoJaval;

public class C extends Mundo implements Configuracao{
	
	public C(String nome, int posX, int posY) {
		this.setNome(nome);
		getCordenadas().setPosX(posX);
		getCordenadas().setPosY(posY);
		configurar();
	}

	@Override
	public void configurar() {
		getCordenadas().setEixoNorte(15);
		getCordenadas().setEixoOeste(1);
		getCordenadas().setEixoSul(1);
		getCordenadas().setEixoLeste(15);
		this.setvTranslacao(10);
		this.setTamOrbita(56);
		this.setvRotacao(0.1f);
		this.setVivo(true);
		this.setResumo("C eh uma linguagem de programacao compilada de proposito geral, estruturada, imperativa, procedural, \n"
				+ "padronizada pela Organizacao Internacional para Padronizacao (ISO), criada em 1972 por Dennis Ritchie na \n"
				+ "empresa AT&T Bell Labs para desenvolvimento do sistema operacional Unix (originalmente escrito em Assembly).\r\n"
				+ "C eh uma das linguagens de programacao mais conhecidas e existem poucas arquiteturas para as quais nao existem \n"
				+ "compiladores para C. Ela tem influenciado muitas outras linguagens de programacao (por exemplo, a linguagem Java),\n"
				+ "mais notavelmente C++, que originalmente comecou como uma extensao para C");
		
	}

}
