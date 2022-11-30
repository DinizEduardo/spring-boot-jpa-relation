package br.com.spring.jpa.empresas.controller.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class FuncionarioRequest {

    @NotBlank(message = "Nome deve ser informado.")
    private String nome;

    @NotBlank(message = "CPF deve ser informado.")
    @CPF(message = "CPF deve ser valido.")
    private String cpf;

    @NotBlank(message = "Email deve ser informado.")
    @Email(message = "Email deve ser valido.")
    private String email;

}
