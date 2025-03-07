package br.com.example.CadastroEscolar.Academico;

import br.com.example.CadastroEscolar.CadastroModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cadastro_academico")
public class Academico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int turma;

    private String turno;

    //uma turma e turno pode ter varios alunos
    @OneToMany(mappedBy = "academico")
    private List<CadastroModel> alunos;
}
