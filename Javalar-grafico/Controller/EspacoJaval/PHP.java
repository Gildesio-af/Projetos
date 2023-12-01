package EspacoJaval;

public class PHP extends Mundo implements Configuracao{
	public PHP(String nome, int posX, int posY) {
		this.setNome(nome);
		getCordenadas().setPosX(posX);
		getCordenadas().setPosY(posY);
		configurar();
	}
	
	@Override
	public void configurar() {
		getCordenadas().setEixoNorte(12);
		getCordenadas().setEixoOeste(4);
		getCordenadas().setEixoSul(4);
		getCordenadas().setEixoLeste(12);
		this.setvTranslacao(2);
		this.setTamOrbita(32);
		this.setvRotacao(60);
		this.setVivo(true);
		this.setResumo("PHP eh uma linguagem interpretada livre, usada originalmente apenas para o desenvolvimento de aplicacoes\n"
				+ "presentes e atuantes no lado do servidor, capazes de gerar conteudo dinamico na World Wide Web. Concorrente \n"
				+ "direto da tecnologia ASP pertencente a Microsoft, o PHP eh utilizado em aplicacoes como o MediaWiki, Facebook,\n"
				+ "Drupal, Joomla!, WordPress, Magento e o Oscommerce.");
	}
}
