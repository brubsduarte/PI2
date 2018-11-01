/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ClienteDAO;
import Model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class VendaController {
    
    public Cliente pesquisaCliente(String cpf) {
        ClienteDAO clienteDao = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDao.getClientes();
        
        int len = clientes.size();
        for(int i = 0; i < len; i++) {
            if (clientes.get(i).getCPF().equals(cpf)) {
                return clientes.get(i);
            }
        }
        
        return null;
    }
}
