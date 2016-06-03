/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.escola.views;

import br.com.escola.entity.Professor;
import br.com.escola.utils.JpaUtils;
import java.io.File;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author labinfo
 */
public class CadastroProfessores extends javax.swing.JFrame {
    
    MaskFormatter formatoDN;
    MaskFormatter formatoTel;
    
    private static int id_professor;

    /**
     * Construtor Padrão.
     */
    public CadastroProfessores() {
        initComponents();
        
        tf_foto.setVisible(false);
        mostrarInformacoes();
    }

    /* Método para limpar os campos. */
    private void limparCampos() {
        txtDataNascimento.setText("");
        txtEmail.setText("");
        txtNome.setText("");
        tf_foto.setText("");
        txtTelefone.setText("");
        labelFoto.setIcon(new ImageIcon("/home/fernando/Dropbox/FACULDADE/3º ANO/LABORATÓRIO DE COMPUTAÇÃO III/2º BIMESTRE/"
                + "Sistema Escola/sistemaEscola/SistemaEscola/Imagens/32x32/no-cameras-sign_1.png"));
    }

    /* Métodos que ativam, e desativam os botões */
    private void ativarBotoes() {
        btnNovo.setEnabled(true);
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnSalvar.setEnabled(true);
    }
    
    private void desativaBotoes() {
        btnNovo.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnSalvar.setEnabled(false);
    }

    /**
     * Método que mostra as informações (a última) presente no banco de dados.
     */
    private void mostrarInformacoes() {
        EntityManager manager = JpaUtils.getEntityManager();

        /* Criamos uma query JPQL e armazenamos em uma váriavel query do tipo Query. */
        Query query = manager.createQuery("from Professor");

        /* Depois executamos o método getResultList() do objeto query e obtemos os
           professores e armazenamos em uma lista de professores. */
        List<Professor> professores = query.getResultList();

        /* Laço utilizado para listar os professores que estão presentes na lista. */
        for (Professor professor : professores) {
            txtNome.setText(professor.getNome());
            txtDataNascimento.setText(professor.getDataNasc());
            txtEmail.setText(professor.getEmail());
            txtMatricula.setText(Integer.toString(professor.getId()));
            tf_foto.setText(professor.getFoto());
            txtTelefone.setText(professor.getTelefone());
            labelFoto.setIcon(new ImageIcon("/home/fernando/Dropbox/FACULDADE/3º ANO/LABORATÓRIO DE COMPUTAÇÃO III/2º BIMESTRE/"
                    + "Sistema Escola/sistemaEscola/SistemaEscola/Imagens/" + professor.getFoto()));
        }

        /* Fechando as conexões */
        manager.close();
        JpaUtils.getEntityManager().close();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelFoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        painel_botoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        tf_foto = new javax.swing.JTextField();
        painel_informacoes = new javax.swing.JPanel();
        labelMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        try {
            formatoDN = new MaskFormatter("##/##/####");
        } catch(Exception erro) {
            JOptionPane.showMessageDialog(null, "Não foi possível inserir uma máscara" + erro);
        }
        txtDataNascimento = new JFormattedTextField(formatoDN);
        labelDataNascimento = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        try {
            formatoTel = new MaskFormatter("(##)####-####");
        } catch(Exception erro) {
            JOptionPane.showMessageDialog(null, "Não foi possível inserir uma máscara" + erro);
        }
        txtTelefone = new JFormattedTextField(formatoTel);
        painel_botoesControle = new javax.swing.JPanel();
        botao_proximo = new javax.swing.JButton();
        painel_tabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de ALunos");

        labelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/32x32/no-cameras-sign_1.png"))); // NOI18N
        labelFoto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        labelFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelFotoMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Professores");

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/24x24/add-new-document.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/24x24/signing-the-contract.png"))); // NOI18N
        btnAlterar.setText("Alterar");

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/24x24/delete.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/24x24/delete.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        tf_foto.setEditable(false);
        tf_foto.setEnabled(false);

        javax.swing.GroupLayout painel_botoesLayout = new javax.swing.GroupLayout(painel_botoes);
        painel_botoes.setLayout(painel_botoesLayout);
        painel_botoesLayout.setHorizontalGroup(
            painel_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_botoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painel_botoesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnExcluir, btnNovo, btnSalvar});

