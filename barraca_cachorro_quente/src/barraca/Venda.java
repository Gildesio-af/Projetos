package barraca;

import java.util.Scanner;

public class Venda {
	Scanner teclado = new Scanner(System.in);
	private Cliente cliente = new Cliente();
	private CachorroQuente cQuente = new CachorroQuente();
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public CachorroQuente getcQuente() {
		return cQuente;
	}
	public void setcQuente(CachorroQuente cQuente) {
		this.cQuente = cQuente;
	}
	
	public void vender(Cliente cliente, CachorroQuente cQuente) {
		System.out.println("Ja possui cadastro? S/N");
		String teste = teclado.nextLine();
		if(teste.equals("s") || teste.equals("S")) {
			System.out.println("Escolha sua proteina: \n" + 
					" Salsicha, linguica, frango ou bacon");
					String proteina = teclado.nextLine();
					System.out.println("Escolha seu queijo:\n" + 
					"Mussarela, prato, parmesao ou coalho.");
					String queijo = teclado.nextLine();
					System.out.println("Deseja algum ingrediente adicional? S/N");
					String teste2 = teclado.nextLine();
					if(teste2.equals("s") || teste2.equals("S")) {
						
						System.out.println("Escolha (um ou mais): \n" + 
					"Maiones, ketchup, ovo e batata palha.");
						String ingAdicional = teclado.nextLine();
						cliente.montarCachorroQuente(proteina, queijo, ingAdicional, cQuente);
					}
					System.out.println("Deseja alguma bebida? S/N");
					String teste3 = teclado.nextLine();
					if(teste3.equals("s") || teste3.equals("S")) {
						System.out.println("Qual? \n" + 
					"Coca-cola, Del Rio, ou Suco do Chaves");
						String bebida = teclado.nextLine();
						cliente.escolherBebida(bebida);
					}
					cliente.montarCachorroQuente(proteina, queijo, cQuente);
		}else {
			System.out.println("Qual seu nome?");
			String nome = teclado.nextLine();
			System.out.println("Qual sua matricula");
			cliente.fazerCadastro(nome, Integer.parseInt(teclado.nextLine()));
			
			System.out.println("Escolha sua proteina: \n" + 
			" Salsicha, linguica, frango ou bacon");
			String proteina = teclado.nextLine();
			System.out.println("Escolha seu queijo:\n" + 
			"Mussarela, prato, parmesao ou coalho.");
			String queijo = teclado.nextLine();
			System.out.println("Deseja algum ingrediente adicional? S/N");
			String teste2 = teclado.nextLine();
			if(teste2.equals("s") || teste2.equals("S")) {
				
				System.out.println("Escolha (um ou mais): \n" + 
			"Maiones, ketchup, ovo e batata palha.");
				String ingAdicional = teclado.nextLine();
				cliente.montarCachorroQuente(proteina, queijo, ingAdicional, cQuente);
			}
			System.out.println("Deseja alguma bebida? S/N");
			String teste3 = teclado.nextLine();
			if(teste3.equals("s") || teste3.equals("S")) {
				System.out.println("Qual? \n" + 
			"Coca-cola, Del Rio, ou Suco do Chaves");
				String bebida = teclado.nextLine();
				cliente.escolherBebida(bebida);
			}
			cliente.montarCachorroQuente(proteina, queijo, cQuente);
			
		}
	}
	
}
