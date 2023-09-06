package br.com.senaisp.bauru.thiago.licao05;

import java.util.Scanner;

/**
 * 
 * @author Thiago
 * 
 */
public class TesterOperadorTenario {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = scan.nextInt();

        System.out.printf("Você %s de idade!%n", idade >= 18 ? "é maior" : "é menor");
    }
}