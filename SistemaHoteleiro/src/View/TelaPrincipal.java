package View;

import javax.swing.JOptionPane;

/**
 *
 * @author Edilson Ricardo
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        setExtendedState(6);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Tens a certeza de que deseja sair?");
        if (resposta == 0) {
            this.dispose();
        }
    }

    private void menuItemCadFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
//        new TelaDeCadastroFuncionario().setVisible(true);
    }

    private void menuItemCadFuncionarioMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        new TelaDeCadastroFuncionario().setVisible(true);
    }

    private void jMenuItem8MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

    }

    private void jMenuItem8MousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        new TelaConsultaDeFuncionarios().setVisible(true);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTelaPrincipal = new javax.swing.JPanel();
        btnEfectuarReserva = new javax.swing.JButton();
        btnConsumo = new javax.swing.JButton();
        btnConsumo1 = new javax.swing.JButton();
        btnCadCliente = new javax.swing.JButton();
        lblImagemTelaPrincipal = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        menuItemCadProduto = new javax.swing.JMenuItem();
        menuItemCadHospedes = new javax.swing.JMenuItem();
        menuItemCadFuncionario = new javax.swing.JMenuItem();
        menuItemCadAcomodacao = new javax.swing.JMenuItem();
        menuConsultar = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        menuConfiguracoes = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Inicial");
        setResizable(false);

        panelTelaPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEfectuarReserva.setText("Efectuar Reserva");
        btnEfectuarReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEfectuarReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEfectuarReservaMousePressed(evt);
            }
        });
        panelTelaPrincipal.add(btnEfectuarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 320, -1, -1));

        btnConsumo.setText("Check-Out");
        btnConsumo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsumo.setFocusPainted(false);
        panelTelaPrincipal.add(btnConsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, 100, -1));

        btnConsumo1.setText("Consumo");
        btnConsumo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsumo1.setFocusPainted(false);
        btnConsumo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsumo1ActionPerformed(evt);
            }
        });
        panelTelaPrincipal.add(btnConsumo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, 110, -1));

        btnCadCliente.setText("Cadastrar Cliente");
        btnCadCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadCliente.setFocusPainted(false);
        btnCadCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCadClienteMousePressed(evt);
            }
        });
        panelTelaPrincipal.add(btnCadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 320, 131, -1));

        lblImagemTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/RUFmenuInicial5.jpg"))); // NOI18N
        panelTelaPrincipal.add(lblImagemTelaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 742));

        menuBar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));
        menuBar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menuCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/page_add.png"))); // NOI18N
        menuCadastros.setText("Cadastros  |");

        menuItemCadProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/basket_add.png"))); // NOI18N
        menuItemCadProduto.setText("Cadastrar Produto");
        menuCadastros.add(menuItemCadProduto);

        menuItemCadHospedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/user_add.png"))); // NOI18N
        menuItemCadHospedes.setText("Cadastrar Hóspede");
        menuItemCadHospedes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItemCadHospedesMouseClicked(evt);
            }
        });
        menuItemCadHospedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadHospedesActionPerformed(evt);
            }
        });
        menuItemCadHospedes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                menuItemCadHospedesKeyPressed(evt);
            }
        });
        menuCadastros.add(menuItemCadHospedes);

        menuItemCadFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/user_add.png"))); // NOI18N
        menuItemCadFuncionario.setText("Cadastrar Funcionário");
        menuItemCadFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItemCadFuncionarioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuItemCadFuncionarioMousePressed(evt);
            }
        });
        menuCadastros.add(menuItemCadFuncionario);

        menuItemCadAcomodacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/door_open.png"))); // NOI18N
        menuItemCadAcomodacao.setText("Cadastrar Acomodação");
        menuItemCadAcomodacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuItemCadAcomodacaoMousePressed(evt);
            }
        });
        menuCadastros.add(menuItemCadAcomodacao);

        menuBar.add(menuCadastros);

        menuConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/magnifier.png"))); // NOI18N
        menuConsultar.setText("Consultar   |");

        jMenuItem5.setText("Consultar Reserva");
        menuConsultar.add(jMenuItem5);

        jMenuItem6.setText("Consultar Produto");
        menuConsultar.add(jMenuItem6);

        jMenuItem7.setText("Consultar Hóspede");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menuConsultar.add(jMenuItem7);

        jMenuItem8.setText("Consultar Funcionário");
        jMenuItem8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem8MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem8MousePressed(evt);
            }
        });
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menuConsultar.add(jMenuItem8);

        jMenuItem9.setText("Consultar Acomodações");
        menuConsultar.add(jMenuItem9);

        menuBar.add(menuConsultar);

        menuRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/report.png"))); // NOI18N
        menuRelatorio.setText("Relatório   |");

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/report_picture.png"))); // NOI18N
        jMenuItem10.setText("Relatório Financeiro");
        menuRelatorio.add(jMenuItem10);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/report_go.png"))); // NOI18N
        jMenuItem11.setText("Relatório de Reservas");
        menuRelatorio.add(jMenuItem11);

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/report_user.png"))); // NOI18N
        jMenuItem12.setText("Relatório de Produtos");
        menuRelatorio.add(jMenuItem12);

        menuBar.add(menuRelatorio);

        menuConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/cog.png"))); // NOI18N
        menuConfiguracoes.setText("Configurações   |");

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/lock_edit.png"))); // NOI18N
        jMenuItem13.setText("Alterar Palavra-Passe");
        menuConfiguracoes.add(jMenuItem13);

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/images.png"))); // NOI18N
        jMenuItem14.setText("Alterar Fundo");
        menuConfiguracoes.add(jMenuItem14);

        menuBar.add(menuConfiguracoes);

        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/door_out.png"))); // NOI18N
        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuBar.add(menuSair);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void menuItemCadHospedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadHospedesActionPerformed
        // TODO add your handling code here:
        new TelaCadastroHospedes().setVisible(true);

    }//GEN-LAST:event_menuItemCadHospedesActionPerformed

    private void btnConsumo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsumo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsumo1ActionPerformed

    private void menuItemCadHospedesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menuItemCadHospedesKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_menuItemCadHospedesKeyPressed
    private void menuItemCadHospedesMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        new TelaCadastroHospedes().setVisible(true);
    }
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void btnCadClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadClienteMousePressed
        // TODO add your handling code here:
        new TelaCadastroHospedes().setVisible(true);
    }//GEN-LAST:event_btnCadClienteMousePressed

    private void menuItemCadAcomodacaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemCadAcomodacaoMousePressed
        // TODO add your handling code here:
        new TeladeCadastrodeAcomodacao().setVisible(true);
    }//GEN-LAST:event_menuItemCadAcomodacaoMousePressed

    private void btnEfectuarReservaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEfectuarReservaMousePressed
        // TODO add your handling code here:
        new TelaEfectuarReserva().setVisible(true);
    }//GEN-LAST:event_btnEfectuarReservaMousePressed

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
    private javax.swing.JButton btnCadCliente;
    private javax.swing.JButton btnConsumo;
    private javax.swing.JButton btnConsumo1;
    private javax.swing.JButton btnEfectuarReserva;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel lblImagemTelaPrincipal;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuConfiguracoes;
    private javax.swing.JMenu menuConsultar;
    private javax.swing.JMenuItem menuItemCadAcomodacao;
    private javax.swing.JMenuItem menuItemCadFuncionario;
    private javax.swing.JMenuItem menuItemCadHospedes;
    private javax.swing.JMenuItem menuItemCadProduto;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenu menuSair;
    private javax.swing.JPanel panelTelaPrincipal;
    // End of variables declaration//GEN-END:variables
}
