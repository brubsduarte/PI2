
package Controller;

import DAO.ProdutoDAO;
import Model.Produto;
import java.util.ArrayList;


public class ProdutoController {

    public static boolean Salvar(String titulo, String genero,String editora,String autor,String tipo,
            String descricao,int quantidade,double valorUni,byte[] imagem  ) {
        //Salvo na memória
        Produto p = new Produto(titulo,genero,editora,autor,tipo,descricao,quantidade,valorUni,imagem  );
        return ProdutoDAO.Salvar(p);
    }

    public static boolean Excluir(int indice) {
        return ProdutoDAO.Excluir(indice);
    }

    public static boolean Atualizar(String titulo, String genero,String editora,String autor,String tipo,
            String descricao,int quantidade,double valorUni,byte[] imagem) {
        Produto p = new Produto(titulo,genero,editora,autor,tipo,descricao,quantidade,valorUni,imagem);
        return ProdutoDAO.Atualizar(p);

    }

 
    public static ArrayList<String[]> getProdutos() {
        ArrayList<Produto> produtos = ProdutoDAO.getProdutos();
        ArrayList<String[]> listaProdutos = new ArrayList<>();

        for (int i = 0; i < produtos.size(); i++) {
            listaProdutos.add(new String[]{
                
                 
                produtos.get(i).gettitulo(), 
                produtos.get(i).getgenero(), 
                produtos.get(i).geteditora(),
                produtos.get(i).getautor(),
                produtos.get(i).gettipo(), 
                String.valueOf(produtos.get(i).getquantidade()),
                String.valueOf(produtos.get(i).getvalorUni()),
                String.valueOf(produtos.get(i).getimagem()),
            
            });

        }

        return listaProdutos;

    }

}
