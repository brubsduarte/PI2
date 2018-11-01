
package DAO;

import Model.*;
import java.util.ArrayList;

public class SimulaDB {

    private static SimulaDB mockdb;

    private ArrayList<Cliente> listaClientes; //Simulo a tabela clientes
    private ArrayList<Produto> listaProdutos; //Simulo a tabela Produtos
    private ArrayList<Venda> listaVendas; //Simulo a tabela Produtos

    private SimulaDB() {

        listaClientes = new ArrayList<Cliente>();
        listaProdutos = new ArrayList<Produto>();
        listaVendas = new ArrayList<Venda>();
    }

    public static synchronized SimulaDB getInstance() {
        if (mockdb == null) {
            mockdb = new SimulaDB();
        }

        return mockdb;
    }

    public boolean SalvarCliente(Cliente c) {
        listaClientes.add(c);

        return true;
    }

    public ArrayList<Cliente> getClientes() {
        return this.listaClientes;
    }

    public boolean AtualizarCliente(Cliente p) {
        for (Cliente item : listaClientes) {
            if (item.getId() == p.getId()) {
                item.setNome(p.getNome());
                item.setCPF(p.getCPF());
            }
        }

        return true;
    }

    public boolean ExcluirCliente(int i) {
        listaClientes.remove(i);

        return true;
    }

    public boolean SalvarProduto(Produto c) {
        listaProdutos.add(c);

        return true;
    }

    public ArrayList<Produto> getProdutos() {
        return this.listaProdutos;
    }

    public boolean AtualizarProduto(Produto p) {
        for (Produto item : listaProdutos) {
            if (item.getIdProduto() == p.getIdProduto()) {
                item.settitulo(p.gettitulo());
                item.setgenero(p.getgenero());
                item.seteditora(p.geteditora());
                item.setautor(p.getautor());
                item.settipo(p.gettipo());
                item.setdescricao(p.getdescricao());
                item.setquantidade(p.getquantidade());
                item.setvalorUni(p.getvalorUni());
                
            }
        }

        return true;
    }

    public boolean ExcluirProduto(int i) {
        listaProdutos.remove(i);

        return true;
    }

}
