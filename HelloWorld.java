package br.com.senaisp.bauru.thiago;
import java.util.Scanner;

/**
 * 
 * @author ThiagoFelix
 * 
 */

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira seu nome: ");
		String nome = scan.nextLine();
		System.out.println("\nHello, " + nome + "!");
		

	}

}

