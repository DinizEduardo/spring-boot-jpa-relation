package br.com.spring.jpa.empresas.controller;

import br.com.spring.jpa.empresas.controller.mapper.request.FuncionarioRequestMapper;
import br.com.spring.jpa.empresas.controller.mapper.response.FuncionarioResponseMapper;
import br.com.spring.jpa.empresas.controller.dto.request.FuncionarioRequest;
import br.com.spring.jpa.empresas.controller.dto.response.FuncionarioResponse;
import br.com.spring.jpa.empresas.domain.Funcionario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @PostMapping
    public ResponseEntity<?> cadastraFuncionario(@RequestBody @Valid FuncionarioRequest request) {
        Funcionario funcionario = FuncionarioRequestMapper.INSTANCE.mapFrom(request);

        FuncionarioResponse funcionarioResponse = FuncionarioResponseMapper.INSTANCE.mapFrom(funcionario);

        return ResponseEntity.ok(funcionarioResponse);
    }

}
