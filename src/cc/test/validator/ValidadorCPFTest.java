package cc.test.validator;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

import cc.code.validator.ValidadorCPF;

public class ValidadorCPFTest {

	@Test
	public void deveRetornarTrueParaUmCPFValido() {
		
		String cpfValido = "02288739088";
		assertTrue(ValidadorCPF.valida(cpfValido));
	}
	
	@Test
	public void deveRetornarFalseParaUmCPFInvalido() {
		
		String cpfInvalido = "99999998877";
		assertFalse(ValidadorCPF.valida(cpfInvalido));
	}
}