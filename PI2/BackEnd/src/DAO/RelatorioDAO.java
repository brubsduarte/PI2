package DAO;

import Model.Cliente;
import Model.Produto;
import Model.Venda;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RelatorioDAO {

    public static ArrayList<Cliente> getCompradores() {
        DB db = new DB(true);
        try {
            String sql = "SELECT cliente.Nome, cliente.CPF, COUNT(*) \"Compras\" FROM cliente LEFT JOIN venda ON venda.idCliente = cliente.id GROUP BY cliente.id;";
            ResultSet rs = db.executarConsulta(sql);
            ArrayList<Cliente> clientes = new ArrayList();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setCPF(rs.getString("CPF"));
                c.setNome(rs.getString("Nome"));
                c.setCompras(rs.getInt("Compras"));
                clientes.add(c);
            }
            db.close();
            return clientes;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            db.close();
            return null;
        }
    }

    public static ArrayList<Produto> getProdutos() {
        DB db = new DB(true);
        try {
            String sql = "SELECT produto.Titulo, produto.Valor, COUNT(*) \"QtdeVendas\", COUNT(*) * produto.Valor \"TotalVendas\" FROM produto INNER JOIN vendaproduto ON produto.ID = vendaproduto.idProduto GROUP BY produto.id";
            ResultSet rs = db.executarConsulta(sql);
            ArrayList<Produto> produtos = new ArrayList();
            while (rs.next()) {
                Produto p = new Produto();

                p.settitulo(rs.getString("Titulo"));
                p.setvalorUni(rs.getDouble("Valor"));
                p.setquantidade(rs.getInt("QtdeVendas"));
                p.setTotalVenda(rs.getDouble("TotalVendas"));
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
    
    public static ArrayList<Venda> getVenda() {
        DB db = new DB(true);
        try {
            String sql = "SELECT * FROM venda";
            ResultSet rs = db.executarConsulta(sql);
            ArrayList<Venda> vendas = new ArrayList();
            while (rs.next()) {
                Venda v = new Venda();
                v.setIdVenda(rs.getInt("ID"));
                v.setData(rs.getDate("Data"));
                v.setValorTotal(rs.getFloat("ValorTotal"));
                v.setNomeCliente(rs.getString("NomeCliente"));
                vendas.add(v);
            }
            db.close();
            return vendas;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            db.close();
            return null;
        }
    }
}
