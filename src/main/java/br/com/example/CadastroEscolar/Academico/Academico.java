package br.com.example.CadastroEscolar.Academico;

import br.com.example.CadastroEscolar.Cadastro.CadastroModel;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "cadastro_academico")
@Data
public class Academico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private int turma;
    @Column
    private String turno;

    //uma turma e turno pode ter varios alunos
    @OneToMany(mappedBy = "academico")
    private List<CadastroModel> alunos;
}
