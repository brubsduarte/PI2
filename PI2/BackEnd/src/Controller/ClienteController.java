
package Controller;

import DAO.ClienteDAO;
import Model.Cliente;
import java.util.ArrayList;

public class ClienteController {
    
   
    public static boolean Salvar(int pId,String pNome, String pCPF)
    {
        //Salvo na memória
        Cliente p =  new Cliente(pId,pNome,pCPF);
        return ClienteDAO.Salvar(p);
    }
    
    public static boolean Excluir(int indice)
    {
        return ClienteDAO.Excluir(indice);
    }
    
    public static boolean Atualizar(int pId, String pNome, String pCPF)
    {
        Cliente p =  new Cliente(pId,pNome,pCPF);
        return ClienteDAO.Atualizar(p);
        
    }
  
    public static ArrayList<String[]> getClientes()
    {
        ArrayList<Cliente> clientes = ClienteDAO.getClientes();
        ArrayList<String[]> listaClientes = new ArrayList<>();
        
        for(int i=0;i<clientes.size();i++)
        {
            listaClientes.add(new String[]{
            String.valueOf(clientes.get(i).getId()),
            clientes.get(i).getNome(),
            clientes.get(i).getCPF()
            
            });
        
        }
        
        return listaClientes;
        
    }
    
}
