package br.com.spring.jpa.empresas.aurora.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "funcionarios")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FuncionarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private byte[] idExterno;
    private String nome;
    private String cpf;
    private String email;

}
