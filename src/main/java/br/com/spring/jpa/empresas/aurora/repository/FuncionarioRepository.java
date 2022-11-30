package br.com.spring.jpa.empresas.aurora.repository;

import br.com.spring.jpa.empresas.aurora.entity.FuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity, Long> {
}
