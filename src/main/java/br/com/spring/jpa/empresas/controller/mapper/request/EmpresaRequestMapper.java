package br.com.spring.jpa.empresas.controller.mapper.request;

import br.com.spring.jpa.empresas.controller.dto.request.EmpresaRequest;
import br.com.spring.jpa.empresas.domain.Empresa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmpresaRequestMapper {

    EmpresaRequestMapper INSTANCE = Mappers.getMapper(EmpresaRequestMapper.class);

    @Mapping(source = "idFuncionario", target = "funcionario.idExterno")
    Empresa mapFrom(EmpresaRequest request);


}
