
package DAO;

import Model.*;
import java.util.ArrayList;

public class SimulaDB {

    private static SimulaDB mockdb;

    private ArrayList<Cliente> listaClientes; //Simulo a tabela clientes
    private ArrayList<Produto> listaProdutos; //Simulo a tabela Produtos
    private ArrayList<Venda> listaVendas; //Simulo a tabela Venda
    
    
    

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
                item.setSexo(p.getSexo());
                item.setRg(p.getRg());
                item.setOrgaoEmissor(p.getOrgaoEmissor());
                item.setUf(p.getUf());
                item.setEstadoCivil(p.getEstadoCivil());
                item.setEmail(p.getEmail());
                item.setTelefone(p.getTelefone());
                item.setCelular(p.getCelular());
                item.setEndereco(p.getEndereco());
                item.setNumeroCasa(p.getNumeroCasa());
                item.setComplemento(p.getComplemento());
                item.setCep(p.getCep());
                item.setEstado(p.getEstado());
                item.setCidade(p.getCidade());
                item.setBairro(p.getBairro());
                //item.setDataDeNascimento(p.getDataDeNascimento());
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
    
        public boolean SalvarVenda(Venda c) {
        listaVendas.add(c);

        return true;
    }

    public ArrayList<Venda> getVenda() {
        return this.listaVendas;
    }

    public boolean AtualizarVenda(Venda p) {
//        for (Venda item : listaVendas) {
//            if (item.getIdVenda()== p.getIdVenda()) {
//                item.setIdCliente(p.getIdCliente());
//                item.setProdutos(p.getProdutos());
//                
//            }
//        }

        return true;
    }
    
 
    public boolean ExcluirVenda(int i) {
        listaVendas.remove(i);

        return true;
    }
    
    
    
    
    
    
    

}

