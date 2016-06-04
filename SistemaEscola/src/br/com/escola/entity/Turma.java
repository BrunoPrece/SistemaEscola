package br.com.escola.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Classe que representa a entidade turma.
 *
 * @author Fernando Ortiz
 */
@Entity
@Table(name = "tab_turma")
public class Turma implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codTurma;

    @ManyToOne
    private Curso curso;

    @Column
    private String nome;

    @ManyToMany
    @JoinTable(name = "professor_has_turma", joinColumns
            = {
                @JoinColumn(name = "codTurma")}, inverseJoinColumns
            = {
                @JoinColumn(name = "id")})
    private List<Professor> professor;
  
    public Turma() {

    }

     public List<Professor> getProfessor() {
        return professor;
    }

    public void setProfessor(List<Professor> professor) {
        this.professor = professor;
    }
    
    
    public int getCodTurma() {
        return codTurma;
    }

    public void setCodTurma(int codTurma) {
        this.codTurma = codTurma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
