package cc.code;

import cc.code.Pessoa;

import java.util.List;

public class PessoaBuilder {
    private Pessoa pessoa;

    public PessoaBuilder() {
        this.pessoa = new Pessoa();
    }

    public PessoaBuilder addName(String name) {
        this.pessoa.name = name;
        return this;
    }

    public PessoaBuilder addCpf(String cpf) {
        this.pessoa.cpf = cpf;
        return this;
    }

    public PessoaBuilder addTelefonesFixos(List<String> telefonesFixos) {
        this.pessoa.telefonesFixos = telefonesFixos;
        return this;
    }

    public Pessoa build() {
        return pessoa;
    }
}
