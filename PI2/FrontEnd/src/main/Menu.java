/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author MArcel B. Cardoso
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public String login;
    public String senha;

    public Menu() {

        initComponents();

        TelaLogin login = new TelaLogin(this, true);
        login.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paineMenu = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        btnCadClienteMenu = new javax.swing.JButton();
        btnPesqProdutoMenu = new javax.swing.JButton();
        btoVendasMenu = new javax.swing.JButton();
        btoGerarRelatorioMenu = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        menuBtoLogin = new javax.swing.JMenu();
        menuItemLog = new javax.swing.JMenuItem();
        menuItemAltCad = new javax.swing.JMenuItem();
        menuItemSair = new javax.swing.JMenuItem();
        menuBtoArquivos = new javax.swing.JMenu();
        menuItemAjuda = new javax.swing.JMenuItem();
        menuItemRelat = new javax.swing.JMenuItem();
        menuBtoClientes = new javax.swing.JMenu();
        menuItemCadCli = new javax.swing.JMenuItem();
        menuItemEditCli = new javax.swing.JMenuItem();
        menuItemExcCli = new javax.swing.JMenuItem();
        menuItemPesqCli = new javax.swing.JMenuItem();
        menuBtoProdutos = new javax.swing.JMenu();
        menuItemCadProd = new javax.swing.JMenuItem();
        menuItemEditProd = new javax.swing.JMenuItem();
        menuItemExcProd = new javax.swing.JMenuItem();
        menuItemPesqProd = new javax.swing.JMenuItem();
        menuBtoVendas = new javax.swing.JMenu();
        menuItemVenda = new javax.swing.JMenuItem();
        menuItemCancVendas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Inicial");
        setUndecorated(true);

        paineMenu.setVerifyInputWhenFocusTarget(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnCadClienteMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/add_user-32.png"))); // NOI18N
        btnCadClienteMenu.setText("Cadastrar Cliente");
        btnCadClienteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadClienteMenuActionPerformed(evt);
            }
        });

        btnPesqProdutoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/search-32.png"))); // NOI18N
        btnPesqProdutoMenu.setText("Pesquisar Produto");
        btnPesqProdutoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqProdutoMenuActionPerformed(evt);
            }
        });

        btoVendasMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/Shopping-Cart-payment-32.png"))); // NOI18N
        btoVendasMenu.setText("Realizar Venda");
        btoVendasMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoVendasMenuActionPerformed(evt);
            }
        });

        btoGerarRelatorioMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsBotoes/Bar-chart-32.png"))); // NOI18N
        btoGerarRelatorioMenu.setText("Consultar Vendas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnCadClienteMenu)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnPesqProdutoMenu)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btoVendasMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btoGerarRelatorioMenu)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnCadClienteMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnPesqProdutoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btoVendasMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btoGerarRelatorioMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        paineMenu.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout paineMenuLayout = new javax.swing.GroupLayout(paineMenu);
        paineMenu.setLayout(paineMenuLayout);
        paineMenuLayout.setHorizontalGroup(
            paineMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineMenuLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        paineMenuLayout.setVerticalGroup(
            paineMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineMenuLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 589, Short.MAX_VALUE))
        );

        menuBtoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/lock.png"))); // NOI18N
        menuBtoLogin.setText("Login");

        menuItemLog.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuItemLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/key.png"))); // NOI18N
        menuItemLog.setText("Login");
        menuItemLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLogActionPerformed(evt);
            }
        });
        menuBtoLogin.add(menuItemLog);

        menuItemAltCad.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        menuItemAltCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/lock_edit.png"))); // NOI18N
        menuItemAltCad.setText("Alterar Cadastro");
        menuBtoLogin.add(menuItemAltCad);

        menuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cancel.png"))); // NOI18N
        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuBtoLogin.add(menuItemSair);

        menu.add(menuBtoLogin);

        menuBtoArquivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/page.png"))); // NOI18N
        menuBtoArquivos.setText("Arquivos");

        menuItemAjuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        menuItemAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/help.png"))); // NOI18N
        menuItemAjuda.setText("Ajuda");
        menuBtoArquivos.add(menuItemAjuda);

        menuItemRelat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menuItemRelat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/chart_bar.png"))); // NOI18N
        menuItemRelat.setText("Relatórios");
        menuBtoArquivos.add(menuItemRelat);

        menu.add(menuBtoArquivos);

        menuBtoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/user.png"))); // NOI18N
        menuBtoClientes.setText("Clientes");

        menuItemCadCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        menuItemCadCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/user_add.png"))); // NOI18N
        menuItemCadCli.setText("Cadastrar Cliente");
        menuItemCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadCliActionPerformed(evt);
            }
        });
        menuBtoClientes.add(menuItemCadCli);

        menuItemEditCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuItemEditCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/user_edit.png"))); // NOI18N
        menuItemEditCli.setText("Editar Cliente");
        menuItemEditCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEditCliActionPerformed(evt);
            }
        });
        menuBtoClientes.add(menuItemEditCli);

        menuItemExcCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/user_delete.png"))); // NOI18N
        menuItemExcCli.setText("Excluir Cliente");
        menuItemExcCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExcCliActionPerformed(evt);
            }
        });
        menuBtoClientes.add(menuItemExcCli);

        menuItemPesqCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        menuItemPesqCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/zoom.png"))); // NOI18N
        menuItemPesqCli.setText("Pesquisar Cliente");
        menuItemPesqCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPesqCliActionPerformed(evt);
            }
        });
        menuBtoClientes.add(menuItemPesqCli);

        menu.add(menuBtoClientes);

        menuBtoProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/tag_blue.png"))); // NOI18N
        menuBtoProdutos.setText("Produtos");

        menuItemCadProd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuItemCadProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/tag_blue_add.png"))); // NOI18N
        menuItemCadProd.setText("Cadastrar Produto");
        menuItemCadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadProdActionPerformed(evt);
            }
        });
        menuBtoProdutos.add(menuItemCadProd);

        menuItemEditProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/tag_blue_edit.png"))); // NOI18N
        menuItemEditProd.setText("Editar Produto");
        menuItemEditProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEditProdActionPerformed(evt);
            }
        });
        menuBtoProdutos.add(menuItemEditProd);

        menuItemExcProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/tag_blue_delete.png"))); // NOI18N
        menuItemExcProd.setText("Excluir Produto");
        menuBtoProdutos.add(menuItemExcProd);

        menuItemPesqProd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuItemPesqProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/zoom.png"))); // NOI18N
        menuItemPesqProd.setText("Pesquisar Produto");
        menuItemPesqProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPesqProdActionPerformed(evt);
            }
        });
        menuBtoProdutos.add(menuItemPesqProd);

        menu.add(menuBtoProdutos);

        menuBtoVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/money.png"))); // NOI18N
        menuBtoVendas.setText("Vendas");

        menuItemVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menuItemVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cart_put.png"))); // NOI18N
        menuItemVenda.setText("Realizar Venda");
        menuItemVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVendaActionPerformed(evt);
            }
        });
        menuBtoVendas.add(menuItemVenda);

        menuItemCancVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        menuItemCancVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cart_delete.png"))); // NOI18N
        menuItemCancVendas.setText("Cancelar Venda");
        menuBtoVendas.add(menuItemCancVendas);

        menu.add(menuBtoVendas);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paineMenu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paineMenu, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemPesqCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPesqCliActionPerformed
        TelaPesquisaCliente pesqCliente = new TelaPesquisaCliente();
        paineMenu.add(pesqCliente);
        pesqCliente.setVisible(true);
    }//GEN-LAST:event_menuItemPesqCliActionPerformed

    private void menuItemEditCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEditCliActionPerformed
        TelaEditarCliente editCliente = new TelaEditarCliente();
        paineMenu.add(editCliente);
        editCliente.setVisible(true);
    }//GEN-LAST:event_menuItemEditCliActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void menuItemLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLogActionPerformed
        Login log = new Login();
        paineMenu.add(log);
        log.setVisible(true);
    }//GEN-LAST:event_menuItemLogActionPerformed

    private void menuItemPesqProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPesqProdActionPerformed
        TelaPesquisaProduto pesquisa = new TelaPesquisaProduto();
        paineMenu.add(pesquisa);
        pesquisa.setVisible(true);
    }//GEN-LAST:event_menuItemPesqProdActionPerformed

    private void menuItemCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadCliActionPerformed
        TelaCadastroCliente cadCliente = new TelaCadastroCliente();
        paineMenu.add(cadCliente);
        cadCliente.setVisible(true);
    }//GEN-LAST:event_menuItemCadCliActionPerformed

    private void btnCadClienteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadClienteMenuActionPerformed
        TelaCadastroCliente cadCliente = new TelaCadastroCliente();
        paineMenu.add(cadCliente);
        cadCliente.setVisible(true);
    }//GEN-LAST:event_btnCadClienteMenuActionPerformed

    private void btnPesqProdutoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqProdutoMenuActionPerformed
        TelaPesquisaProduto pesquisa = new TelaPesquisaProduto();
        paineMenu.add(pesquisa);
        pesquisa.setVisible(true);
    }//GEN-LAST:event_btnPesqProdutoMenuActionPerformed

    private void menuItemCadProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadProdActionPerformed
        TelaCadastroProduto cadProduto = new TelaCadastroProduto();
        paineMenu.add(cadProduto);
        cadProduto.setVisible(true);
    }//GEN-LAST:event_menuItemCadProdActionPerformed

    private void btoVendasMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoVendasMenuActionPerformed
        TelaVendas telVendas = new TelaVendas();
        paineMenu.add(telVendas);
        telVendas.setVisible(true);
    }//GEN-LAST:event_btoVendasMenuActionPerformed

    private void menuItemVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVendaActionPerformed
        TelaVendas telVendas = new TelaVendas();
        paineMenu.add(telVendas);
        telVendas.setVisible(true);
    }//GEN-LAST:event_menuItemVendaActionPerformed

    private void menuItemEditProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEditProdActionPerformed
       
    }//GEN-LAST:event_menuItemEditProdActionPerformed

    private void menuItemExcCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExcCliActionPerformed
    
    }//GEN-LAST:event_menuItemExcCliActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadClienteMenu;
    private javax.swing.JButton btnPesqProdutoMenu;
    private javax.swing.JButton btoGerarRelatorioMenu;
    private javax.swing.JButton btoVendasMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuBtoArquivos;
    private javax.swing.JMenu menuBtoClientes;
    private javax.swing.JMenu menuBtoLogin;
    private javax.swing.JMenu menuBtoProdutos;
    private javax.swing.JMenu menuBtoVendas;
    private javax.swing.JMenuItem menuItemAjuda;
    private javax.swing.JMenuItem menuItemAltCad;
    private javax.swing.JMenuItem menuItemCadCli;
    private javax.swing.JMenuItem menuItemCadProd;
    private javax.swing.JMenuItem menuItemCancVendas;
    private javax.swing.JMenuItem menuItemEditCli;
    private javax.swing.JMenuItem menuItemEditProd;
    private javax.swing.JMenuItem menuItemExcCli;
    private javax.swing.JMenuItem menuItemExcProd;
    private javax.swing.JMenuItem menuItemLog;
    private javax.swing.JMenuItem menuItemPesqCli;
    private javax.swing.JMenuItem menuItemPesqProd;
    private javax.swing.JMenuItem menuItemRelat;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenuItem menuItemVenda;
    private javax.swing.JDesktopPane paineMenu;
    // End of variables declaration//GEN-END:variables
}