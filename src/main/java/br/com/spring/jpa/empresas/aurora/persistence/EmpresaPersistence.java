package br.com.spring.jpa.empresas.aurora.persistence;

import br.com.spring.jpa.empresas.aurora.entity.EmpresaEntity;
import br.com.spring.jpa.empresas.aurora.mapper.EmpresaEntityMapper;
import br.com.spring.jpa.empresas.aurora.repository.EmpresaRepository;
import br.com.spring.jpa.empresas.domain.Empresa;
import br.com.spring.jpa.empresas.exceptions.ResourceNotFoundException;
import br.com.spring.jpa.empresas.utils.mapper.UUIDUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class EmpresaPersistence {

    private final EmpresaRepository repository;

    public Empresa cria(Empresa empresa) {
        EmpresaEntity empresaEntity = EmpresaEntityMapper.INSTANCE.mapFrom(empresa);

        EmpresaEntity saved = repository.save(empresaEntity);

        return EmpresaEntityMapper.INSTANCE.mapFrom(saved);
    }

    public Empresa buscaPorId(UUID id) {
        EmpresaEntity entity = repository.findOneByIdExterno(
                UUIDUtils.INSTANCE.convertUUIDToBytes(id)
        ).orElseThrow(() -> new ResourceNotFoundException("Empresa não encontrado."));

        return EmpresaEntityMapper.INSTANCE.mapFrom(entity);
    }

}
