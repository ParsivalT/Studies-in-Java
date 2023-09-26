package br.com.senaisp.bauru.thiago.licao07;

import java.util.Random;

public class CatergoriaPremio {
	// Campos
	
	private Random rnd;
	private String nomeCategoria;


	private int custoTickets;
	private int saldo;
	
	// Constructor 
	public CatergoriaPremio(String nome, int qtde) {
		rnd = new Random();
		custoTickets = rnd.nextInt(20)+1;
		nomeCategoria = nome;
		saldo = qtde;
		
	}
	
	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getCustoTickets() {
		return custoTickets;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nomeCategoria + "\n" +
			   "Custo: " + custoTickets + "\n" +
			   "Saldo: " + saldo;
	}
}
