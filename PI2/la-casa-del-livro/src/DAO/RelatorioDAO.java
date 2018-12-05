package DAO;

import Model.Cliente;
import Model.Produto;
import Model.Venda;
import Model.VendaDetalhada;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class RelatorioDAO {

    public static ArrayList<Cliente> getCompradores(Date dataInicial, Date dataFinal) {
        DB db = new DB(true);
        try {
            String sql;
            
            if (dataInicial == null || dataFinal == null) {
                sql = 
                    "SELECT cliente.Nome, cliente.CPF, COUNT(*) 'Compras' "
                    + "FROM cliente INNER JOIN venda ON venda.idCliente = cliente.id "
                    + "GROUP BY venda.idCliente "
                    + "ORDER BY COUNT(*) DESC;";
            } else {
                SimpleDateFormat df;
                df = new SimpleDateFormat("yyyy-MM-dd");
                String dataIni = df.format(dataInicial);
                String dataFin = df.format(dataFinal);
                
                sql = 
                    "SELECT cliente.Nome, cliente.CPF, COUNT(*) 'Compras' "
                    + "FROM cliente INNER JOIN venda ON venda.idCliente = cliente.id "
                    + "WHERE (CAST(venda.data AS DATE) BETWEEN '"+dataIni+"' AND '"+dataFin+"') "
                    + "GROUP BY venda.idCliente "
                    + "ORDER BY COUNT(*) DESC;";
            }
            
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

    public static ArrayList<Produto> getProdutos(Date dataInicial, Date dataFinal) {
        DB db = new DB(true);
        try {
            String sql;
            
            if (dataInicial == null || dataFinal == null) {
                sql = 
                    "SELECT produto.Titulo, produto.Valor, SUM(vendaproduto.QuantidadeVenda) 'QtdeVendas', (SUM(vendaproduto.QuantidadeVenda) * produto.Valor) 'TotalVendas' "
                    + "FROM vendaproduto INNER JOIN produto ON produto.ID = vendaproduto.idProduto "
                    + "GROUP BY idProduto "
                    + "ORDER BY SUM(vendaproduto.QuantidadeVenda) DESC;";
            } else {
                SimpleDateFormat df;
                df = new SimpleDateFormat("yyyy-MM-dd");
                String dataIni = df.format(dataInicial);
                String dataFin = df.format(dataFinal);
                
                sql = 
                    "SELECT produto.Titulo, produto.Valor, SUM(vendaproduto.QuantidadeVenda) 'QtdeVendas', (SUM(vendaproduto.QuantidadeVenda) * produto.Valor) 'TotalVendas' "
                    + "FROM vendaproduto INNER JOIN produto ON produto.ID = vendaproduto.idProduto INNER JOIN venda ON venda.ID = vendaproduto.idVenda "
                    + "WHERE (CAST(venda.data AS DATE) BETWEEN '"+dataIni+"' AND '"+dataFin+"') "
                    + "GROUP BY idProduto "
                    + "ORDER BY SUM(vendaproduto.QuantidadeVenda) DESC;";
            }
            
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
    
    public static ArrayList<Venda> getVenda(Date dataInicial, Date dataFinal) {
        DB db = new DB(true);
        try {
            String sql;
            
            if (dataInicial == null || dataFinal == null) {
                sql = 
                    "SELECT venda.ID, venda.data, venda.ValorTotal, cliente.Nome "
                    + "FROM venda INNER JOIN cliente ON cliente.ID = venda.idCliente "
                    + "ORDER BY venda.ValorTotal DESC;";
            } else {
                SimpleDateFormat df;
                df = new SimpleDateFormat("yyyy-MM-dd");
                String dataIni = df.format(dataInicial);
                String dataFin = df.format(dataFinal);
                
                sql = 
                    "SELECT venda.ID, venda.data, venda.ValorTotal, cliente.Nome "
                    + "FROM venda INNER JOIN cliente ON cliente.ID = venda.idCliente "
                    + "WHERE (CAST(venda.data AS DATE) BETWEEN '"+dataIni+"' AND '"+dataFin+"') "
                    + "ORDER BY venda.ValorTotal DESC;";
            }
            
            ResultSet rs = db.executarConsulta(sql);
            ArrayList<Venda> vendas = new ArrayList();
            while (rs.next()) {
                Venda v = new Venda();
                v.setIdVenda(rs.getInt("ID"));
                v.setData(rs.getDate("Data"));
                v.setValorTotal(rs.getFloat("ValorTotal"));
                v.setNomeCliente(rs.getString("Nome"));
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
    
    public static ArrayList<VendaDetalhada> getVendaDetalhada(int idVenda){
        DB db = new DB(true);
        try{
            String sql  = "SELECT \n" +
                        "    V.ID, \n" +
                        "    P.TITULO,\n" +
                        "    VP.QUANTIDADEVENDA,\n" +
                        "    P.VALOR,\n" +
                        "    C.NOME,\n" +
                        "    (VP.QUANTIDADEVENDA * P.VALOR) AS VALORTOTAL\n" +
                        "FROM \n" +
                        "	VENDA V\n" +
                        "INNER JOIN VENDAPRODUTO AS VP\n" +
                        "	ON VP.IDVENDA = V.ID\n" +
                        "INNER JOIN CLIENTE C\n" +
                        "	ON C.ID = V.IDCLIENTE\n" +
                        "INNER JOIN PRODUTO P\n" +
                        "	ON P.ID = VP.IDPRODUTO\n" +
                        "WHERE\n" +
                        "	V.ID = " + idVenda;
            
            ResultSet rs = db.executarConsulta(sql);
            ArrayList<VendaDetalhada> vendaDetalhada = new ArrayList<>();
            while(rs.next()){
                VendaDetalhada v = new VendaDetalhada();
                v.setIdVenda(rs.getInt("ID"));
                v.setNomeCliente(rs.getString("NOME"));
                v.setTituloProduto(rs.getString("TITULO"));
                v.setValorUnitario(rs.getDouble("VALOR"));
                v.setQuantidade(rs.getInt("QUANTIDADEVENDA"));
                v.setValorTotal(rs.getDouble("VALORTOTAL"));
                vendaDetalhada.add(v);
            }
            db.close();
            return vendaDetalhada;
        } catch(SQLException e){
            db.close();
            throw new RuntimeException(e);
            
        }
    }
}
