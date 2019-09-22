package cc.code.utils;

import cc.code.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Validation {

	public List<String> validate(Pessoa pessoa) {
		List<String> constraints = new ArrayList<String>();

		if (pessoa.getCpf() == null) {
			constraints.add("Erro - CPF não informado");
		}

		if (pessoa.getName() == null) {
			constraints.add("Erro - Nome não informado");
		}

		if (pessoa.getTelefonesFixos().isEmpty()) {
			constraints.add("Erro - Telefone Fixo não informado");
		} else {
			if (!this.isTelefone(pessoa.getTelefonesFixos())) {
				constraints.add("Erro - Telefone Fixo inválido");
			}
		}

		if (pessoa.getTelefonesCelulares().isEmpty()) {
			constraints.add("Erro - Telefone Celular não informado");
		} else {
			if (!this.isTelefone(pessoa.getTelefonesCelulares())) {
				constraints.add("Erro - Telefone Celular inválido");
			}
		}

		return constraints;
	}

	public boolean isTelefone(List<String> fones) {
		for (String fone : fones) {
			if (fone.length() < 10) {
				return false;
			}
		}

		return true;
	}
}