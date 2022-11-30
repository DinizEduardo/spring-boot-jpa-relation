package br.com.spring.jpa.empresas.aurora.repository;

import br.com.spring.jpa.empresas.aurora.entity.EmpresaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmpresaRepository extends JpaRepository<EmpresaEntity, Long> {

    Optional<EmpresaEntity> findOneByIdExterno(byte[] idExterno);

}
