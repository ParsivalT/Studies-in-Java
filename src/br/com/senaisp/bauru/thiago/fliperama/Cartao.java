package br.com.senaisp.bauru.thiago.licao07;

public class Cartao {
	// Campos necessarios
	// Numero do cartão 
	// Saldo de creditos
	// Saldo de tickets
	
	private static int sequenciaCartao = 0;
	// Campos 
	private int numeroCartao;
	private int creditos;
	private int tickets;
	
	// Constructor Default
	public Cartao () {
		numeroCartao = ++sequenciaCartao;
		creditos = 0;
		tickets = 0;
	}
	
	// Getters e Setters
	
	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public int getTickets() {
		return tickets;
	}

	public void setTickets(int tickets) {
		this.tickets = tickets;
	}

	public int getNumeroCartao() {
		return numeroCartao;
	}

	@Override
	public String toString() {
		return "Cartão numero: " + numeroCartao + "\n" + 
				"Saldo de creditos: " + creditos + "\n" + 
				"Saldo tickets: " + tickets;
	}
}
