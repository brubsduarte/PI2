/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ClienteController;
import Controller.ProdutoController;
import Controller.VendaController;
import Model.Cliente;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcel
 */
public class Vendas extends javax.swing.JInternalFrame {

    
    public ArrayList<String[]> clientes;
    public ArrayList<String[]> clientesFiltrados;
    public Cliente clienteSelecionado;

    public ArrayList<String[]> produtos;
    public ArrayList<String[]> produtosFiltrados;
    public String[] produtoSelecionado;

    public ArrayList<String[]> vendas;
    
    /**
     * Creates new form Vendas
     */
    public Vendas() {
        initComponents();
        inicia();
    }
    
    public void inicia() {
        Date hoje = new Date();
        SimpleDateFormat df;
        df = new SimpleDateFormat("dd/MM/yyyy");

        lblDataFixo.setText(df.format(hoje));
        lblIDClienteFixo.setText("");
        lblClenteFixo.setText("");
        lblCPF_Fixo.setText("");
        clienteSelecionado = null;

        clientes = VendaController.getClientes();
        clientesFiltrados = clientes;
        clienteSelecionado = null;       

        produtos = VendaController.getProdutos();
        produtosFiltrados = produtos;
        produtoSelecionado = null;
        LoadTableProduto(null);

        spnQtd.setValue(1);
        vendas = new ArrayList();
        LoadTableVendas();
    }
    
    
    
    public void LoadTableProduto(ArrayList<String[]> produtos) {
        
        if(produtos == null){
            produtos = ProdutoController.getProdutos();
        }
        
        DefaultTableModel tmProdutos = new DefaultTableModel();
        tmProdutos.addColumn("ID");
        tmProdutos.addColumn("Titulo");
        tmProdutos.addColumn("Genero");
        tmProdutos.addColumn("Editora");
        tmProdutos.addColumn("Autor");
        tmProdutos.addColumn("Tipo");
        tmProdutos.addColumn("Descrição");
        tmProdutos.addColumn("Estoque");
        tmProdutos.addColumn("Valor Unitario");

        for (String[] p : produtos) {
            tmProdutos.addRow(p);
        }

        tableProdutos.setModel(tmProdutos);

        tableProdutos.getColumnModel().getColumn(0).setPreferredWidth(50); //ID

        tableProdutos.getColumnModel().getColumn(1).setPreferredWidth(250);//Titulo

        tableProdutos.getColumnModel().getColumn(2).setMinWidth(0); //Genero
        tableProdutos.getColumnModel().getColumn(2).setPreferredWidth(0); //Genero
        tableProdutos.getColumnModel().getColumn(2).setMaxWidth(0); //Genero

        tableProdutos.getColumnModel().getColumn(3).setMinWidth(0); // Editora
        tableProdutos.getColumnModel().getColumn(3).setPreferredWidth(0); // Editora
        tableProdutos.getColumnModel().getColumn(3).setMaxWidth(0); // Editora

        tableProdutos.getColumnModel().getColumn(4).setPreferredWidth(100);  // Autor

        tableProdutos.getColumnModel().getColumn(5).setMinWidth(0); // Tipo
        tableProdutos.getColumnModel().getColumn(5).setPreferredWidth(0); // Tipo
        tableProdutos.getColumnModel().getColumn(5).setMaxWidth(0);  // Tipo

        tableProdutos.getColumnModel().getColumn(6).setMinWidth(0); // Descrição       
        tableProdutos.getColumnModel().getColumn(6).setPreferredWidth(0); // Descrição    
        tableProdutos.getColumnModel().getColumn(6).setMaxWidth(0); // Descrição

        tableProdutos.getColumnModel().getColumn(7).setPreferredWidth(50); //Quantidade     

        tableProdutos.getColumnModel().getColumn(8).setPreferredWidth(100); //Valor Unitario
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

        tableVenda.setModel(tmProdutos);

        tableVenda.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tableVenda.getColumnModel().getColumn(1).setPreferredWidth(250); //titulo
        tableVenda.getColumnModel().getColumn(2).setPreferredWidth(150); //autor
        tableVenda.getColumnModel().getColumn(3).setPreferredWidth(150); //valor unitario
        tableVenda.getColumnModel().getColumn(4).setPreferredWidth(150); //valor unitario
    }
      
