package br.com.senaisp.thiago.licao01;

import java.util.Scanner;
import java.util.Locale;
/**
 * 
 * Classe responsavel por converter Galões para Litros
 * @author Thiago
 * 
 */
public class Galoes2LitrosV2 {

	public static void main(String[] args) {
		// Criação de captura de teclado com o Scanner
		
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		double GALOES2LITROS = 3.785;
		double galoes;
		double litros;
		
		// Capturando a Entrada do Usuario.
		System.out.println("==================================================");
		System.out.println("Programa de conversão de Galões para Litros!");
		System.out.println("==================================================");
		System.out.print("Digite a quantidade de galões a ser convertida: ");
		
		// Realizando a conta de conversão
		galoes = scan.nextDouble();
		litros = galoes * GALOES2LITROS;
		
		// Mostrando os valores formatados.
		System.out.printf("Convertendo %.2f em para litros temos %.2f litros\n", galoes, litros);
		System.out.println("==================================================");

	}

}
