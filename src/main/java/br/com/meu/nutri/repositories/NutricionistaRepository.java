package br.com.meu.nutri.repositories;

import br.com.meu.nutri.domain.nutricionista.Nutricionista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NutricionistaRepository extends JpaRepository<Nutricionista, Long> {
}
