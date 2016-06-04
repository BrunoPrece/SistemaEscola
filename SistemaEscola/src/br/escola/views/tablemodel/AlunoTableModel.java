/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.escola.views.tablemodel;

import br.com.escola.entity.Aluno;
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
public class AlunoTableModel extends AbstractTableModel {

    EntityManager manager;
    ArrayList<Aluno> alunos;

    public AlunoTableModel() {
        alunos = (ArrayList<Aluno>) popularTabela();
    }

    public List popularTabela() {

        manager = JpaUtils.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();

        List<Aluno> lista;

        Query query = manager.createQuery("from Aluno");

        lista = query.getResultList();
        return lista;
    }

    @Override
    public int getRowCount() {
        return alunos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

       @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return alunos.get(rowIndex).getId();
            case 1:
                return alunos.get(rowIndex).getNome();
            case 2:
                return alunos.get(rowIndex).getEmail();
            case 3:
                return alunos.get(rowIndex).getTelefone();
            case 4:
                return alunos.get(rowIndex).getCurso().getNome();
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
