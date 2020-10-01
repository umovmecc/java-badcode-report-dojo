package cc.code;

import java.util.ArrayList;
import java.util.List;

import cc.code.model.Pessoa;

public class Validation {

	private static final String ERRO_TELEFONE_INVALIDO = "Erro - Telefone inválido";

	protected List<String> validaPessoa(Pessoa pessoa) {
		
		List<String> constraints = new ArrayList<String>();
		if (pessoa != null) {
			if (pessoa.getCpf() != null) {
				if (pessoa.getName() != null) {
					
					if (!validaTelefonesFixos(pessoa.getTelefonesFixos())) {
						constraints.add(ERRO_TELEFONE_INVALIDO);
					}
					
					if (!validaTelefonesCelulares(pessoa.getTelefonesCelulares())) {
						constraints.add(ERRO_TELEFONE_INVALIDO);
					}
				}
			}
		}

		return constraints;
	}

	private boolean validaTelefonesFixos(List<String> telefones) {
		if (telefones == null || telefones.isEmpty()) {
			return true;
		}
		for (String telefone: telefones) {
			if ( !isTelefoneFixoValido(telefone) ) {
				return false;
			}
		}
		return true;
	}
	
	private boolean isTelefoneFixoValido(String telefone) {
		return telefone.isEmpty() || telefone.length() >= 7;
	}
	
	private boolean validaTelefonesCelulares(List<String> celulares) {
		if (celulares == null || celulares.isEmpty()) {
			return true;
		}
		for (String celular: celulares) {
			if ( !isTelefoneCelularValido(celular) ) {
				return false;
			}
		}
		return true;
	}
 	
	private boolean isTelefoneCelularValido(String celular) {
		return celular.isEmpty() || celular.length() == 10;
	}
}