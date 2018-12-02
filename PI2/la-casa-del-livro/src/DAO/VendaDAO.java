package DAO;

import Model.Produto;
import Model.Venda;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gusta
 */
public class VendaDAO {

    public static boolean Salvar(Venda venda) {
        DB db = new DB(false);
        
        try {
            SimpleDateFormat df;
            df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dataFormatada = df.format(venda.getData());

            String sql = 
                    "INSERT INTO venda "
                    + "(data, valortotal, idcliente) "
                    + "VALUES ("
                    + "'"+dataFormatada+"', "
                    + venda.getValorTotal()+", "
                    + venda.getCliente().getId()+");";

            if (!db.executarAlteracao(sql)) {
                throw new Exception("Não foi possível adicionar a venda.");
            }
            
            String sqlConsulta = "SELECT id FROM venda WHERE data = '"+dataFormatada+"';";
            ResultSet rs = db.executarConsulta(sqlConsulta);

            int vendaID = 0;
            while (rs.next()) {
                vendaID = rs.getInt("id");
            }

            for (Produto produto : venda.getProdutos()) {
                String sqlInsert = "INSERT INTO vendaproduto "
                    + "(idproduto, quantidadevenda, idvenda) "
                    + "VALUES ("
                    + produto.getIdProduto()+", "
                    + produto.getquantidade()+", "
                    + vendaID+");";

                if (!db.executarAlteracao(sqlInsert)) {
                    throw new Exception("Não foi possível adicionar o produto.");
                }
                
                String sqlUpdate = "UPDATE produto SET "
                + "quantidade = "+(produto.getEstoque() - produto.getquantidade())+" "
                + "WHERE id = "+produto.getIdProduto()+";";
                
                if (!db.executarAlteracao(sqlUpdate)) {
                    throw new Exception("Não foi possível atualizar o produto.");
                }
            }
            
            db.commit();
            db.close();
            return true;
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
            db.rollback();
            db.close();
            return false;
        }
    }

    public static boolean Atualizar(Venda p) {
        return SimulaDB.getInstance().AtualizarVenda(p);
    }

    public static boolean Excluir(int indice) {
        return SimulaDB.getInstance().ExcluirVenda(indice);
    }

    public static ArrayList<Venda> getVenda() {
        return SimulaDB.getInstance().getVenda();
    }
}
