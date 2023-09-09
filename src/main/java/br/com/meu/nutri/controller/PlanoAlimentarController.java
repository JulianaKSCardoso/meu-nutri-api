package br.com.meu.nutri.controller;


import br.com.meu.nutri.domain.planoAlimentar.DadosPlanoAlimentarDto;
import br.com.meu.nutri.services.PlanoAlimentarService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/plano-alimentar")
public class PlanoAlimentarController {

    @Autowired
    private PlanoAlimentarService service;

    @GetMapping("/{id}")
    public ResponseEntity<DadosPlanoAlimentarDto> buscarPorId(@PathVariable Long id) {
        DadosPlanoAlimentarDto planoAlimentar = service.buscarPorId(id);
        return ResponseEntity.ok(planoAlimentar);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<DadosPlanoAlimentarDto> cadastrarPlanoAlimentar(@RequestBody @Valid DadosPlanoAlimentarDto dto, UriComponentsBuilder uriBuilder) {
        DadosPlanoAlimentarDto planoAlimentar = service.cadastrarPlanoAlimentar(dto);
        URI uri = uriBuilder.path("plano-alimentar/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(planoAlimentar);
    }



}
