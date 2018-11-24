package DAO;

import Model.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ClienteDAO {

    public static boolean Salvar(Cliente c) {
        DB db = new DB();
        
        SimpleDateFormat df;
        df = new SimpleDateFormat("yyyy-MM-dd");
        String dataFormatada = df.format(c.getDataDeNascimento());
        
        String sql = 
                "INSERT INTO Cliente "
                + "(CPF, Nome, RG, Sexo, OrgaoEmissor, UF, DataNascimento, EstadoCivil, Email, TelefoneResidencial, TelefoneCelular, Rua, Numero, CEP, Complemento, Bairro, Cidade, Estado)"
                + "VALUES ("
                + "'"+c.getCPF()+"', "
                + "'"+c.getNome()+"', "
                + "'"+c.getRg()+"',"
                + "'"+c.getSexo()+"', "
                + "'"+c.getOrgaoEmissor()+"', "
                + "'"+c.getUf()+"', "
                + "'"+dataFormatada+"', "
                + "'"+c.getEstadoCivil()+"', "
                + "'"+c.getEmail()+"', "
                + "'"+c.getTelefone()+"', "
                + "'"+c.getCelular()+"', "
                + "'"+c.getEndereco()+"' , "
                + "'"+c.getNumeroCasa()+"', "
                + "'"+c.getCep()+"', "
                + "'"+c.getComplemento()+"', "
                + "'"+c.getComplemento()+"', "
                + "'"+c.getCidade()+"', "
                + "'"+c.getEstado()+"');";
        return db.executarAlteracao(sql);
    }

    public static boolean Atualizar(Cliente p) {
        return SimulaDB.getInstance().AtualizarCliente(p);
    }

    public static boolean Excluir(int indice) {
        return SimulaDB.getInstance().ExcluirCliente(indice);
    }

    public static ArrayList<Cliente> getClientes() {
        DB db = new DB();
        try {
            String sql = "SELECT * FROM cliente;";
            ResultSet rs = db.executarConsulta(sql);
            ArrayList<Cliente> clientes = new ArrayList();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt("ID"));
                c.setCPF(rs.getString("CPF"));
                c.setNome(rs.getString("Nome"));
                c.setRg(rs.getString("RG"));
                c.setSexo(rs.getString("Sexo"));
                c.setOrgaoEmissor(rs.getString("OrgaoEmissor"));
                c.setUf(rs.getString("UF"));
                c.setDataDeNascimento(rs.getDate("DataNascimento"));
                c.setEstadoCivil(rs.getString("EstadoCivil"));
                c.setEmail(rs.getString("Email"));
                c.setNumeroCasa(rs.getString("Numero"));
                c.setCep(rs.getString("CEP"));
                c.setCelular(rs.getString("TelefoneCelular"));
                c.setTelefone(rs.getString("TelefoneResidencial"));
                c.setComplemento(rs.getString("Complemento"));
                c.setEndereco(rs.getString("Rua"));
                c.setBairro(rs.getString("Bairro"));
                c.setCidade(rs.getString("Cidade"));
                c.setEstado(rs.getString("Estado"));
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

    public static ArrayList<Cliente> filtroCliente(int id, String nome, String cpf, String rg) {
        return SimulaDB.getInstance().filtroCliente(id, nome, cpf, rg);
    }

}
