package br.com.senaisp.bauru.thiago.licao01;

import java.util.Scanner;

/**
 * 
 * Conversor de Galões para Litros
 * 
 * @author Thiago
 * 
 */

public class Conversor {
	public static void main(String[] args) {
		// Capturando a entrada digitada atraves do teclado com o Scanner
		Scanner scan = new Scanner(System.in);

		final double GALOES2LITROS = 3.785; // Constante que armazena o valor de 1 galão convertido em litros
		double galoes;
		double litros;

		// Caputurando a Entrada do Usuario.
		System.out.println("==================================================");
		System.out.println("Programa de conversão de Galões para Litros!");
		System.out.println("==================================================");

		// Realizando a conversão
		System.out.print("Digite a quantidade de galões a ser convertida: ");
		galoes = scan.nextDouble();
		litros = galoes * GALOES2LITROS;

		// Mostrando os valores formatados.
		System.out.printf("Convertendo %.2f Galões para litros temos %.2f litros\n", galoes, litros);
		System.out.println("==================================================");

	}
}
