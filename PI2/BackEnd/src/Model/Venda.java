/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class Venda {
    
    private int idVenda;
    private ArrayList<Produto> produtos;
    private int idCliente;

    public Venda() {
    }

    public Venda(int idVenda, ArrayList<Produto> produtos, int idCliente) {
        this.idVenda = idVenda;
        this.produtos = produtos;
        this.idCliente = idCliente;
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
