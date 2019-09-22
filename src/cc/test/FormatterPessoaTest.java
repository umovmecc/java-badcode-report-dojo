package cc.test;

import cc.code.utils.FormatterPessoa;
import cc.code.model.Pessoa;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class FormatterPessoaTest {
    private FormatterPessoa formatter = new FormatterPessoa();

    @Test
    public void shouldReturnFomattedNames() {
        Pessoa p = new Pessoa();
        p.setName("Fulano");
        p.setCpf("0033435457");
        ArrayList<String> pessoaTelefonesFixos = new ArrayList<String>();
        pessoaTelefonesFixos.add("8765343");
        p.setTelefonesCelulares(pessoaTelefonesFixos);
        p.setTelefonesFixos(pessoaTelefonesFixos);

        assertEquals("Fulano\n", this.formatter.format(p));
    }
}