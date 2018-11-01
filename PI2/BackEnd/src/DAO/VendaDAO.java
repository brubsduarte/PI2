/*
                txtIDproduto.setText(tblProdutos2.getModel().getValueAt(tblProdutos2.getSelectedRow(), 0).toString());
                txtTituloProduto.setText(tblProdutos2.getModel().getValueAt(tblProdutos2.getSelectedRow(), 1).toString());
                cboGeneroProduto.setSelectedItem(tblProdutos2.getModel().getValueAt(tblProdutos2.getSelectedRow(), 2).toString());
                cboEditoraProduto.setSelectedItem(tblProdutos2.getModel().getValueAt(tblProdutos2.getSelectedRow(), 3).toString());
                txtAutorProduto.setText(tblProdutos2.getModel().getValueAt(tblProdutos2.getSelectedRow(), 4).toString());
                cboTipoProduto.setSelectedItem(tblProdutos2.getModel().getValueAt(tblProdutos2.getSelectedRow(), 5).toString());
                txtDescricaoProduto.setText(tblProdutos2.getModel().getValueAt(tblProdutos2.getSelectedRow(), 6).toString());
                spnQuantidadeProduto.setValue(Integer.valueOf(tblProdutos2.getModel().getValueAt(tblProdutos2.getSelectedRow(), 7).toString()));             
                txtVlrUnitario.setText(tblProdutos2.getModel().getValueAt(tblProdutos2.getSelectedRow(), 8).toString());
 */
package DAO;

import Model.Venda;
import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class VendaDAO {
    public static boolean Salvar(Venda p)
    {
        return SimulaDB.getInstance().SalvarVenda(p);
    }
    
    public static boolean Atualizar(Venda p)
    {
        return SimulaDB.getInstance().AtualizarVenda(p);
    }
    
    public static boolean Excluir(int indice)
    {
        return SimulaDB.getInstance().ExcluirVenda(indice);
    }
    
    public static ArrayList<Venda> getVendas()
    {
        return SimulaDB.getInstance().getVendas();
    }
}
