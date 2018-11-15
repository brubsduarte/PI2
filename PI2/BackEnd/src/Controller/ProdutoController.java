
package Controller;

import DAO.ProdutoDAO;
import Model.Produto;
import java.util.ArrayList;


public class ProdutoController {
    
    
    
    public static boolean Salvar(int idProduto,String titulo, String genero,String editora,String autor,String tipo,
            String descricao,int quantidade,double valorUni  ) {
        //Salvo na memória
        Produto p = new Produto(idProduto, titulo,genero,editora,autor,tipo,descricao,quantidade,valorUni);
        return ProdutoDAO.Salvar(p);
    }

    public static boolean Excluir(int indice) {
        return ProdutoDAO.Excluir(indice);
    }

    public static boolean Atualizar(int idProduto, String titulo, String genero,String editora,String autor,String tipo,
            String descricao,int quantidade,double valorUni) {
        Produto p = new Produto(idProduto,titulo,genero,editora,autor,tipo,descricao,quantidade,valorUni);
        return ProdutoDAO.Atualizar(p);

    }

 
    public static ArrayList<String[]> getProdutos() {
        ArrayList<Produto> produtos = ProdutoDAO.getProdutos();
        ArrayList<String[]> listaProdutos = new ArrayList<>();

        for (int i = 0; i < produtos.size(); i++) {
            listaProdutos.add(new String[]{
                
                String.valueOf(produtos.get(i).getIdProduto()),
                produtos.get(i).gettitulo(),
                produtos.get(i).getgenero(), 
                produtos.get(i).geteditora(),
                produtos.get(i).getautor(),
                produtos.get(i).gettipo(), 
                produtos.get(i).getdescricao(),
                String.valueOf(produtos.get(i).getquantidade()),
                String.valueOf(produtos.get(i).getvalorUni()),
                
            
            });

        }

        return listaProdutos;

    }
public static ArrayList<String[]> getProdutosPronto()
    {
        
        Produto produto1 = new Produto(1, "Senhor dos aneis - Sociedade do anel", "Aventura", null, "J.R.R Tolken", null, null, 0, 101.99);
        Produto produto2 = new Produto(2, "Senhor dos aneis - Duas torres", "Aventura", null, "J.R.R Tolken", null, null, 0, 150.99);
        Produto produto3 = new Produto(3, "Senhor dos aneis - Retorno do rei", "Aventura", null, "J.R.R Tolken", null, null, 0, 75.99);
        
        ArrayList<Produto> produtos = new ArrayList();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        ArrayList<String[]> listaProdutos = new ArrayList<>();
        
        for(int i = 0;i < produtos.size();i++)
        {
            listaProdutos.add(new String[]{
                
                String.valueOf(produtos.get(i).getIdProduto()), 
                produtos.get(i).gettitulo(), 
               // produtos.get(i).getgenero(), 
               // produtos.get(i).geteditora(), 
                produtos.get(i).getautor(), 
               // produtos.get(i).gettipo(),
               // produtos.get(i).getdescricao(),
               // String.valueOf(produtos.get(i).getquantidade()), 
                String.valueOf(produtos.get(i).getvalorUni()) 
            
            });        
        }
        
        return listaProdutos;
        
    }
    
    public static ArrayList<Produto> getAll(){
        return ProdutoDAO.getProdutos();
    }
}
