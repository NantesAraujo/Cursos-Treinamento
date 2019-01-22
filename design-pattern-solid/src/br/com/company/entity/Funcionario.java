package br.com.company.entity;

import br.com.company.enums.Cargo;

public class Funcionario {

	private String nome;

	private int matricula;

	private double salarioBase;

	private Cargo cargo;

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double calculaSalario() {
		return this.getCargo().getRegra().calcula(this);
	}
}
