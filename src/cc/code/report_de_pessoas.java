package cc.code;
import java.util.*;

/**
 * Relatório de pessoas
 * @author Deus
 */
public class report_de_pessoas {

	/**
	 * codigo principal
	 * @param args
	 */
	public static void main(String[] args) {
		List<Pessoa> listPessoas = new ArrayList<>();
		
		Pessoa p = new Pessoa();
		p.setName("Fulano");
		p.setCpf("0033435457");
		ArrayList<String> pessoaTelefonesFixos = new ArrayList<String>();
		pessoaTelefonesFixos.add("8765343");
		p.setTelefonesCelulares(pessoaTelefonesFixos);
		listPessoas.add(p);

		Pessoa p2 = new Pessoa();
		p2.setName("Roberto");
		p2.setTelefonesCelulares(pessoaTelefonesFixos);
		listPessoas.add(p2);

		ImpressaoService service = new ImpressaoService();
		service.imprimirPessoas(listPessoas);
	}
}