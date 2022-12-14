package br.com.spring.jpa.empresas.aurora.repository;

import br.com.spring.jpa.empresas.aurora.entity.FuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity, Long> {

    Optional<FuncionarioEntity> findOneByIdExterno(byte[] idExterno);

}
