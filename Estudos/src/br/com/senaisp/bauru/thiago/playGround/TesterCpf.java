package br.com.senaisp.bauru.thiago.playGround;

import java.util.Scanner;

public class TesterCpf {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu CPF: ");
        String cpf = scan.nextLine();

        System.out.println(isValido(cpf));
    }

    public static boolean isValido(String cpf) {
        if (cpf.length() >= 11) {
            return true;
        }
        else {
            return false;
        }
    }
}
