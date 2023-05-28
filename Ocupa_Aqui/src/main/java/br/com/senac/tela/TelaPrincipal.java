/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.tela;

import br.com.senac.entidade.Usuario;

/**
 *
 * @author silvio.junior
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private Usuario usuario;

    public TelaPrincipal() {
        initComponents();
    }

    public TelaPrincipal(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        varUsuarioLogado.setText("Seja bem vindo " + usuario.getNome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        varUsuarioLogado = new javax.swing.JLabel();
        icone_cad_usuario = new javax.swing.JLabel();
        icone_pesq_usuario = new javax.swing.JLabel();
        icone_pesq_usuario1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_cadastro = new javax.swing.JMenu();
        item_cad_usuario = new javax.swing.JMenuItem();
        item_cad_perfil = new javax.swing.JMenuItem();
        item_cad_profissao = new javax.swing.JMenuItem();
        menu_pesquisa = new javax.swing.JMenu();
        item_pesq_usuario = new javax.swing.JMenuItem();
        item_pesq_perfil = new javax.swing.JMenuItem();
        item_pesq_profissao = new javax.swing.JMenuItem();
        menuAlteraSenha = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Senac");

        icone_cad_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cad_usuario.png"))); // NOI18N
        icone_cad_usuario.setToolTipText("Novo Usuário");
        icone_cad_usuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        icone_cad_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icone_cad_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icone_cad_usuarioMouseClicked(evt);
            }
        });

        icone_pesq_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cad_perfil.png"))); // NOI18N
        icone_pesq_usuario.setToolTipText("Pesquisa de usuário");
        icone_pesq_usuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        icone_pesq_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icone_pesq_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icone_pesq_usuarioMouseClicked(evt);
            }
        });

        icone_pesq_usuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/pesq_usario.png"))); // NOI18N
        icone_pesq_usuario1.setToolTipText("Pesquisa de usuário");
        icone_pesq_usuario1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        icone_pesq_usuario1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icone_pesq_usuario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icone_pesq_usuario1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        menu_cadastro.setText("Cadastro");

        item_cad_usuario.setText("Usuario");
        menu_cadastro.add(item_cad_usuario);

        item_cad_perfil.setText("Perfil");
        item_cad_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cad_perfilActionPerformed(evt);
            }
        });
        menu_cadastro.add(item_cad_perfil);

        item_cad_profissao.setText("Profissao");
        item_cad_profissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cad_profissaoActionPerformed(evt);
            }
        });
        menu_cadastro.add(item_cad_profissao);

        jMenuBar1.add(menu_cadastro);

        menu_pesquisa.setText("Pesquisa");

        item_pesq_usuario.setText("Usuario");
        menu_pesquisa.add(item_pesq_usuario);

        item_pesq_perfil.setText("Perfil");
        item_pesq_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_pesq_perfilActionPerformed(evt);
            }
        });
        menu_pesquisa.add(item_pesq_perfil);

        item_pesq_profissao.setText("Profissao");
        item_pesq_profissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_pesq_profissaoActionPerformed(evt);
            }
        });
        menu_pesquisa.add(item_pesq_profissao);

        jMenuBar1.add(menu_pesquisa);

        menuAlteraSenha.setText("Alterar senha");
        menuAlteraSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAlteraSenhaMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuAlteraSenha);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(494, Short.MAX_VALUE)
                .addComponent(varUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(icone_cad_usuario)
                .addGap(18, 18, 18)
                .addComponent(icone_pesq_usuario1)
                .addGap(18, 18, 18)
                .addComponent(icone_pesq_usuario)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(varUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(icone_pesq_usuario)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(icone_cad_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(icone_pesq_usuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(0, 223, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void icone_cad_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icone_cad_usuarioMouseClicked
        new CadastroUsuario().setVisible(true);
    }//GEN-LAST:event_icone_cad_usuarioMouseClicked

    private void icone_pesq_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icone_pesq_usuarioMouseClicked
        new PesquisaUsuario().setVisible(true);
    }//GEN-LAST:event_icone_pesq_usuarioMouseClicked

    private void item_cad_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cad_perfilActionPerformed
        // TODO add your handling code here:
         new CadastroPerfil().setVisible(true);
    }//GEN-LAST:event_item_cad_perfilActionPerformed

    private void item_pesq_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_pesq_perfilActionPerformed
        // TODO add your handling code here:
        new PesquisarPerfil().setVisible(true);
    }//GEN-LAST:event_item_pesq_perfilActionPerformed

    private void item_pesq_profissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_pesq_profissaoActionPerformed
        // TODO add your handling code here:
        new PesquisarProfissao().setVisible(true);
    }//GEN-LAST:event_item_pesq_profissaoActionPerformed

    private void item_cad_profissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cad_profissaoActionPerformed
        new CadastroProfissao().setVisible(true);
    }//GEN-LAST:event_item_cad_profissaoActionPerformed

    private void icone_pesq_usuario1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icone_pesq_usuario1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_icone_pesq_usuario1MouseClicked

    private void menuAlteraSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAlteraSenhaMouseClicked
        // TODO add your handling code here:
        new AlteraSenha(usuario).setVisible(true);
    }//GEN-LAST:event_menuAlteraSenhaMouseClicked

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
//                TelaPrincipal tela = new TelaPrincipal();
//                tela.setVisible(true);
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icone_cad_usuario;
    private javax.swing.JLabel icone_pesq_usuario;
    private javax.swing.JLabel icone_pesq_usuario1;
    private javax.swing.JMenuItem item_cad_perfil;
    private javax.swing.JMenuItem item_cad_profissao;
    private javax.swing.JMenuItem item_cad_usuario;
    private javax.swing.JMenuItem item_pesq_perfil;
    private javax.swing.JMenuItem item_pesq_profissao;
    private javax.swing.JMenuItem item_pesq_usuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuAlteraSenha;
    private javax.swing.JMenu menu_cadastro;
    private javax.swing.JMenu menu_pesquisa;
    private javax.swing.JLabel varUsuarioLogado;
    // End of variables declaration//GEN-END:variables
}
