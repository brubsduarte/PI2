/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ProdutoController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.table.DefaultTableModel;
import utils.Validador;
import static utils.Validador.limparMensagesErro;


public class Produtos extends javax.swing.JInternalFrame {

    private String modoTela; //"Criar/Editar"

    public Produtos() {
        initComponents();

        DesabilitarFormulario2();
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

        tblPesquisaProduto.setModel(tmProdutos);

        tblPesquisaProduto.getColumnModel().getColumn(0).setMinWidth(0); //ID
        tblPesquisaProduto.getColumnModel().getColumn(0).setPreferredWidth(0); //ID
        tblPesquisaProduto.getColumnModel().getColumn(0).setMaxWidth(0);//ID

        tblPesquisaProduto.getColumnModel().getColumn(1).setPreferredWidth(250);//Titulo

        tblPesquisaProduto.getColumnModel().getColumn(2).setMinWidth(0); //Genero
        tblPesquisaProduto.getColumnModel().getColumn(2).setPreferredWidth(0); //Genero
        tblPesquisaProduto.getColumnModel().getColumn(2).setMaxWidth(0); //Genero

        tblPesquisaProduto.getColumnModel().getColumn(3).setMinWidth(0); // Editora
        tblPesquisaProduto.getColumnModel().getColumn(3).setPreferredWidth(0); // Editora
        tblPesquisaProduto.getColumnModel().getColumn(3).setMaxWidth(0); // Editora

        tblPesquisaProduto.getColumnModel().getColumn(4).setMinWidth(0);   // Autor
        tblPesquisaProduto.getColumnModel().getColumn(4).setPreferredWidth(0);  // Autor
        tblPesquisaProduto.getColumnModel().getColumn(4).setMaxWidth(0);   // Autor

        tblPesquisaProduto.getColumnModel().getColumn(5).setMinWidth(0); // Tipo
        tblPesquisaProduto.getColumnModel().getColumn(5).setPreferredWidth(0); // Tipo
        tblPesquisaProduto.getColumnModel().getColumn(5).setMaxWidth(0);  // Tipo

        tblPesquisaProduto.getColumnModel().getColumn(6).setMinWidth(0); // Descrição       
        tblPesquisaProduto.getColumnModel().getColumn(6).setPreferredWidth(0); // Descrição    
        tblPesquisaProduto.getColumnModel().getColumn(6).setMaxWidth(0); // Descrição

        tblPesquisaProduto.getColumnModel().getColumn(7).setPreferredWidth(150); //Quantidade     

        tblPesquisaProduto.getColumnModel().getColumn(8).setPreferredWidth(150); //Valor Unitario
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

    public void DesabilitarFormulario2() {

        txtIDproduto.setEditable(false);
        txtTituloProduto.setEditable(false);
        cboGeneroProduto.setEditable(false);
        cboEditoraProduto.setEditable(false);
        txtAutorProduto.setEditable(false);
        cboTipoProduto.setEditable(false);
        txtDescricaoProduto.setEditable(false);
        ((JSpinner.DefaultEditor) spnQuantidadeProduto.getEditor()).getTextField().setEditable(false);
        txtVlrUnitario.setEditable(false);

        btnSalvarProduto1.setEnabled(false);
        btnCancelar1.setEnabled(false);
    }

    public void HabilitarFormulario2() {

        txtIDproduto.setEditable(true);
        txtTituloProduto.setEditable(true);
        cboGeneroProduto.setEditable(true);
        cboEditoraProduto.setEditable(true);
        txtAutorProduto.setEditable(true);
        cboTipoProduto.setEditable(true);
        txtDescricaoProduto.setEditable(true);
        ((JSpinner.DefaultEditor) spnQuantidadeProduto.getEditor()).getTextField().setEditable(true);
        txtVlrUnitario.setEditable(true);

        btnSalvarProduto1.setEnabled(true);
        btnCancelar1.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtNomePesquisa = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblEditora1 = new javax.swing.JLabel();
        txtAutorPesquisa = new javax.swing.JTextField();
        lblAutor1 = new javax.swing.JLabel();
        lblGenero1 = new javax.swing.JLabel();
        cboGeneroPesquisa = new javax.swing.JComboBox<>();
        txtIDPesquisa = new javax.swing.JFormattedTextField();
        lblID = new javax.swing.JLabel();
        cboEditoraPesquisa = new javax.swing.JComboBox<>();
        jtPesqProdutos = new javax.swing.JScrollPane();
        tblPesquisaProduto = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        btnPesquisar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluirProduto2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricaoProduto = new javax.swing.JTextArea();
        lblTitulo = new javax.swing.JLabel();
        txtTituloProduto = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        txtAutorProduto = new javax.swing.JTextField();
        lblEditora = new javax.swing.JLabel();
        cboEditoraProduto = new javax.swing.JComboBox<>();
        lblAutor = new javax.swing.JLabel();
        cboGeneroProduto = new javax.swing.JComboBox<>();
        cboTipoProduto = new javax.swing.JComboBox<>();
        lblTipo = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        spnQuantidadeProduto = new javax.swing.JSpinner();
        lblValorUnitario = new javax.swing.JLabel();
        btnCancelar1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblAviso = new javax.swing.JLabel();
        txtVlrUnitario = new javax.swing.JTextField();
        painelFoto8 = new javax.swing.JPanel();
        lblFoto8 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        btoAddFoto8 = new javax.swing.JButton();
        btnSalvarProduto1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtIDproduto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lblMensagensErro = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/barcode-32.png"))); // NOI18N

        jTabbedPane2.setToolTipText("");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa de Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblNome.setText("Nome:");

        lblEditora1.setText("Editora:");

        lblAutor1.setText("Autor:");

        lblGenero1.setText("Gênero:");

        cboGeneroPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Fantasia", "Ficção Científica", "Horror", "Autobiografia", "Biografia", "Apocalipse Zumbi", "Romance", "Infanto-Juvenil", "Suspense", "Literatura", "Aventura" }));

        try {
            txtIDPesquisa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblID.setText("ID:");

        cboEditoraPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Arqueiro", "Globo", "Rocco", "Ética", "Abril", "Intrínseca", "Sextante", "Senac", "Saraiva", "Record", "Conrad", "Newpop", "JBC", "Panini", "Draco", "LeYa", "Gutenberg" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID)
                            .addComponent(txtIDPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAutor1)
                            .addComponent(txtAutorPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboGeneroPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGenero1))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEditora1)
                            .addComponent(cboEditoraPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor1)
                    .addComponent(lblGenero1)
                    .addComponent(lblEditora1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAutorPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboGeneroPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboEditoraPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        tblPesquisaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Título", "Autor", "Gênero", "Editora", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPesqProdutos.setViewportView(tblPesquisaProduto);

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/search-32.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/Edit-32x32.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluirProduto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/button_cancel-32.png"))); // NOI18N
        btnExcluirProduto2.setText("Excluir");
        btnExcluirProduto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProduto2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(btnExcluirProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirProduto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtPesqProdutos))
                .addGap(38, 38, 38))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPesqProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Pesquisar", jPanel5);

