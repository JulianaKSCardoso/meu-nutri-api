//package br.com.meu.nutri.domain.consulta;
//
//import br.com.meu.nutri.domain.nutricionista.Nutricionista;
//import br.com.meu.nutri.domain.paciente.Paciente;
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.time.LocalDateTime;
//
//@Entity(name = "Consulta")
//@Table(name= "consultas")
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@EqualsAndHashCode(of = "id")
//public class Consulta {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private LocalDateTime dataHoraConsulta;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name= "paciente_id")
//    private Paciente paciente;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="nutricionista_id")
//    private Nutricionista nutricionista;
//
//}
