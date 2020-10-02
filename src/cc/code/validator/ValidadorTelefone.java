package cc.code.validator;

public class ValidadorTelefone {
	
	public static boolean valida(String telefone) {
		if (telefone == null || telefone.isEmpty()) {
			return true;
		}
		return telefone.length() == 10;
	}
}