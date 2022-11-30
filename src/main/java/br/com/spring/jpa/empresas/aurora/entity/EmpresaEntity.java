package br.com.spring.jpa.empresas.aurora.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "empresas")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmpresaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private byte[] idExterno;
    private String nome;
    private String cnpj;

    @OneToOne(fetch = FetchType.LAZY)
    private FuncionarioEntity funcionario;
    private LocalDateTime dataCriacao;

}
