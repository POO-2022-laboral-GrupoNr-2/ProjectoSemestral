/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author Edilson Ricardo
 */
public class TelaDeCadastroFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeCadastroFuncionario
     */
    public TelaDeCadastroFuncionario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblApelido = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblDatadeNascimento = new javax.swing.JLabel();
        lblNumerodeBI = new javax.swing.JLabel();
        lblNuit = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtApelido = new javax.swing.JTextField();
        txtNrDeBI = new javax.swing.JTextField();
        txtNuit = new javax.swing.JTextField();
        jdcDatadeNascimento = new com.toedter.calendar.JDateChooser();
        lblTitulonoTopo = new javax.swing.JLabel();
        lblNomeUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblNivelAcesso = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblContacto = new javax.swing.JLabel();
        lblContactoAlternativo = new javax.swing.JLabel();
        txtNomedeUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jcbNiveldeAcesso = new javax.swing.JComboBox<>();
        txtEmail = new javax.swing.JTextField();
        txtContacto = new javax.swing.JTextField();
        txtContactoAllternativo = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnLimparCampos = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jcbSexo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 82, 114));

        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome:");

        lblApelido.setForeground(new java.awt.Color(255, 255, 255));
        lblApelido.setText("Apelido:");

        lblSexo.setForeground(new java.awt.Color(255, 255, 255));
        lblSexo.setText("Sexo:");

        lblDatadeNascimento.setForeground(new java.awt.Color(255, 255, 255));
        lblDatadeNascimento.setText("Data de Nascimento:");

        lblNumerodeBI.setForeground(new java.awt.Color(255, 255, 255));
        lblNumerodeBI.setText("Numero de BI:");

        lblNuit.setForeground(new java.awt.Color(255, 255, 255));
        lblNuit.setText("Nuit:");

        lblTitulonoTopo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitulonoTopo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulonoTopo.setText("CADASTRO DE FUNCIONÁRIOS");

        lblNomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeUsuario.setText("Nome de Usuário:");

        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha:");

        lblNivelAcesso.setForeground(new java.awt.Color(255, 255, 255));
        lblNivelAcesso.setText("Nível de Acesso:");

        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email:");

        lblContacto.setForeground(new java.awt.Color(255, 255, 255));
        lblContacto.setText("Contacto:");

        lblContactoAlternativo.setForeground(new java.awt.Color(255, 255, 255));
        lblContactoAlternativo.setText("Contacto Alternativo:");

        jcbNiveldeAcesso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Administrador", "Funcionário" }));

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/user_add.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");

        btnLimparCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/delete.png"))); // NOI18N
        btnLimparCampos.setText("Limpar Campos");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");

        jcbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Masculino", "Feminino" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulonoTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCadastrar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNuit)
                            .addComponent(lblNumerodeBI)
                            .addComponent(lblNome)
                            .addComponent(lblApelido)
                            .addComponent(lblSexo)
                            .addComponent(lblDatadeNascimento))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome)
                            .addComponent(txtApelido)
                            .addComponent(txtNuit)
                            .addComponent(txtNrDeBI)
                            .addComponent(jdcDatadeNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNomeUsuario)
                    .addComponent(lblSenha)
                    .addComponent(lblNivelAcesso)
                    .addComponent(lblEmail)
                    .addComponent(lblContacto)
                    .addComponent(lblContactoAlternativo)
                    .addComponent(btnLimparCampos))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNomedeUsuario)
                        .addComponent(txtSenha)
                        .addComponent(jcbNiveldeAcesso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmail)
                        .addComponent(txtContacto)
                        .addComponent(txtContactoAllternativo, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCancelar))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lblTitulonoTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeUsuario)
                    .addComponent(txtNomedeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApelido)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(lblNivelAcesso)
                    .addComponent(jcbNiveldeAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmail)
                        .addComponent(lblDatadeNascimento)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdcDatadeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNrDeBI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumerodeBI)
                    .addComponent(lblContacto)
                    .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNuit)
                    .addComponent(lblContactoAlternativo)
                    .addComponent(txtContactoAllternativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnLimparCampos)
                    .addComponent(btnCancelar))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaDeCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeCadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbNiveldeAcesso;
    private javax.swing.JComboBox<String> jcbSexo;
    private com.toedter.calendar.JDateChooser jdcDatadeNascimento;
    private javax.swing.JLabel lblApelido;
    private javax.swing.JLabel lblContacto;
    private javax.swing.JLabel lblContactoAlternativo;
    private javax.swing.JLabel lblDatadeNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNivelAcesso;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblNuit;
    private javax.swing.JLabel lblNumerodeBI;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTitulonoTopo;
    private javax.swing.JTextField txtApelido;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtContactoAllternativo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomedeUsuario;
    private javax.swing.JTextField txtNrDeBI;
    private javax.swing.JTextField txtNuit;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}