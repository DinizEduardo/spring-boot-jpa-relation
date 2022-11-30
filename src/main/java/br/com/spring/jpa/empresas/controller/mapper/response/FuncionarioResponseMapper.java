package br.com.spring.jpa.empresas.controller.mapper.response;

import br.com.spring.jpa.empresas.controller.dto.response.FuncionarioResponse;
import br.com.spring.jpa.empresas.domain.Funcionario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FuncionarioResponseMapper {

    FuncionarioResponseMapper INSTANCE = Mappers.getMapper(FuncionarioResponseMapper.class);

    FuncionarioResponse mapFrom(Funcionario request);


}
