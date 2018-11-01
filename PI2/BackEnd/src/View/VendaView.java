
package View;

import Controller.ClienteController;
import Controller.ProdutoController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.table.DefaultTableModel;

public class VendaView extends javax.swing.JFrame {

    private String modoTela; //"Criar/Editar"

    public VendaView() {
        initComponents();

        this.setLocationRelativeTo(null);
      

    }



  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlAbaVendas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblProdutos2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        jLabel1.setText("Data:");

        jLabel2.setText("IDVendedor:");

        jLabel3.setText("Vendendor:");

        jLabel4.setText("IDCliente:");

        jLabel5.setText("Cliente:");

        jLabel6.setText("jLabel1");

        jLabel7.setText("IDProduto:");

        jLabel8.setText("Produto:");

        jLabel9.setText("Quantidade:");

        jLabel10.setText("Valor Unit.:");

        jLabel11.setText("Valor Total:");

        jLabel12.setText("Desconto:");

        jLabel13.setText("Valor Final");

        jLabel14.setText("Forma de Pagamento:");

        tblProdutos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título ", "Genero", "Editora", "Autor", "Tipo", "descricao", "Quantidade", "Valor Unitario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblProdutos2);
        if (tblProdutos2.getColumnModel().getColumnCount() > 0) {
            tblProdutos2.getColumnModel().getColumn(0).setMinWidth(60);
            tblProdutos2.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblProdutos2.getColumnModel().getColumn(0).setMaxWidth(60);
            tblProdutos2.getColumnModel().getColumn(1).setMinWidth(90);
            tblProdutos2.getColumnModel().getColumn(1).setPreferredWidth(90);
            tblProdutos2.getColumnModel().getColumn(1).setMaxWidth(90);
            tblProdutos2.getColumnModel().getColumn(2).setMinWidth(80);
            tblProdutos2.getColumnModel().getColumn(2).setPreferredWidth(80);
            tblProdutos2.getColumnModel().getColumn(2).setMaxWidth(80);
            tblProdutos2.getColumnModel().getColumn(3).setMinWidth(80);
            tblProdutos2.getColumnModel().getColumn(3).setPreferredWidth(80);
            tblProdutos2.getColumnModel().getColumn(3).setMaxWidth(80);
            tblProdutos2.getColumnModel().getColumn(4).setMinWidth(80);
            tblProdutos2.getColumnModel().getColumn(4).setPreferredWidth(80);
            tblProdutos2.getColumnModel().getColumn(4).setMaxWidth(80);
            tblProdutos2.getColumnModel().getColumn(5).setMinWidth(80);
            tblProdutos2.getColumnModel().getColumn(5).setPreferredWidth(80);
            tblProdutos2.getColumnModel().getColumn(5).setMaxWidth(80);
            tblProdutos2.getColumnModel().getColumn(6).setMinWidth(60);
            tblProdutos2.getColumnModel().getColumn(6).setPreferredWidth(60);
            tblProdutos2.getColumnModel().getColumn(6).setMaxWidth(60);
            tblProdutos2.getColumnModel().getColumn(7).setMinWidth(60);
            tblProdutos2.getColumnModel().getColumn(7).setPreferredWidth(60);
            tblProdutos2.getColumnModel().getColumn(7).setMaxWidth(60);
            tblProdutos2.getColumnModel().getColumn(8).setMinWidth(70);
            tblProdutos2.getColumnModel().getColumn(8).setPreferredWidth(70);
            tblProdutos2.getColumnModel().getColumn(8).setMaxWidth(70);
        }

        javax.swing.GroupLayout pnlAbaVendasLayout = new javax.swing.GroupLayout(pnlAbaVendas);
        pnlAbaVendas.setLayout(pnlAbaVendasLayout);
        pnlAbaVendasLayout.setHorizontalGroup(
            pnlAbaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAbaVendasLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(pnlAbaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(pnlAbaVendasLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(217, 217, 217)
                        .addComponent(jLabel12)
                        .addGap(201, 201, 201)
                        .addComponent(jLabel13))
                    .addGroup(pnlAbaVendasLayout.createSequentialGroup()
                        .addGroup(pnlAbaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGroup(pnlAbaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAbaVendasLayout.createSequentialGroup()
                                .addGap(417, 417, 417)
                                .addComponent(jLabel6))
                            .addGroup(pnlAbaVendasLayout.createSequentialGroup()
                                .addGap(291, 291, 291)
                                .addGroup(pnlAbaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)))
                            .addGroup(pnlAbaVendasLayout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jLabel10))))
                    .addGroup(pnlAbaVendasLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(282, Short.MAX_VALUE))
        );
        pnlAbaVendasLayout.setVerticalGroup(
            pnlAbaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAbaVendasLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlAbaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(pnlAbaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(jLabel8)
                .addGap(2, 2, 2)
                .addComponent(jLabel5)
                .addGap(40, 40, 40)
                .addGroup(pnlAbaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(pnlAbaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(36, 36, 36)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastrar Venda", pnlAbaVendas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        pack();
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlAbaVendas;
    private javax.swing.JTable tblProdutos2;
    // End of variables declaration//GEN-END:variables


}