        painel_botoesLayout.setVerticalGroup(
            painel_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_botoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSalvar)
                    .addComponent(tf_foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painel_botoesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnExcluir, btnNovo, btnSalvar});

        labelMatricula.setText("Matrícula.:");

        txtMatricula.setEditable(false);
        txtMatricula.setEnabled(false);

        labelNome.setText("Nome.:");

        labelDataNascimento.setText("Data Nascimento.:");

        labelEmail.setText("Email.:");

        labelTelefone.setText("Telefone.:");

        javax.swing.GroupLayout painel_informacoesLayout = new javax.swing.GroupLayout(painel_informacoes);
        painel_informacoes.setLayout(painel_informacoesLayout);
        painel_informacoesLayout.setHorizontalGroup(
            painel_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_informacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_informacoesLayout.createSequentialGroup()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_informacoesLayout.createSequentialGroup()
                        .addGroup(painel_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_informacoesLayout.createSequentialGroup()
                                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel_informacoesLayout.createSequentialGroup()
                                .addComponent(labelMatricula)
                                .addGap(18, 18, 18)
                                .addComponent(labelNome))
                            .addComponent(labelEmail))
                        .addGap(18, 18, 18)
                        .addGroup(painel_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTelefone)
                            .addComponent(labelDataNascimento)
                            .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_informacoesLayout.setVerticalGroup(
            painel_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_informacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMatricula)
                    .addComponent(labelNome)
                    .addComponent(labelDataNascimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(labelTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        botao_proximo.setText(">>");

        javax.swing.GroupLayout painel_botoesControleLayout = new javax.swing.GroupLayout(painel_botoesControle);
        painel_botoesControle.setLayout(painel_botoesControleLayout);
        painel_botoesControleLayout.setHorizontalGroup(
            painel_botoesControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_botoesControleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botao_proximo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_botoesControleLayout.setVerticalGroup(
            painel_botoesControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_botoesControleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botao_proximo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Matricula.:", "Nome.:", "Email.:", "Telefone.:"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout painel_tabelaLayout = new javax.swing.GroupLayout(painel_tabela);
        painel_tabela.setLayout(painel_tabelaLayout);
        painel_tabelaLayout.setHorizontalGroup(
            painel_tabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_tabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_tabelaLayout.setVerticalGroup(
            painel_tabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_tabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(painel_informacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelFoto))
                            .addComponent(painel_tabela, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(painel_botoesControle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painel_botoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(14, 14, 14)
                        .addComponent(painel_informacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painel_botoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painel_botoesControle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painel_tabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método responsável por persistir informações no banco
     */
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        /* Obtendo uma EntityManager da classe JpaUtils */
        EntityManager manager = JpaUtils.getEntityManager();

        /* Inicializando uma nova transação */
        EntityTransaction tx = manager.getTransaction();
        tx.begin();

        /* Criando um novo Professor */
        Professor professor = new Professor();
        
        professor.setId(0);
        professor.setNome(txtNome.getText());
        professor.setEmail(txtEmail.getText());
        professor.setDataNasc(txtDataNascimento.getText());
        professor.setTelefone(txtTelefone.getText());
        professor.setFoto(tf_foto.getText());

        /* Isso faz com que o JPA insira o objeto no banco de dados */
        manager.persist(professor);
        /* Fazendo um commit da transação */
        tx.commit();
        /* Fechando o EntityManager */
        manager.close();
        
        JOptionPane.showMessageDialog(null, professor.getNome() + " Inserido com Sucesso!");
        id_professor = professor.getId() + 1;
        limparCampos();
        ativarBotoes();
        btnSalvar.setEnabled(false);
        mostrarInformacoes();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        EntityManager manager = JpaUtils.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();

        /* Primeiro busca o Professor */
        Professor professor = manager.find(Professor.class, Integer.parseInt(txtMatricula.getText()));

        /* Remove o veículo passado como parametro */
        manager.remove(professor);
        
        tx.commit();
        manager.close();
        JpaUtils.getEntityManager().close();
    }//GEN-LAST:event_btnExcluirActionPerformed

    /* Método responsável por fazer a troca das fotos. */
    private void labelFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelFotoMouseClicked
        /* Essa condição dou créditos a galera do GUJ que me ajudou, o que ela faz, ela simplesmente
         detecta o sistema operacional que vc esta usando, e armazena em uma variavel diretorio para pesquisa */
        String diretorio = "";
        if (System.getProperty("os.name").startsWith("Windows")) {
            diretorio = "/Users/" + System.getProperty("user.name") + "/Dropbox/FACULDADE/3º ANO/LABORATÓRIO DE COMPUTAÇÃO III/2º BIMESTRE/"
                    + "Sistema Escola/sistemaEscola/SistemaEscola/Imagens";
            //JOptionPane.showMessageDialog(null, diretorio);
        } else if (System.getProperty("os.name").startsWith("Linux")) {
            //no caso do Linux é home
            diretorio = "/home/" + System.getProperty("user.name") + "/Dropbox/FACULDADE/3º ANO/LABORATÓRIO DE COMPUTAÇÃO III/2º BIMESTRE/"
                    + "Sistema Escola/sistemaEscola/SistemaEscola/Imagens";
            //JOptionPane.showMessageDialog(null, diretorio);
        }
        
        try {
            /* Seta esse diretório como padrão */
            JFileChooser buscarFoto = new JFileChooser();
            //JOptionPane.showMessageDialog(null, "Você deve inserir fotos com tamanho 128 x 128 px tudo bem?");

            buscarFoto.setCurrentDirectory(new File(diretorio));
            //buscarFoto.setCurrentDirectory(new File("/home/fernando/Estoque/Estoque/Fotos/"));
            buscarFoto.setDialogTitle("Carregar Imagem do Aluno");
            buscarFoto.showOpenDialog(this);
            
            String foto = "" + buscarFoto.getSelectedFile().getName();
            
            tf_foto.setText(foto);
            labelFoto.setIcon(new ImageIcon("/home/fernando/Dropbox/FACULDADE/3º ANO/LABORATÓRIO DE COMPUTAÇÃO III/2º BIMESTRE/"
                    + "Sistema Escola/sistemaEscola/SistemaEscola/Imagens/" + tf_foto.getText()));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível inserir uma foto");
        }
    }//GEN-LAST:event_labelFotoMouseClicked

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limparCampos();
        desativaBotoes();
        btnSalvar.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAlunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_proximo;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelDataNascimento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JPanel painel_botoes;
    private javax.swing.JPanel painel_botoesControle;
    private javax.swing.JPanel painel_informacoes;
    private javax.swing.JPanel painel_tabela;
    private javax.swing.JTextField tf_foto;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
