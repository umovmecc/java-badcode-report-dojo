package cc.code;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

public class FormatterPessoaTest {
    private FormatterPessoa formatter = new FormatterPessoa();

    @Test
    public void shouldReturnFomattedNames() {
        Vector v = new Vector();

        Pessoa p = new Pessoa();
        p.setName("Fulano");
        p.setCpf("0033435457");
        ArrayList<String> pessoaTelefonesFixos = new ArrayList<String>();
        pessoaTelefonesFixos.add("8765343");
        p.setTelefonesCelulares(pessoaTelefonesFixos);
        p.setTelefonesFixos(pessoaTelefonesFixos);
        v.add(p);

        assertEquals("Fulano", this.formatter.format(v));
    }
}