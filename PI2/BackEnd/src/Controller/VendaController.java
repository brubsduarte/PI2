/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import DAO.VendaDAO;
import DAO.ClienteDAO;
import Model.*;

import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class VendaController {
    
    public static boolean Salvar(int idVenda,ArrayList<Produto> produtos, int idCliente)
    {
        //Salvo na memória
        Venda p =  new Venda(idVenda, produtos, idCliente);
        return VendaDAO.Salvar(p);
    }
    
    public static boolean Excluir(int indice)
    {
        return VendaDAO.Excluir(indice);
    }
    
    public static boolean Atualizar(int idVenda,ArrayList<Produto> produtos, int idCliente)
    {
        Venda p =  new Venda(idVenda, produtos, idCliente);
        return VendaDAO.Atualizar(p);
        
    }
  
    public static ArrayList<String[]> getVendas(){
        ArrayList<Venda> Vendas = VendaDAO.getVendas();
        ArrayList<String[]> listaVendas = new ArrayList<>();
        
        for(int i=0;i<Vendas.size();i++){
            listaVendas.add(new String[]{
                
                String.valueOf(Vendas.get(i).getIdVenda()),
                String.valueOf(Vendas.get(i).getIdCliente()),
                String.valueOf(Vendas.get(i).getProdutos())
            
            });
        
        }
        
        return listaVendas;
        
    }
    
    
  
    public Cliente pesquisaCliente(String cpf) {
        VendaDAO clienteDao = new VendaDAO();
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        int len = clientes.size();
        for(int i = 0; i < len; i++) {
            if (clientes.get(i).getCPF().equals(cpf)) {
                return clientes.get(i);
            }
        }
        
        return null;
    }
}
