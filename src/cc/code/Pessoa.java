package cc.code;

import java.util.List;

public class Pessoa {
    String name;
    String cpf;
    int idade;
    List<String> telefonesFixos;
    List<String> telefonesCelulares;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<String> getTelefonesFixos() {
        return telefonesFixos;
    }

    public void setTelefonesFixos(List<String> telefonesFixos) {
        this.telefonesFixos = telefonesFixos;
    }

    public List<String> getTelefonesCelulares() {
        return telefonesCelulares;
    }

    public void setTelefonesCelulares(List<String> telefonesCelulares) {
        this.telefonesCelulares = telefonesCelulares;
    }
}
