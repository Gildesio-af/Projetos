package questoes;

import java.util.Scanner;

public class Questoes {
	Scanner teclado = new Scanner(System.in);
	public void questao1() {
		System.out.print("Digite um numero: ");
		int A = teclado.nextInt();
		System.out.println("Digite outro numero: ");
		int B = teclado.nextInt();
		
		if(A > 10) {
			System.out.println("A > 10");
		}
		if(A + B == 20)
				System.out.println("A + B == 20");
			else
				System.out.print("Numero nao valido");
	}
	
	
	public void questao2() {
		System.out.println("==============================================================");
		System.out.print("Digite um numero: ");
		int A = teclado.nextInt();
		System.out.print("Digite outro numero: ");
		int B = teclado.nextInt();
		
		if(A < 10) {
			System.out.println("A < 10");
		}else if(A + B == 20) {
			System.out.println("A + B == 20");
		}else 
			System.out.println("Numero nao valido");
	}
	
	
	public void questao3() {
		System.out.println("==============================================================");
		System.out.print("Digite um numero: ");
		int A = teclado.nextInt();
		System.out.print("Digite outro numero: ");
		int B = teclado.nextInt();
		
		if(A == 10) {
			System.out.println("A == 10");
			if(A + B == 20)
				System.out.println("A + B == 20");
			if(B == 10)
				System.out.println("B == 10");
		}
	}
	
	public void questao4() {
		System.out.println("==============================================================");
		System.out.print("Digite um numero: ");
		int A = teclado.nextInt();
		System.out.print("Digite outro numero: ");
		int B = teclado.nextInt();
		
		if(A > 10 || A + B == 20) {
			System.out.println("Numero valido");
		} else if(A == B) {
			System.out.println("A eh igual B");
			System.out.println("A e B sao diferentes de 10");
			System.out.println("A eh menor que 10");
		}else 
			System.out.println("Numero nao valido");
	}
	
	public void questao5() {
		System.out.println("==============================================================");
		System.out.print("Digite um numero: ");
		int A = teclado.nextInt();
		System.out.print("Digite outro numero: ");
		int B = teclado.nextInt();
		
		if(A > 10 || A + B == 20)
			System.out.println("Numero valido");
		else
			System.out.println("Numero nao valido");
	}
	
	public void questao6() {
		System.out.println("==============================================================");
		System.out.print("Digite um numero: ");
		int A = teclado.nextInt();
		System.out.print("Digite outro numero: ");
		int B = teclado.nextInt();
		
		if(A > 10)
			System.out.println("A > 10");
		else
			System.out.println("A <= 10");
		if(A + B == 20) {
			System.out.println("A + B == 20");
		}else
			System.out.println("A + B != 20");
	}
	
	public void questao7() {
		System.out.println("==============================================================");
		System.out.print("Digite um numero: ");
		int A = teclado.nextInt();
		System.out.print("Digite outro numero: ");
		int B = teclado.nextInt();
		
		if(A > 10 || A + B == 20) {
			System.out.println("Numeros validos");
			if(A <= 10)
				System.out.println("Numero nao valido");
		}else
			System.out.println("Numero nao valido");
	}
	
	public void questao8() {
		System.out.println("==============================================================");
		System.out.print("Digite um numero: ");
		int A = teclado.nextInt();
		System.out.print("Digite outro numero: ");
		int B = teclado.nextInt();
		
		if(A > 10) {
			System.out.println("A > B");
			if(A + B == 20) {
				System.out.println("A + B == 20");
			}
		}else
			System.out.println("Numero nao valido");
	}
	
	public void questao9() {
		System.out.println("==============================================================");
		System.out.print("Digite um numero: ");
		int A = teclado.nextInt();
		System.out.print("Digite outro numero: ");
		int B = teclado.nextInt();
		
		if(A > 10 && A + B == 20)
			System.out.println("A + B == 20");
		else
			System.out.println("Numero nao valido");
	}
	
	public void questao10() {
		System.out.println("==============================================================");
		System.out.print("Digite um numero: ");
		int A = teclado.nextInt();
		System.out.print("Digite outro numero: ");
		int B = teclado.nextInt();
		
		if(A <= 10) {
			System.out.println("Numero menor que 10");
		}
		if(A + B != 20) {
			System.out.println("Numero diferente de 20");
		}
	}
	
