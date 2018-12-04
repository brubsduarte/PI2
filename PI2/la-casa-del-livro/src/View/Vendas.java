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
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

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

        lblDate.setText(df.format(hoje));
        lblIdCliente.setText("");
        lblNomeCliente.setText("");
        lblCpfCliente.setText("");
        clienteSelecionado = null;
        LoadTableCliente(null);

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

    public void LoadTableCliente(ArrayList<String[]> clientes) {

        if (clientes == null) {
            clientes = ClienteController.getClientes();
        }

        DefaultTableModel tmClientes = new DefaultTableModel();
        tmClientes.addColumn("ID");
        tmClientes.addColumn("Nome");
        tmClientes.addColumn("CPF");
        tmClientes.addColumn("Sexo");
        tmClientes.addColumn("RG");
        tmClientes.addColumn("Orgão Emissor");
        tmClientes.addColumn("UF");
        tmClientes.addColumn("Estado Civil");
        tmClientes.addColumn("Email");
        tmClientes.addColumn("Telefone");
        tmClientes.addColumn("Celular");
        tmClientes.addColumn("Endereço");
        tmClientes.addColumn("N°");
        tmClientes.addColumn("Complemento");
        tmClientes.addColumn("CEP");
        tmClientes.addColumn("Estado");
        tmClientes.addColumn("Cidade");
        tmClientes.addColumn("Bairro");
        tmClientes.addColumn("Data de Nascimento");

        for (String[] c : clientes) {
            tmClientes.addRow(c);
        }

        tblClientePesquisa.setModel(tmClientes);

        tblClientePesquisa.getColumnModel().getColumn(0).setPreferredWidth(0); //ID;
        tblClientePesquisa.getColumnModel().getColumn(1).setPreferredWidth(250); //nome
        tblClientePesquisa.getColumnModel().getColumn(2).setPreferredWidth(150); //cpf

        tblClientePesquisa.getColumnModel().getColumn(3).setMinWidth(0);  //sexo
        tblClientePesquisa.getColumnModel().getColumn(3).setPreferredWidth(0); //sexo
        tblClientePesquisa.getColumnModel().getColumn(3).setMaxWidth(0); //sexo

        //tblClientePesquisa.getColumnModel().getColumn(3).setMinWidth(0); // rg
        tblClientePesquisa.getColumnModel().getColumn(4).setPreferredWidth(0); // rg
        //tblClientePesquisa.getColumnModel().getColumn(3).setMaxWidth(0); // rg

        tblClientePesquisa.getColumnModel().getColumn(5).setMinWidth(0);   // orgao
        tblClientePesquisa.getColumnModel().getColumn(5).setPreferredWidth(0);  // orgao
        tblClientePesquisa.getColumnModel().getColumn(5).setMaxWidth(0);   // orgao

        tblClientePesquisa.getColumnModel().getColumn(6).setMinWidth(0); // uf
        tblClientePesquisa.getColumnModel().getColumn(6).setPreferredWidth(0); // uf
        tblClientePesquisa.getColumnModel().getColumn(6).setMaxWidth(0);  // uf

        tblClientePesquisa.getColumnModel().getColumn(7).setMinWidth(0); // estado civil        
        tblClientePesquisa.getColumnModel().getColumn(7).setPreferredWidth(0); // estado civil        
        tblClientePesquisa.getColumnModel().getColumn(7).setMaxWidth(0); // estado civil 

        tblClientePesquisa.getColumnModel().getColumn(8).setMinWidth(0); //email
        tblClientePesquisa.getColumnModel().getColumn(8).setPreferredWidth(0); //email
        tblClientePesquisa.getColumnModel().getColumn(8).setMaxWidth(0); //email

        tblClientePesquisa.getColumnModel().getColumn(9).setMinWidth(0); //telefone
        tblClientePesquisa.getColumnModel().getColumn(9).setPreferredWidth(0); //telefone
        tblClientePesquisa.getColumnModel().getColumn(9).setMaxWidth(0); //telefone

        tblClientePesquisa.getColumnModel().getColumn(10).setMinWidth(0); //celular
        tblClientePesquisa.getColumnModel().getColumn(10).setPreferredWidth(0); //celular
        tblClientePesquisa.getColumnModel().getColumn(10).setMaxWidth(0);  //celular

        tblClientePesquisa.getColumnModel().getColumn(11).setMinWidth(0); // endereço
        tblClientePesquisa.getColumnModel().getColumn(11).setPreferredWidth(0);// endereço
        tblClientePesquisa.getColumnModel().getColumn(11).setMaxWidth(0);// endereço

        tblClientePesquisa.getColumnModel().getColumn(12).setMinWidth(0);  //numero
        tblClientePesquisa.getColumnModel().getColumn(12).setPreferredWidth(0); //numero
        tblClientePesquisa.getColumnModel().getColumn(12).setMaxWidth(0); //numero

        tblClientePesquisa.getColumnModel().getColumn(13).setMinWidth(0);  //complemento
        tblClientePesquisa.getColumnModel().getColumn(13).setPreferredWidth(0); //complemento
        tblClientePesquisa.getColumnModel().getColumn(13).setMaxWidth(0); //complemento

        tblClientePesquisa.getColumnModel().getColumn(14).setMinWidth(0); // cep
        tblClientePesquisa.getColumnModel().getColumn(14).setPreferredWidth(0); // cep
        tblClientePesquisa.getColumnModel().getColumn(14).setMaxWidth(0); // cep

        tblClientePesquisa.getColumnModel().getColumn(15).setMinWidth(0); //estado
        tblClientePesquisa.getColumnModel().getColumn(15).setPreferredWidth(0); //estado
        tblClientePesquisa.getColumnModel().getColumn(15).setMaxWidth(0); //estado

        tblClientePesquisa.getColumnModel().getColumn(16).setMinWidth(0); //cidade
        tblClientePesquisa.getColumnModel().getColumn(16).setPreferredWidth(0); //cidade
        tblClientePesquisa.getColumnModel().getColumn(16).setMaxWidth(0); //cidade

        tblClientePesquisa.getColumnModel().getColumn(17).setMinWidth(0); // bairro
        tblClientePesquisa.getColumnModel().getColumn(17).setPreferredWidth(0); // bairro
        tblClientePesquisa.getColumnModel().getColumn(17).setMaxWidth(0); // bairro

        //tblClientePesquisa.getColumnModel().getColumn(18).setMinWidth(0);// data de nascimento
        tblClientePesquisa.getColumnModel().getColumn(18).setPreferredWidth(0);// data de nascimento
        //tblClientePesquisa.getColumnModel().getColumn(18).setMaxWidth(0);// data de nascimento

        this.pack();
    }

    public void LoadTableProduto(ArrayList<String[]> produtos) {

        if (produtos == null) {
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
        tableVenda.getColumnModel().getColumn(4).setPreferredWidth(150); //QUANTIDADE
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

        jLabel2 = new javax.swing.JLabel();
        paineSuperior = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblDate = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblIdCliente = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCpfCliente = new javax.swing.JLabel();
        lblNomeCliente = new javax.swing.JLabel();
        paineInferior = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtPesquisaCliente = new javax.swing.JTextField();
        btnPesquisarCliente = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblClientePesquisa = new javax.swing.JTable();
        btnSelecionarCliente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblProduto = new javax.swing.JLabel();
        txtPesquisaProduto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();
        spnQtd = new javax.swing.JSpinner();
        lblQuantidade = new javax.swing.JLabel();
        AdicionarCarrinho = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableVenda = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        RemoverCarrinho = new javax.swing.JButton();
        btnCancelarVenda = new javax.swing.JButton();
        btnFinalizarVenda = new javax.swing.JButton();
        lblValorTotalVenda = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setClosable(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Data da Venda"));

        lblDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDate.setText("10/10/1099");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblDate)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblDate)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("ID:");

        lblIdCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIdCliente.setText("0000");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Cliente:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("CPF:");

        lblCpfCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCpfCliente.setText("000.000.000-00");

        lblNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeCliente.setText("Nome do Cliente");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCpfCliente)
                    .addComponent(lblNomeCliente)
                    .addComponent(lblIdCliente))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeCliente)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lblCpfCliente))
                        .addGap(5, 5, 5))))
        );

        javax.swing.GroupLayout paineSuperiorLayout = new javax.swing.GroupLayout(paineSuperior);
        paineSuperior.setLayout(paineSuperiorLayout);
        paineSuperiorLayout.setHorizontalGroup(
            paineSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        paineSuperiorLayout.setVerticalGroup(
            paineSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paineSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paineSuperiorLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel3.setText("Nome do Cliente:");

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
        jScrollPane3.setViewportView(tblClientePesquisa);

        btnSelecionarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSelecionarCliente.setText("Selecionar Cliente");
        btnSelecionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(btnSelecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnPesquisarCliente)
                    .addComponent(txtPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSelecionarCliente)
                .addGap(56, 56, 56))
        );

        jTabbedPane1.addTab("Cliente", jPanel4);

        lblProduto.setText("Produto:");

        txtPesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaProdutoActionPerformed(evt);
            }
        });

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        AdicionarCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/Package-add-32.png"))); // NOI18N
        AdicionarCarrinho.setText("Adicionar Produto");
        AdicionarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarCarrinhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(222, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AdicionarCarrinho)
                        .addGap(41, 41, 41))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProduto)
                    .addComponent(txtPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidade)
                    .addComponent(spnQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdicionarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Valor Total:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Forma de Pagamento:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Dinheiro", "Cartão de Crédito", "Cartão de Débito" }));

        RemoverCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/basket_delete.png"))); // NOI18N
        RemoverCarrinho.setText("Excluir Item");
        RemoverCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverCarrinhoActionPerformed(evt);
            }
        });

        btnCancelarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/button_cancel-32.png"))); // NOI18N
        btnCancelarVenda.setText("Cancelar Venda");
        btnCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVendaActionPerformed(evt);
            }
        });

        btnFinalizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/Money-32.png"))); // NOI18N
        btnFinalizarVenda.setText("Concluir Venda");
        btnFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarVendaActionPerformed(evt);
            }
        });

        lblValorTotalVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblValorTotalVenda.setText("00,00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5)
                        .addComponent(lblValorTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(RemoverCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorTotalVenda)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemoverCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizarVenda))
                .addGap(69, 69, 69))
        );

        jTabbedPane1.addTab("Venda", jPanel2);

        javax.swing.GroupLayout paineInferiorLayout = new javax.swing.GroupLayout(paineInferior);
        paineInferior.setLayout(paineInferiorLayout);
        paineInferiorLayout.setHorizontalGroup(
            paineInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineInferiorLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        paineInferiorLayout.setVerticalGroup(
            paineInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineInferiorLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paineSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(paineInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paineSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paineInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String pesquisa = txtPesquisaProduto.getText().toLowerCase();
        if (pesquisa.isEmpty()) {
            LoadTableProduto(null);
            return;
        }

        LoadTableProduto(ProdutoController.getProdutosFiltro(0, pesquisa, "", "", ""));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RemoverCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverCarrinhoActionPerformed
        int linha = tableVenda.getSelectedRow();
        String[] produto = vendas.get(linha);

        vendas.remove(produto);

        LoadTableVendas();

        showMessageDialog(null, "Produto removido com Sucesso");
    }//GEN-LAST:event_RemoverCarrinhoActionPerformed

    private void AdicionarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarCarrinhoActionPerformed
        if (ValidarProdutoCliente()) {

            int quantidade = Integer.parseInt(spnQtd.getValue().toString());

            int linha = tableProdutos.getSelectedRow();
            TableModel tm = tableProdutos.getModel();

            int estoque = Integer.valueOf(tm.getValueAt(linha, 7).toString());

            if (validaProdutoSelecionado(tm.getValueAt(linha, 0).toString())) {
                showMessageDialog(null, "Este produto já foi selecionado.");
                return;
            }

            if (quantidade > estoque || quantidade < 0) {
                showMessageDialog(null, "Quantidade indisponível no estoque.");
                return;
            }

            String[] venda = {
                tm.getValueAt(linha, 0).toString(),
                tm.getValueAt(linha, 1).toString(),
                tm.getValueAt(linha, 4).toString(),
                tm.getValueAt(linha, 8).toString(),
                String.valueOf(quantidade),
                tm.getValueAt(linha, 7).toString(),};

            vendas.add(venda);

            LoadTableVendas();

            showMessageDialog(null, "Produto Adicionado com Sucesso");
        }

    }//GEN-LAST:event_AdicionarCarrinhoActionPerformed

    private void btnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarClienteActionPerformed
        String pesquisa = txtPesquisaCliente.getText().toLowerCase();

        if (pesquisa.isEmpty()) {
            LoadTableCliente(null);
            return;
        }

        LoadTableCliente(ClienteController.getClientesFiltro(0, pesquisa, "", ""));
    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    private void btnSelecionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarClienteActionPerformed
        if (tblClientePesquisa.getSelectedRow() > -1) {
            int linhaSelecionada = tblClientePesquisa.getSelectedRow();

            TableModel tm = tblClientePesquisa.getModel();

            Cliente cliente = new Cliente();

            cliente.setId(Integer.valueOf(tm.getValueAt(linhaSelecionada, 0).toString()));
            cliente.setNome(tm.getValueAt(linhaSelecionada, 1).toString());
            cliente.setCPF(tm.getValueAt(linhaSelecionada, 2).toString());

            lblIdCliente.setText(String.valueOf(cliente.getId()));
            lblNomeCliente.setText(cliente.getNome());
            lblCpfCliente.setText(cliente.getCPF());

            clienteSelecionado = cliente;

        } else {
            JOptionPane.showMessageDialog(this, "Nenhum cliente selecionado.");
        }
    }//GEN-LAST:event_btnSelecionarClienteActionPerformed

    private void txtPesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaProdutoActionPerformed

    private void btnCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVendaActionPerformed
        inicia();
    }//GEN-LAST:event_btnCancelarVendaActionPerformed

    private void btnFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarVendaActionPerformed
        try {
            if (clienteSelecionado == null) {
                throw new Exception("Nenhum cliente selecionado.");
            }

            if (vendas.isEmpty()) {
                throw new Exception("Nenhum produto selecionado.");
            }

            if (!VendaController.Salvar(vendas, clienteSelecionado, new Date())) {
                throw new Exception("Ocorreu um erro durante a venda.");
            }

            showMessageDialog(null, "Venda criada com sucesso");

            inicia();

        } catch (Exception e) {
            showMessageDialog(null, e.getMessage());
        }
    
    }//GEN-LAST:event_btnFinalizarVendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarCarrinho;
    private javax.swing.JButton RemoverCarrinho;
    private javax.swing.JButton btnCancelarVenda;
    private javax.swing.JButton btnFinalizarVenda;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JButton btnSelecionarCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCpfCliente;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblValorTotalVenda;
    private javax.swing.JPanel paineInferior;
    private javax.swing.JPanel paineSuperior;
    private javax.swing.JSpinner spnQtd;
    private javax.swing.JTable tableProdutos;
    private javax.swing.JTable tableVenda;
    private javax.swing.JTable tblClientePesquisa;
    private javax.swing.JTextField txtPesquisaCliente;
    private javax.swing.JTextField txtPesquisaProduto;
    // End of variables declaration//GEN-END:variables

public boolean ValidarProdutoCliente() {

        if (lblIdCliente.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um cliente para adicionar o produto ao carrinho!");
            return false;
        }
        
        if (tableProdutos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um produto!");
            return false;
        }
        
        if (this.spnQtd.getValue().equals(0)) {
            JOptionPane.showMessageDialog(this, "Defina uma quantidade ao produto!");
            return false;
        }

        return true;
    }

    private boolean validaProdutoSelecionado(String id) {
        for (String[] venda : vendas) {
            if (venda[0].equals(id)) {
                return true;
            }
        }
        
        return false;
    }
}
