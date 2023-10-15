package br.com.meu.nutri.repositories;

import br.com.meu.nutri.domain.login.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, String> {
       UserDetails findByEmail();
}
