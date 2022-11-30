package br.com.spring.jpa.empresas.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class ApiException extends RuntimeException {

    private final HttpStatus httpStatus;

    public ApiException(final HttpStatus httpStatus, final String message) {
        super(message);
        this.httpStatus = httpStatus;
    }

}
