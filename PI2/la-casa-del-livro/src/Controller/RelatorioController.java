/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.RelatorioDAO;
import Model.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Bruna Duarte
 */
public class RelatorioController {
    
    public RelatorioController() {
    }

    public static ArrayList<String[]> getCompradores(Date dataInicial, Date dataFinal) {

        ArrayList<Cliente> clientes = RelatorioDAO.getCompradores(dataInicial, dataFinal);
        ArrayList<String[]> listaClientes = new ArrayList<>();
        
        for (int i = 0; i < clientes.size(); i++) {
            listaClientes.add(new String[]{
                clientes.get(i).getNome(),
                clientes.get(i).getCPF(),
                String.valueOf(clientes.get(i).getCompras())
            });
        }

        return listaClientes;
    }

    public static ArrayList<String[]> getProdutos(Date dataInicial, Date dataFinal) {

        ArrayList<Produto> produtos = RelatorioDAO.getProdutos(dataInicial, dataFinal);
        ArrayList<String[]> listaProdutos = new ArrayList<>();
        
        for (int i = 0; i < produtos.size(); i++) {
            listaProdutos.add(new String[]{
                produtos.get(i).gettitulo(),
                String.valueOf(produtos.get(i).getvalorUni()),
                String.valueOf(produtos.get(i).getquantidade()),
                String.valueOf(produtos.get(i).getTotalVenda()),
            });
        }

        return listaProdutos;
    }

    public static ArrayList<String[]> getVendas(Date dataInicial, Date dataFinal) {

        ArrayList<Venda> filtroVendas = RelatorioDAO.getVenda(dataInicial, dataFinal);
        ArrayList<String[]> listaVendas = new ArrayList<>();
        
        for (int i = 0; i < filtroVendas.size(); i++) {
            listaVendas.add(new String[]{
                String.valueOf(filtroVendas.get(i).getIdVenda()),
                filtroVendas.get(i).getNomeCliente(),
                Util.formatarData(filtroVendas.get(i).getData()),
                Util.formatarDinheiro(filtroVendas.get(i).getValorTotal()),
            });
        }

        return listaVendas;
    }
    
    public static ArrayList<VendaDetalhada> vendasDetalhadas(int idVenda){
        return RelatorioDAO.getVendaDetalhada(idVenda);
    }
}
