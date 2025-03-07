package br.com.example.CadastroEscolar;

import br.com.example.CadastroEscolar.Academico.Academico;
import jakarta.persistence.*;

import java.util.List;

@Entity // transforma uma classe em uma entidade no banco de dados
@Table(name = "cadastro_escolar")
public class CadastroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private  String nomeDoResponsavel;
    private int telefone;
    private String endereco;
    private List<Academico> lista;

}
