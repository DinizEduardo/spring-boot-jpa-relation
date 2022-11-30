package br.com.spring.jpa.empresas.controller.mapper.response;

import br.com.spring.jpa.empresas.controller.dto.response.EmpresaResponse;
import br.com.spring.jpa.empresas.domain.Empresa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(
        uses = {
                FuncionarioResponseMapper.class
        }
)
public interface EmpresaResponseMapper {

    EmpresaResponseMapper INSTANCE = Mappers.getMapper(EmpresaResponseMapper.class);

    @Mapping(source = "idExterno", target = "id")
    EmpresaResponse mapFrom(Empresa request);

}
