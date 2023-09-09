package br.com.meu.nutri.controller;

import br.com.meu.nutri.domain.nutricionista.DadosNutricionistaDto;
import br.com.meu.nutri.services.NutricionistaService;
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
@RequestMapping("/nutricionista")
public class NutricionistaController {

    @Autowired
    NutricionistaService service;


    @GetMapping
    public Page<DadosNutricionistaDto> listarTodos(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
        return service.listarTodos(paginacao);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DadosNutricionistaDto> buscarPorId(@PathVariable Long id) {
        DadosNutricionistaDto nutricionista = service.buscarPorId(id);
        return ResponseEntity.ok(nutricionista);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<DadosNutricionistaDto> cadastrar(@RequestBody @Valid DadosNutricionistaDto dto, UriComponentsBuilder uriBuilder) {
        DadosNutricionistaDto nutricionista = service.cadastrar(dto);
        URI uri = uriBuilder.path("nutricionista/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(nutricionista);
    }

    @PutMapping
    @Transactional
    public ResponseEntity<DadosNutricionistaDto> atualizar(@RequestBody @Valid DadosNutricionistaDto dto) {
        DadosNutricionistaDto nutricionistaAtualizado = service.atualizar(dto);
        return ResponseEntity.ok().body(nutricionistaAtualizado);
    }

}
