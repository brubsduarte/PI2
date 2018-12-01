/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ProdutoController;
import Controller.ClienteController;
import Controller.VendaController;
import Model.Cliente;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import utils.Validador;

/**
 *
 * @author Teste
 */
public class TelaVendasView extends javax.swing.JFrame {

    public ArrayList<String[]> clientes;
    public ArrayList<String[]> clientesFiltrados;
    public Cliente clienteSelecionado;

    public ArrayList<String[]> produtos;
    public ArrayList<String[]> produtosFiltrados;
    public String[] produtoSelecionado;

    public ArrayList<String[]> vendas;

    /**
     * Creates new form TelaVendas
     */
    public TelaVendasView() {
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

        clientes = VendaController.getClientes();
        clientesFiltrados = clientes;
        clienteSelecionado = null;
        LoadTableCliente(null);

        produtos = VendaController.getProdutos();
        produtosFiltrados = produtos;
        produtoSelecionado = null;
        LoadTableProduto(null);

        spnQuantidadeProduto.setValue(1);
        vendas = new ArrayList();
        LoadTableVendas();
    }

    public void LoadTableCliente(ArrayList<String[]> clientes) {
        
        if(clientes == null){
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

        tblProdutoPesquisa.setModel(tmProdutos);

        tblProdutoPesquisa.getColumnModel().getColumn(0).setPreferredWidth(50); //ID

        tblProdutoPesquisa.getColumnModel().getColumn(1).setPreferredWidth(250);//Titulo

        tblProdutoPesquisa.getColumnModel().getColumn(2).setMinWidth(0); //Genero
        tblProdutoPesquisa.getColumnModel().getColumn(2).setPreferredWidth(0); //Genero
        tblProdutoPesquisa.getColumnModel().getColumn(2).setMaxWidth(0); //Genero

        tblProdutoPesquisa.getColumnModel().getColumn(3).setMinWidth(0); // Editora
        tblProdutoPesquisa.getColumnModel().getColumn(3).setPreferredWidth(0); // Editora
        tblProdutoPesquisa.getColumnModel().getColumn(3).setMaxWidth(0); // Editora

        tblProdutoPesquisa.getColumnModel().getColumn(4).setPreferredWidth(100);  // Autor

        tblProdutoPesquisa.getColumnModel().getColumn(5).setMinWidth(0); // Tipo
        tblProdutoPesquisa.getColumnModel().getColumn(5).setPreferredWidth(0); // Tipo
        tblProdutoPesquisa.getColumnModel().getColumn(5).setMaxWidth(0);  // Tipo

        tblProdutoPesquisa.getColumnModel().getColumn(6).setMinWidth(0); // Descrição       
        tblProdutoPesquisa.getColumnModel().getColumn(6).setPreferredWidth(0); // Descrição    
        tblProdutoPesquisa.getColumnModel().getColumn(6).setMaxWidth(0); // Descrição

        tblProdutoPesquisa.getColumnModel().getColumn(7).setPreferredWidth(50); //Quantidade     

        tblProdutoPesquisa.getColumnModel().getColumn(8).setPreferredWidth(100); //Valor Unitario
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

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
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
        jPanel5 = new javax.swing.JPanel();
        lblDate = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblIdCliente = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblCpfCliente = new javax.swing.JLabel();
        lblNomeCliente = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome do Cliente");

        btnPesquisarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        if (tblClientePesquisa.getColumnModel().getColumnCount() > 0) {
            tblClientePesquisa.getColumnModel().getColumn(0).setResizable(false);
            tblClientePesquisa.getColumnModel().getColumn(1).setResizable(false);
            tblClientePesquisa.getColumnModel().getColumn(2).setResizable(false);
        }

        btnSelecionarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSelecionarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 140, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarCliente))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSelecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(330, 330, 330))
        );

        jTabbedPane1.addTab("Cliente", jPanel2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Produto");

        txtPesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaProdutoActionPerformed(evt);
            }
        });

        btnPesquisarProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        btnAdicionarCarrinho.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdicionarCarrinho.setText("Adicionar ao Carrinho");
        btnAdicionarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCarrinhoActionPerformed(evt);
            }
        });

        spnQuantidadeProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txtPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97))
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

        btnFinalizarVenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFinalizarVenda.setText("Finalizar Venda");
        btnFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarVendaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Valor Total: ");

        lblValorTotalVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblValorTotalVenda.setText("00,00");

        btnRemoverCarrinho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValorTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoverCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblValorTotalVenda))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoverCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Venda", jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data da Venda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        lblDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDate.setText("10/10/1099");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(lblDate)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblDate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("ID:");

        lblIdCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblIdCliente.setText("0000");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Cliente:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("CPF:");

        lblCpfCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCpfCliente.setText("000.000.000-00");

        lblNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNomeCliente.setText("Nome do Cliente");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIdCliente)
                .addGap(50, 50, 50)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCpfCliente))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeCliente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblNomeCliente)
                    .addComponent(jLabel4)
                    .addComponent(lblIdCliente))
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblCpfCliente))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, Short.MAX_VALUE))
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

    private void btnAdicionarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCarrinhoActionPerformed

        if(ValidarProdutoCliente()){

            int quantidade = Integer.parseInt(spnQuantidadeProduto.getValue().toString());
            
            int linha = tblProdutoPesquisa.getSelectedRow();
            TableModel tm = tblProdutoPesquisa.getModel();

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
                String.valueOf(quantidade)};

            vendas.add(venda);

            LoadTableVendas();

            showMessageDialog(null, "Produto Adicionado com Sucesso");
        }
    }//GEN-LAST:event_btnAdicionarCarrinhoActionPerformed

    private void btnPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarProdutoActionPerformed

        String pesquisa = txtPesquisaProduto.getText().toLowerCase();
        if (pesquisa.isEmpty()) {
            LoadTableProduto(null);
            return;
        }
        
        LoadTableProduto(ProdutoController.getProdutosFiltro(0, pesquisa, "", "", ""));
    }//GEN-LAST:event_btnPesquisarProdutoActionPerformed

    private void txtPesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaProdutoActionPerformed

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

    private void btnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarClienteActionPerformed
        String pesquisa = txtPesquisaCliente.getText().toLowerCase();
        
        if (pesquisa.isEmpty()) {
            LoadTableCliente(null);
            return;
        }
        
        LoadTableCliente(ClienteController.getClientesFiltro(0, pesquisa, "", ""));
    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    private void btnFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarVendaActionPerformed
        try {
//            if(clienteSelecionado.length == 0) {
//                throw new Exception("Nenhum cliente selecionado.");
//            }
            
            if(vendas.isEmpty()) {
                throw new Exception("Nenhum produto selecionado.");
            }
            
//            VendaController.Salvar(vendas, clienteSelecionado, new Date());
            
            showMessageDialog(null, "Venda criada com sucesso");
            
            inicia();
            
        } catch (Exception e) {
            showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnFinalizarVendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarCarrinho;
    private javax.swing.JButton btnCancelarVenda;
    private javax.swing.JButton btnFinalizarVenda;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JButton btnPesquisarProduto;
    private javax.swing.JButton btnRemoverCarrinho;
    private javax.swing.JButton btnSelecionarCliente;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
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
        
        if (tblProdutoPesquisa.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um produto!");
            return false;
        }
        
        if (this.spnQuantidadeProduto.getValue().equals(0)) {
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
