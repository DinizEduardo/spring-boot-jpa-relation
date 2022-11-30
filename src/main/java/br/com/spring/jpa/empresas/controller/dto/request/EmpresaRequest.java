package br.com.spring.jpa.empresas.controller.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class EmpresaRequest {

    @NotBlank(message = "Nome deve ser informado.")
    private String nome;

    @NotBlank(message = "idFuncionario deve ser informado.")
    @Pattern(regexp = "[a-f0-9]{8}(?:-[a-f0-9]{4}){4}[a-f0-9]{8}", message = "idFuncionario deve ser um uuid")
    private String idFuncionario;

    @NotBlank(message = "CNPJ deve ser informado.")
    @CNPJ(message = "CNPJ deve ser valido.")
    private String cnpj;

}
