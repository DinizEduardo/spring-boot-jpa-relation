package br.com.spring.jpa.empresas.aurora.mapper;

import br.com.spring.jpa.empresas.aurora.entity.FuncionarioEntity;
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
public interface FuncionarioEntityMapper {

    FuncionarioEntityMapper INSTANCE = Mappers.getMapper(FuncionarioEntityMapper.class);

    @Mapping(source = "idSequencial", target = "id")
    FuncionarioEntity mapFrom(Funcionario funcionario);

    @Mapping(source = "id", target = "idSequencial")
    Funcionario mapFrom(FuncionarioEntity funcionarioEntity);
}
