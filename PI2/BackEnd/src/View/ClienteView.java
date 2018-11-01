
package View;

import Controller.ClienteController;
import Controller.ProdutoController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.table.DefaultTableModel;

public class ClienteView extends javax.swing.JFrame {

    private String modoTela; //"Criar/Editar"

    public ClienteView() {
        initComponents();

        this.setLocationRelativeTo(null);
        DesabilitarFormulario();
        DesabilitarFormulario2();

    }

    public void LoadTable() {

        ArrayList<String[]> linhasClientes = ClienteController.getClientes();

        DefaultTableModel tmClientes = new DefaultTableModel();
        tmClientes.addColumn("ID");
        tmClientes.addColumn("Nome");
        tmClientes.addColumn("CPF");

        for (String[] c : linhasClientes) {
            tmClientes.addRow(c);
        }

        tblClientes.setModel(tmClientes);

        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblClientes.getColumnModel().getColumn(1).setPreferredWidth(250);
        tblClientes.getColumnModel().getColumn(2).setPreferredWidth(150);
    }

    public void LoadTable2() {

        ArrayList<String[]> linhasProdutos = ProdutoController.getProdutos();

        DefaultTableModel tmProdutos = new DefaultTableModel();
        tmProdutos.addColumn("ID");
        tmProdutos.addColumn("Titulo");
        tmProdutos.addColumn("Genero");
        tmProdutos.addColumn("Editora");
        tmProdutos.addColumn("Autor");
        tmProdutos.addColumn("Tipo");
        tmProdutos.addColumn("Descrição");
        tmProdutos.addColumn("Quantidade");
        tmProdutos.addColumn("Valor Unitario");
        

        for (String[] c : linhasProdutos) {
            tmProdutos.addRow(c);
        }

        tblProdutos1.setModel(tmProdutos);

        tblProdutos1.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblProdutos1.getColumnModel().getColumn(1).setPreferredWidth(150);
        tblProdutos1.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblProdutos1.getColumnModel().getColumn(3).setPreferredWidth(150);
        tblProdutos1.getColumnModel().getColumn(4).setPreferredWidth(150);
        tblProdutos1.getColumnModel().getColumn(5).setPreferredWidth(150);
        tblProdutos1.getColumnModel().getColumn(6).setPreferredWidth(150);
        tblProdutos1.getColumnModel().getColumn(7).setPreferredWidth(50);
        tblProdutos1.getColumnModel().getColumn(8).setPreferredWidth(50);

    }

    public void LimparFormulario() {
        txtIDCliente.setText("");
        txtNome.setText("");
        txtCPF.setText("");

    }

    public void LimparFormulario2() {
        txtIDproduto.setText("");
        txtTituloProduto.setText("");
        cboGeneroProduto.setSelectedIndex(0);
        cboEditoraProduto.setSelectedIndex(0);
        txtAutorProduto.setText("");
        cboTipoProduto.setSelectedIndex(0);
        txtDescricaoProduto.setText("");
        spnQuantidadeProduto.setValue(0);
        txtVlrUnitario.setText("");
        
        
    }

 
    public void DesabilitarFormulario() {
        txtIDCliente.setEditable(false);
        txtNome.setEditable(false);
        txtCPF.setEditable(false);

        btnSalvarCliente.setEnabled(false);
        btnCancelar.setEnabled(false);
    }

    public void DesabilitarFormulario2() {
        
        txtIDproduto.setEditable(false);
        txtTituloProduto.setEditable(false);
        cboGeneroProduto.setEditable(false);
        cboEditoraProduto.setEditable(false);
        txtAutorProduto.setEditable(false);
        cboTipoProduto.setEditable(false);
        txtDescricaoProduto.setEditable(false);
        ((DefaultEditor)spnQuantidadeProduto.getEditor()).getTextField().setEditable(false);
        txtVlrUnitario.setEditable(false);
        
        
        btnSalvarProduto1.setEnabled(false);
        btnCancelar1.setEnabled(false);
    }

    public void HabilitarFormulario() {
        txtIDCliente.setEditable(true);
        txtNome.setEditable(true);
        txtCPF.setEditable(true);

        btnSalvarCliente.setEnabled(true);
        btnCancelar.setEnabled(true);
    }

