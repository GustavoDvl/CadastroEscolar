
package br.com.example.CadastroEscolar.Cadastro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/saudacao")
    public String saudacao(){
        return "Olá, este arquivo esta sendo testado.";
    }
}
