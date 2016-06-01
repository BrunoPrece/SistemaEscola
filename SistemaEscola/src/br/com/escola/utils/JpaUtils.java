package br.com.escola.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe onde vai criar o EntityManager, que é responsável por gerenciar
 * entidades no contexto de persistência.
 *
 * @author Fernando Ortiz
 */
public class JpaUtils {

    private static EntityManagerFactory factory;

    /* bloco estático para inicializar a fábrica de entity manager. 
        Isso ocorrerá uma vez quando inicializar a classe. */
    static {
        factory = Persistence.createEntityManagerFactory("SistemaEscola");
    }
    
    public static EntityManager getEntityManager(){
        return factory.createEntityManager();
    }
    
    public void close(){
        factory.close();
    }

}
