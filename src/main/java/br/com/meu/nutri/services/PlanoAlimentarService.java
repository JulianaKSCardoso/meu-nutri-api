package br.com.meu.nutri.services;

import br.com.meu.nutri.domain.planoAlimentar.DadosPlanoAlimentarDto;
import br.com.meu.nutri.domain.planoAlimentar.PlanoAlimentar;
import br.com.meu.nutri.repositories.ItemRefeicaoRepository;
import br.com.meu.nutri.repositories.PlanoAlimentarRepository;
import br.com.meu.nutri.repositories.RefeicaoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanoAlimentarService {

    @Autowired
    public PlanoAlimentarRepository planoAlimentarRepository;

    @Autowired
    public RefeicaoRepository refeicaoRepository;

    @Autowired
    public ItemRefeicaoRepository itemRefeicaoRepository;

    @Autowired
    public ModelMapper modelMapper;

    public DadosPlanoAlimentarDto buscarPorId(Long id) {
        PlanoAlimentar planoAlimentar = planoAlimentarRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        return modelMapper.map(planoAlimentar, DadosPlanoAlimentarDto.class);
    }

    public DadosPlanoAlimentarDto cadastrarPlanoAlimentar(DadosPlanoAlimentarDto dto) {
        return null;
    }
}
