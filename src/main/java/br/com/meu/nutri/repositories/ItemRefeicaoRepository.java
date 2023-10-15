package br.com.meu.nutri.repositories;

import br.com.meu.nutri.domain.planoAlimentar.ItemRefeicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRefeicaoRepository extends JpaRepository<ItemRefeicao, Long> {
}
