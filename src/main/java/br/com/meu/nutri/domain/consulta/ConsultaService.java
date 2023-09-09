//package br.com.meu.nutri.domain.consulta;
//
//import br.com.meu.nutri.domain.nutricionista.DadosNutricionistaDto;
//import br.com.meu.nutri.domain.nutricionista.Nutricionista;
//import br.com.meu.nutri.domain.paciente.Paciente;
//import br.com.meu.nutri.repositories.ConsultaRepository;
//import br.com.meu.nutri.repositories.NutricionistaRepository;
//import br.com.meu.nutri.repositories.PacienteRepository;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class ConsultaService {
//
//    @Autowired
//    public ConsultaRepository consultaRepository;
//
//    @Autowired
//    public PacienteRepository pacienteRepository;
//
//    @Autowired
//    public NutricionistaRepository nutricionistaRepository;
//
//    @Autowired
//    ModelMapper modelMapper;
//
//    public List<DadosConsultaDto> listarConsultasAgendadas() {
//        return consultaRepository.findAll().stream().map(c -> modelMapper
//                .map(c, DadosConsultaDto.class))
//                .collect(Collectors.toList());
//    }
//
//
////    public DadosConsultaDto agendarConsulta(DadosConsultaDto dadosConsultaDto) {
////
////
////    }
//}
