package br.com.senaisp.bauru.thiago.licao02;
/**
 * 
 * Classe para testar os metodos da classe Estudante.
 * @author Thiago
 *
 */
public class EstudanteTeste {

	public static void main(String[] args) {

		// Instanciando a classe Estudante e definindo os valores iniciais usando os setters
		Estudante estudante = new Estudante();

		estudante.setNome("David");
		estudante.setFumante(true);
		estudante.setAltura(1.60);
		estudante.setIdade(24);

		// Instanciando a classe e passando os valores iniciais como argumentos.
		Estudante estudante2 = new Estudante("Peter Parker", 25, 1.78, false);

		System.out.println("Nome: "+ estudante.getNome());
		System.out.println(estudante2.toString());

	}

}