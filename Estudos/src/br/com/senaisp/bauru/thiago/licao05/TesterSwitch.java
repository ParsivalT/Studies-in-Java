package br.com.senaisp.bauru.thiago.licao05;

import java.util.Scanner;

public class TesterSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("==========================");
		System.out.println("     Menu de opções");
		System.out.println("==========================");
		System.out.println("A - Adição");
		System.out.println("B - Subtração");
		System.out.println("C - Multiplicação");
		System.out.println("D - Divisão");
		System.out.println("E - Resto");
		System.out.println("F - Fim");
		System.out.println("==========================");
		System.out.println("Digite sua opção: ");
		
		char opc = scan.nextLine().charAt(0);
		
		System.out.println("Digite o Primeiro valor: ");
		int valor1 = scan.nextInt();
		
		System.out.println("Digite o Segundo valor: ");
		int valor2 = scan.nextInt();
		
		int resultado = 0;
		
		switch(Character.toUpperCase(opc)) {
		case 'A': resultado = valor1 + valor2;break;
		case 'B': resultado = valor1 - valor2;break; 
		case 'C': resultado = valor1 * valor2;break;
		case 'D': resultado = valor1 / valor2;break;
		case 'E': resultado = valor1 % valor2;break;
		
		default: 
			resultado = 0;
		}
		
		if (resultado != 0) {
			System.out.println("Resultado: " + resultado);
		}
		
		
		
	}

}
