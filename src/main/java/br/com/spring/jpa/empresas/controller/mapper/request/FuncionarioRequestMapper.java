package br.com.spring.jpa.empresas.controller.mapper.request;

import br.com.spring.jpa.empresas.controller.dto.request.FuncionarioRequest;
import br.com.spring.jpa.empresas.domain.Funcionario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FuncionarioRequestMapper {

    FuncionarioRequestMapper INSTANCE = Mappers.getMapper(FuncionarioRequestMapper.class);

    Funcionario mapFrom(FuncionarioRequest request);


}
