
package Controller;

import DAO.ProdutoDAO;
import Model.Produto;
import java.util.ArrayList;


public class ProdutoController {

    public static boolean Salvar(int idProduto, String dscProduto, double vlrUnitario) {
        //Salvo na memória
        Produto p = new Produto(idProduto, dscProduto, vlrUnitario);
        return ProdutoDAO.Salvar(p);
    }

    public static boolean Excluir(int indice) {
        return ProdutoDAO.Excluir(indice);
    }

    public static boolean Atualizar(int idProduto, String dscProduto, double vlrUnitario) {
        Produto p = new Produto(idProduto, dscProduto, vlrUnitario);
        return ProdutoDAO.Atualizar(p);

    }

 
    public static ArrayList<String[]> getProdutos() {
        ArrayList<Produto> produtos = ProdutoDAO.getProdutos();
        ArrayList<String[]> listaProdutos = new ArrayList<>();

        for (int i = 0; i < produtos.size(); i++) {
            listaProdutos.add(new String[]{String.valueOf(produtos.get(i).getIdProduto()), produtos.get(i).getDescriProduto(), String.valueOf(produtos.get(i).getValorUnitario())});

        }

        return listaProdutos;

    }

}
