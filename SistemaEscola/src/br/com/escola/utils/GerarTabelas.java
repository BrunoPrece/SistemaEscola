/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.escola.utils;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author bruno
 */
public class GerarTabelas {
   
        public static void main(String[] args) {
        /* O parâmetro do creteEntity deve ser o mesmo informado 
            no atributo name da tag persistence-unit, no arquivo 
            persistence.xml */
       EntityManagerFactory factory =  Persistence.createEntityManagerFactory("SistemaEscola");
            
    }
}

