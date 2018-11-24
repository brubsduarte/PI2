package DAO;

import Model.Produto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutoDAO {

    public static boolean Salvar(Produto p) {
        DB db = new DB();
        String sql = 
                "INSERT INTO produto "
                + "(Titulo, Autor, Genero, Editora, Valor, Tipo, Quantidade, Descricao)"
                + "VALUES ("
                + "'"+p.gettitulo()+"', "
                + "'"+p.getautor()+"', "
                + "'"+p.getgenero()+"', "
                + "'"+p.geteditora()+"', "
                + ""+p.getvalorUni()+", "
                + "'"+p.gettipo()+"', "
                + ""+p.getquantidade()+", "
                + "'"+p.getdescricao()+"');";
        return db.executarAlteracao(sql);
    }

    public static boolean Atualizar(Produto p) {
        DB db = new DB();
        String sql = 
                "UPDATE produto SET "
                + "Titulo = '"+p.gettitulo()+"', "
                + "Autor = '"+p.getautor()+"', "
                + "Genero = '"+p.getgenero()+"', "
                + "Editora = '"+p.geteditora()+"', "
                + "Valor = "+p.getvalorUni()+", "
                + "Tipo = '"+p.gettipo()+"', "
                + "Quantidade = "+p.getquantidade()+", "
                + "Descricao = '"+p.getdescricao()+"' "
                + "Where ID = "+p.getIdProduto()+";";
        return db.executarAlteracao(sql);
    }

    public static boolean Excluir(int produtoID) {
        DB db = new DB();
        String sql = "DELETE FROM produto Where ID = "+produtoID+";";
        return db.executarAlteracao(sql);
    }

    public static ArrayList<Produto> getProdutos() {
        DB db = new DB();
        try {
            String sql = "SELECT * FROM produto;";
            ResultSet rs = db.executarConsulta(sql);
            ArrayList<Produto> produtos = new ArrayList();
            while (rs.next()) {
                Produto p = new Produto();
                p.setIdProduto(rs.getInt("ID"));
                p.settitulo(rs.getString("Titulo"));
                p.setautor(rs.getString("Autor"));
                p.setgenero(rs.getString("Genero"));
                p.seteditora(rs.getString("Editora"));
                p.setvalorUni(rs.getDouble("Valor"));
                p.settipo(rs.getString("Tipo"));
                p.setquantidade(rs.getInt("Quantidade"));
                p.setdescricao(rs.getString("Descricao"));
                produtos.add(p);
            }
            db.close();
            return produtos;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            db.close();
            return null;
        }
    }

}
