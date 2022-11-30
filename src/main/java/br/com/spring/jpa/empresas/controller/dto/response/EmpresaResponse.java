package br.com.spring.jpa.empresas.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class EmpresaResponse {

    private UUID id;
    private String nome;
    private String cnpj;
    private FuncionarioResponse funcionario;

}
