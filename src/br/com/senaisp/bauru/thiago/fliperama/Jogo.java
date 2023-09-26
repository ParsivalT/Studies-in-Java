package br.com.senaisp.bauru.thiago.licao07;

import java.util.Random;

public class Jogo {
	// Campos
	
	private Random rnd;
	private int custoCredito;
	private int tickets;
	private String titulo;
	
	// Constructor
	
	public Jogo () {
		rnd = new Random();
		custoCredito = rnd.nextInt(10)+ 1;
		tickets = rnd.nextInt(15)+1;
		titulo = "Sem titulo";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getCustoCredito() {
		return custoCredito;
	}

	public int getTickets() {
		return tickets;
	}
	
	// Metodos
	public void lerCartao(Cartao ct) {
			if (ct.getCreditos() < getCustoCredito()) {
				System.out.println("Infelizmente Você não possui Saldo Suficiente para o jogo.");
			}
			else {
				int saldo = ct.getCreditos() - getCustoCredito();
				ct.setCreditos(saldo);
				
				saldo = ct.getTickets() + getTickets();
				ct.setTickets(saldo);
				
				System.out.println("-------------------------------------");
				System.out.println("Saldo atual:");
				System.out.println(ct.toString());
			}
	}
	@Override
	public String toString() {
		return "Nome do jogo: " + titulo + "\n" +
				"Preço: " + custoCredito + "\n" +
				"Ticket cedidos: " + tickets;
	}
}
