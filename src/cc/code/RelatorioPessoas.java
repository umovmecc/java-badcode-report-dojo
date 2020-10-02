package cc.code;
import java.util.ArrayList;
import java.util.List;

import cc.code.model.Pessoa;
import cc.code.validator.ValidadorPessoa;

/**
 * Relatório de pessoas
 * @author Deus
 */
public class RelatorioPessoas {
	
	/**
	 * Imprime a lista de pessoas
	 * @param pessoas
	 */
	public static List<String> imprime(List<Pessoa> pessoas){
		
		List<String> listaImpressao = new ArrayList<String>();
		
		for (Pessoa pessoa : pessoas ) {
			
			ValidadorPessoa validador = new ValidadorPessoa();
			List<String> erro = validador.validarPessoa(pessoa);
			
			if(!erro.isEmpty()) {
				listaImpressao.addAll(erro);
				continue;
			}
			
			listaImpressao.add(pessoa.toString());			
		}
		
		return listaImpressao;
	}
	
	/**
	 * codigo principal
	 * @param args
	 */
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		
		Pessoa pessoa = new Pessoa("Fulano", "02288739088", "5181511682");

		pessoas.add(pessoa);
		List<String> resultado = imprime(pessoas);
		System.out.print(String.join("\n -- \n", resultado));
	}
}