package br.com.spring.jpa.empresas.domain;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@With
@Builder
public class Funcionario {

    private Long idSequencial;
    private UUID idExterno;
    private String nome;
    private String cpf;
    private String email;

}
