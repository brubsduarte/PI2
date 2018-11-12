
package View;


import Controller.ProdutoController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.table.DefaultTableModel;
import utils.Validador;
import static utils.Validador.limparMensagesErro;

public class ProdutoView extends javax.swing.JFrame {

    private String modoTela; //"Criar/Editar"

    public ProdutoView() {
        initComponents();

        this.setLocationRelativeTo(null);
       
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
        ((DefaultEditor)spnQuantidadeProduto.getEditor()).getTextField().setEditable(false);
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
        ((DefaultEditor)spnQuantidadeProduto.getEditor()).getTextField().setEditable(true);
        txtVlrUnitario.setEditable(true);
        
        
        btnSalvarProduto1.setEnabled(true);
        btnCancelar1.setEnabled(true);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneMainProduto = new javax.swing.JTabbedPane();
        cadastroProdutoView = new javax.swing.JPanel();
        pnlAbaCadastroProduto1 = new javax.swing.JPanel();
        pnlFormularioProduto = new javax.swing.JPanel();
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
        lblMensagensErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        cadastroProdutoView.setMaximumSize(new java.awt.Dimension(1000, 1000));
        cadastroProdutoView.setPreferredSize(new java.awt.Dimension(1000, 1000));

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

        javax.swing.GroupLayout pnlFormularioProdutoLayout = new javax.swing.GroupLayout(pnlFormularioProduto);
        pnlFormularioProduto.setLayout(pnlFormularioProdutoLayout);
        pnlFormularioProdutoLayout.setHorizontalGroup(
            pnlFormularioProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormularioProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormularioProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblVlrUnitario1)
                        .addComponent(lblTituloProduto)
                        .addComponent(lblAutorProduto)
                        .addComponent(lblGeneroProduto))
                    .addComponent(lblIDProduto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFormularioProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormularioProdutoLayout.createSequentialGroup()
                        .addComponent(lblQuantidadeProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(pnlFormularioProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFormularioProdutoLayout.createSequentialGroup()
                                .addComponent(lblDescricaoProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlFormularioProdutoLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(pnlBotoesFormulario1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlFormularioProdutoLayout.createSequentialGroup()
                        .addGroup(pnlFormularioProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTituloProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlFormularioProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtIDproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtVlrUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAutorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnlFormularioProdutoLayout.createSequentialGroup()
                                    .addComponent(cboGeneroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(lblEditoraProduto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cboEditoraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(lblTipoProduto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cboTipoProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMensagensErro, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
            .addGroup(pnlFormularioProdutoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pnlTabela1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFormularioProdutoLayout.setVerticalGroup(
            pnlFormularioProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioProdutoLayout.createSequentialGroup()
                .addGroup(pnlFormularioProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormularioProdutoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(pnlFormularioProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIDProduto)
                            .addComponent(txtIDproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlFormularioProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTituloProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTituloProduto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormularioProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVlrUnitario1)
                            .addComponent(txtVlrUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblMensagensErro, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormularioProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutorProduto)
                    .addComponent(txtAutorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormularioProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGeneroProduto)
                    .addComponent(cboGeneroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEditoraProduto)
                    .addComponent(cboEditoraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoProduto)
                    .addComponent(cboTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFormularioProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addComponent(pnlFormularioProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAbaCadastroProduto1Layout.setVerticalGroup(
            pnlAbaCadastroProduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAbaCadastroProduto1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlFormularioProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout cadastroProdutoViewLayout = new javax.swing.GroupLayout(cadastroProdutoView);
        cadastroProdutoView.setLayout(cadastroProdutoViewLayout);
        cadastroProdutoViewLayout.setHorizontalGroup(
            cadastroProdutoViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastroProdutoViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlAbaCadastroProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        cadastroProdutoViewLayout.setVerticalGroup(
            cadastroProdutoViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroProdutoViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAbaCadastroProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paneMainProduto.addTab("Cadastrar Produto", cadastroProdutoView);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneMainProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paneMainProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboGeneroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGeneroProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboGeneroProdutoActionPerformed

    private void txtAutorProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorProdutoActionPerformed

    private void txtIDprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDprodutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDprodutoActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        // TODO add your handling code here:
        DesabilitarFormulario2();
        LimparFormulario2();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnSalvarProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProduto1ActionPerformed
        
        Validador.ValidarNumero(txtIDproduto);
        //Validador.ValidarNumero(txtQtd);
        Validador.ValidarDecimal(txtVlrUnitario);
        
        //Caso ocorra algum erro
        if(Validador.getMensagensErro().size()>0)
        {
            String erros = "";
            for(String erro: Validador.getMensagensErro())
            {
                erros += erro + "<br/>";
            }
            
            lblMensagensErro.setText("<html>"+ erros + "</html>");
        }
        else
        {
            lblMensagensErro.setText("");
        }
        limparMensagesErro();
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

    private void btnNovoProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProduto1ActionPerformed
        modoTela = "Criar";
        HabilitarFormulario2();
        LimparFormulario2();
    }//GEN-LAST:event_btnNovoProduto1ActionPerformed

    private void txtVlrUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVlrUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVlrUnitarioActionPerformed

    private void txtTituloProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloProdutoActionPerformed

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
    private javax.swing.JButton btnEditarProduto1;
    private javax.swing.JButton btnExcluirProduto1;
    private javax.swing.JButton btnNovoProduto1;
    private javax.swing.JButton btnSalvarProduto1;
    private javax.swing.JPanel cadastroProdutoView;
    private javax.swing.JComboBox<String> cboEditoraProduto;
    private javax.swing.JComboBox<String> cboGeneroProduto;
    private javax.swing.JComboBox<String> cboTipoProduto;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAutorProduto;
    private javax.swing.JLabel lblDescricaoProduto;
    private javax.swing.JLabel lblEditoraProduto;
    private javax.swing.JLabel lblGeneroProduto;
    private javax.swing.JLabel lblIDProduto;
    private javax.swing.JLabel lblMensagensErro;
    private javax.swing.JLabel lblQuantidadeProduto;
    private javax.swing.JLabel lblTipoProduto;
    private javax.swing.JLabel lblTituloProduto;
    private javax.swing.JLabel lblVlrUnitario1;
    private javax.swing.JTabbedPane paneMainProduto;
    private javax.swing.JPanel pnlAbaCadastroProduto1;
    private javax.swing.JPanel pnlBotoes1;
    private javax.swing.JPanel pnlBotoesFormulario1;
    private javax.swing.JPanel pnlFormularioProduto;
    private javax.swing.JPanel pnlTabela1;
    private javax.swing.JSpinner spnQuantidadeProduto;
    private javax.swing.JTable tblProdutos1;
    private javax.swing.JTextField txtAutorProduto;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextField txtIDproduto;
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
