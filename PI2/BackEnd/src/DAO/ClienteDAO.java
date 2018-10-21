
package DAO;

import Model.Cliente;
import java.util.ArrayList;

public class ClienteDAO {
    
    public static boolean Salvar(Cliente p)
    {
        return SimulaDB.getInstance().SalvarCliente(p);
    }
    
    public static boolean Atualizar(Cliente p)
    {
        return SimulaDB.getInstance().AtualizarCliente(p);
    }
    
    public static boolean Excluir(int indice)
    {
        return SimulaDB.getInstance().ExcluirCliente(indice);
    }
    
    public static ArrayList<Cliente> getClientes()
    {
        return SimulaDB.getInstance().getClientes();
    }
    
}
