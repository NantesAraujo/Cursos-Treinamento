package br.com.company.interfaces.impl;

import br.com.company.entity.Funcionario;
import br.com.company.interfaces.RegraDeCalculo;

public class DezOuVintePorCento implements RegraDeCalculo {

	public double calcula(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 3000.0)
			return funcionario.getSalarioBase() * 0.8;
		else
			return funcionario.getSalarioBase() * 0.9;
	}
}
