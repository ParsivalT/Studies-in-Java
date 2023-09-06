package br.com.senaisp.thiago.licao07;

import java.util.Scanner;

/**
 * Tratando exceções em java.
 * 
 * @author Thiago
 *
 */

// Metodo principal.
public class TesteValoresTry {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int opc;
		do {
			menu();
			System.out.println(">> ");
			
			try {
				opc = scan.nextInt();
			}
			catch (Exception e) {
				clearConsole();
				System.out.println("Digite números somente!");
				opc =0;
				scan.nextLine();
			}
			
			if(opc<1 || opc>9 || opc>4 && opc<9) {
				clearConsole();
				System.out.println("Opção Invalida!");
				opc=0;
				
			}
		}
		while(opc<1 || opc>9);
		
		System.out.println("Opção escolhida foi: " + opc);
	}
	
	// Função que limpa o console.
	public final static void clearConsole()
	{
	    try
	    {
	       Thread.sleep(1000);
	       new ProcessBuilder("Clear").inheritIO().start().waitFor();
	    }
	    catch (final Exception e)
	    {
	    	//
	    }
	}
	
	public static void menu( ) {
		// Menu do programa.
		System.out.println("====================");
		System.out.println("Menu de opções");
		System.out.println("1 - Cadastro");
		System.out.println("2 - Consulta");
		System.out.println("3 - Exclusão");
		System.out.println("4 - Listagem");
		System.out.println("9 - Fim");
		System.out.println("====================");
	}
	

}
