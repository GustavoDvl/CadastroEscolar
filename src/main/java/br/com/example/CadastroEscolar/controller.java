package br.com.example.CadastroEscolar.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping
public class controller {

    @GetMapping("/saudacao")
    public String saudacao(){
        return "Olá, este arquivo esta sendo testado.";
    }
}