    public void HabilitarFormulario2() {
        
        txtIDproduto.setEditable(true);
        txtTituloProduto.setEditable(true);
        cboGeneroProduto.setEditable(true);
        cboEditoraProduto.setEditable(true);
        txtAutorProduto.setEditable(true);
        cboTipoProduto.setEditable(true);
        txtDescricaoProduto.setEditable(true);
        ((DefaultEditor)spnQuantidadeProduto.getEditor()).getTextField().setEditable(true);
        txtVlrUnitario.setEditable(true);
        
        
        btnSalvarProduto1.setEnabled(true);
        btnCancelar1.setEnabled(true);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlAbaCadastroCliente = new javax.swing.JPanel();
        pnlFormulario = new javax.swing.JPanel();
        txtCPF = new javax.swing.JTextField();
        txtIDCliente = new javax.swing.JTextField();
        lblValorUnitario = new javax.swing.JLabel();
        lblNomeCliente = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblIDCliente = new javax.swing.JLabel();
        pnlTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        pnlBotoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        pnlBotoesFormulario = new javax.swing.JPanel();
        btnSalvarCliente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pnlAbaCadastrarProduto = new javax.swing.JPanel();
        pnlAbaCadastroProduto1 = new javax.swing.JPanel();
        pnlFormulario1 = new javax.swing.JPanel();
        txtTituloProduto = new javax.swing.JTextField();
        lblVlrUnitario1 = new javax.swing.JLabel();
        txtVlrUnitario = new javax.swing.JTextField();
        lblTituloProduto = new javax.swing.JLabel();
        pnlTabela1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdutos1 = new javax.swing.JTable();
        pnlBotoes1 = new javax.swing.JPanel();
        btnNovoProduto1 = new javax.swing.JButton();
        btnEditarProduto1 = new javax.swing.JButton();
        btnExcluirProduto1 = new javax.swing.JButton();
        pnlBotoesFormulario1 = new javax.swing.JPanel();
        btnSalvarProduto1 = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        lblIDProduto = new javax.swing.JLabel();
        txtIDproduto = new javax.swing.JTextField();
        lblAutorProduto = new javax.swing.JLabel();
        txtAutorProduto = new javax.swing.JTextField();
        lblGeneroProduto = new javax.swing.JLabel();
        cboGeneroProduto = new javax.swing.JComboBox<>();
        lblEditoraProduto = new javax.swing.JLabel();
        cboEditoraProduto = new javax.swing.JComboBox<>();
        lblTipoProduto = new javax.swing.JLabel();
        cboTipoProduto = new javax.swing.JComboBox<>();
        lblQuantidadeProduto = new javax.swing.JLabel();
        spnQuantidadeProduto = new javax.swing.JSpinner();
        lblDescricaoProduto = new javax.swing.JLabel();
        txtDescricaoProduto = new javax.swing.JTextField();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        lblValorUnitario.setText("CPF:");

        lblNomeCliente.setText("Nome:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblIDCliente.setText("ID:");

        pnlTabela.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
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
        jScrollPane1.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setMinWidth(120);
            tblClientes.getColumnModel().getColumn(0).setPreferredWidth(120);
            tblClientes.getColumnModel().getColumn(0).setMaxWidth(120);
            tblClientes.getColumnModel().getColumn(1).setMinWidth(200);
            tblClientes.getColumnModel().getColumn(1).setPreferredWidth(120);
            tblClientes.getColumnModel().getColumn(1).setMaxWidth(120);
            tblClientes.getColumnModel().getColumn(2).setMinWidth(300);
            tblClientes.getColumnModel().getColumn(2).setPreferredWidth(120);
            tblClientes.getColumnModel().getColumn(2).setMaxWidth(120);
        }

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditarCliente.setText("Editar");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnExcluirCliente.setText("Excluir");
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBotoesLayout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlBotoesLayout.createSequentialGroup()
                        .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirCliente)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        pnlBotoesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEditarCliente, btnExcluirCliente, btnNovo});

        javax.swing.GroupLayout pnlTabelaLayout = new javax.swing.GroupLayout(pnlTabela);
        pnlTabela.setLayout(pnlTabelaLayout);
        pnlTabelaLayout.setHorizontalGroup(
            pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlTabelaLayout.setVerticalGroup(
            pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlTabelaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        btnSalvarCliente.setText("Salvar");
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });
        pnlBotoesFormulario.add(btnSalvarCliente);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlBotoesFormulario.add(btnCancelar);

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTabela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNomeCliente)
                            .addComponent(lblValorUnitario)
                            .addComponent(lblIDCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addGroup(pnlFormularioLayout.createSequentialGroup()
                                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(pnlBotoesFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCliente)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorUnitario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlBotoesFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlAbaCadastroClienteLayout = new javax.swing.GroupLayout(pnlAbaCadastroCliente);
        pnlAbaCadastroCliente.setLayout(pnlAbaCadastroClienteLayout);
        pnlAbaCadastroClienteLayout.setHorizontalGroup(
            pnlAbaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAbaCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAbaCadastroClienteLayout.setVerticalGroup(
            pnlAbaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAbaCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastrar Cliente", pnlAbaCadastroCliente);

        pnlAbaCadastrarProduto.setMaximumSize(new java.awt.Dimension(1000, 1000));
        pnlAbaCadastrarProduto.setPreferredSize(new java.awt.Dimension(1000, 1000));

        txtTituloProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloProdutoActionPerformed(evt);
            }
        });

        lblVlrUnitario1.setText("Valor Unitario:");

        txtVlrUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVlrUnitarioActionPerformed(evt);
            }
        });

        lblTituloProduto.setText("Titulo");

        pnlTabela1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblProdutos1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblProdutos1);
        if (tblProdutos1.getColumnModel().getColumnCount() > 0) {
            tblProdutos1.getColumnModel().getColumn(0).setMinWidth(60);
            tblProdutos1.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblProdutos1.getColumnModel().getColumn(0).setMaxWidth(60);
            tblProdutos1.getColumnModel().getColumn(1).setMinWidth(90);
            tblProdutos1.getColumnModel().getColumn(1).setPreferredWidth(90);
            tblProdutos1.getColumnModel().getColumn(1).setMaxWidth(90);
            tblProdutos1.getColumnModel().getColumn(2).setMinWidth(80);
            tblProdutos1.getColumnModel().getColumn(2).setPreferredWidth(80);
            tblProdutos1.getColumnModel().getColumn(2).setMaxWidth(80);
            tblProdutos1.getColumnModel().getColumn(3).setMinWidth(80);
            tblProdutos1.getColumnModel().getColumn(3).setPreferredWidth(80);
            tblProdutos1.getColumnModel().getColumn(3).setMaxWidth(80);
            tblProdutos1.getColumnModel().getColumn(4).setMinWidth(80);
            tblProdutos1.getColumnModel().getColumn(4).setPreferredWidth(80);
            tblProdutos1.getColumnModel().getColumn(4).setMaxWidth(80);
            tblProdutos1.getColumnModel().getColumn(5).setMinWidth(80);
            tblProdutos1.getColumnModel().getColumn(5).setPreferredWidth(80);
            tblProdutos1.getColumnModel().getColumn(5).setMaxWidth(80);
            tblProdutos1.getColumnModel().getColumn(6).setMinWidth(60);
            tblProdutos1.getColumnModel().getColumn(6).setPreferredWidth(60);
            tblProdutos1.getColumnModel().getColumn(6).setMaxWidth(60);
            tblProdutos1.getColumnModel().getColumn(7).setMinWidth(60);
            tblProdutos1.getColumnModel().getColumn(7).setPreferredWidth(60);
            tblProdutos1.getColumnModel().getColumn(7).setMaxWidth(60);
            tblProdutos1.getColumnModel().getColumn(8).setMinWidth(70);
            tblProdutos1.getColumnModel().getColumn(8).setPreferredWidth(70);
            tblProdutos1.getColumnModel().getColumn(8).setMaxWidth(70);
        }

        btnNovoProduto1.setText("Novo");
        btnNovoProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoProduto1ActionPerformed(evt);
            }
        });

        btnEditarProduto1.setText("Editar");
        btnEditarProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProduto1ActionPerformed(evt);
            }
        });

        btnExcluirProduto1.setText("Excluir");
        btnExcluirProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProduto1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotoes1Layout = new javax.swing.GroupLayout(pnlBotoes1);
        pnlBotoes1.setLayout(pnlBotoes1Layout);
        pnlBotoes1Layout.setHorizontalGroup(
            pnlBotoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoes1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovoProduto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluirProduto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarProduto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlBotoes1Layout.setVerticalGroup(
            pnlBotoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoes1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovoProduto1)
                .addGap(18, 18, 18)
                .addComponent(btnEditarProduto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluirProduto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout pnlTabela1Layout = new javax.swing.GroupLayout(pnlTabela1);
        pnlTabela1.setLayout(pnlTabela1Layout);
        pnlTabela1Layout.setHorizontalGroup(
            pnlTabela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabela1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlBotoes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlTabela1Layout.setVerticalGroup(
            pnlTabela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabela1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTabela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlBotoes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalvarProduto1.setText("Salvar");
        btnSalvarProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProduto1ActionPerformed(evt);
            }
        });
        pnlBotoesFormulario1.add(btnSalvarProduto1);

        btnCancelar1.setText("Cancelar");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });
        pnlBotoesFormulario1.add(btnCancelar1);

        lblIDProduto.setText("ID:");

        txtIDproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDprodutoActionPerformed(evt);
            }
        });

        lblAutorProduto.setText("Autor:");

        txtAutorProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorProdutoActionPerformed(evt);
            }
        });

        lblGeneroProduto.setText("Genero:");

        cboGeneroProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Fantasia", "Ficção Científica", "Horror", "Autobiografia", "Biografia", "Apocalipse Zumbi", "Romance", "Infanto-Juvenil", "Suspense", "Literatura", "Aventura" }));
        cboGeneroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGeneroProdutoActionPerformed(evt);
            }
        });

        lblEditoraProduto.setText("Editora:");

        cboEditoraProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Arqueiro", "Globo", "Rocco", "Ética", "Abril", "Intrínseca", "Sextante", "Senac", "Saraiva", "Record", "Conrad", "Newpop", "JBC", "Panini", "Draco", "LeYa", "Gutenberg" }));

        lblTipoProduto.setText("Tipo:");

        cboTipoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Capa Padrão", "Capa Dura", "Edição de Anirvesário", "Edição de Luxo", "Capa Alternativa" }));

        lblQuantidadeProduto.setText("Quantidade:");

        lblDescricaoProduto.setText("Descrição:");

        javax.swing.GroupLayout pnlFormulario1Layout = new javax.swing.GroupLayout(pnlFormulario1);
        pnlFormulario1.setLayout(pnlFormulario1Layout);
        pnlFormulario1Layout.setHorizontalGroup(
            pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario1Layout.createSequentialGroup()
                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormulario1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblVlrUnitario1)
                                .addComponent(lblTituloProduto)
                                .addComponent(lblAutorProduto)
                                .addComponent(lblGeneroProduto))
                            .addComponent(lblIDProduto, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtIDproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtVlrUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAutorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnlFormulario1Layout.createSequentialGroup()
                                    .addComponent(cboGeneroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(lblEditoraProduto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cboEditoraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(lblTipoProduto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cboTipoProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnlFormulario1Layout.createSequentialGroup()
                                .addComponent(lblQuantidadeProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlFormulario1Layout.createSequentialGroup()
                                        .addComponent(lblDescricaoProduto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlFormulario1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(pnlBotoesFormulario1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtTituloProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlFormulario1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(pnlTabela1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFormulario1Layout.setVerticalGroup(
            pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDProduto)
                    .addComponent(txtIDproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTituloProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTituloProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVlrUnitario1)
                    .addComponent(txtVlrUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutorProduto)
                    .addComponent(txtAutorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGeneroProduto)
                    .addComponent(cboGeneroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEditoraProduto)
                    .addComponent(cboEditoraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoProduto)
                    .addComponent(cboTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidadeProduto)
                    .addComponent(spnQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricaoProduto)
                    .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlBotoesFormulario1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTabela1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlAbaCadastroProduto1Layout = new javax.swing.GroupLayout(pnlAbaCadastroProduto1);
        pnlAbaCadastroProduto1.setLayout(pnlAbaCadastroProduto1Layout);
        pnlAbaCadastroProduto1Layout.setHorizontalGroup(
            pnlAbaCadastroProduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAbaCadastroProduto1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFormulario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAbaCadastroProduto1Layout.setVerticalGroup(
            pnlAbaCadastroProduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAbaCadastroProduto1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlFormulario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlAbaCadastrarProdutoLayout = new javax.swing.GroupLayout(pnlAbaCadastrarProduto);
        pnlAbaCadastrarProduto.setLayout(pnlAbaCadastrarProdutoLayout);
        pnlAbaCadastrarProdutoLayout.setHorizontalGroup(
            pnlAbaCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAbaCadastrarProdutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlAbaCadastroProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAbaCadastrarProdutoLayout.setVerticalGroup(
            pnlAbaCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAbaCadastrarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAbaCadastroProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastrar Produto", pnlAbaCadastrarProduto);

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Produto", "Qntd.", "Preço Unit.", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
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
        jScrollPane3.setViewportView(jTable1);

        jLabel11.setText("Valor Total:");

        jLabel12.setText("Desconto:");

        jLabel13.setText("Valor Final");

        jLabel14.setText("Forma de Pagamento:");

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
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlAbaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(36, 36, 36)
                .addComponent(jLabel14)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vendas", pnlAbaVendas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        DesabilitarFormulario();
        LimparFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed

        if (ValidarFormulario()) {
            if (modoTela.equals("Criar")) {
                if (ClienteController.Salvar(Integer.parseInt(txtIDCliente.getText()), txtNome.getText(), Long.parseLong(txtCPF.getText()))) {
                    this.LoadTable();
                    JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
                    LimparFormulario();
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao cadastrar cliente!");
                }

            } else {

                if (ClienteController.Atualizar(Integer.parseInt(txtIDCliente.getText()), txtNome.getText(), Long.parseLong(txtCPF.getText()))) {
                    this.LoadTable();
                    JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao cadastrar cliente!");
                }

            }

            LimparFormulario();
            DesabilitarFormulario();

        }

    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed

        if (tblClientes.getRowCount() > 0) {
            if (ClienteController.Excluir(tblClientes.getSelectedRow())) {
                this.LoadTable();
                JOptionPane.showMessageDialog(this, "Cliente excluído da base de dados");
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao excluir o cliente!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há clientes para excluir!");
        }
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed

        if (tblClientes.getRowCount() > 0) {
            if (tblClientes.getSelectedRow() >= 0) {
                HabilitarFormulario();
                modoTela = "Editar";

                txtIDCliente.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 0).toString());
                txtNome.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 1).toString());
                txtCPF.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 2).toString());
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um cliente para editar!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há clientes para editar!");
        }
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        modoTela = "Criar";
        HabilitarFormulario();
        LimparFormulario();

    }//GEN-LAST:event_btnNovoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtVlrUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVlrUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVlrUnitarioActionPerformed

    private void btnNovoProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProduto1ActionPerformed
        modoTela = "Criar";
        HabilitarFormulario2();
        LimparFormulario2();
    }//GEN-LAST:event_btnNovoProduto1ActionPerformed

    private void btnEditarProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProduto1ActionPerformed
        if (tblProdutos1.getRowCount() > 0) {
            if (tblProdutos1.getSelectedRow() >= 0) {
                HabilitarFormulario2();
                modoTela = "Editar";
                
                
                txtIDproduto.setText(tblProdutos1.getModel().getValueAt(tblProdutos1.getSelectedRow(), 0).toString());
                txtTituloProduto.setText(tblProdutos1.getModel().getValueAt(tblProdutos1.getSelectedRow(), 1).toString());
                cboGeneroProduto.setSelectedItem(tblProdutos1.getModel().getValueAt(tblProdutos1.getSelectedRow(), 2).toString());
                cboEditoraProduto.setSelectedItem(tblProdutos1.getModel().getValueAt(tblProdutos1.getSelectedRow(), 3).toString());
                txtAutorProduto.setText(tblProdutos1.getModel().getValueAt(tblProdutos1.getSelectedRow(), 4).toString());
                cboTipoProduto.setSelectedItem(tblProdutos1.getModel().getValueAt(tblProdutos1.getSelectedRow(), 5).toString());
                txtDescricaoProduto.setText(tblProdutos1.getModel().getValueAt(tblProdutos1.getSelectedRow(), 6).toString());
                spnQuantidadeProduto.setValue(Integer.valueOf(tblProdutos1.getModel().getValueAt(tblProdutos1.getSelectedRow(), 7).toString()));             
                txtVlrUnitario.setText(tblProdutos1.getModel().getValueAt(tblProdutos1.getSelectedRow(), 8).toString());

            } else {
                JOptionPane.showMessageDialog(this, "Selecione um produto para editar!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há produtos para editar!");
        }
    }//GEN-LAST:event_btnEditarProduto1ActionPerformed

    private void btnExcluirProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProduto1ActionPerformed

        if (tblProdutos1.getRowCount() > 0) {
            if (ProdutoController.Excluir(tblProdutos1.getSelectedRow())) {
                this.LoadTable2();
                JOptionPane.showMessageDialog(this, "Produto excluído da base de dados");
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao excluir o produto!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há produtos para excluir!");
        }

    }//GEN-LAST:event_btnExcluirProduto1ActionPerformed

    private void btnSalvarProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProduto1ActionPerformed
        if (ValidarFormulario2()) {
            if (modoTela.equals("Criar")) 
            
            {
                if (ProdutoController.Salvar(Integer.parseInt(txtIDproduto.getText().toString())
                        ,txtTituloProduto.getText().toString()
                        ,cboGeneroProduto.getSelectedItem().toString()
                        ,cboEditoraProduto.getSelectedItem().toString()
                        ,txtAutorProduto.getText().toString()
                        ,cboTipoProduto.getSelectedItem().toString()
                        ,txtDescricaoProduto.getText().toString()
                        ,Integer.parseInt(spnQuantidadeProduto.getValue().toString())
                        ,Double.parseDouble(txtVlrUnitario.getText().toString())
                ))
                        
                {
                    this.LoadTable2();
                    JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!");
                    LimparFormulario2();
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao cadastrar produto!");
                }

            } else {

                if (ProdutoController.Atualizar(Integer.parseInt(txtIDproduto.getText().toString())
                        ,txtTituloProduto.getText().toString()
                        ,cboGeneroProduto.getSelectedItem().toString()
                        ,cboEditoraProduto.getSelectedItem().toString()
                        ,txtAutorProduto.getText().toString()
                        ,cboTipoProduto.getSelectedItem().toString()
                        ,txtDescricaoProduto.getText().toString()
                        ,Integer.parseInt(spnQuantidadeProduto.getValue().toString())
                        ,Double.parseDouble(txtVlrUnitario.getText().toString())
                ))
                {
                    this.LoadTable2();
                    JOptionPane.showMessageDialog(this, "Produto Atualizado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao Atualizar produto!");
                }

            }

            LimparFormulario2();
            DesabilitarFormulario2();

        }
    }//GEN-LAST:event_btnSalvarProduto1ActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        // TODO add your handling code here:
        DesabilitarFormulario2();
        LimparFormulario2();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void txtTituloProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloProdutoActionPerformed

    private void txtIDprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDprodutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDprodutoActionPerformed

    private void txtAutorProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorProdutoActionPerformed

    private void cboGeneroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGeneroProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboGeneroProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new ClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEditarProduto1;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnExcluirProduto1;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnNovoProduto1;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JButton btnSalvarProduto1;
    private javax.swing.JComboBox<String> cboEditoraProduto;
    private javax.swing.JComboBox<String> cboGeneroProduto;
    private javax.swing.JComboBox<String> cboTipoProduto;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAutorProduto;
    private javax.swing.JLabel lblDescricaoProduto;
    private javax.swing.JLabel lblEditoraProduto;
    private javax.swing.JLabel lblGeneroProduto;
    private javax.swing.JLabel lblIDCliente;
    private javax.swing.JLabel lblIDProduto;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblQuantidadeProduto;
    private javax.swing.JLabel lblTipoProduto;
    private javax.swing.JLabel lblTituloProduto;
    private javax.swing.JLabel lblValorUnitario;
    private javax.swing.JLabel lblVlrUnitario1;
    private javax.swing.JPanel pnlAbaCadastrarProduto;
    private javax.swing.JPanel pnlAbaCadastroCliente;
    private javax.swing.JPanel pnlAbaCadastroProduto1;
    private javax.swing.JPanel pnlAbaVendas;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlBotoes1;
    private javax.swing.JPanel pnlBotoesFormulario;
    private javax.swing.JPanel pnlBotoesFormulario1;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlFormulario1;
    private javax.swing.JPanel pnlTabela;
    private javax.swing.JPanel pnlTabela1;
    private javax.swing.JSpinner spnQuantidadeProduto;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblProdutos1;
    private javax.swing.JTextField txtAutorProduto;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtIDproduto;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTituloProduto;
    private javax.swing.JTextField txtVlrUnitario;
    // End of variables declaration//GEN-END:variables

    private boolean ValidarFormulario() {

        if (this.txtIDCliente.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um ID ao cliente!");
            return false;
        }

        if (this.txtNome.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um nome para o cliente!");
            return false;
        }

        if (this.txtCPF.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para cliente!");
            return false;
        }

        return true;

    }

    private boolean ValidarFormulario2() {

        if (this.txtIDproduto.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um ID ao produto!");
            return false;
        }

        if (this.txtTituloProduto.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina uma descrição ao produto!");
            return false;
        }

        if (this.txtVlrUnitario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um valor unitario ao produto!");
            return false;
        }

        return true;

    }
}
