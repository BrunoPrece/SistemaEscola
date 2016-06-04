
package br.com.escola.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


/**
 * Classe que representa a entidade curso.
 * @author Fernando Ortiz
 */

@Entity
@Table(name = "tab_curso")
public class Curso implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_curso;
    
    @Column
    private String nome;
    @Column
    private String cargaHoraria;
    
    @ManyToOne
    private Coordenador cordenador;
       
    public Curso(){
        
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Coordenador getCordenador() {
        return cordenador;
    }

    public void setCordenador(Coordenador cordenador) {
        this.cordenador = cordenador;
    }
    
   
    
    
    
    
}