    public String formatDecimal(float number) {
        Locale meuLocal = new Locale("pt", "BR");
        NumberFormat format = NumberFormat.getCurrencyInstance(meuLocal);
        return format.format(number);
    }
    
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(TelaVendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaVendasView().setVisible(true);
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

        paineSuperior = new javax.swing.JPanel();
        lblDataFixo = new javax.swing.JLabel();
        txtDataFixo = new javax.swing.JFormattedTextField();
        lblIDClienteFixo = new javax.swing.JLabel();
        txtIdClienteFixo = new javax.swing.JTextField();
        lblClenteFixo = new javax.swing.JLabel();
        txtNomeFixo = new javax.swing.JTextField();
        lblCPF_Fixo = new javax.swing.JLabel();
        txtCPF_Fixo = new javax.swing.JFormattedTextField();
        lblNumVenda = new javax.swing.JLabel();
        idVenda = new javax.swing.JLabel();
        paineInferior = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblProduto = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();
        spnQtd = new javax.swing.JSpinner();
        lblQuantidade = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableVenda = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        lblValorTotalVenda = new javax.swing.JLabel();

        lblDataFixo.setText("Data:");

        txtDataFixo.setEditable(false);
        try {
            txtDataFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblIDClienteFixo.setText("ID do Cliente:");

        txtIdClienteFixo.setEditable(false);

        lblClenteFixo.setText("Nome do Cliente:");

        txtNomeFixo.setEditable(false);

        lblCPF_Fixo.setText("CPF:");

        txtCPF_Fixo.setEditable(false);
        try {
            txtCPF_Fixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblNumVenda.setText("Venda Nº");

        idVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idVenda.setText("0025");

        javax.swing.GroupLayout paineSuperiorLayout = new javax.swing.GroupLayout(paineSuperior);
        paineSuperior.setLayout(paineSuperiorLayout);
        paineSuperiorLayout.setHorizontalGroup(
            paineSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paineSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(paineSuperiorLayout.createSequentialGroup()
                        .addComponent(lblDataFixo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(lblIDClienteFixo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdClienteFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(lblCPF_Fixo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF_Fixo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paineSuperiorLayout.createSequentialGroup()
                        .addComponent(lblClenteFixo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeFixo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paineSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNumVenda)
                .addGap(46, 46, 46)
                .addComponent(idVenda)
                .addGap(48, 48, 48))
        );
        paineSuperiorLayout.setVerticalGroup(
            paineSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paineSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataFixo)
                    .addComponent(txtDataFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDClienteFixo)
                    .addComponent(txtIdClienteFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF_Fixo)
                    .addComponent(txtCPF_Fixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paineSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumVenda)
                    .addComponent(idVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paineSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClenteFixo)
                    .addComponent(txtNomeFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        lblProduto.setText("Produto:");

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("IDProduto:");

        jButton2.setText("Pesquisar");

        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Titulo", "Autor", "Editora", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
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
        jScrollPane1.setViewportView(tableProdutos);
        if (tableProdutos.getColumnModel().getColumnCount() > 0) {
            tableProdutos.getColumnModel().getColumn(0).setResizable(false);
            tableProdutos.getColumnModel().getColumn(0).setPreferredWidth(30);
            tableProdutos.getColumnModel().getColumn(1).setResizable(false);
            tableProdutos.getColumnModel().getColumn(1).setPreferredWidth(200);
            tableProdutos.getColumnModel().getColumn(2).setResizable(false);
            tableProdutos.getColumnModel().getColumn(2).setPreferredWidth(150);
            tableProdutos.getColumnModel().getColumn(3).setResizable(false);
            tableProdutos.getColumnModel().getColumn(3).setPreferredWidth(100);
            tableProdutos.getColumnModel().getColumn(4).setResizable(false);
            tableProdutos.getColumnModel().getColumn(4).setPreferredWidth(70);
        }

        spnQtd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblQuantidade.setText("Quantidade:");

        jLabel2.setText("SubTotal:");

        jTextField2.setEditable(false);
        jTextField2.setText("R$ 00,00");

        jLabel3.setText("Adicionar Produto");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/Package-add-32.png"))); // NOI18N
        jButton3.setText("Adicionar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton1)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblQuantidade)
                        .addGap(18, 18, 18)
                        .addComponent(spnQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProduto)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantidade)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Produtos", jPanel1);

        tableVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Titulo", "Autor", "Editora", "Sub-Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
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
        jScrollPane2.setViewportView(tableVenda);
        if (tableVenda.getColumnModel().getColumnCount() > 0) {
            tableVenda.getColumnModel().getColumn(0).setResizable(false);
            tableVenda.getColumnModel().getColumn(0).setPreferredWidth(30);
            tableVenda.getColumnModel().getColumn(1).setResizable(false);
            tableVenda.getColumnModel().getColumn(1).setPreferredWidth(200);
            tableVenda.getColumnModel().getColumn(2).setResizable(false);
            tableVenda.getColumnModel().getColumn(2).setPreferredWidth(150);
            tableVenda.getColumnModel().getColumn(3).setResizable(false);
            tableVenda.getColumnModel().getColumn(3).setPreferredWidth(100);
            tableVenda.getColumnModel().getColumn(4).setResizable(false);
            tableVenda.getColumnModel().getColumn(4).setPreferredWidth(70);
        }

        jLabel4.setText("Valor Total:");

        jLabel5.setText("Forma de Pagamento:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cartão de Crédito", "Cartão de Débito" }));

        jLabel6.setText("Valor Final:");

        jTextField4.setEditable(false);
        jTextField4.setText("R$ 0,00");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/basket_delete.png"))); // NOI18N
        jButton4.setText("Excluir Item");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/button_cancel-32.png"))); // NOI18N
        jButton5.setText("Cancelar Venda");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/Money-32.png"))); // NOI18N
        jButton6.setText("Concluir Venda");

        lblValorTotalVenda.setText("00,00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblValorTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblValorTotalVenda))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(91, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Venda", jPanel2);

        javax.swing.GroupLayout paineInferiorLayout = new javax.swing.GroupLayout(paineInferior);
        paineInferior.setLayout(paineInferiorLayout);
        paineInferiorLayout.setHorizontalGroup(
            paineInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        paineInferiorLayout.setVerticalGroup(
            paineInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paineSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paineInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paineSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paineInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel idVenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblCPF_Fixo;
    private javax.swing.JLabel lblClenteFixo;
    private javax.swing.JLabel lblDataFixo;
    private javax.swing.JLabel lblIDClienteFixo;
    private javax.swing.JLabel lblNumVenda;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblValorTotalVenda;
    private javax.swing.JPanel paineInferior;
    private javax.swing.JPanel paineSuperior;
    private javax.swing.JSpinner spnQtd;
    private javax.swing.JTable tableProdutos;
    private javax.swing.JTable tableVenda;
    private javax.swing.JFormattedTextField txtCPF_Fixo;
    private javax.swing.JFormattedTextField txtDataFixo;
    private javax.swing.JTextField txtIdClienteFixo;
    private javax.swing.JTextField txtNomeFixo;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables
}
