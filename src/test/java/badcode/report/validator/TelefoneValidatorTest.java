package badcode.report.validator;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import badcode.report.exception.ValidatorException;

public class TelefoneValidatorTest {
	
	public TelefoneValidator telefoneValidator = new TelefoneValidator();
	
	@Test
	public void naoDeveDispararExceptionComTelefoneValido() throws ValidatorException {
		String telefone = "51981511682";
		assertDoesNotThrow(() -> telefoneValidator.valida(telefone));
	}
	
	@Test
	public void deveDispararExceptionComTelefoneInvalido() throws ValidatorException {
		String telefone = "5199999";
		assertThrows(ValidatorException.class, () -> {
			telefoneValidator.valida(telefone);
	    });
	}
}
