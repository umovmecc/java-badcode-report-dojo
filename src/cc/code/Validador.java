package cc.code;

import java.util.ArrayList;
import java.util.List;

import cc.code.model.Pessoa;

public class Validador {

	private static final String ERRO_CPF_INVÁLIDO = "Erro - CPF inválido";
	private static final String ERRO_TELEFONE_INVALIDO = "Erro - Telefone inválido";

	protected List<String> validarPessoa(Pessoa pessoa) {
		
		List<String> constraints = new ArrayList<String>();
		if (pessoa != null) {
			if (pessoa.getCpf() != null) {
				
				if (!CPF.valida(pessoa.getCpf())) {
					constraints.add(ERRO_CPF_INVÁLIDO);
					return constraints;
				}
								
				if (pessoa.getNome() != null) {
					
					if (!validaTelefone(pessoa.getTelefone())) {
						constraints.add(ERRO_TELEFONE_INVALIDO);
						return constraints;
					}
				}
			}
		}

		return constraints;
	}

	private boolean validaTelefone(String telefone) {
		if (telefone == null || telefone.isEmpty()) {
			return true;
		}
		if ( !isTelefoneValido(telefone) ) {
			return false;
		}
		return true;
	}
	
	private boolean isTelefoneValido(String telefone) {
		return telefone.isEmpty() || telefone.length() == 10;
	}
}