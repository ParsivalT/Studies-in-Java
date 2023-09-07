package br.com.senaisp.thiago.licao07;
/**
 * Exercitando os conceitos de OOP Polimorfismo, Herança
 * 
 * @author Thiago
 *
 */

// Abstract impossibilita a criação de um objeto apartir desta classe

public abstract class Mamifero {
	private String nome;
	private int idade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public abstract void falar(); 
	
	
	protected void alimentar() {
		System.out.println("Alimentando-se");
	}
	
}
