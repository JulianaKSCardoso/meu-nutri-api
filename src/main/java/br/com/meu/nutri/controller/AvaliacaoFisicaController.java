package br.com.meu.nutri.controller;

import br.com.meu.nutri.services.AvaliacaoFisicaService;
import br.com.meu.nutri.domain.avaliacaoFisica.DadosAvaliacaoFisicaDto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/avaliacaofisica")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaService service;

    @GetMapping("/{id}")
    public ResponseEntity<DadosAvaliacaoFisicaDto> buscarPorId(@PathVariable Long id) {
        DadosAvaliacaoFisicaDto dadosAvaliacao = service.buscarPorIdPaciente(id);
        return ResponseEntity.ok(dadosAvaliacao);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<DadosAvaliacaoFisicaDto> cadastrar(@RequestBody @Valid DadosAvaliacaoFisicaDto dto, UriComponentsBuilder uriBuilder) {
        DadosAvaliacaoFisicaDto dadosAvaliacao = service.cadastrar(dto);
        URI uri = uriBuilder.path("avaliacaofisica/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dadosAvaliacao);
    }
}
