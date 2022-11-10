package View;

import connection.ConnectionFactory;
import controller.ClienteController;
import dao.QuartoJpaController;
import java.awt.Color;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import model.Quarto;
import validacoes.Validacao;

public class TelaCadastroHospedes extends javax.swing.JFrame {

    private QuartoJpaController controllerQuarto;
    private List<Quarto> quartos;

    /**
     * Preenche a tabela com os dados, recuperados a partir da base dados.
     */
    public void preencherTabela() {
        controllerQuarto = new QuartoJpaController(ConnectionFactory.getEmf());
        quartos = controllerQuarto.findQuartoEntities();

        DefaultTableModel tabela = (DefaultTableModel) tblQuartos.getModel();

        tabela.setNumRows(0);
        for (Quarto quarto : quartos) {
            if (quarto.getEstado().equalsIgnoreCase("Disponivel")) {
                Object[] obj = new Object[]{
                    quarto.getId(),
                    quarto.getDescricao(),
                    quarto.getTipo(),
                    quarto.getPreco(),
                    quarto.getEstado()
                };
                tabela.addRow(obj);
            }
        }
    }

    /**
     * Captura o primeiro valor da linha selecionada na tabela.
     *
     * @return primeiro valor na tabela correspondente ao ID.
     */
    public long pegarIdQuarto() {
        int linhaSelecionada = tblQuartos.getSelectedRow();
        if (linhaSelecionada == -1) {

        } else {
            Long id = Long.parseLong(tblQuartos.getValueAt(linhaSelecionada, 0).toString());
            return id;
        }
        return -1l;
    }

    private void limparCampos() {
        txtNome.setText("");
        txtCelular.setText("");
        txtEndereco.setText("");
        txtEmail.setText("");
        txtNacionalidade.setText("");
        txtQuarto.setText("");
        txtNumeroBi.setText("");

    }