        txtDescricaoProduto.setColumns(20);
        txtDescricaoProduto.setRows(5);
        txtDescricaoProduto.setText("Descrição");
        jScrollPane1.setViewportView(txtDescricaoProduto);

        lblTitulo.setText("Título:");

        lblGenero.setText("Gênero:");

        lblEditora.setText("Editora:");

        cboEditoraProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Arqueiro", "Globo", "Rocco", "Ética", "Abril", "Intrínseca", "Sextante", "Senac", "Saraiva", "Record", "Conrad", "Newpop", "JBC", "Panini", "Draco", "LeYa", "Gutenberg" }));

        lblAutor.setText("Autor:");

        cboGeneroProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Fantasia", "Ficção Científica", "Horror", "Autobiografia", "Biografia", "Apocalipse Zumbi", "Romance", "Infanto-Juvenil", "Suspense", "Literatura", "Aventura" }));
        cboGeneroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGeneroProdutoActionPerformed(evt);
            }
        });

        cboTipoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Capa Padrão", "Capa Dura", "Edição de Anirvesário", "Edição de Luxo", "Capa Alternativa" }));

        lblTipo.setText("Tipo:");

        lblQuantidade.setText("Quantidade:");

        lblValorUnitario.setText("Valor Unitário:");

        btnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/cnrdelete-all-32.png"))); // NOI18N
        btnCancelar1.setText("Cancelar");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("*");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("*");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("*");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("*");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("*");

        lblAviso.setForeground(new java.awt.Color(255, 0, 0));
        lblAviso.setText("AVISO CASO FALTE ALGUMA INFORMAÇÃO");

        txtVlrUnitario.setText("R$ 0,00");

        painelFoto8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        painelFoto8.setPreferredSize(new java.awt.Dimension(175, 286));

        lblFoto8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto8.setText("FOTO");

        btoAddFoto8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/camera-32.png"))); // NOI18N
        btoAddFoto8.setText("Adicionar Foto");

        javax.swing.GroupLayout painelFoto8Layout = new javax.swing.GroupLayout(painelFoto8);
        painelFoto8.setLayout(painelFoto8Layout);
        painelFoto8Layout.setHorizontalGroup(
            painelFoto8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator9)
            .addComponent(lblFoto8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btoAddFoto8, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
        );
        painelFoto8Layout.setVerticalGroup(
            painelFoto8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFoto8Layout.createSequentialGroup()
                .addComponent(lblFoto8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btoAddFoto8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnSalvarProduto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/Package-add-32.png"))); // NOI18N
        btnSalvarProduto1.setText("Salvar");
        btnSalvarProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProduto1ActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Produto:");

        txtIDproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDprodutoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("*");

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/edit_add-32.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalvarProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lblMensagensErro, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtAutorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblAutor)
                                                .addGap(219, 219, 219)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTipo)
                                            .addComponent(cboTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(spnQuantidadeProduto, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblQuantidade, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addGap(95, 95, 95)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblValorUnitario)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtVlrUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(lblAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTitulo)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblGenero)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cboGeneroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2)))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblEditora)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cboEditoraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtTituloProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIDproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelFoto8, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar1, btnNovo, btnSalvarProduto1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIDproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTituloProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGenero)
                            .addComponent(lblEditora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboEditoraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboGeneroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAutor)
                            .addComponent(lblTipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAutorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuantidade)
                            .addComponent(lblValorUnitario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(txtVlrUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(lblAviso))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelFoto8, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar1)
                    .addComponent(btnSalvarProduto1)
                    .addComponent(btnNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(lblMensagensErro, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelar1, btnNovo, btnSalvarProduto1});

        jTabbedPane2.addTab("Produtos", jPanel1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        DesabilitarFormulario2();
        LimparFormulario2();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void cboGeneroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGeneroProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboGeneroProdutoActionPerformed

    private void btnSalvarProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProduto1ActionPerformed
        Validador.ValidarNumero(txtIDproduto);
        //Validador.ValidarNumero(txtQtd);
        Validador.ValidarDecimal(txtVlrUnitario);

        //Caso ocorra algum erro
        if (Validador.getMensagensErro().size() > 0) {
            String erros = "";
            for (String erro : Validador.getMensagensErro()) {
                erros += erro + "<br/>";
            }

            lblMensagensErro.setText("<html>" + erros + "</html>");
        } else {
            lblMensagensErro.setText("");
        }
        limparMensagesErro();
        if (ValidarFormulario2()) {
            if (modoTela.equals("Criar")) {
                if (ProdutoController.Salvar(Integer.parseInt(txtIDproduto.getText().toString()),
                        txtTituloProduto.getText().toString(),
                        cboGeneroProduto.getSelectedItem().toString(),
                        cboEditoraProduto.getSelectedItem().toString(),
                        txtAutorProduto.getText().toString(),
                        cboTipoProduto.getSelectedItem().toString(),
                        txtDescricaoProduto.getText().toString(),
                        Integer.parseInt(spnQuantidadeProduto.getValue().toString()),
                        Double.parseDouble(txtVlrUnitario.getText().toString())
                )) {
                    this.LoadTable2();
                    JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!");
                    LimparFormulario2();
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao cadastrar produto!");
                }

            } else {

                if (ProdutoController.Atualizar(Integer.parseInt(txtIDproduto.getText().toString()),
                        txtTituloProduto.getText().toString(),
                        cboGeneroProduto.getSelectedItem().toString(),
                        cboEditoraProduto.getSelectedItem().toString(),
                        txtAutorProduto.getText().toString(),
                        cboTipoProduto.getSelectedItem().toString(),
                        txtDescricaoProduto.getText().toString(),
                        Integer.parseInt(spnQuantidadeProduto.getValue().toString()),
                        Double.parseDouble(txtVlrUnitario.getText().toString())
                )) {
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

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        modoTela = "Criar";
        HabilitarFormulario2();
        LimparFormulario2();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirProduto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProduto2ActionPerformed
        if (tblPesquisaProduto.getRowCount() > 0) {
            if (ProdutoController.Excluir(tblPesquisaProduto.getSelectedRow())) {
                this.LoadTable2();
                JOptionPane.showMessageDialog(this, "Produto excluído da base de dados");
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao excluir o produto!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há produtos para excluir!");
        }
    }//GEN-LAST:event_btnExcluirProduto2ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tblPesquisaProduto.getRowCount() > 0) {
            if (tblPesquisaProduto.getSelectedRow() >= 0) {
                HabilitarFormulario2();
                modoTela = "Editar";

                txtIDproduto.setText(tblPesquisaProduto.getModel().getValueAt(tblPesquisaProduto.getSelectedRow(), 0).toString());
                txtTituloProduto.setText(tblPesquisaProduto.getModel().getValueAt(tblPesquisaProduto.getSelectedRow(), 1).toString());
                cboGeneroProduto.setSelectedItem(tblPesquisaProduto.getModel().getValueAt(tblPesquisaProduto.getSelectedRow(), 2).toString());
                cboEditoraProduto.setSelectedItem(tblPesquisaProduto.getModel().getValueAt(tblPesquisaProduto.getSelectedRow(), 3).toString());
                txtAutorProduto.setText(tblPesquisaProduto.getModel().getValueAt(tblPesquisaProduto.getSelectedRow(), 4).toString());
                cboTipoProduto.setSelectedItem(tblPesquisaProduto.getModel().getValueAt(tblPesquisaProduto.getSelectedRow(), 5).toString());
                txtDescricaoProduto.setText(tblPesquisaProduto.getModel().getValueAt(tblPesquisaProduto.getSelectedRow(), 6).toString());
                spnQuantidadeProduto.setValue(Integer.valueOf(tblPesquisaProduto.getModel().getValueAt(tblPesquisaProduto.getSelectedRow(), 7).toString()));
                txtVlrUnitario.setText(tblPesquisaProduto.getModel().getValueAt(tblPesquisaProduto.getSelectedRow(), 8).toString());

            } else {
                JOptionPane.showMessageDialog(this, "Selecione um produto para editar!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há produtos para editar!");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtIDprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDprodutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDprodutoActionPerformed
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
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ProdutoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluirProduto2;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvarProduto1;
    private javax.swing.JButton btoAddFoto8;
    private javax.swing.JComboBox<String> cboEditoraPesquisa;
    private javax.swing.JComboBox<String> cboEditoraProduto;
    private javax.swing.JComboBox<String> cboGeneroPesquisa;
    private javax.swing.JComboBox<String> cboGeneroProduto;
    private javax.swing.JComboBox<String> cboTipoProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JScrollPane jtPesqProdutos;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblAutor1;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblEditora;
    private javax.swing.JLabel lblEditora1;
    private javax.swing.JLabel lblFoto8;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblGenero1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMensagensErro;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValorUnitario;
    private javax.swing.JPanel painelFoto8;
    private javax.swing.JSpinner spnQuantidadeProduto;
    private javax.swing.JTable tblPesquisaProduto;
    private javax.swing.JTextField txtAutorPesquisa;
    private javax.swing.JTextField txtAutorProduto;
    private javax.swing.JTextArea txtDescricaoProduto;
    private javax.swing.JFormattedTextField txtIDPesquisa;
    private javax.swing.JTextField txtIDproduto;
    private javax.swing.JTextField txtNomePesquisa;
    private javax.swing.JTextField txtTituloProduto;
    private javax.swing.JTextField txtVlrUnitario;
    // End of variables declaration//GEN-END:variables
 
    private boolean ValidarFormulario2() {

        if (this.txtIDproduto.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um ID ao produto!");
            return false;
        }

        if (this.txtTituloProduto.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina uma Titulo ao produto!");
            return false;
        }

        if (this.txtVlrUnitario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um valor unitario ao produto!");
            return false;
        }
        
        if (this.txtAutorProduto.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um autor ao produto!");
            return false;
        }
        
        if (this.cboGeneroProduto.getSelectedItem().equals("Selecione")) {
            JOptionPane.showMessageDialog(this, "Defina um genero ao produto!");
            return false;
        }        
        
        if (this.cboEditoraProduto.getSelectedItem().equals("Selecione")) {
            JOptionPane.showMessageDialog(this, "Defina uma editora ao produto!");
            return false;
        }
        
        if (this.cboTipoProduto.getSelectedItem().equals("Selecione")) {
            JOptionPane.showMessageDialog(this, "Defina um tipo ao produto!");
            return false;
        }
        
        if (this.spnQuantidadeProduto.getValue().equals(0)) {
            JOptionPane.showMessageDialog(this, "Defina uma quantidade ao produto!");
            return false;
        }
        
        

        return true;

    }


}
