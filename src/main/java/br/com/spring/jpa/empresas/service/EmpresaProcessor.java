package br.com.spring.jpa.empresas.service;

import br.com.spring.jpa.empresas.aurora.persistence.EmpresaPersistence;
import br.com.spring.jpa.empresas.domain.Empresa;
import br.com.spring.jpa.empresas.domain.Funcionario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class EmpresaProcessor {

    private final EmpresaPersistence persistence;
    private final FuncionarioProcessor funcionarioProcessor;

    public Empresa cria(Empresa empresa) {
        Funcionario funcionario = funcionarioProcessor.buscaPorId(empresa.getFuncionario().getIdExterno());

        return persistence.cria(
                empresa
                        .withIdExterno(UUID.randomUUID())
                        .withFuncionario(funcionario)
        );
    }

    public Empresa buscaPorId(UUID id) {
        return persistence.buscaPorId(id);
    }


}
