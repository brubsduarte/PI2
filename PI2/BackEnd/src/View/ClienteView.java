package View;

import Controller.ClienteController;
import Controller.ProdutoController;
import Model.Cliente;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.ValidaCpf;

public class ClienteView extends javax.swing.JFrame {

    private String modoTela; //"Criar/Editar"
    ValidaCpf cpf = new ValidaCpf();
    
    

    public ClienteView() {
        initComponents();

        this.setLocationRelativeTo(null);
        DesabilitarFormulario();
        

    }

    public void LoadTable() {

        ArrayList<String[]> linhasClientes = ClienteController.getClientes();

        DefaultTableModel tmClientes = new DefaultTableModel();
        tmClientes.addColumn("ID");
        tmClientes.addColumn("Nome");
        tmClientes.addColumn("CPF");
        tmClientes.addColumn("RG");
        tmClientes.addColumn("Orgão Emissor");
        tmClientes.addColumn("UF");
        tmClientes.addColumn("Estado Civil");
        tmClientes.addColumn("Sexo");
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
        for (String[] c : linhasClientes) {
            tmClientes.addRow(c);
        }

        tblClientes.setModel(tmClientes);

        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblClientes.getColumnModel().getColumn(1).setPreferredWidth(250); //nome
        tblClientes.getColumnModel().getColumn(2).setPreferredWidth(150); //cpf
        tblClientes.getColumnModel().getColumn(3).setPreferredWidth(150); // rg
        tblClientes.getColumnModel().getColumn(4).setPreferredWidth(50);  // orgao
        tblClientes.getColumnModel().getColumn(5).setPreferredWidth(50); // uf
        tblClientes.getColumnModel().getColumn(6).setPreferredWidth(250); // estado civil
        tblClientes.getColumnModel().getColumn(7).setPreferredWidth(150); //sexo
        tblClientes.getColumnModel().getColumn(8).setPreferredWidth(250); //email
        tblClientes.getColumnModel().getColumn(9).setPreferredWidth(250); //telefone
        tblClientes.getColumnModel().getColumn(10).setPreferredWidth(250); //celular
        tblClientes.getColumnModel().getColumn(11).setPreferredWidth(250);// endereço
        tblClientes.getColumnModel().getColumn(12).setPreferredWidth(50); //numero
        tblClientes.getColumnModel().getColumn(13).setPreferredWidth(250); //complemento
        tblClientes.getColumnModel().getColumn(14).setPreferredWidth(150); // cep
        tblClientes.getColumnModel().getColumn(15).setPreferredWidth(250); //estado
        tblClientes.getColumnModel().getColumn(16).setPreferredWidth(250); //cidade
        tblClientes.getColumnModel().getColumn(17).setPreferredWidth(250); // bairro
    }
  

    public void LimparFormulario() {
        txtIDCliente.setText("");
        txtNome.setText("");
        txtCPF.setText("");
        txtRg.setText("");
        cboxOrgaoEmissor.setSelectedIndex(0);
        cboxUF.setSelectedIndex(0);
        cboxEstadoCivil.setSelectedIndex(0);
        //GrupoSexo
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
        // txtDataNascimento.setText("");

    }



    public void DesabilitarFormulario() {
        txtIDCliente.setEditable(false);
        txtNome.setEditable(false);
        txtCPF.setEditable(false);
        txtRg.setEditable(false);
        cboxOrgaoEmissor.setEditable(false);
        cboxUF.setEditable(false);
        cboxEstadoCivil.setEditable(false);
        //GrupoSexo
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

        btnSalvarCliente.setEnabled(false);
        btnCancelar.setEnabled(false);
    }



