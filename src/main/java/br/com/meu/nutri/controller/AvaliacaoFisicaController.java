package br.com.meu.nutri.controller;

import br.com.meu.nutri.services.AvaliacaoFisicaService;
import br.com.meu.nutri.domain.avaliacaoFisica.DadosAvaliacaoFisicaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

}
