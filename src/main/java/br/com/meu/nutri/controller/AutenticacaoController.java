package br.com.meu.nutri.controller;

import br.com.meu.nutri.domain.login.DadosLoginDto;
import br.com.meu.nutri.domain.login.Login;
import br.com.meu.nutri.domain.login.LoginResponseDto;
import br.com.meu.nutri.domain.login.RegistroDto;
import br.com.meu.nutri.infra.TokenService;
import br.com.meu.nutri.repositories.LoginRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AutenticacaoController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid DadosLoginDto dadosLoginDto) {
        var usernamePassword = new UsernamePasswordAuthenticationToken(dadosLoginDto.email(), dadosLoginDto.senha());
        var auth = this.authenticationManager.authenticate(usernamePassword);

        var token = tokenService.gerarToken((Login) auth.getPrincipal());

        return ResponseEntity.ok(new LoginResponseDto(token));
    }

    @PostMapping("/registrar-nutricionista")
    public ResponseEntity registrarNutricionista(@RequestBody @Valid RegistroDto registroDto){
//        if(LoginRepository.findByEmail(registroDto.email())!= null) return ResponseEntity.badRequest().build();
        String encryptedPassword = new BCryptPasswordEncoder().encode(registroDto.senha());
        Login novoPerfil = new Login(registroDto.email(), encryptedPassword, registroDto.role());
        this.loginRepository.save(novoPerfil);

        return ResponseEntity.ok().build();
    }

    @PostMapping("/registrar-paciente")
    public ResponseEntity registrarPaciente(@RequestBody @Valid RegistroDto registroDto){
//        if(LoginRepository.findByEmail(registroDto.email())!= null) return ResponseEntity.badRequest().build();
        String encryptedPassword = new BCryptPasswordEncoder().encode(registroDto.senha());
        Login novoPerfil = new Login(registroDto.email(), encryptedPassword, registroDto.role());

        this.loginRepository.save(novoPerfil);

        return ResponseEntity.ok().build();
    }

}

