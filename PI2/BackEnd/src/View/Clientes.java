/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ClienteController;
import Model.Cliente;
import Model.Util;
import java.awt.HeadlessException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.ValidaCpf;

public class Clientes extends javax.swing.JInternalFrame {

    private String modoTela; //"Criar/Editar"
    ValidaCpf cpf = new ValidaCpf();

    public Clientes() {
        initComponents();
        LoadTable();

        //this.setLocationRelativeTo(null);
        DesabilitarFormulario();
    }

    public void LoadTable() {

        ArrayList<String[]> linhasClientes = ClienteController.getClientes();

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
        for (String[] c : linhasClientes) {
            tmClientes.addRow(c);
        }

        tblPesquisaCliente3.setModel(tmClientes);

        tblPesquisaCliente3.getColumnModel().getColumn(0).setPreferredWidth(0); //ID;
        tblPesquisaCliente3.getColumnModel().getColumn(1).setPreferredWidth(250); //nome
        tblPesquisaCliente3.getColumnModel().getColumn(2).setPreferredWidth(150); //cpf

        tblPesquisaCliente3.getColumnModel().getColumn(3).setMinWidth(0);  //sexo
        tblPesquisaCliente3.getColumnModel().getColumn(3).setPreferredWidth(0); //sexo
        tblPesquisaCliente3.getColumnModel().getColumn(3).setMaxWidth(0); //sexo

        //tblPesquisaCliente3.getColumnModel().getColumn(3).setMinWidth(0); // rg
        tblPesquisaCliente3.getColumnModel().getColumn(4).setPreferredWidth(0); // rg
        //tblPesquisaCliente3.getColumnModel().getColumn(3).setMaxWidth(0); // rg

        tblPesquisaCliente3.getColumnModel().getColumn(5).setMinWidth(0);   // orgao
        tblPesquisaCliente3.getColumnModel().getColumn(5).setPreferredWidth(0);  // orgao
        tblPesquisaCliente3.getColumnModel().getColumn(5).setMaxWidth(0);   // orgao

        tblPesquisaCliente3.getColumnModel().getColumn(6).setMinWidth(0); // uf
        tblPesquisaCliente3.getColumnModel().getColumn(6).setPreferredWidth(0); // uf
        tblPesquisaCliente3.getColumnModel().getColumn(6).setMaxWidth(0);  // uf

        tblPesquisaCliente3.getColumnModel().getColumn(7).setMinWidth(0); // estado civil        
        tblPesquisaCliente3.getColumnModel().getColumn(7).setPreferredWidth(0); // estado civil        
        tblPesquisaCliente3.getColumnModel().getColumn(7).setMaxWidth(0); // estado civil 

        tblPesquisaCliente3.getColumnModel().getColumn(8).setMinWidth(0); //email
        tblPesquisaCliente3.getColumnModel().getColumn(8).setPreferredWidth(0); //email
        tblPesquisaCliente3.getColumnModel().getColumn(8).setMaxWidth(0); //email

        tblPesquisaCliente3.getColumnModel().getColumn(9).setMinWidth(0); //telefone
        tblPesquisaCliente3.getColumnModel().getColumn(9).setPreferredWidth(0); //telefone
        tblPesquisaCliente3.getColumnModel().getColumn(9).setMaxWidth(0); //telefone

        tblPesquisaCliente3.getColumnModel().getColumn(10).setMinWidth(0); //celular
        tblPesquisaCliente3.getColumnModel().getColumn(10).setPreferredWidth(0); //celular
        tblPesquisaCliente3.getColumnModel().getColumn(10).setMaxWidth(0);  //celular

        tblPesquisaCliente3.getColumnModel().getColumn(11).setMinWidth(0); // endereço
        tblPesquisaCliente3.getColumnModel().getColumn(11).setPreferredWidth(0);// endereço
        tblPesquisaCliente3.getColumnModel().getColumn(11).setMaxWidth(0);// endereço

        tblPesquisaCliente3.getColumnModel().getColumn(12).setMinWidth(0);  //numero
        tblPesquisaCliente3.getColumnModel().getColumn(12).setPreferredWidth(0); //numero
        tblPesquisaCliente3.getColumnModel().getColumn(12).setMaxWidth(0); //numero

        tblPesquisaCliente3.getColumnModel().getColumn(13).setMinWidth(0);  //complemento
        tblPesquisaCliente3.getColumnModel().getColumn(13).setPreferredWidth(0); //complemento
        tblPesquisaCliente3.getColumnModel().getColumn(13).setMaxWidth(0); //complemento

        tblPesquisaCliente3.getColumnModel().getColumn(14).setMinWidth(0); // cep
        tblPesquisaCliente3.getColumnModel().getColumn(14).setPreferredWidth(0); // cep
        tblPesquisaCliente3.getColumnModel().getColumn(14).setMaxWidth(0); // cep

        tblPesquisaCliente3.getColumnModel().getColumn(15).setMinWidth(0); //estado
        tblPesquisaCliente3.getColumnModel().getColumn(15).setPreferredWidth(0); //estado
        tblPesquisaCliente3.getColumnModel().getColumn(15).setMaxWidth(0); //estado

        tblPesquisaCliente3.getColumnModel().getColumn(16).setMinWidth(0); //cidade
        tblPesquisaCliente3.getColumnModel().getColumn(16).setPreferredWidth(0); //cidade
        tblPesquisaCliente3.getColumnModel().getColumn(16).setMaxWidth(0); //cidade

        tblPesquisaCliente3.getColumnModel().getColumn(17).setMinWidth(0); // bairro
        tblPesquisaCliente3.getColumnModel().getColumn(17).setPreferredWidth(0); // bairro
        tblPesquisaCliente3.getColumnModel().getColumn(17).setMaxWidth(0); // bairro

        //tblPesquisaCliente3.getColumnModel().getColumn(18).setMinWidth(0);// data de nascimento
        tblPesquisaCliente3.getColumnModel().getColumn(18).setPreferredWidth(0);// data de nascimento
        //tblPesquisaCliente3.getColumnModel().getColumn(18).setMaxWidth(0);// data de nascimento

        this.pack();
    }

