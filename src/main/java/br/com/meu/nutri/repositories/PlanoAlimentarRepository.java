package br.com.meu.nutri.repositories;

import br.com.meu.nutri.domain.planoAlimentar.PlanoAlimentar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanoAlimentarRepository extends JpaRepository<PlanoAlimentar, Long> {

}
