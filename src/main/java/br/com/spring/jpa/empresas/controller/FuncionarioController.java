package br.com.spring.jpa.empresas.controller;

import br.com.spring.jpa.empresas.controller.mapper.request.FuncionarioRequestMapper;
import br.com.spring.jpa.empresas.controller.mapper.response.FuncionarioResponseMapper;
import br.com.spring.jpa.empresas.controller.dto.request.FuncionarioRequest;
import br.com.spring.jpa.empresas.controller.dto.response.FuncionarioResponse;
import br.com.spring.jpa.empresas.domain.Funcionario;
import br.com.spring.jpa.empresas.service.FuncionarioProcessor;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/funcionarios")
@AllArgsConstructor
public class FuncionarioController {

    private final FuncionarioProcessor processor;

    @PostMapping
    public ResponseEntity<?> cadastraFuncionario(@RequestBody @Valid FuncionarioRequest request) {
        Funcionario funcionario = FuncionarioRequestMapper.INSTANCE.mapFrom(request);

        FuncionarioResponse funcionarioResponse = FuncionarioResponseMapper.INSTANCE.mapFrom(
                processor.cria(funcionario)
        );

        return ResponseEntity.ok(funcionarioResponse);
    }

    @GetMapping("/{idFuncionario}")
    public ResponseEntity<?> buscaFuncionarioPorId(@PathVariable String idFuncionario) {
        Funcionario funcionario = processor.buscaPorId(UUID.fromString(idFuncionario));

        return ResponseEntity.ok(funcionario);
    }

}
