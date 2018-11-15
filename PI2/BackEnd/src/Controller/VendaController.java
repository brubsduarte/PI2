/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import DAO.VendaDAO;
import Model.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author gusta
 */
public class VendaController {

    public ArrayList<Venda> vendas;
    public ArrayList<Venda> vendasFiltradas;
    
    public VendaController() {
        vendas = VendaController.getVendas();
        vendasFiltradas = vendas;
    }
    
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
  
    public Cliente pesquisaCliente(String cpf) {
        ArrayList<Cliente> clientes;
        clientes = new ArrayList<>();
        
        int len = clientes.size();
        for(int i = 0; i < len; i++) {
            if (clientes.get(i).getCPF().equals(cpf)) {
                return clientes.get(i);
            }
        }
        
        return null;
    }
    
    public ArrayList<String[]> getCompradores() {
        
        return Venda.getCompradores(vendasFiltradas);
    }
    
    public ArrayList<String[]> getProdutos() {
        
        return Venda.getProdutosOrdenados(vendasFiltradas);
    }
    
    public ArrayList<String[]> getVendasOrdenadas() {
        
        return Venda.getVendasOrdenadas(vendasFiltradas);
    }
    
    public float getTotalVendas() {
        
        return Venda.getTotalVendas(vendasFiltradas);
    }
    
    public boolean filtraVendas(Date dataInicial, Date dataFinal) {
        
        vendasFiltradas = new ArrayList();

        for(Venda venda : vendas) {
            if(venda.getData().compareTo(dataInicial) >= 0 && venda.getData().compareTo(dataFinal) <= 0) {
                vendasFiltradas.add(venda);
            }
        }
        
        if(vendasFiltradas.isEmpty()) {
            return false;
        }
         
        return true;
    }
    
    public void limparFiltros() {
        vendasFiltradas = vendas;
    }
}
