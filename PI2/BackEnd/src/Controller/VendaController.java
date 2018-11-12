/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import DAO.VendaDAO;
import DAO.ClienteDAO;
import Model.*;
import java.time.Instant;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author gusta
 */
public class VendaController {
    
    public static boolean Salvar(int idVenda, ArrayList<Produto> produtos, Cliente cliente, float valorTotal, Date data)
    {
        //Salvo na memória
        Venda p =  new Venda(idVenda, produtos, cliente,valorTotal, data);
        return VendaDAO.Salvar(p);
    }
    
    public static boolean Excluir(int indice)
    {
        return VendaDAO.Excluir(indice);
    }
    
    public static boolean Atualizar(int idVenda, ArrayList<Produto> produtos, Cliente cliente, float valorTotal, Date data)
    {
        Venda p =  new Venda(idVenda, produtos, cliente,valorTotal, data);
        return VendaDAO.Atualizar(p);
        
    }
  
    public static ArrayList<Venda> getVendas(){

        return VendaDAO.getVenda();
    }
    
    public static ArrayList<Venda> getVendasProntas(){
        Calendar c = Calendar.getInstance();
        
        Cliente cliente1 = new Cliente(1, "Gustavo", "213434235", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        Cliente cliente2 = new Cliente(2, "Felipe", "131232113", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        Cliente cliente3 = new Cliente(3, "Caio", "213434235", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        
        Produto produto1 = new Produto(1, "Senhor dos aneis - Sociedade do anel", "Aventura", null, "J.R.R Tolken", null, null, 0, 101.99);
        Produto produto2 = new Produto(2, "Senhor dos aneis - Duas torres", "Aventura", null, "J.R.R Tolken", null, null, 0, 150.99);
        Produto produto3 = new Produto(3, "Senhor dos aneis - Retorno do rei", "Aventura", null, "J.R.R Tolken", null, null, 0, 75.99);
        
        ArrayList<Produto> produtos = new ArrayList();
        produtos.add(produto1);
        produtos.add(produto1);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        
        c.set(2018, Calendar.NOVEMBER, 10);
        Venda venda1 = new Venda(1, produtos, cliente1, 30.00f, c.getTime());
        c.set(2018, Calendar.AUGUST, 11);
        Venda venda2 = new Venda(2, produtos, cliente2, 50.00f, c.getTime());
        c.set(2018, Calendar.AUGUST, 12);
        Venda venda3 = new Venda(3, produtos, cliente3, 40.00f, c.getTime());
        c.set(2018, Calendar.NOVEMBER, 10);
        Venda venda4 = new Venda(1, produtos, cliente1, 60.00f, c.getTime());
        
        ArrayList<Venda> vendas = new ArrayList();
        vendas.add(venda1);
        vendas.add(venda2);
        vendas.add(venda3);
        vendas.add(venda4);
        
        return vendas;
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
