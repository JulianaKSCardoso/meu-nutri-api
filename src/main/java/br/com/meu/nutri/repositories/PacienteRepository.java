package br.com.meu.nutri.repositories;
import br.com.meu.nutri.domain.paciente.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
