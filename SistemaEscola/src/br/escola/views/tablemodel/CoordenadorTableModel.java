/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.escola.views.tablemodel;

import br.com.escola.entity.Coordenador;
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
public class CoordenadorTableModel extends AbstractTableModel {
        EntityManager manager;
    ArrayList<Coordenador> coordenadores;

    public CoordenadorTableModel() {
        coordenadores = (ArrayList<Coordenador>) popularTabela();
    }

    public List popularTabela() {

        manager = JpaUtils.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();

        List<Coordenador> lista;

        Query query = manager.createQuery("from Coordenador");

        lista = query.getResultList();
        return lista;
    }

    @Override
    public int getRowCount() {
        return coordenadores.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

       @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return coordenadores.get(rowIndex).getId();
            case 1:
                return coordenadores.get(rowIndex).getNome();
            case 2:
                return coordenadores.get(rowIndex).getEmail();
            case 3:
                return coordenadores.get(rowIndex).getTelefone();
            case 4:
                return coordenadores.get(rowIndex).getCurso();
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
            case 4:
                return "Curso";
            default:
                return "Erro";
        }

    }
}
