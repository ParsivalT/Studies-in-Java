package br.com.senaisp.thiago.licao07;

/**
 * 
 * Objetivo: Testar argumentos passados via linha de comando para a classe.
 *
 * @author Thiago
 *
 */
public class TesteParametroJava {

	public static void main(String[] args) {
		/*
		 * Listando os argumentos passados atraves da linha de comando atraves do
		 * laço de repetição foreatch.
		 */

		for (String item : args) {
			System.out.println(item);
			}
		
		System.out.println("-----------X----------");
		System.out.println("Fim do programa");
	}

}
