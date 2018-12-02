/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/**
 *
 * @author gusta
 */
public class Venda {
    
    private int idVenda;
    private ArrayList<Produto> produtos;
    private Cliente cliente;
    private float valorTotal;
    private Date data;
    private String nomeCliente;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Venda() {
    }

    public Venda(int idVenda, ArrayList<Produto> produtos, Cliente cliente, float valorTotal, Date data) {
        this.idVenda = idVenda;
        this.produtos = produtos;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.data = data;
    }
    
    public Venda(ArrayList<String[]> produtos, Cliente cliente, Date data) {
        this.produtos = converteProdutos(produtos);
        this.cliente = cliente;
        this.valorTotal = getTotal(produtos);
        this.data = data;
    }
    
    private ArrayList<Produto> converteProdutos(ArrayList<String[]> produtosLista) {
        ArrayList<Produto> novosProdutos = new ArrayList();
        for (String[] strings : produtosLista) {
            novosProdutos.add(new Produto(
                                          Integer.valueOf(strings[0]), 
                                          strings[1], 
                                          strings[2], 
                                          Integer.valueOf(strings[4]), 
                                          Double.valueOf(strings[3]),
                                          Integer.valueOf(strings[5])));
        }
        return novosProdutos;
    }
    
    private float getTotal(ArrayList<String[]> produtosLista) {
        float valor = 0f;

        for (String[] produto : produtosLista) {
            valor += Float.valueOf(produto[3]) * Float.valueOf(produto[4]);
        }
        
        return valor;
    }
    
    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }
    
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public double getValorTotal() {
        return valorTotal;
    }

    public Date getData() {
        return data;
    }
    
    public static ArrayList<String[]> getCompradores(ArrayList<Venda> vendas) {
        ArrayList<Cliente> clientes = new ArrayList();

        for (Venda venda : vendas) {
            clientes.add(venda.getCliente());
        }

        ArrayList<String[]> clientesOrndenados = new ArrayList();

        Set<Cliente> unique = new HashSet<>(clientes);
        for (Cliente key : unique) {
            String[] clienteArray = new String[]{
                key.getNome(),
                key.getCPF(),
                String.valueOf(Collections.frequency(clientes, key))
            };
            clientesOrndenados.add(clienteArray);
        }

        clientesOrndenados = ordenaMelhoresCompradores(clientesOrndenados);
        
        return clientesOrndenados;
    }
    
    public static ArrayList<String[]> getVendasOrdenadas(ArrayList<Venda> vendas) {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        
        ArrayList<String[]> vendasOrndenadas = new ArrayList();
        
        for (Venda venda : vendas) {
            vendasOrndenadas.add(new String[]{
                String.valueOf(venda.getIdVenda()),
                venda.getCliente().getNome(),
                simpleDateFormat.format(venda.getData()),
                Util.formatarDinheiro(venda.getValorTotal()),
                String.valueOf(venda.getValorTotal())
            });
        }

        vendasOrndenadas = sortVendas(vendasOrndenadas);
        
        return vendasOrndenadas;
    }
    
    public static float getTotalVendas(ArrayList<Venda> vendas) {
        
        float valorTotal = 0f;
        
        for (Venda venda : vendas) {
            valorTotal += venda.getValorTotal();
        }

        return valorTotal;
    }
    
    public static ArrayList<String[]> getProdutosOrdenados(ArrayList<Venda> vendas) {
        ArrayList<Produto> produtos = new ArrayList();

        for (Venda venda : vendas) {
            produtos.addAll(venda.getProdutos());
        }

        ArrayList<String[]> produtosOrndenados = new ArrayList();

        Set<Produto> unique = new HashSet<>(produtos);
        for (Produto key : unique) {
            int quantidade = Collections.frequency(produtos, key);
            String[] produtoArray = new String[]{
                key.gettitulo(),
                Util.formatarDinheiro((float)key.getvalorUni()),
                String.valueOf(quantidade),
                Util.formatarDinheiro((float)(quantidade * key.getvalorUni()))
            };
            produtosOrndenados.add(produtoArray);
        }

        produtosOrndenados = sortProdutos(produtosOrndenados);
        
        return produtosOrndenados;
    }
    
    private static ArrayList<String[]> ordenaMelhoresCompradores(ArrayList<String[]> arr) {
        int n = arr.size();
        String[] temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (Integer.valueOf(arr.get(j - 1)[2]) < Integer.valueOf(arr.get(j)[2])) {
                    
                    temp = arr.get(j - 1);
                    arr.set(j - 1, arr.get(j));
                    arr.set(j, temp);
                }

            }
        }

        return arr;
    }
    
    private static ArrayList<String[]> sortVendas(ArrayList<String[]> arr) {
        int n = arr.size();
        String[] temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (Float.valueOf(arr.get(j - 1)[4]) < Float.valueOf(arr.get(j)[4])) {
                    
                    temp = arr.get(j - 1);
                    arr.set(j - 1, arr.get(j));
                    arr.set(j, temp);
                }

            }
        }

        return arr;
    }
    
    static ArrayList<String[]> sortProdutos(ArrayList<String[]> arr) {
        int n = arr.size();
        String[] temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (Integer.valueOf(arr.get(j - 1)[2]) < Integer.valueOf(arr.get(j)[2])) {
                    
                    temp = arr.get(j - 1);
                    arr.set(j - 1, arr.get(j));
                    arr.set(j, temp);
                }

            }
        }

        return arr;
    }
}
