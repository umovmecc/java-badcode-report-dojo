package cc.code;
import java.util.ArrayList;
import java.util.List;

import cc.code.model.Pessoa;

/**
 * Relatório de pessoas
 * @author Deus
 */
public class RelatorioPessoas {
	
	/**
	 * Imprime a lista de pessoas
	 * @param pessoas
	 */
	public static void imprime(List<Pessoa> pessoas){
		
		List<String> listaPessoas = new ArrayList<String>();
		
		for (Pessoa pessoa : pessoas ) {
			
			Validation validador = new Validation();
			List<String> erro = validador.validaPessoa(pessoa);
			
			if(!erro.isEmpty())
				continue;
			
			listaPessoas.add(pessoa.getName());			
		}
		System.out.print(String.join(",", listaPessoas));
	}
	
	/**
	 * codigo principal
	 * @param args
	 */
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setName("Fulano");
		pessoa.setCpf("0033435457");
		ArrayList<String> pessoaTelefonesFixos = new ArrayList<String>();
		pessoaTelefonesFixos.add("8765343");
		pessoa.setTelefonesCelulares(pessoaTelefonesFixos);
		pessoas.add(pessoa);
		
		imprime(pessoas);
	}
}