package cc.code;

import java.util.ArrayList;
import java.util.List;

import cc.code.model.Pessoa;

public class Validation {

	protected List<String> validaPessoa(Pessoa pessoa) {
		
		List<String> constraints = new ArrayList<String>();
		if (pessoa != null) {
			if (pessoa.getCpf() != null) {
				if (pessoa.getName() != null) {
					if (pessoa.getTelefonesFixos() != null) {
						for (String telefone : pessoa.getTelefonesFixos()) {
							if (telefone != null) {
								if (telefone.isEmpty()) {
									constraints.add("Erro - Telefone inválido");
									return constraints;
								} else {
									if(telefone.length() < 7){
										constraints.add("Erro - Telefone inválido");
										return constraints;
									}
								}
								
							} else {
								constraints.add("Erro - Telefone inválido");
								return constraints;
							}
						}
					}
				}
			}
		}

		return constraints;
	}
}