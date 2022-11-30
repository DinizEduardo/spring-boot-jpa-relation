package br.com.spring.jpa.empresas.domain;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@With
@Builder
public class Empresa {

    private Long idSequencial;
    private UUID idExterno;
    private String nome;
    private Funcionario funcionario;
    private String cnpj;
    private LocalDateTime dataCriacao;

}
