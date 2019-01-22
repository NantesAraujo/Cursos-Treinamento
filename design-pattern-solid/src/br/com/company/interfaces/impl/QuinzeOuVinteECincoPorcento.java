package br.com.company.interfaces.impl;

import br.com.company.entity.Funcionario;
import br.com.company.interfaces.RegraDeCalculo;

public class QuinzeOuVinteECincoPorcento implements RegraDeCalculo {

	public double calcula(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 2000.0)
			return funcionario.getSalarioBase() * 0.75;

		return 0;
	}
}
