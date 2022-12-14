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
public class FuncionarioResponse {

    private UUID id;
    private String nome;
    private String cpf;
    private String email;

}
