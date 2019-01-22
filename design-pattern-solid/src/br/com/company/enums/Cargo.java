package br.com.company.enums;

import br.com.company.interfaces.RegraDeCalculo;
import br.com.company.interfaces.impl.DezOuVintePorCento;
import br.com.company.interfaces.impl.QuinzeOuVinteECincoPorcento;

public enum Cargo {

	DESENVOLVEDOR(new DezOuVintePorCento()),
	DBA(new QuinzeOuVinteECincoPorcento());

	private RegraDeCalculo regra;

	Cargo(RegraDeCalculo regra) {
		this.regra = regra;
	}

	public RegraDeCalculo getRegra() {
		return regra;
	}
}
