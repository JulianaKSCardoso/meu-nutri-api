//package br.com.meu.nutri.controller;
//
//import br.com.meu.nutri.domain.consulta.Consulta;
//import br.com.meu.nutri.domain.consulta.ConsultaService;
//import br.com.meu.nutri.domain.consulta.DadosConsultaDto;
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.util.UriComponentsBuilder;
//
//import java.net.URI;
//import java.util.List;
//
//
//@RestController
//@RequestMapping("/consulta")
//public class ConsultaController {
//
//    @Autowired
//    public ConsultaService service;
//
//    @GetMapping
//    public List<DadosConsultaDto> listarConsultasAgendadas() {
//        return service.listarConsultasAgendadas();
//    }
//
//    @PostMapping
//    @Transactional
//    public ResponseEntity<DadosConsultaDto> agendarConsulta(@RequestBody @Valid DadosConsultaDto dadosConsulta, UriComponentsBuilder uriBuilder) {
//        DadosConsultaDto consulta =  service.agendarConsulta(dadosConsulta);
//        URI uri = uriBuilder.path("consulta/{id}").buildAndExpand(dadosConsulta.getId()).toUri();
//        return ResponseEntity.created(uri).body(consulta);
//    }
//}
