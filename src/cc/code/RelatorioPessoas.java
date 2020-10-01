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
	public static List<String> imprime(List<Pessoa> pessoas){
		
		List<String> listaImpressao = new ArrayList<String>();
		
		for (Pessoa pessoa : pessoas ) {
			
			Validation validador = new Validation();
			List<String> erro = validador.validaPessoa(pessoa);
			
			if(!erro.isEmpty()) {
				listaImpressao.addAll(erro);
				continue;
			}
			
			listaImpressao.add(pessoa.getName());			
		}
		
		return listaImpressao;
	}
	
	/**
	 * codigo principal
	 * @param args
	 */
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setName("Fulano");
		pessoa1.setCpf("0033435457");
		ArrayList<String> pessoaTelefonesFixos = new ArrayList<String>();
		pessoaTelefonesFixos.add("8765343");
		pessoa1.setTelefonesFixos(pessoaTelefonesFixos);
		
		List<String> resultado = imprime(pessoas);
		System.out.print(String.join(", ", resultado));
	}
}