	public void questao11(){
		System.out.println("==============================================================");
		System.out.print("Digite um numero: ");
		int A = teclado.nextInt();
		System.out.print("Digite outro numero: ");
		int B = teclado.nextInt();
		
	    if(A <= 10){
	        if(A + B == 20){
	            System.out.println("A + B == 20");
	        }else
	            System.out.println("Numero nao valido");
	    }
	}

	public void questao12(){
		System.out.println("==============================================================");
		System.out.print("Digite um numero: ");
		int A = teclado.nextInt();
		System.out.print("Digite outro numero: ");
		int B = teclado.nextInt();
		
	    if(A > 10)
	        System.out.println("A > 10");
	    if(A + B == 20)
	        System.out.println("A + B == 20");
	    else if(A <= 10)
	        System.out.println("Numeros nao validos");

	    System.out.println("Sejam bem-vindos a disciplina de tecnicas de programacao");
	}

	public void questao13(){
		System.out.println("==============================================================");
		System.out.print("Digite um numero: ");
		int A = teclado.nextInt();
		System.out.print("Digite outro numero: ");
		int B = teclado.nextInt();
		
	    if(A > 10){
	         System.out.println(A > 10);
	    if(A + B == 20)
	    	System.out.println("A + B == 20");
	    }else if(A <= 10)
	    	System.out.println("Numeros nao validos");
	}
	
	public void questao14() {
		System.out.println("==============================================================");
		System.out.print("Digite um numero: ");
		int A = teclado.nextInt();
		System.out.print("Digite outro numero: ");
		int B = teclado.nextInt();
		
		if(A > 10) 
			System.out.println("A > 10");
		if(A + B == 20)
			System.out.println("A + B == 20");
		else if(A <= 10)
			System.out.println("Numero nao valido");
	}
	
	public void questao15() {
		System.out.println("==============================================================");
		System.out.print("Digite um numero: ");
		int A = teclado.nextInt();
		System.out.print("Digite outro numero: ");
		int B = teclado.nextInt();
		
		if(A < 10) 
			System.out.println("A < 10");
		if(A + B == 20)
			System.out.println("A + B == 20");
		else if(A <= 10)
			System.out.println("Numero nao valido");
	}
	
	public void questao16() {
		System.out.println("==============================================================");
		System.out.print("Digite um numero: ");
		int A = teclado.nextInt();
		System.out.print("Digite outro numero: ");
		int B = teclado.nextInt();
		
		if(A == 10)
			System.out.println("A == 10");
		if(A + B == 20)
			System.out.println("A + B = 20");
		if(B == 10)
			System.out.println("B == 10");
	}
	
	public void questao17() {
		System.out.println("==============================================================");
		System.out.print("Digite um numero: ");
		int A = teclado.nextInt();
		System.out.print("Digite outro numero: ");
		int B = teclado.nextInt();
		
		if(A > 10 || A + B == 20)
			System.out.println("Numero valido");
		else if(A == B) {
			System.out.println("A eh igual B");
		}else if(A != 10 && B != 10 && A < 10)
			System.out.println("A < 10");
		else
			System.out.println("Numero nao valido");
	}
	
	public void questao18() {
		System.out.println("==============================================================");
		System.out.print("Digite um numero: ");
		int A = teclado.nextInt();
		System.out.print("Digite outro numero: ");
		int B = teclado.nextInt();
		
		if(A > 10 || A + B == 20) {
			System.out.println("Numero valido");
		}else 
			System.out.println("Numero nao valido");
	}
	
	public void questao19() {
		System.out.println("==============================================================");
		System.out.print("Digite um numero: ");
		int A = teclado.nextInt();
		System.out.print("Digite outro numero: ");
		int B = teclado.nextInt();
		
		if(A > 10) {
			System.out.println("A > 10");
		}else
			System.out.println("A <= 10");
		if(A + B == 20)
			System.out.println("A + B == 20");
		else
			System.out.println("A + B != 20");
	}
	
	public void questao20() {
		System.out.println("==============================================================");
		System.out.print("Digite um numero: ");
		int A = teclado.nextInt();
		System.out.print("Digite outro numero: ");
		int B = teclado.nextInt();
		
		if(A > 10 || A + B == 20) {
			System.out.println("Numeros validos");
		}else
			System.out.println("Numero nao valido");
		
		System.out.println("Sejam bem-vindos a disciplina"
				+ " de tecnicas de programacao");
	}
}

