
package DAO;

import Model.*;
import java.util.ArrayList;
import java.util.Calendar;

public class SimulaDB {

    private static SimulaDB mockdb;

    private ArrayList<Cliente> listaClientes; //Simulo a tabela clientes
    private ArrayList<Produto> listaProdutos; //Simulo a tabela Produtos
    private ArrayList<Venda> listaVendas; //Simulo a tabela Venda
    
    private SimulaDB() {

        listaClientes = new ArrayList<>();
        listaProdutos = new ArrayList<>();
        listaVendas = new ArrayList<>();
        criaListaVenda();
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
    public ArrayList<Cliente> filtroCliente(int id, String nome, String cpf, String rg) {
        ArrayList<Cliente> listaFiltrada = new ArrayList<Cliente>();
        
        if(id > 0){
            for(Cliente c: this.listaClientes){
                if(c.getId() == id){
                    listaFiltrada.add(c);
                    return listaFiltrada;
                }
            }
        }
        
        if(!cpf.equals("")){
            for(Cliente c: this.listaClientes){
                if(c.getCPF().equals(cpf)){
                    listaFiltrada.add(c);
                    return listaFiltrada;
                }
            }
        }
        
        if(!nome.equals("")){
            for(Cliente c: this.listaClientes){
                if(c.getNome().contains(nome)){
                    listaFiltrada.add(c);
                    return listaFiltrada;
                }
            }
        }
        
        if(!rg.equals("")){
            for(Cliente c: this.listaClientes){
                if(c.getRg().contains(rg)){
                    listaFiltrada.add(c);
                    return listaFiltrada;
                }
            }
        }
        return listaFiltrada;
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
                item.setDataDeNascimento(p.getDataDeNascimento());
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

    private void criaListaVenda() {
        Calendar c = Calendar.getInstance();
        
        Cliente cliente1 = new Cliente(1, "Gustavo", "213434235", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        Cliente cliente2 = new Cliente(2, "Felipe", "131232113", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        Cliente cliente3 = new Cliente(3, "Caio", "213434235", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        
        Produto produto1 = new Produto(1, "Senhor dos aneis - Sociedade do anel", "Aventura", null, "J.R.R Tolken", null, null, 0, 10.00);
        Produto produto2 = new Produto(2, "Senhor dos aneis - Duas torres", "Aventura", null, "J.R.R Tolken", null, null, 0, 20.00);
        Produto produto3 = new Produto(3, "Senhor dos aneis - Retorno do rei", "Aventura", null, "J.R.R Tolken", null, null, 0, 30.00);
        
        ArrayList<Produto> produtos = new ArrayList();
        produtos.add(produto1);
        produtos.add(produto1);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        
        c.set(2018, Calendar.NOVEMBER, 10);
        Venda venda1 = new Venda(1, produtos, cliente1, 80.00f, c.getTime());
        
        produtos.add(produto1);
        produtos.add(produto2);
        
        c.set(2018, Calendar.AUGUST, 11);
        Venda venda2 = new Venda(2, produtos, cliente2, 110.00f, c.getTime());
        
        produtos.add(produto1);
        produtos.add(produto1);
        
        c.set(2018, Calendar.AUGUST, 12);
        Venda venda3 = new Venda(3, produtos, cliente3, 130.00f, c.getTime());
        
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        
        c.set(2018, Calendar.NOVEMBER, 10);
        Venda venda4 = new Venda(1, produtos, cliente1, 190.00f, c.getTime());
        
        ArrayList<Venda> vendas = new ArrayList();
        vendas.add(venda1);
        vendas.add(venda2);
        vendas.add(venda3);
        vendas.add(venda4);
        
        this.listaVendas = vendas;
    }
    
    public boolean AtualizarVenda(Venda p) {
        for (Venda item : listaVendas) {
            if (item.getIdVenda()== p.getIdVenda()) {
                item.setCliente(p.getCliente());
                item.setProdutos(p.getProdutos());
            }
        }

        return true;
    }
    
 
    public boolean ExcluirVenda(int i) {
        listaVendas.remove(i);

        return true;
    }
    
    
    
    
    
    
    

}

