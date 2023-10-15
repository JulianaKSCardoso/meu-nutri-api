package br.com.meu.nutri.repositories;

import br.com.meu.nutri.domain.planoAlimentar.Refeicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefeicaoRepository extends JpaRepository<Refeicao, Long> {
}
