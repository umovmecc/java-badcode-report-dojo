package badcode.report.validator;

import badcode.report.exception.ValidatorException;

public interface Validator<T> {
	public void valida(T objeto) throws ValidatorException;
}
