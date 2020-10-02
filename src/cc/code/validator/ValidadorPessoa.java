package cc.code.validator;

import java.util.ArrayList;
import java.util.List;

import cc.code.model.Pessoa;

public class ValidadorPessoa {

	private static final String ERRO_CPF_INVÁLIDO = "Erro - CPF inválido";
	private static final String ERRO_TELEFONE_INVALIDO = "Erro - Telefone inválido";

	public List<String> validarPessoa(Pessoa pessoa) {
		
		List<String> constraints = new ArrayList<String>();
		if (pessoa != null) {
			if (pessoa.getCpf() != null) {
				
				if (!ValidadorCPF.valida(pessoa.getCpf())) {
					constraints.add(ERRO_CPF_INVÁLIDO);
					return constraints;
				}
								
				if (pessoa.getNome() != null) {
					if (!ValidadorTelefone.valida(pessoa.getTelefone())) {
						constraints.add(ERRO_TELEFONE_INVALIDO);
						return constraints;
					}
				}
			}
		}

		return constraints;
	}
}