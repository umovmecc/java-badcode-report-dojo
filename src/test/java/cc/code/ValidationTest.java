package cc.code;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ValidationTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void validaPessoaNula() {
        //given/when
        List<String> validaPessoa = new Validation().validaPessoa(null);

        //then
        Assertions.assertNotNull(validaPessoa);
        Assertions.assertEquals(validaPessoa.size(), 0);
    }

    //TODO Validar se pessoa sem CPF deveria retornar erro
    @Test
    void validaPessoaVazia() {
        //given
        Pessoa pessoa = new PessoaBuilder().build();

        //when
        List<String> validaPessoa = new Validation().validaPessoa(pessoa);

        //then
        Assertions.assertNotNull(validaPessoa);
        Assertions.assertEquals(validaPessoa.size(), 0);
    }

    //TODO Validar se pessoa sem Nome deveria retornar erro
    //TODO Validar se pessoa com CPF invalido deveria retornar erro
    @Test
    void validaPessoaSemNome() {
        //given
        Pessoa pessoa = new PessoaBuilder().addCpf("0").build();

        //when
        List<String> validaPessoa = new Validation().validaPessoa(pessoa);

        //then
        Assertions.assertNotNull(validaPessoa);
        Assertions.assertEquals(validaPessoa.size(), 0);
    }

    @Test
    void validaPessoaSemNumeroTelefoneFixo() {
        //given
        Pessoa pessoa = new PessoaBuilder().addName("Fulano").addCpf("0").addTelefonesFixos(java.util.Collections.emptyList()).build();

        //when
        List<String> validaPessoa = new Validation().validaPessoa(pessoa);

        //then
        Assertions.assertNotNull(validaPessoa);
        Assertions.assertEquals(validaPessoa.size(), 0);
    }

    @Test
    void validaPessoaComNumeroTelefoneFixoNulo() {
        //given
        Pessoa pessoa = new PessoaBuilder().addName("Fulano").addCpf("0").addTelefonesFixos(Collections.singletonList(null)).build();

        //when
        List<String> validaPessoa = new Validation().validaPessoa(pessoa);

        //then
        Assertions.assertNotNull(validaPessoa);
        Assertions.assertEquals(validaPessoa.size(), 1);
        Assertions.assertEquals(validaPessoa.get(0), "Erro - Telefone inválido");
    }

    @Test
    void validaPessoaComNumeroTelefoneFixoVazio() {
        //given
        Pessoa pessoa = new PessoaBuilder().addName("Fulano").addCpf("0").addTelefonesFixos(Collections.singletonList("")).build();

        //when
        List<String> validaPessoa = new Validation().validaPessoa(pessoa);

        //then
        Assertions.assertNotNull(validaPessoa);
        Assertions.assertEquals(validaPessoa.size(), 1);
        Assertions.assertEquals(validaPessoa.get(0), "Erro - Telefone inválido");
    }

    @Test
    void validaPessoaComNumeroTelefoneFixoComTamanhoMenorDeSete() {
        //given
        Pessoa pessoa = new PessoaBuilder().addName("Fulano").addCpf("0").addTelefonesFixos(Collections.singletonList("123456")).build();

        //when
        List<String> validaPessoa = new Validation().validaPessoa(pessoa);

        //then
        Assertions.assertNotNull(validaPessoa);
        Assertions.assertEquals(validaPessoa.size(), 1);
        Assertions.assertEquals(validaPessoa.get(0), "Erro - Telefone inválido");
    }

    @Test
    void validaPessoaComNumeroTelefoneFixoComTamanhoMenorDeDez() {
        //given
        Pessoa pessoa = new PessoaBuilder().addName("Fulano").addCpf("0").addTelefonesFixos(Collections.singletonList("123456789")).build();

        //when
        List<String> validaPessoa = new Validation().validaPessoa(pessoa);

        //then
        Assertions.assertNotNull(validaPessoa);
        Assertions.assertEquals(validaPessoa.size(), 1);
        Assertions.assertEquals(validaPessoa.get(0), "Erro - Telefone inválido");
    }

    @Test
    void validaPessoaComNumeroTelefoneFixo() {
        //given
        Pessoa pessoa = new PessoaBuilder().addName("Fulano").addCpf("0").addTelefonesFixos(Collections.singletonList("1234567890")).build();

        //when
        List<String> validaPessoa = new Validation().validaPessoa(pessoa);

        //then
        Assertions.assertNotNull(validaPessoa);
        Assertions.assertEquals(validaPessoa.size(), 0);
    }
}