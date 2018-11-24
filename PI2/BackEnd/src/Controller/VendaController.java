/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ClienteDAO;
import DAO.ProdutoDAO;
import DAO.VendaDAO;
import Model.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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

    public static boolean Salvar(int idVenda, ArrayList<Produto> produtos, Cliente cliente, float valorTotal, Date data) {
        //Salvo na memória
        Venda p = new Venda(idVenda, produtos, cliente, valorTotal, data);
        return VendaDAO.Salvar(p);
    }

    public static boolean Salvar(ArrayList<String[]> produtos, String[] cliente, Date data) {
        //Salvo na memória
        Venda p = new Venda(produtos, cliente, data);
        return VendaDAO.Salvar(p);
    }

    public static boolean Excluir(int indice) {
        return VendaDAO.Excluir(indice);
    }

    public static boolean Atualizar(int idVenda, ArrayList<Produto> produtos, Cliente cliente, float valorTotal, Date data) {
        Venda p = new Venda(idVenda, produtos, cliente, valorTotal, data);
        return VendaDAO.Atualizar(p);

    }

    public static ArrayList<Venda> getVendas() {

        return VendaDAO.getVenda();
    }

    public Cliente pesquisaCliente(String cpf) {
        ArrayList<Cliente> clientes;
        clientes = new ArrayList<>();

        int len = clientes.size();
        for (int i = 0; i < len; i++) {
            if (clientes.get(i).getCPF().equals(cpf)) {
                return clientes.get(i);
            }
        }

        return null;
    }

    public ArrayList<String[]> getCompradores() {

        return Venda.getCompradores(vendasFiltradas);
    }

    public static ArrayList<String[]> getClientes() {
        ArrayList<Cliente> clientes = ClienteDAO.getClientes();
        ArrayList<String[]> listaClientes = new ArrayList<>();

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        for (int i = 0; i < clientes.size(); i++) {
            listaClientes.add(new String[]{String.valueOf(clientes.get(i).getId()),
                clientes.get(i).getNome(),
                clientes.get(i).getCPF()
            });

        }

        return listaClientes;

    }

    public static ArrayList<String[]> getProdutos() {
        ArrayList<Produto> produtos = ProdutoDAO.getProdutos();
        ArrayList<String[]> listaProdutos = new ArrayList<>();

        for (int i = 0; i < produtos.size(); i++) {
            listaProdutos.add(new String[]{
                String.valueOf(produtos.get(i).getIdProduto()),
                produtos.get(i).gettitulo(),
                produtos.get(i).getautor(),
                String.valueOf(produtos.get(i).getvalorUni()),});
        }
        return listaProdutos;
    }

    public ArrayList<String[]> getVendasOrdenadas() {

        return Venda.getVendasOrdenadas(vendasFiltradas);
    }

    public float getTotalVendas() {

        return Venda.getTotalVendas(vendasFiltradas);
    }

    public boolean filtraVendas(Date dataInicial, Date dataFinal) {

        vendasFiltradas = new ArrayList();

        for (Venda venda : vendas) {
            if (venda.getData().compareTo(dataInicial) >= 0 && venda.getData().compareTo(dataFinal) <= 0) {
                vendasFiltradas.add(venda);
            }
        }

        return !vendasFiltradas.isEmpty();
    }

    public void limparFiltros() {
        vendasFiltradas = vendas;
    }

}
