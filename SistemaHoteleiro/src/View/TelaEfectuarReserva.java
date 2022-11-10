package View;

import connection.ConnectionFactory;
import controller.QuartoController;
import controller.ReservaController;
import dao.QuartoJpaController;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Quarto;

public class TelaEfectuarReserva extends javax.swing.JFrame {

    private QuartoJpaController controller;
    private List<Quarto> quartos;
    private Quarto quarto;

    private void limparCampos() {
        txtNome.setText("");
        txtCelular.setText("");
        txtEndereco.setText("");
        txtEmail.setText("");
        txtNacionalidade.setText("");
        txtQuarto.setText("");
        txtNrBi.setText("");
        txtValor.setText("");

    }

    /**
     * Captura o primeiro valor da linha selecionada na tabela.
     *
     * @return primeiro valor na tabela, correspondente ao ID.
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

    /**
     * Este metodo preenche a tabela com os registros da base de dados
     */

    public void preencherTabela() {
        controller = new QuartoJpaController(ConnectionFactory.getEmf());
        quarto = new Quarto();
        quartos = controller.findQuartoEntities();

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
     * Creates new form TelaCadastroHospedes
     */
    public TelaEfectuarReserva() {
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
        lblValorReserva = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtNrBi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Efectuar Reserva ");
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

        lblDataCheckIn.setForeground(new java.awt.Color(255, 255, 255));
        lblDataCheckIn.setText("Data de Check-in:");

        lblDatadeNascimento.setForeground(new java.awt.Color(255, 255, 255));
        lblDatadeNascimento.setText("Numero de BI:");

        lblNumeroQuarto.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroQuarto.setText("Número do Quarto:");

        btnCheckin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/calendar_view_day.png"))); // NOI18N
        btnCheckin.setText("Efectuar Reserva");
        btnCheckin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        lblTituloNoTopo.setText("EFECTUAR RESERVA");

        lblValorReserva.setForeground(new java.awt.Color(255, 255, 255));
        lblValorReserva.setText("Valor Pago:");

        txtValor.setEditable(false);

        javax.swing.GroupLayout panelCadastroClienteLayout = new javax.swing.GroupLayout(panelCadastroCliente);
        panelCadastroCliente.setLayout(panelCadastroClienteLayout);
        panelCadastroClienteLayout.setHorizontalGroup(
            panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroClienteLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(txtNrBi))
                        .addGap(80, 80, 80)
                        .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmail)
                            .addComponent(lblDataCheckIn)
                            .addComponent(lblTelemovel)
                            .addComponent(lblNumeroQuarto)
                            .addComponent(lblValorReserva))
                        .addGap(18, 18, 18)
                        .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail)
                            .addComponent(jdcDatadeCheckIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCelular)
                            .addComponent(txtQuarto, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(txtValor)))
                    .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(lblTituloNoTopo))
                    .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCheckin))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCadastroClienteLayout.setVerticalGroup(
            panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblTituloNoTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
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
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblValorReserva)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNrBi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDatadeNascimento)))
                .addGap(18, 18, 18)
                .addComponent(jdcDatadeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheckin)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
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
        String nrBi = txtNrBi.getText();
        //Valor deve ser passado ao selecionar ou insirir o numero do quarto
        Double valor = Double.parseDouble(txtValor.getText());

        if (ReservaController.cadastrar(nome, celular, endereco, email, genero, checkIn, nacionalidade, quarto, nrBi, valor)) {
            JOptionPane.showMessageDialog(null, "Reserva efectuada com sucesso!!");
            this.limparCampos();
            QuartoController.statusReservado(quarto);
            preencherTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar efectuar reserva!!");
        }
    }//GEN-LAST:event_btnCheckinMousePressed

    private void tblQuartosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuartosMousePressed
        // TODO add your handling code here:

        txtQuarto.setText(String.valueOf(pegarIdQuarto()));
        txtValor.setText(String.valueOf(QuartoController.setarValor(pegarIdQuarto())));
    }//GEN-LAST:event_tblQuartosMousePressed

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
            java.util.logging.Logger.getLogger(TelaEfectuarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEfectuarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEfectuarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEfectuarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEfectuarReserva().setVisible(true);
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
    private javax.swing.JLabel lblValorReserva;
    private javax.swing.JPanel panelCadastroCliente;
    private javax.swing.JTable tblQuartos;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNacionalidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNrBi;
    private javax.swing.JTextField txtQuarto;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
