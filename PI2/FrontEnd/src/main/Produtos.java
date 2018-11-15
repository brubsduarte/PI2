/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author marcel.bcardoso
 */
public class Produtos {
    private String titulo;
    private String genero;
    private String editora;
    private String autor;
    private String tipo;

ArrayList<Produtos> lista = new ArrayList <Produtos>();
    
    
    public Produtos(){
        
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setGenero (String genero){
        this.genero = genero;
    }
    public void setEditora(String editora){
        this.editora = editora;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setTipo (String tipo){
        this.tipo = tipo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public String getGenero(){
        return genero;
    }
    public String getEditora(){
        return editora;
    }
    public String setAutor(){
        return autor;
    }
    public String setTipo(){
        return tipo;
    }
    
}
