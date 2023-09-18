package barraca;


public class Barraca {

	public static void main(String[] args) {
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		CachorroQuente cQuente = new CachorroQuente();
		
		venda.vender(cliente, cQuente);
		
		System.out.println("================");
		
		cliente.mostrarDados();
	}

}