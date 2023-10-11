package EspacoJaval;

public class CSharp extends Mundo implements Configuracao{
	
	public CSharp(String nome, int posX, int posY) {
		this.setNome(nome);
		getCordenadas().setPosX(posX);
		getCordenadas().setPosY(posY);
		configurar();
	}
	
	@Override
	public void configurar() {
		getCordenadas().setEixoNorte(13);
		getCordenadas().setEixoOeste(3);
		getCordenadas().setEixoSul(3);
		getCordenadas().setEixoLeste(13);
		this.setvTranslacao(1);
		this.setTamOrbita(40);
		this.setvRotacao(4);
		this.setVivo(true);
		this.setResumo("O C# eh uma linguagem de programacao moderna, orientada a objeto e fortemente tipada. \n"
				+ "O C# permite que os desenvolvedores criem muitos tipos de aplicativos seguros e robustos que\n"
				+ " sao executados no .NET. O C# tem suas raizes na familia de linguagens C e os programadores \n"
				+ "em C, C++, Java e JavaScript a reconhecerao imediatamente. ");
	}
}
