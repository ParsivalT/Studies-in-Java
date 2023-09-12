package br.com.senaisp.thiago.empresa;

public class Operador extends Funcionario {

	private String setor;
	
	public Operador(String nome, String cargo, int idade, float vlrHora) {
		
		super.setNome(nome);
		super.setCargo(cargo);
		super.setIdade(idade);
		super.setValorHora(vlrHora);
		super.gerarFuncional();
	}
	

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public void calculaSalario() {
		super.setSalario(getHoras_trabalhadas()*getValor_hora());
	}
}