    public void HabilitarFormulario() {
        txtIDCliente.setEditable(true);
        txtNome.setEditable(true);
        txtCPF.setEditable(true);
        txtRg.setEditable(true);
        cboxOrgaoEmissor.setEditable(true);
        cboxUF.setEditable(true);
        cboxEstadoCivil.setEditable(true);
        //GrupoSexo
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

        btnSalvarCliente.setEnabled(true);
        btnCancelar.setEnabled(true);
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoSexo = new javax.swing.ButtonGroup();
        paneMainCliente = new javax.swing.JTabbedPane();
        pnlAbaCadastroCliente = new javax.swing.JPanel();
        pnlFormularioCliente = new javax.swing.JPanel();
        txtCPF = new javax.swing.JTextField();
        txtIDCliente = new javax.swing.JTextField();
        lblValorUnitario = new javax.swing.JLabel();
        lblNomeCliente = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblIDCliente = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        lblRg = new javax.swing.JLabel();
        cboxOrgaoEmissor = new javax.swing.JComboBox<>();
        lblOrgaoEmissor = new javax.swing.JLabel();
        cboxUF = new javax.swing.JComboBox<>();
        lblUF = new javax.swing.JLabel();
        lblEstadoCivil = new javax.swing.JLabel();
        cboxEstadoCivil = new javax.swing.JComboBox<>();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        lblDataDeNascimento = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        lblTelefone = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        txtEndereco = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtNumeroCasa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        lblComplemento = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboxEstado = new javax.swing.JComboBox<>();
        txtCidade = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        pnlBotoes = new javax.swing.JPanel();
        btnEditarCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnSalvarCliente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnFemin = new javax.swing.JRadioButton();
        btnOutros = new javax.swing.JRadioButton();
        btnMasc = new javax.swing.JRadioButton();
        lblSexo = new javax.swing.JLabel();

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

        lblRg.setText("R.G.:");

        cboxOrgaoEmissor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "SSP", "PC", "CREA", "IML", "MAE", "OAB", "OUTROS" }));

        lblOrgaoEmissor.setText("Orgão Emissor:");

        cboxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "UF", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cboxUF.setToolTipText("");

        lblUF.setText("UF:");

        lblEstadoCivil.setText("Estado Civil:");

        cboxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Solteiro", "Casado", "Viúvo", "Divorciado", "Separado" }));

        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblDataDeNascimento.setText("Data de Nasc.:");

        lblEmail.setText("E-mail:");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblTelefone.setText("Telefone:");

        lblCelular.setText("Celular:");

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblEndereco.setText("Endereço:");

        jLabel3.setText("Nº");

        lblComplemento.setText("Complemento:");

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("C.E.P.:");

        jLabel4.setText("Estado:");

        cboxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });

        lblCidade.setText("Cidade:");

        lblBairro.setText("Bairro:");

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pnlBotoesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEditarCliente, btnExcluirCliente, btnNovo});

        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnEditarCliente)
                .addGap(18, 18, 18)
                .addComponent(btnExcluirCliente)
                .addGap(31, 31, 31))
        );

        pnlBotoesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEditarCliente, btnExcluirCliente, btnNovo});

        btnSalvarCliente.setText("Salvar");
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalvarCliente)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarCliente)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        GrupoSexo.add(btnFemin);
        btnFemin.setText("Feminino");

        GrupoSexo.add(btnOutros);
        btnOutros.setText("Outros");

        GrupoSexo.add(btnMasc);
        btnMasc.setText("Masculino");

        lblSexo.setText("Sexo:");

        javax.swing.GroupLayout pnlFormularioClienteLayout = new javax.swing.GroupLayout(pnlFormularioCliente);
        pnlFormularioCliente.setLayout(pnlFormularioClienteLayout);
        pnlFormularioClienteLayout.setHorizontalGroup(
            pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblCelular))
                    .addComponent(txtCelular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                        .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNomeCliente)
                            .addComponent(lblValorUnitario)
                            .addComponent(lblIDCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                                .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                        .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEndereco)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComplemento)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                        .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                                .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEstadoCivil)
                                    .addComponent(cboxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDataDeNascimento)
                                    .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(lblSexo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnMasc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnFemin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnOutros))))
                            .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                                .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(cboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCidade)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(lblBairro))
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                                .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRg)
                                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboxOrgaoEmissor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                                        .addComponent(lblOrgaoEmissor)
                                        .addGap(56, 56, 56)
                                        .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cboxUF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblUF))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormularioClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlFormularioClienteLayout.setVerticalGroup(
            pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCliente)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorUnitario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                        .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                                .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblRg)
                                    .addComponent(lblOrgaoEmissor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblUF)
                                .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cboxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboxOrgaoEmissor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                                .addComponent(lblEstadoCivil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                                .addComponent(lblDataDeNascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblSexo)
                                        .addComponent(btnMasc)
                                        .addComponent(btnFemin)
                                        .addComponent(btnOutros)))))
                        .addGap(26, 26, 26)
                        .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                                .addComponent(lblEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormularioClienteLayout.createSequentialGroup()
                                .addComponent(lblTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                        .addComponent(lblCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                        .addComponent(lblEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                        .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblComplemento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormularioClienteLayout.createSequentialGroup()
                            .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(lblCidade))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlFormularioClienteLayout.createSequentialGroup()
                        .addComponent(lblBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlAbaCadastroClienteLayout = new javax.swing.GroupLayout(pnlAbaCadastroCliente);
        pnlAbaCadastroCliente.setLayout(pnlAbaCadastroClienteLayout);
        pnlAbaCadastroClienteLayout.setHorizontalGroup(
            pnlAbaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAbaCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFormularioCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAbaCadastroClienteLayout.setVerticalGroup(
            pnlAbaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAbaCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFormularioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        paneMainCliente.addTab("Cadastrar Cliente", pnlAbaCadastroCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneMainCliente)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneMainCliente)
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
            try {
                
                if (modoTela.equals("Criar")) {

                    if (ClienteController.Salvar(Integer.parseInt(txtIDCliente.getText()), txtNome.getText(), txtCPF.getText(), txtRg.getText(), cboxOrgaoEmissor.getSelectedItem().toString(), cboxUF.getSelectedItem().toString(), cboxEstadoCivil.getSelectedItem().toString(), GrupoSexo.getSelection().getActionCommand(), txtEmail.getText(), txtTelefone.getText(), txtCelular.getText(), txtEndereco.getText(), txtNumeroCasa.getText(), txtComplemento.getText(), txtCEP.getText(), cboxEstado.getSelectedItem().toString(), txtCidade.getText(), txtBairro.getText())) {
                        this.LoadTable();
                        JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
                        LimparFormulario();
                    } else {
                        JOptionPane.showMessageDialog(this, "Falha ao cadastrar cliente!");
                    }

                } else {

                    if (ClienteController.Atualizar(Integer.parseInt(txtIDCliente.getText()), txtNome.getText(), txtCPF.getText(), txtRg.getText(), cboxOrgaoEmissor.getSelectedItem().toString(), cboxUF.getSelectedItem().toString(), cboxEstadoCivil.getSelectedItem().toString(), GrupoSexo.getSelection().getActionCommand(), txtEmail.getText(), txtTelefone.getText(), txtCelular.getText(), txtEndereco.getText(), txtNumeroCasa.getText(), txtComplemento.getText(), txtCEP.getText(), cboxEstado.getSelectedItem().toString(), txtCidade.getText(), txtBairro.getText())) {
                        this.LoadTable();
                        JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Falha ao cadastrar cliente!");
                    }

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Falha ao cadastrar cliente");

            }

            LimparFormulario();
            DesabilitarFormulario();

        }

    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
        try {
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

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir o cliente!");

        }
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        try {
            if (tblClientes.getRowCount() > 0) {
                if (tblClientes.getSelectedRow() >= 0) {
                    HabilitarFormulario();
                    modoTela = "Editar";

                    txtIDCliente.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 0).toString());
                    txtNome.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 1).toString());
                    txtCPF.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 2).toString());
                    txtRg.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 3).toString());
                    //cboxOrgaoEmissor(4)
                    //cboxUF(5)
                    //cboxEstadoCivil(6)
                    //GrupoSexo(7)
                    txtEmail.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 8).toString());
                    txtTelefone.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 9).toString());
                    txtCelular.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 10).toString());
                    txtEndereco.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 11).toString());
                    txtNumeroCasa.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 12).toString());
                    txtComplemento.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 13).toString());
                    txtCEP.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 14).toString());
                    //cboxEstado(15)
                    txtCidade.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 16).toString());
                    txtBairro.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 17).toString());
                } else {
                    JOptionPane.showMessageDialog(this, "Selecione um cliente para editar!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Não há clientes para editar!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao Editar Cliente");

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

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

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
    private javax.swing.ButtonGroup GrupoSexo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JRadioButton btnFemin;
    private javax.swing.JRadioButton btnMasc;
    private javax.swing.JButton btnNovo;
    private javax.swing.JRadioButton btnOutros;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JComboBox<String> cboxEstado;
    private javax.swing.JComboBox<String> cboxEstadoCivil;
    private javax.swing.JComboBox<String> cboxOrgaoEmissor;
    private javax.swing.JComboBox<String> cboxUF;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblDataDeNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblIDCliente;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblOrgaoEmissor;
    private javax.swing.JLabel lblRg;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUF;
    private javax.swing.JLabel lblValorUnitario;
    private javax.swing.JTabbedPane paneMainCliente;
    private javax.swing.JPanel pnlAbaCadastroCliente;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlFormularioCliente;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumeroCasa;
    private javax.swing.JTextField txtRg;
    private javax.swing.JFormattedTextField txtTelefone;
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
            JOptionPane.showMessageDialog(this, "Defina um CPF para 0 cliente!");
            return false;
        }

        if (!cpf.ValidarCPF(txtCPF.getText())) {
            JOptionPane.showMessageDialog(this, "Cpf inválido!");
            return false;
        }

        for (Cliente c : ClienteController.getAll()) {
            if (this.txtCPF.getText().equals(c.getCPF())) {
                JOptionPane.showMessageDialog(this, "Cpf já cadastrado!");
                return false;
            }
        }
        if(this.txtRg.getText().equalsIgnoreCase("")){
           JOptionPane.showMessageDialog(this, "Defina um RG para o cliente!");
           return false;
        }


        return true;

    }


}
