package cc.code;
import java.util.*;

/**
 * Relatório de pessoas
 * @author Deus
 */
public class report_de_pessoas {

	/**
	 * imprime a lista de pessoas
	 * @param paramL
	 */
	public static void print_e_vai(Vector paramL){
		for (int i = 0; i < paramL.size(); i++) {

			Pessoa p = (Pessoa) paramL.get(i);
			Validation validador = new Validation();
			List<String> erro = validador.validaPessoa(p);

			if(!erro.isEmpty())
				continue;
		}

		FormatterPessoa formatter = new FormatterPessoa();
		System.out.print(formatter.format(paramL));
	}

	/**
	 * codigo principal
	 * @param args
	 */
	public static void main(String[] args) {
		Vector v = new Vector();
		
		Pessoa p = new Pessoa();
		p.setName("Fulano");
		p.setCpf("0033435457");
		ArrayList<String> pessoaTelefonesFixos = new ArrayList<String>();
		pessoaTelefonesFixos.add("8765343");
		p.setTelefonesCelulares(pessoaTelefonesFixos);
		v.add(p);
		
		print_e_vai(v);
	}
}