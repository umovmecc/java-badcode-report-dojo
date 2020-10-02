package cc.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

import cc.code.CPF;

public class CPFTest {

	@Test
	public void deveRetornarTrueParaUmCPFValido() {
		
		String cpfValido = "02288739088";
		assertTrue(CPF.valida(cpfValido));
	}
	
	@Test
	public void deveRetornarFalseParaUmCPFInvalido() {
		
		String cpfInvalido = "99999998877";
		assertFalse(CPF.valida(cpfInvalido));
	}
}