/*
*@author Eduarda Jeniffer Steilein Gislon
*/

import java.util.Scanner;

public class MainCalculadora {
	
	public static void main(String[] args) {
		String expressao;
		int tipoPilha;
		String pilha = ""; 
	
		System.out.println("Escreva Expresao Aritmética");
		Scanner teclado = new Scanner(System.in);
		expressao = teclado.next();
		
		System.out.println("Qual pilha utilizar?");
		System.out.println("1- Vetor");
		System.out.println("2- Dinâmica");
		
		 tipoPilha = teclado.nextInt();
		 switch (tipoPilha) {
			 case 1:
				 pilha = "Vetor";
				 break;
			 case 2: 
				 pilha = "Dinamica";
				 
				 break;
			default:
				break;
		 }
		 System.out.println("Escolhido " + pilha);
		
		
		
	}

}