    public void LoadTableWithFilters(int id, String nome, String cpf, String rg) {

        ArrayList<String[]> linhasClientes = ClienteController.getClientesFiltro(id, nome, cpf, rg);

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

        for (String[] c : linhasClientes) {
            tmClientes.addRow(c);
        }

        tblPesquisaCliente3.setModel(tmClientes);

        tblPesquisaCliente3.getColumnModel().getColumn(0).setPreferredWidth(0); //ID;
        tblPesquisaCliente3.getColumnModel().getColumn(1).setPreferredWidth(250); //nome
        tblPesquisaCliente3.getColumnModel().getColumn(2).setPreferredWidth(150); //cpf

        tblPesquisaCliente3.getColumnModel().getColumn(3).setMinWidth(0);  //sexo
        tblPesquisaCliente3.getColumnModel().getColumn(3).setPreferredWidth(0); //sexo
        tblPesquisaCliente3.getColumnModel().getColumn(3).setMaxWidth(0); //sexo

        //tblPesquisaCliente3.getColumnModel().getColumn(3).setMinWidth(0); // rg
        tblPesquisaCliente3.getColumnModel().getColumn(4).setPreferredWidth(0); // rg
        //tblPesquisaCliente3.getColumnModel().getColumn(3).setMaxWidth(0); // rg

        tblPesquisaCliente3.getColumnModel().getColumn(5).setMinWidth(0);   // orgao
        tblPesquisaCliente3.getColumnModel().getColumn(5).setPreferredWidth(0);  // orgao
        tblPesquisaCliente3.getColumnModel().getColumn(5).setMaxWidth(0);   // orgao

        tblPesquisaCliente3.getColumnModel().getColumn(6).setMinWidth(0); // uf
        tblPesquisaCliente3.getColumnModel().getColumn(6).setPreferredWidth(0); // uf
        tblPesquisaCliente3.getColumnModel().getColumn(6).setMaxWidth(0);  // uf

        tblPesquisaCliente3.getColumnModel().getColumn(7).setMinWidth(0); // estado civil        
        tblPesquisaCliente3.getColumnModel().getColumn(7).setPreferredWidth(0); // estado civil        
        tblPesquisaCliente3.getColumnModel().getColumn(7).setMaxWidth(0); // estado civil 

        tblPesquisaCliente3.getColumnModel().getColumn(8).setMinWidth(0); //email
        tblPesquisaCliente3.getColumnModel().getColumn(8).setPreferredWidth(0); //email
        tblPesquisaCliente3.getColumnModel().getColumn(8).setMaxWidth(0); //email

        tblPesquisaCliente3.getColumnModel().getColumn(9).setMinWidth(0); //telefone
        tblPesquisaCliente3.getColumnModel().getColumn(9).setPreferredWidth(0); //telefone
        tblPesquisaCliente3.getColumnModel().getColumn(9).setMaxWidth(0); //telefone

        tblPesquisaCliente3.getColumnModel().getColumn(10).setMinWidth(0); //celular
        tblPesquisaCliente3.getColumnModel().getColumn(10).setPreferredWidth(0); //celular
        tblPesquisaCliente3.getColumnModel().getColumn(10).setMaxWidth(0);  //celular

        tblPesquisaCliente3.getColumnModel().getColumn(11).setMinWidth(0); // endereço
        tblPesquisaCliente3.getColumnModel().getColumn(11).setPreferredWidth(0);// endereço
        tblPesquisaCliente3.getColumnModel().getColumn(11).setMaxWidth(0);// endereço

        tblPesquisaCliente3.getColumnModel().getColumn(12).setMinWidth(0);  //numero
        tblPesquisaCliente3.getColumnModel().getColumn(12).setPreferredWidth(0); //numero
        tblPesquisaCliente3.getColumnModel().getColumn(12).setMaxWidth(0); //numero

        tblPesquisaCliente3.getColumnModel().getColumn(13).setMinWidth(0);  //complemento
        tblPesquisaCliente3.getColumnModel().getColumn(13).setPreferredWidth(0); //complemento
        tblPesquisaCliente3.getColumnModel().getColumn(13).setMaxWidth(0); //complemento

        tblPesquisaCliente3.getColumnModel().getColumn(14).setMinWidth(0); // cep
        tblPesquisaCliente3.getColumnModel().getColumn(14).setPreferredWidth(0); // cep
        tblPesquisaCliente3.getColumnModel().getColumn(14).setMaxWidth(0); // cep

        tblPesquisaCliente3.getColumnModel().getColumn(15).setMinWidth(0); //estado
        tblPesquisaCliente3.getColumnModel().getColumn(15).setPreferredWidth(0); //estado
        tblPesquisaCliente3.getColumnModel().getColumn(15).setMaxWidth(0); //estado

        tblPesquisaCliente3.getColumnModel().getColumn(16).setMinWidth(0); //cidade
        tblPesquisaCliente3.getColumnModel().getColumn(16).setPreferredWidth(0); //cidade
        tblPesquisaCliente3.getColumnModel().getColumn(16).setMaxWidth(0); //cidade

        tblPesquisaCliente3.getColumnModel().getColumn(17).setMinWidth(0); // bairro
        tblPesquisaCliente3.getColumnModel().getColumn(17).setPreferredWidth(0); // bairro
        tblPesquisaCliente3.getColumnModel().getColumn(17).setMaxWidth(0); // bairro

        //tblPesquisaCliente3.getColumnModel().getColumn(18).setMinWidth(0);// data de nascimento
        tblPesquisaCliente3.getColumnModel().getColumn(18).setPreferredWidth(0);// data de nascimento
        //tblPesquisaCliente3.getColumnModel().getColumn(18).setMaxWidth(0);// data de nascimento

        this.pack();
    }

