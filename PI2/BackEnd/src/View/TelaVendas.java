/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ProdutoController;
import Controller.ClienteController;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import Model.Produto;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import utils.Validador;

/**
 *
 * @author Teste
 */
public class TelaVendas extends javax.swing.JFrame {

    public ArrayList<String[]> clientes;
    public ArrayList<String[]> clientesFiltrados;
    public String[] clienteSelecionado;

    public ArrayList<String[]> produtos;
    public ArrayList<String[]> produtosFiltrados;
    public String[] produtoSelecionado;

    public ArrayList<String[]> vendas;

    /**
     * Creates new form TelaVendas
     */
    public TelaVendas() {
        initComponents();
        inicia();
    }

    public void inicia() {
        Date hoje = new Date();
        SimpleDateFormat df;
        df = new SimpleDateFormat("dd/MM/yyyy");

        lblDate.setText(df.format(hoje));
        lblIdCliente.setText("");
        lblNomeCliente.setText("");
        lblCpfCliente.setText("");

        clientes = ClienteController.getClientesPronto();
        clientesFiltrados = ClienteController.getClientesPronto();
        clienteSelecionado = null;
        LoadTableCliente();

        produtos = ProdutoController.getProdutosPronto();
        produtosFiltrados = ProdutoController.getProdutosPronto();
        produtoSelecionado = null;
        LoadTableProduto();

        spnQuantidadeProduto.setValue(1);
        vendas = new ArrayList();
        LoadTableVendas();
    }

    public void LoadTableCliente() {

        ArrayList<String[]> linhasClientes = clientesFiltrados;

        DefaultTableModel tmClientes = new DefaultTableModel();
        tmClientes.addColumn("ID");
        tmClientes.addColumn("Nome");
        tmClientes.addColumn("CPF");

        for (String[] c : linhasClientes) {
            tmClientes.addRow(c);
        }

        tblClientePesquisa.setModel(tmClientes);

        tblClientePesquisa.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblClientePesquisa.getColumnModel().getColumn(1).setPreferredWidth(250); //nome
        tblClientePesquisa.getColumnModel().getColumn(2).setPreferredWidth(150); //cpf

    }

    public void LoadTableProduto() {

        ArrayList<String[]> linhasProdutos = produtosFiltrados;

        DefaultTableModel tmProdutos = new DefaultTableModel();
        tmProdutos.addColumn("ID");
        tmProdutos.addColumn("TITULO");
        tmProdutos.addColumn("AUTOR");
        tmProdutos.addColumn("PREÇO UNITARIO");

        for (String[] c : linhasProdutos) {
            tmProdutos.addRow(c);
        }

        tblProdutoPesquisa.setModel(tmProdutos);

        tblProdutoPesquisa.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblProdutoPesquisa.getColumnModel().getColumn(1).setPreferredWidth(250); //titulo
        tblProdutoPesquisa.getColumnModel().getColumn(2).setPreferredWidth(150); //autor
        tblProdutoPesquisa.getColumnModel().getColumn(3).setPreferredWidth(150); //valor unitario

    }

    public void LoadTableVendas() {

        ArrayList<String[]> linhasProdutos = vendas;

        DefaultTableModel tmProdutos = new DefaultTableModel();
        tmProdutos.addColumn("ID");
        tmProdutos.addColumn("TITULO");
        tmProdutos.addColumn("AUTOR");
        tmProdutos.addColumn("PREÇO UNITARIO");
        tmProdutos.addColumn("QUANTIDADE");

        float valorTotal = 0f;

        for (String[] c : linhasProdutos) {
            tmProdutos.addRow(c);
            valorTotal += Double.parseDouble(c[3]) * Double.parseDouble(c[4]);
        }

        lblValorTotalVenda.setText(formatDecimal(valorTotal));

        tblVenda.setModel(tmProdutos);

        tblVenda.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblVenda.getColumnModel().getColumn(1).setPreferredWidth(250); //titulo
        tblVenda.getColumnModel().getColumn(2).setPreferredWidth(150); //autor
        tblVenda.getColumnModel().getColumn(3).setPreferredWidth(150); //valor unitario
        tblVenda.getColumnModel().getColumn(4).setPreferredWidth(150); //valor unitario

    }

    public String formatDecimal(float number) {
        Locale meuLocal = new Locale("pt", "BR");
        NumberFormat format = NumberFormat.getCurrencyInstance(meuLocal);
        return format.format(number);
    }

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
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaVendas().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblDate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblIdCliente = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblNomeCliente = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPesquisaCliente = new javax.swing.JTextField();
        btnPesquisarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientePesquisa = new javax.swing.JTable();
        btnSelecionarCliente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtPesquisaProduto = new javax.swing.JTextField();
        btnPesquisarProduto = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProdutoPesquisa = new javax.swing.JTable();
        btnAdicionarCarrinho = new javax.swing.JButton();
        spnQuantidadeProduto = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblVenda = new javax.swing.JTable();
        btnCancelarVenda = new javax.swing.JButton();
        btnFinalizarVenda = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblValorTotalVenda = new javax.swing.JLabel();
        btnRemoverCarrinho = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblCpfCliente = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        lblDate.setText("10/10/1099");

        jLabel1.setText("Data:");

        jLabel4.setText("IDCliente:");

        lblIdCliente.setText("0000");

        jLabel6.setText("Cliente:");

        lblNomeCliente.setText("Nome do Cliente");

        jLabel2.setText("Nome do Cliente");

