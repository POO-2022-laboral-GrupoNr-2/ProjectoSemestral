package View;

import connection.ConnectionFactory;
import dao.CheckOutJpaController;
import dao.ClienteJpaController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;
import model.CheckOut;
import model.Cliente;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.statistics.HistogramDataset;

public class TelaRelatorio11 extends javax.swing.JFrame {

    int jan = 0;
    int feb = 0;
    int marc = 0;
    int abr = 0;
    int mai = 0;
    int jun = 0;
    int jul = 0;
    int ag = 0;
    int set = 0;
    int out = 0;
    int nov = 0;
    int dez = 0;

    /**
     * Creates new form TelaRelatorio
     */
    public TelaRelatorio11() {
        initComponents();
        showBarChart();
        // showHistogram();
    }

    /**
     * Este metodo desenha o grafico, relativo ao numero de estadias mensais.
     * Para isso buscamos todos os registros na base de dados para verificar as
     * datas de checkin
     */
    public void showBarChart() {

        CheckOutJpaController controller = new CheckOutJpaController(ConnectionFactory.getEmf());
        List<CheckOut> clientes = controller.findCheckOutEntities();

        for (CheckOut iterador : clientes) {
            if (iterador.getCheckIn().getMonthValue() == 1) {
                this.jan++;
            }
            if (iterador.getCheckIn().getMonthValue() == 2) {
                this.feb++;
            }
            if (iterador.getCheckIn().getMonthValue() == 3) {
                this.marc++;
            }
            if (iterador.getCheckIn().getMonthValue() == 4) {
                this.abr++;
            }
            if (iterador.getCheckIn().getMonthValue() == 5) {
                this.mai++;
            }
            if (iterador.getCheckIn().getMonthValue() == 6) {
                this.jun++;
            }
            if (iterador.getCheckIn().getMonthValue() == 7) {
                this.jul++;
            }
            if (iterador.getCheckIn().getMonthValue() == 8) {
                this.ag++;
            }
            if (iterador.getCheckIn().getMonthValue() == 9) {
                this.set++;
            }
            if (iterador.getCheckIn().getMonthValue() == 10) {
                this.out++;
            }
            if (iterador.getCheckIn().getMonthValue() == 11) {
                this.nov++;
            }
            if (iterador.getCheckIn().getMonthValue() == 12) {
                this.dez++;
            }
        }

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(jan, "Ab", "Jan");
        dataset.setValue(feb, "Ab", "Fev");
        dataset.setValue(marc, "Ab", "Mar");
        dataset.setValue(abr, "Ab", "Abr");
        dataset.setValue(mai, "Ab", "Mai");
        dataset.setValue(jun, "Ab", "Jun");
        dataset.setValue(jul, "Ab", "Jul");
        dataset.setValue(ag, "Ab", "Ago");
        dataset.setValue(set, "Ab", "Set");
        dataset.setValue(out, "Ab", "Out");
        dataset.setValue(nov, "Ab", "Nov");
        dataset.setValue(dez, "Ab", "Dez");

        JFreeChart chart = ChartFactory.createBarChart(" ", "Meses", "Quantidades",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        CategoryPlot categoryPlot = chart.getCategoryPlot();
        //categoryPlot.setRangeGridlinePaint(Color.BLUE);
        categoryPlot.setBackgroundPaint(Color.WHITE);
        //categoryPlot.setBackgroundPaint(new Color(0, 81,114));
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        //Color clr3 = new Color(0, 81,114);
        renderer.setSeriesPaint(0, (new Color(0, 81, 114)));

        ChartPanel barpChartPanel = new ChartPanel(chart);
        panelGraficoBarras.removeAll();
        panelGraficoBarras.add(barpChartPanel, BorderLayout.CENTER);
        panelGraficoBarras.validate();

        txtJan.setText(String.valueOf(jan));
        txtFev.setText(String.valueOf(feb));
        txtMar.setText(String.valueOf(marc));
        txtAbr.setText(String.valueOf(abr));
        txtMai.setText(String.valueOf(mai));
        txtJun.setText(String.valueOf(jun));
        txtJul.setText(String.valueOf(jul));
        txtAgo.setText(String.valueOf(ag));
        txtSet.setText(String.valueOf(set));
        txtOut.setText(String.valueOf(out));
        txtNov.setText(String.valueOf(nov));
        txtDez.setText(String.valueOf(dez));

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
        jPanel2 = new javax.swing.JPanel();
        panelGraficoBarras = new javax.swing.JPanel();
        lblTituloNoTopo = new javax.swing.JLabel();
        lblJan = new javax.swing.JLabel();
        lblFev = new javax.swing.JLabel();
        lblMar = new javax.swing.JLabel();
        lblAbr = new javax.swing.JLabel();
        lblMai = new javax.swing.JLabel();
        lblJun = new javax.swing.JLabel();
        lblAgo = new javax.swing.JLabel();
        lblSet = new javax.swing.JLabel();
        lblOut = new javax.swing.JLabel();
        lblNov = new javax.swing.JLabel();
        lblDez = new javax.swing.JLabel();
        lblJul = new javax.swing.JLabel();
        txtJan = new javax.swing.JTextField();
        txtFev = new javax.swing.JTextField();
        txtMar = new javax.swing.JTextField();
        txtAbr = new javax.swing.JTextField();
        txtMai = new javax.swing.JTextField();
        txtJun = new javax.swing.JTextField();
        txtJul = new javax.swing.JTextField();
        txtAgo = new javax.swing.JTextField();
        txtSet = new javax.swing.JTextField();
        txtOut = new javax.swing.JTextField();
        txtNov = new javax.swing.JTextField();
        txtDez = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatorio de Estadias");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 81, 114));

        jPanel2.setBackground(new java.awt.Color(0, 81, 114));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelGraficoBarras.setLayout(new java.awt.BorderLayout());
        jPanel2.add(panelGraficoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 670, 240));

        lblTituloNoTopo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTituloNoTopo.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloNoTopo.setText("RELATÓRIO DE ESTADIAS MENSAIS");
        jPanel2.add(lblTituloNoTopo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        lblJan.setForeground(new java.awt.Color(255, 255, 255));
        lblJan.setText("Janeiro");

        lblFev.setForeground(new java.awt.Color(255, 255, 255));
        lblFev.setText("Fevereiro");

        lblMar.setForeground(new java.awt.Color(255, 255, 255));
        lblMar.setText("Março");

        lblAbr.setForeground(new java.awt.Color(255, 255, 255));
        lblAbr.setText("Abril");

        lblMai.setForeground(new java.awt.Color(255, 255, 255));
        lblMai.setText("Maio");

        lblJun.setForeground(new java.awt.Color(255, 255, 255));
        lblJun.setText("Junho");

        lblAgo.setForeground(new java.awt.Color(255, 255, 255));
        lblAgo.setText("Agosto");

        lblSet.setForeground(new java.awt.Color(255, 255, 255));
        lblSet.setText("Setembro");

        lblOut.setForeground(new java.awt.Color(255, 255, 255));
        lblOut.setText("Outubro");

        lblNov.setForeground(new java.awt.Color(255, 255, 255));
        lblNov.setText("Novembro");

        lblDez.setForeground(new java.awt.Color(255, 255, 255));
        lblDez.setText("Dezembro");

        lblJul.setForeground(new java.awt.Color(255, 255, 255));
        lblJul.setText("Julho");

        txtJan.setEditable(false);
        txtJan.setFocusable(false);

        txtFev.setEditable(false);
        txtFev.setFocusable(false);

        txtMar.setEditable(false);
        txtMar.setFocusable(false);

        txtAbr.setEditable(false);
        txtAbr.setFocusable(false);

        txtMai.setEditable(false);
        txtMai.setFocusable(false);

        txtJun.setEditable(false);
        txtJun.setFocusable(false);

        txtJul.setEditable(false);
        txtJul.setFocusable(false);

        txtAgo.setEditable(false);
        txtAgo.setFocusable(false);

        txtSet.setEditable(false);
        txtSet.setFocusable(false);

        txtOut.setEditable(false);
        txtOut.setFocusable(false);

        txtNov.setEditable(false);
        txtNov.setFocusable(false);
        txtNov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNovActionPerformed(evt);
            }
        });

        txtDez.setEditable(false);
        txtDez.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblFev)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblJan, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblJun)
                                                .addComponent(lblMai))
                                            .addGap(2, 2, 2)))))
                            .addComponent(lblAbr))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMai, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(txtJun, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(104, 104, 104)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNov, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDez, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(lblSet)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtFev, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAbr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(lblAgo))
                                    .addComponent(lblOut, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtJan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblJul))
                            .addComponent(txtMar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAgo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(txtSet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(txtOut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(txtNov, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(txtDez, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJan)
                    .addComponent(txtJan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJul)
                    .addComponent(txtJul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFev)
                    .addComponent(txtFev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAgo)
                    .addComponent(txtAgo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMar)
                    .addComponent(txtMar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSet)
                    .addComponent(txtSet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAbr)
                    .addComponent(txtAbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOut)
                    .addComponent(txtOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMai)
                    .addComponent(txtMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNov)
                    .addComponent(txtNov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJun)
                    .addComponent(txtJun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDez)
                    .addComponent(txtDez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNovActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNovActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRelatorio11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorio11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAbr;
    private javax.swing.JLabel lblAgo;
    private javax.swing.JLabel lblDez;
    private javax.swing.JLabel lblFev;
    private javax.swing.JLabel lblJan;
    private javax.swing.JLabel lblJul;
    private javax.swing.JLabel lblJun;
    private javax.swing.JLabel lblMai;
    private javax.swing.JLabel lblMar;
    private javax.swing.JLabel lblNov;
    private javax.swing.JLabel lblOut;
    private javax.swing.JLabel lblSet;
    private javax.swing.JLabel lblTituloNoTopo;
    private javax.swing.JPanel panelGraficoBarras;
    private javax.swing.JTextField txtAbr;
    private javax.swing.JTextField txtAgo;
    private javax.swing.JTextField txtDez;
    private javax.swing.JTextField txtFev;
    private javax.swing.JTextField txtJan;
    private javax.swing.JTextField txtJul;
    private javax.swing.JTextField txtJun;
    private javax.swing.JTextField txtMai;
    private javax.swing.JTextField txtMar;
    private javax.swing.JTextField txtNov;
    private javax.swing.JTextField txtOut;
    private javax.swing.JTextField txtSet;
    // End of variables declaration//GEN-END:variables
}
