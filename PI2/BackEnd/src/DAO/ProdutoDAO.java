
package DAO;

import Model.Produto;
import java.util.ArrayList;


public class ProdutoDAO {
    
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