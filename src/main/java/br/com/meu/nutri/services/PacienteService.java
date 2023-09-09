package br.com.meu.nutri.services;

import br.com.meu.nutri.domain.paciente.DadosPacienteDto;
import br.com.meu.nutri.domain.paciente.Paciente;
import br.com.meu.nutri.repositories.PacienteRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PacienteService {

    @Autowired
    public PacienteRepository repository;

    @Autowired
    public ModelMapper modelMapper;

    public Page<DadosPacienteDto> listarTodos(Pageable paginacao) {
        return repository.findAll(paginacao).map(paciente -> modelMapper
                .map(paciente, DadosPacienteDto.class));
    }

    public DadosPacienteDto buscarPorId(Long id) {
        Paciente paciente = repository.findById(id).orElseThrow(EntityNotFoundException::new);
                return modelMapper.map(paciente, DadosPacienteDto.class);
    }

    public DadosPacienteDto cadastrar(DadosPacienteDto dto) {
        Paciente paciente = modelMapper.map(dto, Paciente.class);
//        paciente.setDtCadastro(LocalDateTime.now());
        paciente.setAtivo(true);
        repository.save(paciente);
        
        return modelMapper.map(paciente, DadosPacienteDto.class);
    }

    public DadosPacienteDto atualizar(DadosPacienteDto dto) {
        Paciente paciente = modelMapper.map(dto, Paciente.class);
        paciente.atualizaDados(paciente);
        repository.save(paciente);
        return modelMapper.map(paciente, DadosPacienteDto.class);
    }

    public void excluir(Long id) {
        Paciente paciente = repository.findById(id).orElseThrow(EntityNotFoundException::new);
        paciente.setAtivo(false);
        repository.save(paciente);
        modelMapper.map(paciente, DadosPacienteDto.class);
    }


}