    public void LimparFormulario() {
        txtIDCliente.setText("");
        txtNome.setText("");
        txtCPF.setText("");
        txtRg.setText("");
        cboxOrgaoEmissor.setSelectedIndex(0);
        cboxUF.setSelectedIndex(0);
        cboxEstadoCivil.setSelectedIndex(0);
        cboxSexo.setSelectedIndex(0);
        txtEmail.setText("");
        txtTelefone.setText("");
        txtCelular.setText("");
        txtEndereco.setText("");
        txtNumeroCasa.setText("");
        txtComplemento.setText("");
        txtCEP.setText("");
        cboxEstado.setSelectedIndex(0);
        txtCidade.setText("");
        txtBairro.setText("");
        txtDataNascimento.setText("");
    }

    public void DesabilitarFormulario() {
        txtNome.setEditable(false);
        txtCPF.setEditable(false);
        txtRg.setEditable(false);
        cboxOrgaoEmissor.setEditable(false);
        cboxUF.setEditable(false);
        cboxEstadoCivil.setEditable(false);
        cboxSexo.setEditable(false);
        txtEmail.setEditable(false);
        txtTelefone.setEditable(false);
        txtCelular.setEditable(false);
        txtEndereco.setEditable(false);
        txtNumeroCasa.setEditable(false);
        txtComplemento.setEditable(false);
        txtCEP.setEditable(false);
        cboxEstado.setEditable(false);
        txtCidade.setEditable(false);
        txtBairro.setEditable(false);
        txtDataNascimento.setEditable(false);

        btnSalvarCliente.setEnabled(false);
        btnCancelar2.setEnabled(false);
    }

