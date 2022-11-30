package br.com.spring.jpa.empresas.controller;

import br.com.spring.jpa.empresas.controller.dto.request.EmpresaRequest;
import br.com.spring.jpa.empresas.controller.dto.response.EmpresaResponse;
import br.com.spring.jpa.empresas.controller.mapper.request.EmpresaRequestMapper;
import br.com.spring.jpa.empresas.controller.mapper.response.EmpresaResponseMapper;
import br.com.spring.jpa.empresas.domain.Empresa;
import br.com.spring.jpa.empresas.service.EmpresaProcessor;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/empresas")
@AllArgsConstructor
public class EmpresaController {

    private final EmpresaProcessor processor;

    @PostMapping
    public ResponseEntity<?> cadastrarEmpresa(@RequestBody @Valid EmpresaRequest request) {
        Empresa empresa = EmpresaRequestMapper.INSTANCE.mapFrom(request);

        EmpresaResponse empresaResponse = EmpresaResponseMapper.INSTANCE.mapFrom(
                processor.cria(empresa)
        );

        return ResponseEntity.ok(empresaResponse);
    }

    @GetMapping("/{idEmpresa}")
    public ResponseEntity<?> buscaEmpresaPorId(@PathVariable String idEmpresa) {
        Empresa empresa = processor.buscaPorId(UUID.fromString(idEmpresa));

        EmpresaResponse empresaResponse = EmpresaResponseMapper.INSTANCE.mapFrom(empresa);

        return ResponseEntity.ok(empresaResponse);
    }

}
