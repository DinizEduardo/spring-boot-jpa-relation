package br.com.spring.jpa.empresas.aurora.persistence;

import br.com.spring.jpa.empresas.aurora.entity.FuncionarioEntity;
import br.com.spring.jpa.empresas.aurora.mapper.FuncionarioEntityMapper;
import br.com.spring.jpa.empresas.aurora.repository.FuncionarioRepository;
import br.com.spring.jpa.empresas.domain.Funcionario;
import br.com.spring.jpa.empresas.exceptions.ResourceNotFoundException;
import br.com.spring.jpa.empresas.utils.mapper.UUIDUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class FuncionarioPersistence {

    private final FuncionarioRepository repository;

    public Funcionario cria(Funcionario funcionario) {
        FuncionarioEntity funcionarioEntity = FuncionarioEntityMapper.INSTANCE.mapFrom(funcionario);

        FuncionarioEntity saved = repository.save(funcionarioEntity);

        return FuncionarioEntityMapper.INSTANCE.mapFrom(saved);
    }

    public Funcionario buscaPorId(UUID id) {
        FuncionarioEntity entity = repository.findOneByIdExterno(
                UUIDUtils.INSTANCE.convertUUIDToBytes(id)
        ).orElseThrow(() -> new ResourceNotFoundException("Funcionario não encontrado."));

        return FuncionarioEntityMapper.INSTANCE.mapFrom(entity);
    }
}
