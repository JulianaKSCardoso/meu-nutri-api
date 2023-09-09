package br.com.meu.nutri.services;

import br.com.meu.nutri.domain.avaliacaoFisica.AvaliacaoFisica;
import br.com.meu.nutri.domain.avaliacaoFisica.DadosAvaliacaoFisicaDto;
import br.com.meu.nutri.repositories.AvaliacaoFisicaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvaliacaoFisicaService {

    @Autowired
    public AvaliacaoFisicaRepository repository;

    @Autowired
    public ModelMapper modelMapper;

    public DadosAvaliacaoFisicaDto buscarPorIdPaciente(Long id) {
        AvaliacaoFisica avaliacaoFisica = repository.findById(id).orElseThrow(EntityNotFoundException::new);
        return modelMapper.map(avaliacaoFisica, DadosAvaliacaoFisicaDto.class);
    }
}
