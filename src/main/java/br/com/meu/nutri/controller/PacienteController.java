package br.com.meu.nutri.controller;


import br.com.meu.nutri.domain.paciente.DadosPacienteDto;
import br.com.meu.nutri.services.PacienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService service;

    @GetMapping
    public Page<DadosPacienteDto> listarTodos(@PageableDefault (size= 10, sort = {"nome"})Pageable paginacao) {
        return service.listarTodos(paginacao);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DadosPacienteDto> buscarPorId(@PathVariable Long id) {
        DadosPacienteDto paciente =  service.buscarPorId(id);
        return ResponseEntity.ok(paciente);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<DadosPacienteDto> cadastrar(@RequestBody @Valid DadosPacienteDto dto, UriComponentsBuilder uriBuilder) {
      DadosPacienteDto paciente = service.cadastrar(dto);
        URI uri = uriBuilder.path("pacientes/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(paciente);
    }

    @PutMapping
    @Transactional
    public ResponseEntity<DadosPacienteDto> atualizar(@RequestBody @Valid DadosPacienteDto dto) {
        DadosPacienteDto pacienteAtualizado = service.atualizar(dto);
        return ResponseEntity.ok().body(pacienteAtualizado);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<DadosPacienteDto> excluir(@PathVariable @Valid Long id) {
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}


