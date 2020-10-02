package cc.test.validator;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;
import cc.code.validator.ValidadorTelefone;

public class ValidadorTelefoneTest {

	@Test
	public void deveRetornarTrueParaUmTelefoneValido() {
		
		String telefoneValido = "5181511682";
		assertTrue(ValidadorTelefone.valida(telefoneValido));
	}
	
	@Test
	public void deveRetornarFalseParaUmTelefoneInvalido() {
		
		String telefoneInvalido = "51984";
		assertFalse(ValidadorTelefone.valida(telefoneInvalido));
	}
}
