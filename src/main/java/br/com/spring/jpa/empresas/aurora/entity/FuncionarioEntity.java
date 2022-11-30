package br.com.spring.jpa.empresas.aurora.entity;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "funcionarios")
@Getter
@Builder
public class FuncionarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private byte[] idExterno;
    private String nome;
    private String cpf;
    private String email;

}
