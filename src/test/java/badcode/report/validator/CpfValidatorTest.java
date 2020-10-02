package badcode.report.validator;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import badcode.report.exception.ValidatorException;

public class CpfValidatorTest {
	
	public CpfValidator cpfValidator = new CpfValidator();
	
	@Test
	public void naoDeveDispararExceptionComCpfValido() throws ValidatorException {
		String cpf = "02288739088";
		assertDoesNotThrow(() -> cpfValidator.valida(cpf));
	}
	
	@Test
	public void deveDispararExceptionComCpfInvalido() throws ValidatorException {
		String cpf = "11999887755";
		
		assertThrows(ValidatorException.class, () -> {
			cpfValidator.valida(cpf);
	    });
	}
}
