package br.com.spring.jpa.empresas.exceptions.handlers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.With;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@With
@AllArgsConstructor
@Getter
public class ApiError {

    private HttpStatus status;
    private LocalDateTime timestamp;
    private String message;
    private Object errors;

    public ApiError() {
        this.timestamp = LocalDateTime.now();
    }

    ApiError(final HttpStatus status, final String message) {
        this();
        this.status = status;
        this.message = message;
    }

    ApiError(final HttpStatus status, final String message, final Object errors) {
        this(status, message);
        this.errors = errors;
    }

}
