package br.com.escola.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Classe que vai representar a entidade coordenador.
 * @author Fernando Ortiz
 */

@Entity
@Table(name = "tab_coordenador")
public class Coordenador implements Serializable {
    
    @Id
    private int id;
    @Column
    private String nome;
    @Column
    private String dataNascimento;
    @Column
    private String email;
    @Column
    private String telefone;
    @Column
    private String foto;
    
    @ManyToOne
    private Professor professor;
    
    public Coordenador(){
        
    }
    
    /* private Curso curso */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
}
