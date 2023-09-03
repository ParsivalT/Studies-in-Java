package br.com.senaisp.bauru.thiago.licao01;
import java.util.Scanner;

/**
 * 
 * @author Thiago
 * 
 */
public class HelloWorld {
	public static void main(String[] args)
	{
		// Recebendo a entrada do usuario.
		Scanner scan = new Scanner(System.in);
		
		// Imprimindo a entrada na tela.
		System.out.print("Insira seu nome: ");
		String nome = scan.nextLine();
		System.out.println("\nHello, " + nome + "!");
	}
}
