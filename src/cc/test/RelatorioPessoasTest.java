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
		Pessoa pessoa = new Pessoa();
		pessoa.setName("Fulano");
		pessoa.setCpf("69185055050");
		ArrayList<String> pessoaTelefonesFixo = new ArrayList<String>();
		pessoaTelefonesFixo.add("8765343");
		pessoa.setTelefonesFixos(pessoaTelefonesFixo);
		pessoas.add(pessoa);
		
		List<String> resultado = RelatorioPessoas.imprime(pessoas);
		
		assertEquals(Arrays.asList("Fulano"), resultado);
	}
	
	@Test
	public void deveTestarRelatorioComCelularInvalido() {
		
		List<Pessoa> pessoas = new ArrayList<>();
		Pessoa pessoa = new Pessoa();
		pessoa.setName("Fulano");
		pessoa.setCpf("63182980025");
		ArrayList<String> telefonesCelulares = new ArrayList<String>();
		telefonesCelulares.add("8765343");
		pessoa.setTelefonesCelulares(telefonesCelulares);
		pessoas.add(pessoa);
		
		List<String> resultado = RelatorioPessoas.imprime(pessoas);
		
		assertEquals(Arrays.asList("Erro - Telefone inválido"), resultado);
	}
	
	@Test
	public void deveTestarRelatorioComCelularValido() {
		
		List<Pessoa> pessoas = new ArrayList<>();
		Pessoa pessoa = new Pessoa();
		pessoa.setName("Fulano da Silva");
		pessoa.setCpf("63182980025");
		ArrayList<String> telefonesCelulares = new ArrayList<String>();
		telefonesCelulares.add("5181511682");
		pessoa.setTelefonesCelulares(telefonesCelulares);
		pessoas.add(pessoa);
		
		List<String> resultado = RelatorioPessoas.imprime(pessoas);
		
		assertEquals(Arrays.asList("Fulano da Silva"), resultado);
	}
	
	@Test
	public void deveTestarRelatorioComTelefoneFixoInvalido() {
		
		List<Pessoa> pessoas = new ArrayList<>();
		Pessoa pessoa = new Pessoa();
		pessoa.setName("Fulano");
		pessoa.setCpf("63182980025");
		ArrayList<String> telefonesFixos = new ArrayList<String>();
		telefonesFixos.add("343");
		pessoa.setTelefonesFixos(telefonesFixos);
		pessoas.add(pessoa);
		
		List<String> resultado = RelatorioPessoas.imprime(pessoas);
		
		assertEquals(Arrays.asList("Erro - Telefone inválido"), resultado);
	}
	
	@Test
	public void deveTestarRelatorioComTelefoneFixoValido() {
		
		List<Pessoa> pessoas = new ArrayList<>();
		Pessoa pessoa = new Pessoa();
		pessoa.setName("Fulano");
		pessoa.setCpf("63182980025");
		ArrayList<String> telefonesFixos = new ArrayList<String>();
		telefonesFixos.add("8765343");
		pessoa.setTelefonesFixos(telefonesFixos);
		pessoas.add(pessoa);
		
		RelatorioPessoas.imprime(pessoas);
		
		List<String> resultado = RelatorioPessoas.imprime(pessoas);
		
		assertEquals(Arrays.asList("Fulano"), resultado);
	}
	
	@Test
	public void deveTestarRelatorioComMultiplasPessoas() {
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setName("Fulano");
		pessoa1.setCpf("63182980025");
		ArrayList<String> telefonesFixos = new ArrayList<String>();
		telefonesFixos.add("8765343");
		pessoa1.setTelefonesFixos(telefonesFixos);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setName("Beltrano");
		pessoa2.setCpf("63182980025");
		ArrayList<String> telefonesCelulares = new ArrayList<String>();
		telefonesCelulares.add("5181511682");
		pessoa2.setTelefonesCelulares(telefonesCelulares);
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setName("Tereza");
		pessoa3.setCpf("50934942080");
		ArrayList<String> telefonesFixosInvalidos = new ArrayList<String>();
		telefonesFixosInvalidos.add("789");
		pessoa3.setTelefonesFixos(telefonesFixosInvalidos);
		
		Pessoa pessoa4 = new Pessoa();
		pessoa4.setName("José");
		pessoa4.setCpf("50934942080");
		ArrayList<String> telefonesCelularesInvalidos = new ArrayList<String>();
		telefonesCelularesInvalidos.add("785458");
		pessoa4.setTelefonesCelulares(telefonesCelularesInvalidos);
		
		Pessoa pessoa5 = new Pessoa();
		pessoa5.setName("Josevaldo");
		pessoa5.setCpf("02288739083");
		ArrayList<String> telefoneCelularValido = new ArrayList<String>();
		telefoneCelularValido.add("5181511682");
		pessoa5.setTelefonesCelulares(telefoneCelularValido);
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		pessoas.add(pessoa5);
		
		RelatorioPessoas.imprime(pessoas);
		
		List<String> resultado = RelatorioPessoas.imprime(pessoas);
		
		List<String> resultadoEsperado = new ArrayList<String>();
		resultadoEsperado.add("Fulano");
		resultadoEsperado.add("Beltrano");
		resultadoEsperado.add("Erro - Telefone inválido");
		resultadoEsperado.add("Erro - Telefone inválido");
		resultadoEsperado.add("Erro - CPF inválido");

		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void deveTestarRelatorioComCPFInvalido() {

		List<Pessoa> pessoas = new ArrayList<>();
		Pessoa pessoa = new Pessoa();
		pessoa.setName("Fulano");
		pessoa.setCpf("00088877885");
		ArrayList<String> telefonesFixos = new ArrayList<String>();
		telefonesFixos.add("8765343");
		pessoa.setTelefonesFixos(telefonesFixos);
		pessoas.add(pessoa);
		
		RelatorioPessoas.imprime(pessoas);
		
		List<String> resultado = RelatorioPessoas.imprime(pessoas);
		
		assertEquals(Arrays.asList("Erro - CPF inválido"), resultado);
	}
}