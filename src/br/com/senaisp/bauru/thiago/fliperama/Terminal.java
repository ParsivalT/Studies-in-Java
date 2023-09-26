package br.com.senaisp.bauru.thiago.licao07;

public class Terminal {
	// Campos
	
	private CatergoriaPremio[] categoria;
	
	// Constructor

	public Terminal (CatergoriaPremio[] cat) {
		categoria = cat;
	}
	
	// Getters e Setters
	public CatergoriaPremio[] getCategoria() {
		return categoria;
	}
	
	// Metodos
	public void consultarSaldo(Cartao ct) {
		System.out.println("----------------");
		System.out.println("Consulta de Saldo");
		System.out.println("----------------");
		System.out.println(ct.toString());
	}
	
	public void carregarCartao(Cartao ct, int valor) {
		int saldo = ct.getCreditos() + valor * 2;
		ct.setCreditos(saldo);
		
		System.out.println("----------------");
		System.out.println("Crédito de saldo");
		System.out.println("----------------");
		System.out.println(ct.toString());
	}
	
	public void permutarSaldo(Cartao ctOri, Cartao ctDes, int valor) {
		if (ctOri.getCreditos() < valor) {
			System.out.println("Não é possivel efetuar a permuta de credito! Saldo insuficiente");
		}
		else {
			int saldo = ctOri.getTickets() - valor;
			ctOri.setCreditos(saldo);
			
			saldo = ctDes.getCreditos() + valor;
			ctDes.setCreditos(saldo);
		}
	}
}	
