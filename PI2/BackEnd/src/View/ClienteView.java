
package View;

import Controller.ClienteController;
import Controller.ProdutoController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
        tmProdutos.addColumn("Descrição do Produto");
        tmProdutos.addColumn("Valor por Unidade");

        for (String[] c : linhasProdutos) {
            tmProdutos.addRow(c);
        }

        tblProdutos1.setModel(tmProdutos);

        tblProdutos1.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblProdutos1.getColumnModel().getColumn(1).setPreferredWidth(250);
        tblProdutos1.getColumnModel().getColumn(2).setPreferredWidth(150);

    }

    public void LimparFormulario() {
        txtIDCliente.setText("");
        txtNome.setText("");
        txtCPF.setText("");

    }

    public void LimparFormulario2() {
        txtIDproduto1.setText("");
        txtDscProduto1.setText("");
        txtVlrUnitario1.setText("");

    }

 
    public void DesabilitarFormulario() {
        txtIDCliente.setEditable(false);
        txtNome.setEditable(false);
        txtCPF.setEditable(false);

        btnSalvarCliente.setEnabled(false);
        btnCancelar.setEnabled(false);
    }

    public void DesabilitarFormulario2() {
        txtIDproduto1.setEditable(false);
        txtDscProduto1.setEditable(false);
        txtVlrUnitario1.setEditable(false);

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
        txtIDproduto1.setEditable(true);
        txtDscProduto1.setEditable(true);
        txtVlrUnitario1.setEditable(true);

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
        jPanel1 = new javax.swing.JPanel();
        pnlAbaCadastroProduto1 = new javax.swing.JPanel();
        pnlFormulario1 = new javax.swing.JPanel();
        txtDscProduto1 = new javax.swing.JTextField();
        lblVlrUnitario1 = new javax.swing.JLabel();
        txtVlrUnitario1 = new javax.swing.JTextField();
        lblDscProduto1 = new javax.swing.JLabel();
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
        txtIDproduto1 = new javax.swing.JTextField();
        lblIDProduto1 = new javax.swing.JLabel();

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
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pnlBotoesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEditarCliente, btnExcluirCliente, btnNovo});

        javax.swing.GroupLayout pnlTabelaLayout = new javax.swing.GroupLayout(pnlTabela);
        pnlTabela.setLayout(pnlTabelaLayout);
        pnlTabelaLayout.setHorizontalGroup(
            pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
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

        lblVlrUnitario1.setText("Valor Unitario:");

        txtVlrUnitario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVlrUnitario1ActionPerformed(evt);
            }
        });

        lblDscProduto1.setText("Descrição do Produto:");

        pnlTabela1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblProdutos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição do Produto", "Valor Unitario"
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
        jScrollPane2.setViewportView(tblProdutos1);
        if (tblProdutos1.getColumnModel().getColumnCount() > 0) {
            tblProdutos1.getColumnModel().getColumn(0).setMinWidth(120);
            tblProdutos1.getColumnModel().getColumn(0).setPreferredWidth(120);
            tblProdutos1.getColumnModel().getColumn(0).setMaxWidth(120);
            tblProdutos1.getColumnModel().getColumn(1).setMinWidth(120);
            tblProdutos1.getColumnModel().getColumn(1).setPreferredWidth(120);
            tblProdutos1.getColumnModel().getColumn(1).setMaxWidth(120);
            tblProdutos1.getColumnModel().getColumn(2).setMinWidth(300);
            tblProdutos1.getColumnModel().getColumn(2).setPreferredWidth(120);
            tblProdutos1.getColumnModel().getColumn(2).setMaxWidth(120);
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
                    .addGroup(pnlBotoes1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlBotoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExcluirProduto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarProduto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnNovoProduto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlBotoes1Layout.setVerticalGroup(
            pnlBotoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoes1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovoProduto1)
                .addGap(50, 50, 50)
                .addComponent(btnEditarProduto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnExcluirProduto1)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout pnlTabela1Layout = new javax.swing.GroupLayout(pnlTabela1);
        pnlTabela1.setLayout(pnlTabela1Layout);
        pnlTabela1Layout.setHorizontalGroup(
            pnlTabela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabela1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotoes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlTabela1Layout.setVerticalGroup(
            pnlTabela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabela1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTabela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBotoes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlTabela1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
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

        javax.swing.GroupLayout pnlFormulario1Layout = new javax.swing.GroupLayout(pnlFormulario1);
        pnlFormulario1.setLayout(pnlFormulario1Layout);
        pnlFormulario1Layout.setHorizontalGroup(
            pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTabela1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFormulario1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormulario1Layout.createSequentialGroup()
                        .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblVlrUnitario1)
                            .addComponent(lblDscProduto1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDscProduto1)
                            .addGroup(pnlFormulario1Layout.createSequentialGroup()
                                .addComponent(txtVlrUnitario1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(pnlBotoesFormulario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlFormulario1Layout.setVerticalGroup(
            pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDscProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDscProduto1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVlrUnitario1)
                    .addComponent(txtVlrUnitario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlBotoesFormulario1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTabela1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlAbaCadastroProduto1Layout = new javax.swing.GroupLayout(pnlAbaCadastroProduto1);
        pnlAbaCadastroProduto1.setLayout(pnlAbaCadastroProduto1Layout);
        pnlAbaCadastroProduto1Layout.setHorizontalGroup(
            pnlAbaCadastroProduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAbaCadastroProduto1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFormulario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAbaCadastroProduto1Layout.setVerticalGroup(
            pnlAbaCadastroProduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAbaCadastroProduto1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFormulario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblIDProduto1.setText("ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(lblIDProduto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIDproduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(469, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlAbaCadastroProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDproduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDProduto1))
                .addContainerGap(388, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlAbaCadastroProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Cadastrar Produto", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
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

    private void txtVlrUnitario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVlrUnitario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVlrUnitario1ActionPerformed

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

                txtIDproduto1.setText(tblProdutos1.getModel().getValueAt(tblProdutos1.getSelectedRow(), 0).toString());
                txtDscProduto1.setText(tblProdutos1.getModel().getValueAt(tblProdutos1.getSelectedRow(), 1).toString());
                txtVlrUnitario1.setText(tblProdutos1.getModel().getValueAt(tblProdutos1.getSelectedRow(), 2).toString());

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
            if (modoTela.equals("Criar")) {
                if (ProdutoController.Salvar(Integer.parseInt(txtIDproduto1.getText()), txtDscProduto1.getText(), Long.parseLong(txtVlrUnitario1.getText()))) {
                    this.LoadTable2();
                    JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!");
                    LimparFormulario2();
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao cadastrar produto!");
                }

            } else {

                if (ProdutoController.Atualizar(Integer.parseInt(txtIDproduto1.getText()), txtDscProduto1.getText(), Long.parseLong(txtVlrUnitario1.getText()))) {
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblDscProduto1;
    private javax.swing.JLabel lblIDCliente;
    private javax.swing.JLabel lblIDProduto1;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblValorUnitario;
    private javax.swing.JLabel lblVlrUnitario1;
    private javax.swing.JPanel pnlAbaCadastroCliente;
    private javax.swing.JPanel pnlAbaCadastroProduto1;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlBotoes1;
    private javax.swing.JPanel pnlBotoesFormulario;
    private javax.swing.JPanel pnlBotoesFormulario1;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlFormulario1;
    private javax.swing.JPanel pnlTabela;
    private javax.swing.JPanel pnlTabela1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblProdutos1;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtDscProduto1;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtIDproduto1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtVlrUnitario1;
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

        if (this.txtIDproduto1.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um ID ao produto!");
            return false;
        }

        if (this.txtDscProduto1.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina uma descrição ao produto!");
            return false;
        }

        if (this.txtVlrUnitario1.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um valor unitario ao produto!");
            return false;
        }

        return true;

    }
}
