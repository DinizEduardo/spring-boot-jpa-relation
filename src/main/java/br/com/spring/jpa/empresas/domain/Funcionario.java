package br.com.spring.jpa.empresas.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.With;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@With
public class Funcionario {

    private Long idSequencial;
    private UUID idExterno;
    private String nome;
    private String cpf;
    private String email;

}
