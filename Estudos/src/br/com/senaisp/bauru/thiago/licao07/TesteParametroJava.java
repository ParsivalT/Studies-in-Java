package br.com.senaisp.thiago.licao07;
/**
 * 
 * @author Thiago
 *
 */
public class TesteParametrosVariaveis {

	public static void main(String[] args) {
		String[] frutas = {"Pera", "Uvas", "Laranja", "Banana"};
		listarValoresV1(frutas);
		System.out.println("-------");
		listarValoresV2("Pera", "Maça");
	}
	
	// Função responsavel por listar os valores de um vetor.
	public static void listarValoresV1(String[] par) {
		for(String it : par) {
			System.out.println(it);
		}
	}
	
	public static void listarValoresV2(String ... par) {
		for(String it : par) {
			System.out.println(it);
		}
	}
	
}
