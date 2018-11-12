/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.ArrayList;
import java.util.Date;

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

    public Venda() {
    }

    public Venda(int idVenda, ArrayList<Produto> produtos, Cliente cliente, float valorTotal, Date data) {
        this.idVenda = idVenda;
        this.produtos = produtos;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.data = data;
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
    
    public float getValorTotal() {
        return valorTotal;
    }

    public Date getData() {
        return data;
    }
}
