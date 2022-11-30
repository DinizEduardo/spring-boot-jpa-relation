package br.com.spring.jpa.empresas.aurora.mapper;

import br.com.spring.jpa.empresas.aurora.entity.EmpresaEntity;
import br.com.spring.jpa.empresas.domain.Empresa;
import br.com.spring.jpa.empresas.utils.mapper.UUIDUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(
        uses = {
                UUIDUtils.class,
                FuncionarioEntityMapper.class
        }
)
public interface EmpresaEntityMapper {


    EmpresaEntityMapper INSTANCE = Mappers.getMapper(EmpresaEntityMapper.class);

    @Mapping(source = "idSequencial", target = "id")
    EmpresaEntity mapFrom(Empresa funcionario);

    @Mapping(source = "id", target = "idSequencial")
    Empresa mapFrom(EmpresaEntity funcionarioEntity);

}