    public void HabilitarFormulario() {
        txtNome.setEditable(true);
        txtCPF.setEditable(true);
        txtRg.setEditable(true);
        cboxOrgaoEmissor.setEditable(true);
        cboxUF.setEditable(true);
        cboxEstadoCivil.setEditable(true);
        cboxSexo.setEditable(true);
        txtEmail.setEditable(true);
        txtTelefone.setEditable(true);
        txtCelular.setEditable(true);
        txtEndereco.setEditable(true);
        txtNumeroCasa.setEditable(true);
        txtComplemento.setEditable(true);
        txtCEP.setEditable(true);
        cboxEstado.setEditable(true);
        txtCidade.setEditable(true);
        txtBairro.setEditable(true);
        txtDataNascimento.setEditable(true);

        btnSalvarCliente.setEnabled(true);
        btnCancelar2.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        PainePrincipal3 = new javax.swing.JPanel();
        lblPesquisaID3 = new javax.swing.JLabel();
        lblPesquisaCPF3 = new javax.swing.JLabel();
        lblPesquisaNome3 = new javax.swing.JLabel();
        lblPesquisaRG3 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPesquisaCliente3 = new javax.swing.JTable();
        btnExcluir1 = new javax.swing.JButton();
        txtPesquisaId = new javax.swing.JTextField();
        txtPesquisaNome = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        txtPesquisaCpf = new javax.swing.JFormattedTextField();
        txtPesquisaRg = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtIDCliente = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        txtRg = new javax.swing.JFormattedTextField();
        lblNotNullNome1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboxUF = new javax.swing.JComboBox<>();
        lblSexo = new javax.swing.JLabel();
        lblUF = new javax.swing.JLabel();
        cboxOrgaoEmissor = new javax.swing.JComboBox<>();
        lblOrgaoEmissor = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        lblDataDeNascimento = new javax.swing.JLabel();
        lblEstadoCivil = new javax.swing.JLabel();
        cboxEstadoCivil = new javax.swing.JComboBox<>();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        lblCelular = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtNumeroCasa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboxEstado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        lblComplemento = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblNotNullNome2 = new javax.swing.JLabel();
        lblNotNullNome3 = new javax.swing.JLabel();
        lblNotNullNome4 = new javax.swing.JLabel();
        btnSalvarCliente = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        lblNotNullNome12 = new javax.swing.JLabel();
        lblNotNullNome14 = new javax.swing.JLabel();
        lblNotNullNome15 = new javax.swing.JLabel();
        lblNotNullNome16 = new javax.swing.JLabel();
        cboxSexo = new javax.swing.JComboBox<>();
        btnCancelar2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        lblNotNullNome9 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/user.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Clientes"));

        lblPesquisaID3.setText("ID:");

        lblPesquisaCPF3.setText("C.P.F.:");

        lblPesquisaNome3.setText("Nome:");

        lblPesquisaRG3.setText("R.G.:");

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/search-32.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/Edit-32x32.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        tblPesquisaCliente3.setAutoCreateRowSorter(true);
        tblPesquisaCliente3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "RG", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tblPesquisaCliente3.setFocusable(false);
        tblPesquisaCliente3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(tblPesquisaCliente3);

        btnExcluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/button_cancel-32.png"))); // NOI18N
        btnExcluir1.setText("Excluir");
        btnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir1ActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        try {
            txtPesquisaCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtPesquisaRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout PainePrincipal3Layout = new javax.swing.GroupLayout(PainePrincipal3);
        PainePrincipal3.setLayout(PainePrincipal3Layout);
        PainePrincipal3Layout.setHorizontalGroup(
            PainePrincipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainePrincipal3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PainePrincipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPesquisaNome)
                    .addComponent(lblPesquisaNome3)
                    .addGroup(PainePrincipal3Layout.createSequentialGroup()
                        .addGroup(PainePrincipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPesquisaID3)
                            .addComponent(txtPesquisaId, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PainePrincipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainePrincipal3Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lblPesquisaCPF3))
                            .addGroup(PainePrincipal3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtPesquisaCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(PainePrincipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPesquisaRG3)
                            .addComponent(txtPesquisaRg, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainePrincipal3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainePrincipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                    .addGroup(PainePrincipal3Layout.createSequentialGroup()
                        .addComponent(btnExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        PainePrincipal3Layout.setVerticalGroup(
            PainePrincipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainePrincipal3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PainePrincipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisaID3)
                    .addComponent(lblPesquisaCPF3)
                    .addComponent(lblPesquisaRG3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainePrincipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisaCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisaRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(lblPesquisaNome3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainePrincipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(PainePrincipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir1))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainePrincipal3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainePrincipal3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Pesquisa", jPanel2);

        lblNome.setText("Nome:");

        txtIDCliente.setEditable(false);

        lblCPF.setText("C.P.F.:");

        try {
            txtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblNotNullNome1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNotNullNome1.setForeground(new java.awt.Color(255, 0, 0));
        lblNotNullNome1.setText("*");

        jLabel2.setText("R.G.:");

        cboxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "UF", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cboxUF.setToolTipText("");

        lblSexo.setText("Sexo:");

        lblUF.setText("UF:");

        cboxOrgaoEmissor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "SSP", "PC", "CREA", "IML", "MAE", "OAB", "OUTROS" }));

        lblOrgaoEmissor.setText("Orgão Emissor:");

        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblDataDeNascimento.setText("Data de Nasc.:");

        lblEstadoCivil.setText("Estado Civil:");

        cboxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Solteiro", "Casado", "Viúvo", "Divorciado", "Separado" }));

        lblEmail.setText("E-mail:");

        lblTelefone.setText("Telefone:");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblCelular.setText("Celular:");

        lblEndereco.setText("Endereço:");

        jLabel3.setText("Nº");

        cboxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel4.setText("Estado:");

        jLabel5.setText("C.E.P.:");

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblComplemento.setText("Complemento:");

        lblCidade.setText("Cidade:");

        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });

        lblBairro.setText("Bairro:");

        lblNotNullNome2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNotNullNome2.setForeground(new java.awt.Color(255, 0, 0));
        lblNotNullNome2.setText("*");

        lblNotNullNome3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNotNullNome3.setForeground(new java.awt.Color(255, 0, 0));
        lblNotNullNome3.setText("*");

        lblNotNullNome4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNotNullNome4.setForeground(new java.awt.Color(255, 0, 0));
        lblNotNullNome4.setText("*");

        btnSalvarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/filesave-32.png"))); // NOI18N
        btnSalvarCliente.setText("Salvar");
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/edit_add-32.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        lblNotNullNome12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNotNullNome12.setForeground(new java.awt.Color(255, 0, 0));
        lblNotNullNome12.setText("*");

        lblNotNullNome14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNotNullNome14.setForeground(new java.awt.Color(255, 0, 0));
        lblNotNullNome14.setText("*");

        lblNotNullNome15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNotNullNome15.setForeground(new java.awt.Color(255, 0, 0));
        lblNotNullNome15.setText("*");

        lblNotNullNome16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNotNullNome16.setForeground(new java.awt.Color(255, 0, 0));
        lblNotNullNome16.setText("*");

        cboxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino", "Outros" }));

        btnCancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/cnrdelete-all-32.png"))); // NOI18N
        btnCancelar2.setText("Cancelar");
        btnCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar2ActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblNotNullNome9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNotNullNome9.setForeground(new java.awt.Color(255, 0, 0));
        lblNotNullNome9.setText("*");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEndereco)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComplemento)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNotNullNome9)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCPF)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNotNullNome1)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(cboxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNotNullNome4))
                            .addComponent(lblSexo))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelefone)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(91, 91, 91)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNotNullNome12))
                                    .addComponent(lblCelular)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEstadoCivil)
                                    .addComponent(cboxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmail)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNotNullNome2))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(lblNotNullNome15)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboxOrgaoEmissor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNotNullNome14))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(153, 153, 153)
                                        .addComponent(lblOrgaoEmissor)))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(cboxUF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNotNullNome16))
                                    .addComponent(lblUF))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDataDeNascimento)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNotNullNome3))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(btnCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSalvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addGap(26, 26, 26)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCidade)
                                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(29, 29, 29)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(lblBairro))
                                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar2, btnSalvarCliente});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNotNullNome4)
                            .addComponent(cboxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNotNullNome1)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(lblCPF)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(lblNome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNotNullNome9)))))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(lblOrgaoEmissor))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cboxOrgaoEmissor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNotNullNome15)
                                .addComponent(lblNotNullNome14)
                                .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(lblUF)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cboxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNotNullNome16))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblDataDeNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNotNullNome3))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblEstadoCivil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNotNullNome2))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(lblCelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNotNullNome12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblComplemento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(lblCidade))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvarCliente)
                        .addComponent(btnNovo)))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelar2, btnNovo, btnSalvarCliente});

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cliente", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
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
    }// </editor-fold>//GEN-END:initComponents

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed
        if (ValidarFormulario()) {

            try {

                if (modoTela.equals("Criar")) {

                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    df.setLenient(false);
                    Date dt = df.parse(txtDataNascimento.getText());

                    if (ClienteController.Salvar(Integer.parseInt(txtIDCliente.getText()),
                            txtNome.getText(),
                            Util.limpaFormatacao(txtCPF.getText()),
                            cboxSexo.getSelectedItem().toString(),
                            Util.limpaFormatacao(txtRg.getText()),
                            cboxOrgaoEmissor.getSelectedItem().toString(),
                            cboxUF.getSelectedItem().toString(),
                            cboxEstadoCivil.getSelectedItem().toString(),
                            txtEmail.getText(),
                            Util.limpaFormatacao(txtTelefone.getText()),
                            Util.limpaFormatacao(txtCelular.getText()),
                            txtEndereco.getText(),
                            txtNumeroCasa.getText(),
                            txtComplemento.getText(),
                            Util.limpaFormatacao(txtCEP.getText()),
                            cboxEstado.getSelectedItem().toString(),
                            txtCidade.getText(),
                            txtBairro.getText(),
                            dt)) {

                        this.LoadTable();
                        LimparFormulario();
                        DesabilitarFormulario();
                        JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Falha ao cadastrar cliente!");
                    }

                } else {

                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    df.setLenient(false);
                    Date dt = df.parse(txtDataNascimento.getText());

                    if (ClienteController.Atualizar(
                            Integer.parseInt(txtIDCliente.getText()),
                            txtNome.getText(),
                            Util.limpaFormatacao(txtCPF.getText()),
                            cboxSexo.getSelectedItem().toString(),
                            Util.limpaFormatacao(txtRg.getText()),
                            cboxOrgaoEmissor.getSelectedItem().toString(),
                            cboxUF.getSelectedItem().toString(),
                            cboxEstadoCivil.getSelectedItem().toString(),
                            txtEmail.getText(),
                            Util.limpaFormatacao(txtTelefone.getText()),
                            Util.limpaFormatacao(txtCelular.getText()),
                            txtEndereco.getText(),
                            txtNumeroCasa.getText(),
                            txtComplemento.getText(),
                            Util.limpaFormatacao(txtCEP.getText()),
                            cboxEstado.getSelectedItem().toString(),
                            txtCidade.getText(),
                            txtBairro.getText(),
                            dt)) {

                        LimparFormulario();
                        DesabilitarFormulario();
                        this.LoadTable();
                        JOptionPane.showMessageDialog(this, "Cliente atualizado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Falha ao atualizar cliente!");
                    }

                }

            } catch (HeadlessException | NumberFormatException | ParseException e) {
                JOptionPane.showMessageDialog(null, "Falha ao cadastrar ou alterar cliente!");
            }
        }

    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        modoTela = "Criar";
        HabilitarFormulario();
        LimparFormulario();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar2ActionPerformed
        DesabilitarFormulario();
        LimparFormulario();
    }//GEN-LAST:event_btnCancelar2ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            if (tblPesquisaCliente3.getRowCount() > 0) {
                if (tblPesquisaCliente3.getSelectedRow() >= 0) {
                    HabilitarFormulario();
                    modoTela = "Editar";

                    txtIDCliente.setText(tblPesquisaCliente3.getModel().getValueAt(tblPesquisaCliente3.getSelectedRow(), 0).toString());
                    txtNome.setText(tblPesquisaCliente3.getModel().getValueAt(tblPesquisaCliente3.getSelectedRow(), 1).toString());
                    txtCPF.setText(tblPesquisaCliente3.getModel().getValueAt(tblPesquisaCliente3.getSelectedRow(), 2).toString());
                    cboxSexo.setSelectedItem(tblPesquisaCliente3.getModel().getValueAt(tblPesquisaCliente3.getSelectedRow(), 3).toString());
                    txtRg.setText(tblPesquisaCliente3.getModel().getValueAt(tblPesquisaCliente3.getSelectedRow(), 4).toString());
                    cboxOrgaoEmissor.setSelectedItem(tblPesquisaCliente3.getModel().getValueAt(tblPesquisaCliente3.getSelectedRow(), 5).toString());
                    cboxUF.setSelectedItem(tblPesquisaCliente3.getModel().getValueAt(tblPesquisaCliente3.getSelectedRow(), 6).toString());
                    cboxEstadoCivil.setSelectedItem(tblPesquisaCliente3.getModel().getValueAt(tblPesquisaCliente3.getSelectedRow(), 7).toString());
                    txtEmail.setText(tblPesquisaCliente3.getModel().getValueAt(tblPesquisaCliente3.getSelectedRow(), 8).toString());
                    txtTelefone.setText(tblPesquisaCliente3.getModel().getValueAt(tblPesquisaCliente3.getSelectedRow(), 9).toString());
                    txtCelular.setText(tblPesquisaCliente3.getModel().getValueAt(tblPesquisaCliente3.getSelectedRow(), 10).toString());
                    txtEndereco.setText(tblPesquisaCliente3.getModel().getValueAt(tblPesquisaCliente3.getSelectedRow(), 11).toString());
                    txtNumeroCasa.setText(tblPesquisaCliente3.getModel().getValueAt(tblPesquisaCliente3.getSelectedRow(), 12).toString());
                    txtComplemento.setText(tblPesquisaCliente3.getModel().getValueAt(tblPesquisaCliente3.getSelectedRow(), 13).toString());
                    txtCEP.setText(tblPesquisaCliente3.getModel().getValueAt(tblPesquisaCliente3.getSelectedRow(), 14).toString());
                    cboxEstado.setSelectedItem(tblPesquisaCliente3.getModel().getValueAt(tblPesquisaCliente3.getSelectedRow(), 15).toString());
                    txtCidade.setText(tblPesquisaCliente3.getModel().getValueAt(tblPesquisaCliente3.getSelectedRow(), 16).toString());
                    txtBairro.setText(tblPesquisaCliente3.getModel().getValueAt(tblPesquisaCliente3.getSelectedRow(), 17).toString());
                    txtDataNascimento.setText(tblPesquisaCliente3.getModel().getValueAt(tblPesquisaCliente3.getSelectedRow(), 18).toString());
                    jTabbedPane1.setSelectedIndex(1);
                } else {
                    JOptionPane.showMessageDialog(this, "Selecione um cliente para editar!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Não há clientes para editar!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao Editar Cliente");

        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        int id;
        if (txtPesquisaId.getText().equals("")) {
            id = 0;
        } else {
            id = Integer.parseInt(txtPesquisaId.getText());
        }

        if (tblPesquisaCliente3.getRowCount() > 0) {
            LoadTableWithFilters(id, txtPesquisaNome.getText(), txtPesquisaCpf.getText(), txtPesquisaRg.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Não é possível pesquisar com a tabela vazia!");
        }

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir1ActionPerformed
        try {
            if (tblPesquisaCliente3.getRowCount() > 0) {
                int clienteID = Integer.parseInt(tblPesquisaCliente3.getModel().getValueAt(tblPesquisaCliente3.getSelectedRow(), 0).toString());
                if (ClienteController.Excluir(clienteID)) {
                    this.LoadTable();
                    JOptionPane.showMessageDialog(this, "Cliente excluído da base de dados");
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao excluir o cliente!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Não há clientes para excluir!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir o cliente!");

        }
    }//GEN-LAST:event_btnExcluir1ActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtPesquisaCpf.setText("");
        txtPesquisaId.setText("");
        txtPesquisaNome.setText("");
        txtPesquisaRg.setText("");
        LoadTable();
    }//GEN-LAST:event_btnLimparActionPerformed
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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainePrincipal3;
    private javax.swing.JButton btnCancelar2;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir1;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JComboBox<String> cboxEstado;
    private javax.swing.JComboBox<String> cboxEstadoCivil;
    private javax.swing.JComboBox<String> cboxOrgaoEmissor;
    private javax.swing.JComboBox<String> cboxSexo;
    private javax.swing.JComboBox<String> cboxUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblDataDeNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNotNullNome1;
    private javax.swing.JLabel lblNotNullNome12;
    private javax.swing.JLabel lblNotNullNome14;
    private javax.swing.JLabel lblNotNullNome15;
    private javax.swing.JLabel lblNotNullNome16;
    private javax.swing.JLabel lblNotNullNome2;
    private javax.swing.JLabel lblNotNullNome3;
    private javax.swing.JLabel lblNotNullNome4;
    private javax.swing.JLabel lblNotNullNome9;
    private javax.swing.JLabel lblOrgaoEmissor;
    private javax.swing.JLabel lblPesquisaCPF3;
    private javax.swing.JLabel lblPesquisaID3;
    private javax.swing.JLabel lblPesquisaNome3;
    private javax.swing.JLabel lblPesquisaRG3;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUF;
    private javax.swing.JTable tblPesquisaCliente3;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumeroCasa;
    private javax.swing.JFormattedTextField txtPesquisaCpf;
    private javax.swing.JTextField txtPesquisaId;
    private javax.swing.JTextField txtPesquisaNome;
    private javax.swing.JFormattedTextField txtPesquisaRg;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private boolean ValidarFormularioCPF() {
        for (Cliente c : ClienteController.getAll()) {
            if (this.txtRg.getText().equals(c.getCPF())) {
                JOptionPane.showMessageDialog(this, "Cpf já cadastrado!");
                return false;
            }
        }
        return true;
    }

    private boolean ValidarFormulario() {
        
        if (this.txtNome.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um nome para o cliente!");
            return false;
        }

        if (this.txtRg.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para 0 cliente!");
            return false;
        }

        if (this.txtRg.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um RG para o cliente!");
            return false;
        }

        return true;

    }

}
