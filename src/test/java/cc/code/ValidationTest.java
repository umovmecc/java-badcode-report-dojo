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
        Assertions.assertEquals(0, validaPessoa.size());
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
        Assertions.assertEquals(0, validaPessoa.size());
    }

    @Test
    void validaPessoaVaziaComCpfInvalido() {
        //given
        Pessoa pessoa = new PessoaBuilder().addCpf("826.113.170-00").build();

        //when
        List<String> validaPessoa = new Validation().validaPessoa(pessoa);

        //then
        Assertions.assertNotNull(validaPessoa);
        Assertions.assertEquals(1, validaPessoa.size());
        Assertions.assertEquals("CPF invalido!",validaPessoa.get(0));
    }

    @Test
    void validaPessoaVaziaComCpfComFormatacaoInvalida() {
        //given
        Pessoa pessoa = new PessoaBuilder().addCpf("826.113.170.03").build();

        //when
        List<String> validaPessoa = new Validation().validaPessoa(pessoa);

        //then
        Assertions.assertNotNull(validaPessoa);
        Assertions.assertEquals(1, validaPessoa.size());
        Assertions.assertEquals("CPF invalido!",validaPessoa.get(0));
    }

    @Test
    void validaPessoaVaziaComCpfValido() {
        //given
        Pessoa pessoa = new PessoaBuilder().addCpf("826.113.170-03").build();

        //when
        List<String> validaPessoa = new Validation().validaPessoa(pessoa);

        //then
        Assertions.assertNotNull(validaPessoa);
        Assertions.assertEquals(0, validaPessoa.size());
    }

    //TODO Validar se pessoa sem Nome deveria retornar erro
    @Test
    void validaPessoaSemNome() {
        //given
        Pessoa pessoa = new PessoaBuilder().build();

        //when
        List<String> validaPessoa = new Validation().validaPessoa(pessoa);

        //then
        Assertions.assertNotNull(validaPessoa);
        Assertions.assertEquals(0, validaPessoa.size());
    }

    @Test
    void validaPessoaSemNumeroTelefoneFixo() {
        //given
        Pessoa pessoa = new PessoaBuilder().addName("Fulano").addTelefonesFixos(java.util.Collections.emptyList()).build();

        //when
        List<String> validaPessoa = new Validation().validaPessoa(pessoa);

        //then
        Assertions.assertNotNull(validaPessoa);
        Assertions.assertEquals(0, validaPessoa.size());
    }

    @Test
    void validaPessoaComNumeroTelefoneFixoNulo() {
        //given
        Pessoa pessoa = new PessoaBuilder().addName("Fulano").addTelefonesFixos(Collections.singletonList(null)).build();

        //when
        List<String> validaPessoa = new Validation().validaPessoa(pessoa);

        //then
        Assertions.assertNotNull(validaPessoa);
        Assertions.assertEquals(1, validaPessoa.size());
        Assertions.assertEquals("Erro - Telefone inválido",validaPessoa.get(0));
    }

    @Test
    void validaPessoaComNumeroTelefoneFixoVazio() {
        //given
        Pessoa pessoa = new PessoaBuilder().addName("Fulano").addTelefonesFixos(Collections.singletonList("")).build();

        //when
        List<String> validaPessoa = new Validation().validaPessoa(pessoa);

        //then
        Assertions.assertNotNull(validaPessoa);
        Assertions.assertEquals(1, validaPessoa.size());
        Assertions.assertEquals("Erro - Telefone inválido",validaPessoa.get(0));
    }

    @Test
    void validaPessoaComNumeroTelefoneFixoComTamanhoMenorDeSete() {
        //given
        Pessoa pessoa = new PessoaBuilder().addName("Fulano").addTelefonesFixos(Collections.singletonList("123456")).build();

        //when
        List<String> validaPessoa = new Validation().validaPessoa(pessoa);

        //then
        Assertions.assertNotNull(validaPessoa);
        Assertions.assertEquals(1, validaPessoa.size());
        Assertions.assertEquals("Erro - Telefone inválido",validaPessoa.get(0));
    }

    @Test
    void validaPessoaComNumeroTelefoneFixoComTamanhoMenorDeDez() {
        //given
        Pessoa pessoa = new PessoaBuilder().addName("Fulano").addTelefonesFixos(Collections.singletonList("123456789")).build();

        //when
        List<String> validaPessoa = new Validation().validaPessoa(pessoa);

        //then
        Assertions.assertNotNull(validaPessoa);
        Assertions.assertEquals(1, validaPessoa.size());
        Assertions.assertEquals("Erro - Telefone inválido",validaPessoa.get(0));
    }

    @Test
    void validaPessoaComNumeroTelefoneFixo() {
        //given
        Pessoa pessoa = new PessoaBuilder().addName("Fulano").addTelefonesFixos(Collections.singletonList("1234567890")).build();

        //when
        List<String> validaPessoa = new Validation().validaPessoa(pessoa);

        //then
        Assertions.assertNotNull(validaPessoa);
        Assertions.assertEquals(0,validaPessoa.size());
    }
}