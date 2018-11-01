/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Venda;
import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class VendaDAO {
    public static boolean Salvar(Produto p)
    {
        return SimulaDB.getInstance().SalvarProduto(p);
    }
    
    public static boolean Atualizar(Produto p)
    {
        return SimulaDB.getInstance().AtualizarProduto(p);
    }
    
    public static boolean Excluir(int indice)
    {
        return SimulaDB.getInstance().ExcluirProduto(indice);
    }
    
    public static ArrayList<Produto> getProdutos()
    {
        return SimulaDB.getInstance().getProdutos();
    }
}
