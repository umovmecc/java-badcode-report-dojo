package cc.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import cc.code.RelatorioPessoas;
import cc.code.model.Pessoa;

public class RelatorioPessoasTest {
	
	private static final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	public List<Pessoa> pessoas = new ArrayList<>();
	
	@Before
	public void populaDados() {
		Pessoa pessoa = new Pessoa();
		pessoa.setName("Fulano");
		pessoa.setCpf("0033435457");
		ArrayList<String> pessoaTelefonesFixo = new ArrayList<String>();
		pessoaTelefonesFixo.add("8765343");
		pessoa.setTelefonesCelulares(pessoaTelefonesFixo);
		pessoas.add(pessoa);
	    System.setOut(new PrintStream(outputStreamCaptor));
	}
	
	@Test
	public void deveTestarAImpressaoDoRelatorioDePessoas() {
		
		RelatorioPessoas.imprime(pessoas);
		assertEquals("Fulano", outputStreamCaptor.toString().trim());
	}
}