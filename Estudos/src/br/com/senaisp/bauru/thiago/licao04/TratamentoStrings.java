package br.com.senaisp.bauru.thiago.licao04;

/**
 * 
 * @author Thiago
 */
public class TratamentoStrings {

	public static void main(String[] args) {
		String nome1 = "Parsival";
		String nome2 = new String("Parsival");

		if (nome1 == nome2) {
			System.out.println("São endereços iguais!");
		} else {
			System.out.println("São endereços diferentes!");
		}

		// para comparar o conteúdo dos objetos usamos equals
		if (nome1.equals(nome2)) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}

	}

}