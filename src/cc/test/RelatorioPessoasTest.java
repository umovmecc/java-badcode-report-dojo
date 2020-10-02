package cc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import cc.code.RelatorioPessoas;
import cc.code.model.Pessoa;

public class RelatorioPessoasTest {
	
	@Test
	public void deveImprimirRelatorioComSucesso() {
		
		List<Pessoa> pessoas = new ArrayList<>();
		Pessoa pessoa = new Pessoa("Fulano", "69185055050", "5181511682");
		pessoas.add(pessoa);
		
		List<String> resultado = RelatorioPessoas.imprime(pessoas);
		assertEquals(Arrays.asList(pessoa.toString()), resultado);
	}
	
	@Test
	public void deveTestarRelatorioComCelularInvalido() {
		
		List<Pessoa> pessoas = new ArrayList<>();
		Pessoa pessoa = new Pessoa("Fulano", "63182980025", "8765343");
		pessoas.add(pessoa);
		
		List<String> resultado = RelatorioPessoas.imprime(pessoas);
		assertEquals(Arrays.asList("Erro - Telefone inválido"), resultado);
	}
	
	@Test
	public void deveTestarRelatorioComMultiplasPessoas() {
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		Pessoa pessoaValida = new Pessoa("Fulano", "63182980025", "5181511682");
		Pessoa pessoaTelefoneInvalido = new Pessoa("Tereza", "50934942080", "58544");
		Pessoa pessoaCpfInvalido = new Pessoa("José", "04522893652", "51981511682");
		
		pessoas.add(pessoaValida);
		pessoas.add(pessoaTelefoneInvalido);
		pessoas.add(pessoaCpfInvalido);
		
		List<String> resultado = RelatorioPessoas.imprime(pessoas);
		
		List<String> resultadoEsperado = new ArrayList<String>();
		resultadoEsperado.add(pessoaValida.toString());
		resultadoEsperado.add("Erro - Telefone inválido");
		resultadoEsperado.add("Erro - CPF inválido");

		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void deveTestarRelatorioComCPFInvalido() {

		List<Pessoa> pessoas = new ArrayList<>();
		Pessoa pessoa = new Pessoa("Fulano", "00088877885", "5181511682");
		pessoas.add(pessoa);
		
		RelatorioPessoas.imprime(pessoas);
		
		List<String> resultado = RelatorioPessoas.imprime(pessoas);
		assertEquals(Arrays.asList("Erro - CPF inválido"), resultado);
	}
}