package br.com.escola.views;

import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaSkyMetallicLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaStandardLookAndFeel;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Classe que representa a tela principal
 *
 * @author ortiz
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();

        /* chamada ao método*/
        //temaPadrao();
    }

    /* Tema padrão, nesse caso ele vai setar como padrão o ambiente que o sistema esta
        mas vamos mudar, isso é provisório */
    private void temaPadrao() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        menu_principal = new javax.swing.JMenuBar();
        menu_cadastro = new javax.swing.JMenu();
        item_usuario = new javax.swing.JMenuItem();
        item_alunos = new javax.swing.JMenuItem();
        item_professor = new javax.swing.JMenuItem();
        item_coordenador = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        item_turma = new javax.swing.JMenuItem();
        item_curso = new javax.swing.JMenuItem();
        item_disciplina = new javax.swing.JMenuItem();
        menu_consulta = new javax.swing.JMenu();
        menu_matricula = new javax.swing.JMenu();
        menu_configuracao = new javax.swing.JMenu();
        menu_temas = new javax.swing.JMenu();
        blue_moon = new javax.swing.JMenuItem();
        black_moon = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema Gerenciador de Cadastro de Alunos");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Sistema Cadastro de Alunos");

        jLabel3.setText("Em desenvolvimento");

        menu_cadastro.setMnemonic('c');
        menu_cadastro.setText("Cadastros");

        item_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/32x32/multiple-users-silhouette.png"))); // NOI18N
        item_usuario.setText("Usuários");
        item_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_usuarioActionPerformed(evt);
            }
        });
        menu_cadastro.add(item_usuario);

        item_alunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/32x32/graduate-student-avatar.png"))); // NOI18N
        item_alunos.setText("Alunos");
        item_alunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_alunosActionPerformed(evt);
            }
        });
        menu_cadastro.add(item_alunos);

        item_professor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/32x32/teacher-writing-on-whiteboard.png"))); // NOI18N
        item_professor.setText("Professores");
        item_professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_professorActionPerformed(evt);
            }
        });
        menu_cadastro.add(item_professor);

        item_coordenador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/32x32/manager.png"))); // NOI18N
        item_coordenador.setText("Coordernadores");
        item_coordenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_coordenadorActionPerformed(evt);
            }
        });
        menu_cadastro.add(item_coordenador);
        menu_cadastro.add(jSeparator1);

        item_turma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/32x32/computer.png"))); // NOI18N
        item_turma.setText("Turmas");
        item_turma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_turmaActionPerformed(evt);
            }
        });
        menu_cadastro.add(item_turma);

        item_curso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/32x32/write-board.png"))); // NOI18N
        item_curso.setText("Cursos");
        item_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cursoActionPerformed(evt);
            }
        });
        menu_cadastro.add(item_curso);

        item_disciplina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/32x32/drawing.png"))); // NOI18N
        item_disciplina.setText("Disciplinas");
        item_disciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_disciplinaActionPerformed(evt);
            }
        });
        menu_cadastro.add(item_disciplina);

        menu_principal.add(menu_cadastro);

        menu_consulta.setMnemonic('n');
        menu_consulta.setText("Consultas");
        menu_principal.add(menu_consulta);

        menu_matricula.setMnemonic('m');
        menu_matricula.setText("Matrículas");
        menu_principal.add(menu_matricula);

        menu_configuracao.setMnemonic('o');
        menu_configuracao.setText("Configurações");

        menu_temas.setIcon(new javax.swing.ImageIcon("/home/fernando/Dropbox/FACULDADE/3º ANO/LABORATÓRIO DE COMPUTAÇÃO III/2º BIMESTRE/sistemaEscola/SistemaEscola/Imagens/32x32/paint-pallete-with-paint-brush.png")); // NOI18N
        menu_temas.setText("Temas");

        blue_moon.setText("Synthetica BlueMoon");
        blue_moon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue_moonActionPerformed(evt);
            }
        });
        menu_temas.add(blue_moon);

        black_moon.setText("Synthetica BlackMoon");
        black_moon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                black_moonActionPerformed(evt);
            }
        });
        menu_temas.add(black_moon);

        menu_configuracao.add(menu_temas);

        menu_principal.add(menu_configuracao);

        setJMenuBar(menu_principal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addComponent(separador)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(300, 300, 300)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(810, 441));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void item_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_usuarioActionPerformed
        new TelaControleUsuario().show();
    }//GEN-LAST:event_item_usuarioActionPerformed

    private void item_alunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_alunosActionPerformed
        new CadastroAlunos().show();
    }//GEN-LAST:event_item_alunosActionPerformed

    private void item_turmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_turmaActionPerformed
        new CadastroTurmas().show();
    }//GEN-LAST:event_item_turmaActionPerformed

    private void item_coordenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_coordenadorActionPerformed
        new CadastroCoordenadores().show();
    }//GEN-LAST:event_item_coordenadorActionPerformed

    private void item_professorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_professorActionPerformed
        new CadastroProfessores().show();
    }//GEN-LAST:event_item_professorActionPerformed

    private void item_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cursoActionPerformed
        new CadastroTurmas().show();
    }//GEN-LAST:event_item_cursoActionPerformed

    private void item_disciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_disciplinaActionPerformed
        new CadastroDisciplinas().show();
    }//GEN-LAST:event_item_disciplinaActionPerformed

    private void black_moonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_black_moonActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaStandardLookAndFeel());
            UIManager.setLookAndFeel(new SyntheticaSkyMetallicLookAndFeel());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ParseException | UnsupportedLookAndFeelException e) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, e);

        }

    }//GEN-LAST:event_black_moonActionPerformed

    private void blue_moonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue_moonActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaStandardLookAndFeel());
            UIManager.setLookAndFeel(new SyntheticaAluOxideLookAndFeel());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException | ParseException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_blue_moonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem black_moon;
    private javax.swing.JMenuItem blue_moon;
    private javax.swing.JMenuItem item_alunos;
    private javax.swing.JMenuItem item_coordenador;
    private javax.swing.JMenuItem item_curso;
    private javax.swing.JMenuItem item_disciplina;
    private javax.swing.JMenuItem item_professor;
    private javax.swing.JMenuItem item_turma;
    private javax.swing.JMenuItem item_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menu_cadastro;
    private javax.swing.JMenu menu_configuracao;
    private javax.swing.JMenu menu_consulta;
    private javax.swing.JMenu menu_matricula;
    private javax.swing.JMenuBar menu_principal;
    private javax.swing.JMenu menu_temas;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables
}
