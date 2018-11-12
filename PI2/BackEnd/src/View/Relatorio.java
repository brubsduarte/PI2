/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.VendaController;
import Model.Cliente;
import Model.Produto;
import Model.Venda;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import javax.swing.JFormattedTextField;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Bruna
 */
public final class Relatorio extends javax.swing.JFrame {

    public ArrayList<Venda> vendas;
    public ArrayList<Venda> vendasFiltradas;

    /**
     * Creates new form Relatorio
     */
    public Relatorio() {
        initComponents();

        vendas = VendaController.getVendasProntas();
        vendasFiltradas = VendaController.getVendasProntas();
        loadTables();
    }
    
    public void loadTables() {
        LoadTableCliente();
        LoadTableVenda();
        LoadTableProduto();
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
        jLabel1 = new javax.swing.JLabel();
        txtDataInicio = new javax.swing.JFormattedTextField();
        txtDataFinal = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblValorTotal = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVendas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa de Relatório", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Selecione a Data: ");

        try {
            txtDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDataInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataInicioActionPerformed(evt);
            }
        });

        try {
            txtDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataFinal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("até");

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(txtDataInicio))
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(txtDataFinal))
                .addGap(136, 136, 136))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnPesquisar))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vendas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Valor Total:");

        lblValorTotal.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblValorTotal.setText("R$20,00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(240, 240, 240))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addComponent(lblValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblCliente);

        jTabbedPane2.addTab("Clientes Compradores", jScrollPane1);

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblProduto);

        jTabbedPane2.addTab("Produtos Vendidos", jScrollPane2);

        tblVendas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblVendas);

        jTabbedPane2.addTab("Vendas Realizadas", jScrollPane3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1154, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void LoadTableCliente() {

        ArrayList<Cliente> clientes = new ArrayList();

        for (Venda venda : vendasFiltradas) {
            clientes.add(venda.getCliente());
        }

        ArrayList<String[]> clientesOrndenados = new ArrayList();

        Set<Cliente> unique = new HashSet<>(clientes);
        for (Cliente key : unique) {
            String[] clienteArray = new String[]{
                key.getNome(),
                key.getCPF(),
                String.valueOf(Collections.frequency(clientes, key))
            };
            clientesOrndenados.add(clienteArray);
        }

        clientesOrndenados = sortClients(clientesOrndenados);

        DefaultTableModel tmClientes = new DefaultTableModel();
        tmClientes.addColumn("Nome");
        tmClientes.addColumn("CPF");
        tmClientes.addColumn("Qtde. Compras");

        for (String[] cliente : clientesOrndenados) {
            tmClientes.addRow(cliente);
        }

        tblCliente.setModel(tmClientes);

        tblCliente.getColumnModel().getColumn(0).setPreferredWidth(250); //nome
        tblCliente.getColumnModel().getColumn(1).setPreferredWidth(150); //cpf
        tblCliente.getColumnModel().getColumn(2).setPreferredWidth(100); //ID
    }

    static ArrayList<String[]> sortClients(ArrayList<String[]> arr) {
        int n = arr.size();
        String[] temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (Integer.valueOf(arr.get(j - 1)[2]) < Integer.valueOf(arr.get(j)[2])) {
                    
                    temp = arr.get(j - 1);
                    arr.set(j - 1, arr.get(j));
                    arr.set(j, temp);
                }

            }
        }

        return arr;
    }
    
    public void LoadTableVenda() {

        ArrayList<Cliente> clientes = new ArrayList();

        for (Venda venda : vendasFiltradas) {
            clientes.add(venda.getCliente());
        }

        ArrayList<String[]> clientesOrndenados = new ArrayList();

        Set<Cliente> unique = new HashSet<>(clientes);
        for (Cliente key : unique) {
            String[] clienteArray = new String[]{
                key.getNome(),
                key.getCPF(),
                String.valueOf(Collections.frequency(clientes, key))
            };
            clientesOrndenados.add(clienteArray);
        }

        clientesOrndenados = sortClients(clientesOrndenados);

        DefaultTableModel tmClientes = new DefaultTableModel();
        tmClientes.addColumn("ID");
        tmClientes.addColumn("Cliente");
        tmClientes.addColumn("Data");
        tmClientes.addColumn("Total");

        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        
        float valorTotal = 0f;
        
        ArrayList<String[]> vendasOrndenadas = new ArrayList();
        
        for (Venda venda : vendasFiltradas) {
            vendasOrndenadas.add(new String[]{
                String.valueOf(venda.getIdVenda()),
                venda.getCliente().getNome(),
                simpleDateFormat.format(venda.getData()),
                formatDecimal(venda.getValorTotal()),
                String.valueOf(venda.getValorTotal())
            });
            valorTotal += venda.getValorTotal();
        }

        vendasOrndenadas = sortVendas(vendasOrndenadas);
        
        for (String[] venda : vendasOrndenadas) {
            tmClientes.addRow(venda);
        }
        
        lblValorTotal.setText(formatDecimal(valorTotal));
        
        tblVendas.setModel(tmClientes);

        tblVendas.getColumnModel().getColumn(0).setPreferredWidth(100); 
        tblVendas.getColumnModel().getColumn(1).setPreferredWidth(150); 
        tblVendas.getColumnModel().getColumn(2).setPreferredWidth(250); 
        tblVendas.getColumnModel().getColumn(3).setPreferredWidth(100); 
    }

    static ArrayList<String[]> sortVendas(ArrayList<String[]> arr) {
        int n = arr.size();
        String[] temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (Float.valueOf(arr.get(j - 1)[4]) < Float.valueOf(arr.get(j)[4])) {
                    
                    temp = arr.get(j - 1);
                    arr.set(j - 1, arr.get(j));
                    arr.set(j, temp);
                }

            }
        }

        return arr;
    }
    
    public String formatDecimal(float number) {
        Locale meuLocal = new Locale( "pt", "BR" );
        NumberFormat format = NumberFormat.getCurrencyInstance(meuLocal);
        return format.format(number);       
    }
    
    public void LoadTableProduto() {

        ArrayList<Produto> produtos = new ArrayList();

        for (Venda venda : vendasFiltradas) {
            produtos.addAll(venda.getProdutos());
        }

        ArrayList<String[]> produtosOrndenados = new ArrayList();

        Set<Produto> unique = new HashSet<>(produtos);
        for (Produto key : unique) {
            int quantidade = Collections.frequency(produtos, key);
            String[] produtoArray = new String[]{
                key.gettitulo(),
                formatDecimal((float)key.getvalorUni()),
                String.valueOf(quantidade),
                formatDecimal((float)(quantidade * key.getvalorUni()))
            };
            produtosOrndenados.add(produtoArray);
        }

        produtosOrndenados = sortProdutos(produtosOrndenados);

        DefaultTableModel tmClientes = new DefaultTableModel();
        tmClientes.addColumn("Titulo");
        tmClientes.addColumn("Valor unitário");
        tmClientes.addColumn("Qtde. vendas");
        tmClientes.addColumn("Total vendas");

        for (String[] produto : produtosOrndenados) {
            tmClientes.addRow(produto);
        }

        tblProduto.setModel(tmClientes);

        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(250); 
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(150); 
        tblProduto.getColumnModel().getColumn(2).setPreferredWidth(100); 
        tblProduto.getColumnModel().getColumn(3).setPreferredWidth(100); 
    }
    
    static ArrayList<String[]> sortProdutos(ArrayList<String[]> arr) {
        int n = arr.size();
        String[] temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (Integer.valueOf(arr.get(j - 1)[2]) < Integer.valueOf(arr.get(j)[2])) {
                    
                    temp = arr.get(j - 1);
                    arr.set(j - 1, arr.get(j));
                    arr.set(j, temp);
                }

            }
        }

        return arr;
    }
    
    private void txtDataInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataInicioActionPerformed

        JFormattedTextField tfDATA = new JFormattedTextField();
        try {
            tfDATA.setFormatterFactory(new DefaultFormatterFactory(
                    new MaskFormatter("##/##/####")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtDataInicioActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date dataInicial = formatter.parse(txtDataInicio.getText().toLowerCase());
            Date dataFinal = formatter.parse(txtDataFinal.getText().toLowerCase());
            
            if(dataInicial.compareTo(dataFinal) > 0) {
                throw new ExecutionException("Período de pesquisa inválido", null);
            }
            
            long diff = dataFinal.getTime() - dataInicial.getTime();
            long daysDiff = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
            
            if(daysDiff > 30) {
                throw new ExecutionException("A diferença de dias entre uma data e outra é maior que 30 dias.", null);
            }
            
            vendasFiltradas = new ArrayList();
            
            for(Venda venda : vendas) {
                if(venda.getData().compareTo(dataInicial) >= 0 && venda.getData().compareTo(dataFinal) <= 0) {
                    vendasFiltradas.add(venda);
                }
            }
            
            loadTables();
            
            if(vendasFiltradas.isEmpty()) {
                throw new ExecutionException("Nenhum resultado encontrado", null);
            }
            
        } catch (ParseException e) {
            showMessageDialog(null, "Data inválida");
        } catch (ExecutionException e) {
            showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtDataInicio.setText("");
        txtDataFinal.setText("");
        vendasFiltradas = vendas;
        loadTables();
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTable tblVendas;
    private javax.swing.JFormattedTextField txtDataFinal;
    private javax.swing.JFormattedTextField txtDataInicio;
    // End of variables declaration//GEN-END:variables
}
