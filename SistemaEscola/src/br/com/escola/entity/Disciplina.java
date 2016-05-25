
package br.com.escola.entity;

/**
 * Classe que vai representar a entidade Disciplina.
 * @author Fernando Ortiz
 */
public class Disciplina {

    private int codTurma;
    private Professor professor;
    private String nome;
    /* private Turma turma; */
    private Aluno aluno;
    private String cargaHoraria;

    public int getCodTurma() {
        return codTurma;
    }

    public void setCodTurma(int codTurma) {
        this.codTurma = codTurma;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    
    
    
}
