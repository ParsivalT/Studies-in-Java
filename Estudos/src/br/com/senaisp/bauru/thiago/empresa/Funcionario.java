package br.com.senaisp.thiago.empresa;

import java.util.UUID;

public abstract class Funcionario {
	
	// Informações do funcionario.
	private String nome;
	private int idade;
	
	private String cargo;
	private String funcional;
	
	private float valor_hora;
	private double horas_trabalhadas;
	private double salario;
	
	
	public String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	protected void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCargo() {
		return cargo;
	}
	protected void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getFuncional() {
		return funcional;
	}
	protected void setFuncional(String funcional) {
		this.funcional = funcional;
	}
	
	public float getValor_hora() {
		return valor_hora;
	}
	protected void setValorHora(float vlrHora) {
		this.valor_hora = vlrHora;
	}
	
	public double getHoras_trabalhadas() {
		return horas_trabalhadas;
	}
	
	
	public void setHoras_trabalhadas(double horas_trabalhadas) {
		this.horas_trabalhadas += horas_trabalhadas;
	}
		
	public double getSalario() {
		return salario;
	}
	protected void setSalario(double salario) {
		this.salario = salario;
	}
	protected void gerarFuncional() {
		UUID uuid = UUID.randomUUID();
		String funcional = uuid.toString();
		
		setFuncional(funcional.substring(24));
	}

	
	
}
