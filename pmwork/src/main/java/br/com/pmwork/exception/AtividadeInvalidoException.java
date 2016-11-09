package br.com.pmwork.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST)
public class AtividadeInvalidoException extends RuntimeException{

	private static final long serialVersionUID = 8072959227211554659L;

}
