package br.com.meu.nutri.services;


import br.com.meu.nutri.domain.nutricionista.DadosNutricionistaDto;
import br.com.meu.nutri.domain.nutricionista.Nutricionista;
import br.com.meu.nutri.repositories.NutricionistaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class NutricionistaService {


    @Autowired
    NutricionistaRepository nutricionistaRepository;

    @Autowired
    ModelMapper modelMapper;

    public Page<DadosNutricionistaDto> listarTodos(Pageable paginacao) {
        return nutricionistaRepository.findAll(paginacao).map(nutricionista -> modelMapper
                .map(nutricionista, DadosNutricionistaDto.class));
    }

    public DadosNutricionistaDto buscarPorId(Long id) {
        Nutricionista nutricionista = nutricionistaRepository.findById(id).orElseThrow(EntityNotFoundException::new);

        return modelMapper.map(nutricionista, DadosNutricionistaDto.class);
    }

    public DadosNutricionistaDto cadastrar(DadosNutricionistaDto dto) {
        Nutricionista nutricionista = modelMapper.map(dto, Nutricionista.class);

        nutricionista.getUsuario().setDtCadastro(LocalDateTime.now());
        nutricionistaRepository.save(nutricionista);

        return modelMapper.map(nutricionista, DadosNutricionistaDto.class);
    }

    public DadosNutricionistaDto atualizar(DadosNutricionistaDto dto) {
        Nutricionista nutricionista = modelMapper.map(dto, Nutricionista.class);
        nutricionista.atualizar(dto);
        nutricionistaRepository.save(nutricionista);

        return modelMapper.map(nutricionista, DadosNutricionistaDto.class);

    }
}