        btnPesquisarCliente.setText("Pesquisar");
        btnPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarClienteActionPerformed(evt);
            }
        });

        tblClientePesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblClientePesquisa);

        btnSelecionarCliente.setText("Selecionar Cliente");
        btnSelecionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnSelecionarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPesquisaCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelecionarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Cliente", jPanel2);

        jLabel3.setText("Produto");

        txtPesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaProdutoActionPerformed(evt);
            }
        });

        btnPesquisarProduto.setText("Pesquisar");
        btnPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarProdutoActionPerformed(evt);
            }
        });

        tblProdutoPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Titulo", "Autor", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblProdutoPesquisa);

        btnAdicionarCarrinho.setText("Adicionar ao Carrinho");
        btnAdicionarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCarrinhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(spnQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdicionarCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPesquisarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPesquisaProduto))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdicionarCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(spnQuantidadeProduto))
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Produto", jPanel3);

        tblVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Titulo", "Autor", "Preço", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblVenda);

        btnCancelarVenda.setText("Cancelar Venda");
        btnCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVendaActionPerformed(evt);
            }
        });

        btnFinalizarVenda.setText("Finalizar Venda");

        jLabel8.setText("Valor Total: ");

        lblValorTotalVenda.setText("00,00");

        btnRemoverCarrinho.setText("Remover do Carrinho");
        btnRemoverCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverCarrinhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValorTotalVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(btnRemoverCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblValorTotalVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(btnRemoverCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Venda", jPanel4);

        jLabel7.setText("CPF:");

        lblCpfCliente.setText("000.000.000-00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDate)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIdCliente)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCpfCliente)
                        .addGap(165, 165, 165))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblDate))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblIdCliente)
                    .addComponent(jLabel6)
                    .addComponent(lblNomeCliente)
                    .addComponent(jLabel7)
                    .addComponent(lblCpfCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaProdutoActionPerformed

    private void btnPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarProdutoActionPerformed

        String pesquisa = txtPesquisaProduto.getText().toLowerCase();
        if (pesquisa.isEmpty()) {
            produtosFiltrados = produtos;
            LoadTableProduto();
            return;
        }

        produtosFiltrados = new ArrayList();
        for (int i = 0; i < produtos.size(); i++) {
            String[] produto = produtos.get(i);
            if (produto[1].toLowerCase().contains(pesquisa)) {
                produtosFiltrados.add(produto);
            }
        }
        LoadTableProduto();
    }//GEN-LAST:event_btnPesquisarProdutoActionPerformed

    private void btnSelecionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarClienteActionPerformed
        int linha = tblClientePesquisa.getSelectedRow();
        String[] cliente = clientesFiltrados.get(linha);

        lblIdCliente.setText(cliente[0]);
        lblNomeCliente.setText(cliente[1]);
        lblCpfCliente.setText(cliente[2]);

        clienteSelecionado = cliente;

        showMessageDialog(null, "Cliente Adicionado Na Venda");


    }//GEN-LAST:event_btnSelecionarClienteActionPerformed

    private void btnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarClienteActionPerformed
        String pesquisa = txtPesquisaCliente.getText().toLowerCase();
        if (pesquisa.isEmpty()) {
            clientesFiltrados = clientes;
            LoadTableCliente();
            return;
        }

        clientesFiltrados = new ArrayList();
        for (int i = 0; i < clientes.size(); i++) {
            String[] cliente = clientes.get(i);
            if (cliente[1].toLowerCase().contains(pesquisa)) {
                clientesFiltrados.add(cliente);
            }
        }
        LoadTableCliente();
    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    private void btnAdicionarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCarrinhoActionPerformed
        
        if(ValidarProdutoCliente()){            
               
        int quantidade = Integer.parseInt(spnQuantidadeProduto.getValue().toString());

        int linha = tblProdutoPesquisa.getSelectedRow();
        String[] produto = produtosFiltrados.get(linha);

        String[] venda = {produto[0], produto[1], produto[2], produto[3], String.valueOf(quantidade)};

        vendas.add(venda);

        LoadTableVendas();

        showMessageDialog(null, "Produto Adicionado com Sucesso");
        
        }

    }//GEN-LAST:event_btnAdicionarCarrinhoActionPerformed

    private void btnRemoverCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverCarrinhoActionPerformed

        int linha = tblVenda.getSelectedRow();
        String[] produto = vendas.get(linha);

        vendas.remove(produto);

        LoadTableVendas();

        showMessageDialog(null, "Produto removido com Sucesso");
    }//GEN-LAST:event_btnRemoverCarrinhoActionPerformed

    private void btnCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVendaActionPerformed
        inicia();
    }//GEN-LAST:event_btnCancelarVendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarCarrinho;
    private javax.swing.JButton btnCancelarVenda;
    private javax.swing.JButton btnFinalizarVenda;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JButton btnPesquisarProduto;
    private javax.swing.JButton btnRemoverCarrinho;
    private javax.swing.JButton btnSelecionarCliente;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCpfCliente;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblValorTotalVenda;
    private javax.swing.JSpinner spnQuantidadeProduto;
    private javax.swing.JTable tblClientePesquisa;
    private javax.swing.JTable tblProdutoPesquisa;
    private javax.swing.JTable tblVenda;
    private javax.swing.JTextField txtPesquisaCliente;
    private javax.swing.JTextField txtPesquisaProduto;
    // End of variables declaration//GEN-END:variables
    
    public boolean ValidarProdutoCliente() {

        if (lblIdCliente.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um cliente para adicionar o produto ao carrinho!");
            return false;
        }
        
        if (this.spnQuantidadeProduto.getValue().equals(0)) {
            
            JOptionPane.showMessageDialog(this, "Defina uma quantidade ao produto!");
            return false;
            
        }

        return true;
    }

}
