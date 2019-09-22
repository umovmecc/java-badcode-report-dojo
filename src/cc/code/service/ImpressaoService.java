package cc.code.service;

import cc.code.utils.FormatterPessoa;
import cc.code.utils.Validation;
import cc.code.model.Pessoa;

import java.util.List;

public class ImpressaoService {
    public void imprimirPessoas(List<Pessoa> pessoas) {
        FormatterPessoa formatter = new FormatterPessoa();

        for (Pessoa pessoa : pessoas) {
            Validation validador = new Validation();
            List<String> erro = validador.validate(pessoa);

            if(erro.isEmpty()) {
                System.out.print(formatter.format(pessoa) + "\n");
            } else {
                System.out.print(erro.toString() + "\n");
            }
        }
    }
}