    /**
     * Creates new form TelaCadastroHospedes
     */
    public TelaCadastroHospedes() {
        initComponents();
        preencherTabela();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCadastroCliente = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQuartos = new javax.swing.JTable();
        jcbSexo = new javax.swing.JComboBox<>();
        lblNome = new javax.swing.JLabel();
        lblApelido = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblNacionalidade = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtNacionalidade = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblTelemovel = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblDataCheckIn = new javax.swing.JLabel();
        jdcDatadeCheckIn = new com.toedter.calendar.JDateChooser();
        lblDatadeNascimento = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        lblNumeroQuarto = new javax.swing.JLabel();
        txtQuarto = new javax.swing.JTextField();
        btnCheckin = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblTituloNoTopo = new javax.swing.JLabel();
        jdcDatadeNascimento = new com.toedter.calendar.JDateChooser();
        txtNumeroBi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Check-in");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCadastroCliente.setBackground(new java.awt.Color(0, 82, 114));
        panelCadastroCliente.setForeground(new java.awt.Color(0, 51, 51));

        tblQuartos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número do Quarto", "Descrição do Quarto", "Tipo de Quarto", "Preço do Quarto", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQuartos.setColumnSelectionAllowed(true);
        tblQuartos.getTableHeader().setReorderingAllowed(false);
        tblQuartos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblQuartosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblQuartos);
        tblQuartos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jcbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Masculino", "Feminino" }));
        jcbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSexoActionPerformed(evt);
            }
        });

        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome:");

        lblApelido.setForeground(new java.awt.Color(255, 255, 255));
        lblApelido.setText("Endereço:");

        lblSexo.setForeground(new java.awt.Color(255, 255, 255));
        lblSexo.setText("Sexo:");

        lblNacionalidade.setForeground(new java.awt.Color(255, 255, 255));
        lblNacionalidade.setText("Nacionalidade:");

        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email:");

        lblTelemovel.setForeground(new java.awt.Color(255, 255, 255));
        lblTelemovel.setText("Telemóvel:");

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        lblDataCheckIn.setForeground(new java.awt.Color(255, 255, 255));
        lblDataCheckIn.setText("Data de Check-in:");

        lblDatadeNascimento.setForeground(new java.awt.Color(255, 255, 255));
        lblDatadeNascimento.setText("Numero de BI");

        lblNumeroQuarto.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroQuarto.setText("Número do Quarto:");

        txtQuarto.setEditable(false);

        btnCheckin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/door_in.png"))); // NOI18N
        btnCheckin.setText("Check-in");
        btnCheckin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCheckinMousePressed(evt);
            }
        });
        btnCheckin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckinActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarMousePressed(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblTituloNoTopo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTituloNoTopo.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloNoTopo.setText("CHECK-IN DE HÓSPEDES");

        javax.swing.GroupLayout panelCadastroClienteLayout = new javax.swing.GroupLayout(panelCadastroCliente);
        panelCadastroCliente.setLayout(panelCadastroClienteLayout);
        panelCadastroClienteLayout.setHorizontalGroup(
            panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDatadeNascimento)
                    .addComponent(lblNacionalidade)
                    .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApelido)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNacionalidade)
                    .addComponent(jcbSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEndereco)
                    .addComponent(txtNome)
                    .addComponent(jdcDatadeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroBi))
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmail)
                            .addComponent(lblDataCheckIn)
                            .addComponent(lblTelemovel)
                            .addComponent(lblNumeroQuarto))
                        .addGap(18, 18, 18)
                        .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail)
                            .addComponent(jdcDatadeCheckIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCelular)
                            .addComponent(txtQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroClienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCheckin)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(161, 161, 161))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloNoTopo)
                .addGap(316, 316, 316))
        );
        panelCadastroClienteLayout.setVerticalGroup(
            panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(lblTituloNoTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome)
                    .addComponent(lblTelemovel)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                        .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApelido))
                        .addGap(20, 20, 20)
                        .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDataCheckIn)
                            .addComponent(lblSexo)))
                    .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                        .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jdcDatadeCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNacionalidade)
                    .addComponent(lblNumeroQuarto)
                    .addComponent(txtQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroBi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDatadeNascimento)
                    .addComponent(btnCheckin)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addComponent(jdcDatadeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        getContentPane().add(panelCadastroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbSexoActionPerformed

    private void btnCheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckinActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarMousePressed

    private void btnCheckinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckinMousePressed
        // TODO add your handling code here:
        String nome = txtNome.getText();
        String celular = txtCelular.getText();
        String endereco = txtEndereco.getText();
        String email = txtEmail.getText();
        String genero = jcbSexo.getSelectedItem().toString();
        Date date = jdcDatadeCheckIn.getDate();
        LocalDate checkIn = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        String nacionalidade = txtNacionalidade.getText();
        Long quarto = Long.parseLong(txtQuarto.getText());
        String nrBi = txtNumeroBi.getText();

        if (ClienteController.cadastrarCliente(nome, celular, endereco, email, genero, checkIn, nacionalidade, pegarIdQuarto(), nrBi)) {
            JOptionPane.showMessageDialog(null, "Hospede cadastrado com sucesso!!");
            this.limparCampos();
            preencherTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar cadastrar!!");
        }

    }//GEN-LAST:event_btnCheckinMousePressed

    private void tblQuartosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuartosMousePressed
        // TODO add your handling code here:
        pegarIdQuarto();
        txtQuarto.setText(String.valueOf(pegarIdQuarto()));
    }//GEN-LAST:event_tblQuartosMousePressed

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        if (!Validacao.validarEmail(txtEmail.getText())) {
            txtEmail.setBorder(new LineBorder(Color.red));
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
        txtEmail.setBorder(new LineBorder(Color.white));
    }//GEN-LAST:event_txtEmailFocusGained

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
            java.util.logging.Logger.getLogger(TelaCadastroHospedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroHospedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroHospedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroHospedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroHospedes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCheckin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbSexo;
    private com.toedter.calendar.JDateChooser jdcDatadeCheckIn;
    private com.toedter.calendar.JDateChooser jdcDatadeNascimento;
    private javax.swing.JLabel lblApelido;
    private javax.swing.JLabel lblDataCheckIn;
    private javax.swing.JLabel lblDatadeNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNacionalidade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumeroQuarto;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelemovel;
    private javax.swing.JLabel lblTituloNoTopo;
    private javax.swing.JPanel panelCadastroCliente;
    private javax.swing.JTable tblQuartos;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNacionalidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumeroBi;
    private javax.swing.JTextField txtQuarto;
    // End of variables declaration//GEN-END:variables
}
