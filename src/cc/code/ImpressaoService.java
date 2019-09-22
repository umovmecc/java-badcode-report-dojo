package cc.code;

import java.util.List;

public class ImpressaoService {
    public void imprimirPessoas(List<Pessoa> pessoas) {
        FormatterPessoa formatter = new FormatterPessoa();

        for (Pessoa pessoa : pessoas) {
            Validation validador = new Validation();
            List<String> erro = validador.validaPessoa(pessoa);

            if(erro.isEmpty()) {
                System.out.print(formatter.format(pessoa));
            } else {
                System.out.print(erro.toString());
            }
        }



    }
}
