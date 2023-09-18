package barraca;

public class Cliente {
	private String nome;
	private int nMatricula, nCompras;
	private CachorroQuente cachorroQuente = new CachorroQuente();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getnMatricula() {
		return nMatricula;
	}
	public void setnMatricula(int nMatricula) {
		this.nMatricula = nMatricula;
	}
	
	public CachorroQuente getcQuente() {
		return cachorroQuente;
	}
	public void setcQuente(CachorroQuente cQuente) {
		this.cachorroQuente = cQuente;
	}
	
	public int getnCompras() {
		return nCompras;
	}
	public void setnCompras(int nCompras) {
		this.nCompras += nCompras;
	}
	public CachorroQuente getCachorroQuente() {
		return cachorroQuente;
	}
	public void setCachorroQuente(CachorroQuente cachorroQuente) {
		this.cachorroQuente = cachorroQuente;
	}
	
	public void escolherBebida(String bebida) {
		this.cachorroQuente.setBebida(bebida);
	}
	
	public void fazerCadastro(String nome, int nMatricula) {
		this.setNome(nome);
		this.setnMatricula(nMatricula);
	}
	
	public void montarCachorroQuente(String proteina, String queijo,
			CachorroQuente cQuente) {
		this.cachorroQuente.setProteina(proteina);
		this.cachorroQuente.setQueijo(queijo);
		this.setCachorroQuente(cQuente);
	}
	
	public void montarCachorroQuente(String proteina, String queijo, String ingAdicionais,
			CachorroQuente cquente) {
		this.cachorroQuente.setProteina(proteina);
		this.cachorroQuente.setQueijo(queijo);
		this.cachorroQuente.setIngAdicionais(ingAdicionais);
		this.setCachorroQuente(cquente);
	}
	
	public void adicionarIng(String ingAdicionais) {
		this.cachorroQuente.setIngAdicionais(ingAdicionais);
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Matricula: " + this.nMatricula);
		System.out.println("Proteina: " + this.cachorroQuente.getProteina());
		System.out.println("Queijo: " + this.cachorroQuente.getQueijo());
		System.out.println("Ingrediente adicional: " + this.cachorroQuente.getIngAdicionais());
		System.out.println("Bebida: " + this.cachorroQuente.getBebida());
	}
	
}
