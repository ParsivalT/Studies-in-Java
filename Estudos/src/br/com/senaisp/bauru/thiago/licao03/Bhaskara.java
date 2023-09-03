package br.com.senaisp.bauru.thiago.licao03;

/**
 * Classe para calcular a formula de bhaskara;
 * 
 * @author Thiago
 * 
 */
import java.util.Scanner;
import java.lang.Math;

public class Bhaskara {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Coletando os valores de A, B, C
		System.out.println("=====================================");
		System.out.println("Programa de calculo trigonométrico");
		System.out.println("=====================================");

		System.out.print("Digite o valor de A: ");
		int a = scan.nextInt();

		System.out.print("Digite o valor de B: ");
		int b = scan.nextInt();

		System.out.print("Digite o valor de C: ");
		int c = scan.nextInt();


		// Calculando o delta
		double delta = Math.pow(b,2) -4 * a * c;

		// Calculando x1 e x2
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);


		// Mostrando o resultado
		System.out.println("=====================================");
		System.out.println("Valor de Delta: " + delta);
		System.out.println("Valor de X1: " + x1);
		System.out.println("Valor de X2: " + x2);
		System.out.println("=====================================");

		scan.close();
	}

}