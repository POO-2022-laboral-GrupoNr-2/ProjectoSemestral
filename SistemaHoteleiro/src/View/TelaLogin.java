/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.event.KeyEvent;

/**
 *
 * @author Edilson Ricardo
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
        this.setExtendedState(6);
        //Comentario
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPalavraPasse = new javax.swing.JLabel();
        lblNomeUsuario = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        txtPalavraPasse = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        lblEsqueceuPalavraPasse = new javax.swing.JLabel();
        lblImagemLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPalavraPasse.setBackground(new java.awt.Color(255, 255, 255));
        lblPalavraPasse.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        lblPalavraPasse.setForeground(new java.awt.Color(255, 255, 255));
        lblPalavraPasse.setText("Palavra-passe:");
        getContentPane().add(lblPalavraPasse, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 400, 100, -1));

        lblNomeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lblNomeUsuario.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        lblNomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeUsuario.setText("Nome de usuário:");
        getContentPane().add(lblNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 330, 120, -1));

        txtNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUsuarioActionPerformed(evt);
            }
        });
        txtNomeUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 360, 310, -1));

        txtPalavraPasse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPalavraPasseKeyPressed(evt);
            }
        });
        getContentPane().add(txtPalavraPasse, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 430, 310, -1));

        btnEntrar.setText("Entrar");
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 500, -1, -1));

        lblEsqueceuPalavraPasse.setForeground(new java.awt.Color(0, 153, 255));
        lblEsqueceuPalavraPasse.setText("Esqueceu a palavra passe?");
        lblEsqueceuPalavraPasse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblEsqueceuPalavraPasse, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 460, -1, -1));

        lblImagemLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Ruf.jpg"))); // NOI18N
        getContentPane().add(lblImagemLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeUsuarioActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
        new TelaPrincipal().setVisible(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtPalavraPasseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPalavraPasseKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            new TelaPrincipal().setVisible(rootPaneCheckingEnabled);
        dispose();
        }
    }//GEN-LAST:event_txtPalavraPasseKeyPressed

    private void txtNomeUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeUsuarioKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            new TelaPrincipal().setVisible(rootPaneCheckingEnabled);
        dispose();
        }
    }//GEN-LAST:event_txtNomeUsuarioKeyPressed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lblEsqueceuPalavraPasse;
    private javax.swing.JLabel lblImagemLogin;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblPalavraPasse;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JPasswordField txtPalavraPasse;
    // End of variables declaration//GEN-END:variables
}
