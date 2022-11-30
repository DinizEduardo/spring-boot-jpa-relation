package br.com.spring.jpa.empresas.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDate;
import java.util.*;

@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {

    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers,
            HttpStatus status, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDate.now());
        body.put("status", status.value());

//        Map<Map<String, String>, Map<String, String>> errors = new HashMap<>();

        List<Map<String, String>> errors = new ArrayList<>();

        for (FieldError x : ex.getBindingResult()
                .getFieldErrors()) {
            HashMap<String, String> field = new HashMap<>();
            field.put("campo", x.getField());
            field.put("mensagem", x.getDefaultMessage());
            errors.add(field);
        }

        body.put("erros", errors);

        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }

}
