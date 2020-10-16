package cc.code;

import java.util.ArrayList;
import java.util.List;

public class Validation {
    private static final String CPF_REGEX_PATTERN = "([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2})";
    private static final int TAMANHO_CPF = 11;
    private static final int[] PESOS_CPF = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

    protected List<String> validaPessoa(Pessoa pessoa) {
        List<String> constraints = new ArrayList<>();
        if (pessoa == null) {
            return constraints;
        }
        if (validaTelefoneFixo(pessoa.telefonesFixos)) {
            constraints.add("Erro - Telefone inválido");
        }
        if (validaCpf(pessoa.cpf)) {
            constraints.add("CPF invalido!");
        }
        return constraints;
    }

    private boolean validaTelefoneFixo(List<String> telefonesFixos) {
        if (telefonesFixos == null || telefonesFixos.isEmpty()) {
            return false;
        }
        for (String telefone : telefonesFixos) {
            if (telefone == null || telefone.isEmpty() || telefone.length() < 10) {
                return true;
            }
        }
        return false;
    }

    private boolean validaCpf(final String cpf) {
        if (cpf == null || cpf.trim().isEmpty()) {
            return false;
        }
        if (!cpf.matches(CPF_REGEX_PATTERN)) {
            return true;
        }
        String cpfSomenteNumeros = cpf.replaceAll("\\D", "");
        String digitos = cpfSomenteNumeros.substring(0, TAMANHO_CPF - 2);
        String verificador1 = verificador(digitos, PESOS_CPF);
        String verificador2 = verificador(digitos + verificador1, PESOS_CPF);
        return !(digitos + verificador1 + verificador2).equals(cpfSomenteNumeros);
    }

    private static String verificador(String digitos, int[] pesos) {
        int soma = 0;
        int qtdDigitos = digitos.length();
        for (int posicao = qtdDigitos - 1; posicao >= 0; posicao--) {
            int digito = Character.getNumericValue(digitos.charAt(posicao));
            soma += digito * pesos[pesos.length - qtdDigitos + posicao];
        }
        soma = 11 - soma % 11;
        return String.valueOf(soma > 9 ? 0 : soma);
    }


}