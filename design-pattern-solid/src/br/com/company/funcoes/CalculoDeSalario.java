package br.com.company.funcoes;

import br.com.company.entity.Funcionario;
import br.com.company.enums.Cargo;

public class CalculoDeSalario {

	public double Calcula(Funcionario funcionario){

		if(Cargo.DESENVOLVEDOR.equals(funcionario.getCargo()))
			return dezOuVintePorCento(funcionario);

		if(Cargo.DBA.equals(funcionario.getCargo()))
			return quinzeOuVinteCincoPorcento(funcionario);


		throw new RuntimeException("Funcionario invalido");
	}

	private double dezOuVintePorCento(Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 3000.0)
			return funcionario.getSalarioBase() * 0.8;

		return 0;
	}

	private double quinzeOuVinteCincoPorcento(Funcionario funcionario) {
			if(funcionario.getSalarioBase() > 2000.0)
				return funcionario.getSalarioBase() * 0.75;

			return 0;
		}
}