package br.com.example.CadastroEscolar.Academico;

import br.com.example.CadastroEscolar.CadastroModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "cadastro_academico")
public class Academico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int matricula;

    private int turma;

    private String turno;

    private CadastroModel aluno;


}
