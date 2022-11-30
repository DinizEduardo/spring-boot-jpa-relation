package br.com.spring.jpa.empresas.controller.mapper.response;

import br.com.spring.jpa.empresas.controller.dto.response.FuncionarioResponse;
import br.com.spring.jpa.empresas.domain.Funcionario;
import br.com.spring.jpa.empresas.utils.mapper.UUIDUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(
        uses = {
                UUIDUtils.class
        }
)
public interface FuncionarioResponseMapper {

    FuncionarioResponseMapper INSTANCE = Mappers.getMapper(FuncionarioResponseMapper.class);

    @Mapping(source = "idExterno", target = "id")
    FuncionarioResponse mapFrom(Funcionario funcionario);


}
