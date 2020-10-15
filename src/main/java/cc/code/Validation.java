package cc.code;

import java.util.ArrayList;
import java.util.List;

public class Validation {

    protected List<String> validaPessoa(Pessoa pessoa) {
        List<String> constraints = new ArrayList<>();
        if (pessoa == null || pessoa.cpf == null || pessoa.name == null || pessoa.telefonesFixos == null || pessoa.telefonesFixos.isEmpty()) {
            return constraints;
        }
        if (validaTelefoneFixo(pessoa)) {
            constraints.add("Erro - Telefone inválido");
        }
        return constraints;
    }

    private boolean validaTelefoneFixo(Pessoa pessoa) {
        for (String telefone : pessoa.telefonesFixos) {
            if (telefone == null || telefone.isEmpty() || telefone.length() < 7) {
                return true;
            }
        }
        return false;
    }
}