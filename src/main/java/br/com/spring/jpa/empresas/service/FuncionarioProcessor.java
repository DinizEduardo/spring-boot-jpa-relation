package br.com.spring.jpa.empresas.service;

import br.com.spring.jpa.empresas.aurora.persistence.FuncionarioPersistence;
import br.com.spring.jpa.empresas.domain.Funcionario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class FuncionarioProcessor {

    private final FuncionarioPersistence persistence;

    public Funcionario cria(Funcionario funcionario) {
        return persistence.cria(
                funcionario
                        .withIdExterno(UUID.randomUUID())
        );
    }

    public Funcionario buscaPorId(UUID id) {
        return persistence.buscaPorId(id);
    }

}
