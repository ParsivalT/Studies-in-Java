package br.com.senaisp.thiago.licao02;

/**
 * Classe Para exercitar o 1° pilar da orientação da programação orientada a
 * objeto A Abstração.
 * 
 * @author Thiago
 *
 */

// Definindo as caracteristica de um Estudante.
public class Estudante {
	private String nome; // String (Sequencia de caracteres.)
	private int idade; // Int (Numeros sem casa decimal.)
	private double altura; // Double (2.567.... -45.654)
	private boolean fumante; // Booleano (True / False)
	public static final int BIMESTRES = 4; // Constante (Um valor que não pode ser alterado durante a execução do
											// codigo.)

	// Constructor padrão
	public Estudante() {

		nome = "";
		idade = 0;
		altura = 0;
		fumante = false;

	}

	// Constructor especifico com passagem de parâmetros.
	public Estudante(String nome, int idade, double altura, boolean fumante) {
		setNome(nome);
		setIdade(idade);
		setAltura(altura);
		setFumante(fumante);
	}

	// Criando os Getters
	public String getNome() {
		return this.nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public double getAltura() {
		return this.altura;
	}

	public boolean getFumante() {
		return this.fumante;
	}

	// Criando os Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setFumante(boolean fumante) {
		this.fumante = fumante;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nNome : " + getNome() +
			   "\nIdade: " + getIdade() +
			   "\nAltura : " + getAltura() + 
			   "\nFumante:" + getFumante();
				
	}

}
