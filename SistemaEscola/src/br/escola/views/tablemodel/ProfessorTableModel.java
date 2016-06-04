/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.escola.views.tablemodel;

import br.com.escola.entity.Professor;
import br.com.escola.utils.JpaUtils;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author bruno
 */
public class ProfessorTableModel extends AbstractTableModel {

    EntityManager manager;
    ArrayList<Professor> professores;

    public ProfessorTableModel() {
        professores = (ArrayList<Professor>) popularTabela();
    }
    
    public List popularTabela() {
        
        manager = JpaUtils.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        
        List<Professor> lista;

        Query query = manager.createQuery("from Professor");
        
        lista = query.getResultList();
        return lista;
    }

    @Override
    public int getRowCount() {
        return professores.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return professores.get(rowIndex).getId();
            case 1:
                return professores.get(rowIndex).getNome();
            case 2:
                return professores.get(rowIndex).getEmail();
            case 3:
                return professores.get(rowIndex).getTelefone();
            default:
                return "Erro";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Matrícula";
            case 1:
                return "Nome";
            case 2:
                return "Email";
            case 3:
                return "Telefone";
            default:
                return "Erro";
        }

    }

}
