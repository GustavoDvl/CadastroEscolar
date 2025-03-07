package br.com.example.CadastroEscolar.Cadastro;

import br.com.example.CadastroEscolar.Academico.Academico;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity // transforma uma classe em uma entidade no banco de dados
@Table(name = "cadastro_escolar")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CadastroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nome_do_Aluno")
    private String nome;
    @Column(name = "Matricula")
    private int matricula;
    @Column(name = "email ")
    private String email;
    @Column(name = "Nome_do_Responsável")
    private  String nomeDoResponsavel;
    @Column(name = "Telefone")
    private int telefone;
    @Column(name = "Endereco")
    private String endereco;


    // um aluno tem uma unica matricula, turno e turma
    @ManyToOne
    @JoinColumn(name = "alunos_id") // chave estrangeira ou Foreing Key
    private Academico academico;

}
