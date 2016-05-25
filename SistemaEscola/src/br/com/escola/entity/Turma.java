package br.com.escola.entity;

/**
 * Classe que representa a entidade turma.
 * @author Fernando Ortiz
 */
public class Turma {
    
    private int codTurma;
    private Professor professor;
    private Disciplina disciplina;
    /* private Curso curso; */
    private String nome;
    
    public Turma(){
        
    }

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

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
