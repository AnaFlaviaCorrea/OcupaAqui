/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.tela;

import br.com.senac.dao.HibernateUtil;
import br.com.senac.dao.PerfilDao;
import br.com.senac.dao.PerfilDaoImpl;
import br.com.senac.dao.UsuarioDao;
import br.com.senac.dao.UsuarioDaoImpl;
import br.com.senac.entidade.Perfil;
import br.com.senac.entidade.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author silvio.junior
 */
public class CadastroUsuario extends javax.swing.JFrame {

    private UsuarioDao usuarioDao;
    private Session sessao;
    private Usuario usuario;
    private List<Perfil> perfis;

    public CadastroUsuario() {
        initComponents();
        carregarComboPerfil();
        
         
   }

    public CadastroUsuario(Usuario usuario) {
        initComponents();
        lb_titulo.setText("Alterar Usuário");
        btSalvar.setText("Alterar");
        carregarAlteracaoUsuario(usuario);
    }

    private void carregarAlteracaoUsuario(Usuario usuario1) {
        this.usuario = usuario1;
        varNome.setText(usuario1.getNome());
        varLogin.setText(usuario1.getLogin());
        varComboPerfil.getModel().setSelectedItem(usuario1.getPerfil().getNome());
        carregarComboPerfil();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_titulo = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
        varNome = new javax.swing.JTextField();
        lb_login = new javax.swing.JLabel();
        varLogin = new javax.swing.JTextField();
        lb_perfil = new javax.swing.JLabel();
        varComboPerfil = new javax.swing.JComboBox<>();
        btSalvar = new javax.swing.JButton();
        btAtivo = new javax.swing.JButton();
        lb_situacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuário");

        lb_titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setText("Cadastro Usuário");

        lb_nome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome.setText("Nome:");

        lb_login.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_login.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_login.setText("Login:");

        lb_perfil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_perfil.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_perfil.setText("Perfil:");

        varComboPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um perfil..." }));
        varComboPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varComboPerfilActionPerformed(evt);
            }
        });

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btAtivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btAtivo.setText("Ativo");
        btAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtivoActionPerformed(evt);
            }
        });

        lb_situacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_situacao.setText("Situação: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lb_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(varNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lb_login, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(varLogin)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_situacao)
                            .addComponent(lb_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(varComboPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_nome)
                    .addComponent(varNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_login)
                    .addComponent(varLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_perfil)
                    .addComponent(varComboPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtivo)
                    .addComponent(lb_situacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSalvar)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        usuarioDao = new UsuarioDaoImpl();
        sessao = HibernateUtil.abrirConexao();
        if (validarFormulario()) {
            if(usuario == null){
                 usuario = new Usuario();
                usuario.setSenha("12345");
            }
           
            usuario.setNome(varNome.getText());
            usuario.setLogin(varLogin.getText());

            int indice = varComboPerfil.getSelectedIndex();
            indice--;
            usuario.setPerfil(perfis.get(indice));
            usuarioDao.salvarOuAlterar(usuario, sessao);
            dispose();//fecha a janela atual
            JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!");
            sessao.close();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void varComboPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varComboPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varComboPerfilActionPerformed

    private void btAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtivoActionPerformed
        // TODO add your handling code here:
        System.out.println("Valor botão: " + btAtivo.getText());
        if(btAtivo.getText().equals("Ativo")){
            btAtivo.setText("Inativo");
           
        }else{
            btAtivo.setText("Ativo");
        }
    }//GEN-LAST:event_btAtivoActionPerformed

    private void carregarComboPerfil() {
        PerfilDao perfilDao = new PerfilDaoImpl();
        try {
            sessao = HibernateUtil.abrirConexao();
            perfis = perfilDao.pesquisarTodosAtivo(sessao);
            
            perfis.forEach(perfil -> {
                varComboPerfil.addItem(perfil.getNome());
            });

        } catch (HibernateException e) {
            System.out.println("Erro ao pesquisar perfis" + e.getMessage());
        } finally {
            sessao.close();
        }

    }

    private boolean validarFormulario() {
        String nome = varNome.getText().trim();
        if (validarCampoMenor3Caracter(nome)) {
            JOptionPane.showMessageDialog(null, "Preencha o nome corretamente!");
            return false;
        }
        String login = varLogin.getText().trim();
        if (validarCampoMenor3Caracter(login)) {
            JOptionPane.showMessageDialog(null, "Preencha o login corretamente!");
            return false;
        }
        int indice = varComboPerfil.getSelectedIndex();
        if (indice == 0) {
            JOptionPane.showMessageDialog(null, "Selecione pelo menos um perfil");
            return false;
        }
        return true;
    }

    private boolean validarCampoMenor3Caracter(String campo) {
        return campo.length() < 3;

    }

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
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtivo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel lb_login;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_perfil;
    private javax.swing.JLabel lb_situacao;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JComboBox<String> varComboPerfil;
    private javax.swing.JTextField varLogin;
    private javax.swing.JTextField varNome;
    // End of variables declaration//GEN-END:variables
}
