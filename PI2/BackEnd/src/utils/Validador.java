/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author fernando.fernandes
 */
public class Validador {
    
    public static ArrayList<String> mensagensErro = new ArrayList<>();

    public static ArrayList<String> getMensagensErro() {
        return mensagensErro;
    }
    public static void ValidarNumero(JTextField txt) {
        
         try{
            //Verifico se o campo está vazio
            if(txt.getText().equals("")){
                 //Crio uma nova exceção para mudar a mensagem para o usuário   
                 throw new IllegalArgumentException();
             }
            
            //Trecho que pode ocorrer erro de conversão
            int valorConvertido = Integer.parseInt(txt.getText());
            txt.setBackground(Color.white);
        }
        catch (NumberFormatException e)
        {
           //Trato a exceção para a falha na conversão
           mensagensErro.add("Falha ao converter o valor do campo "+txt.getName()+" em inteiro");
           txt.setBackground(Color.red);
           
        }
        catch (IllegalArgumentException e)
        {
           //Trato a exceção para o campo vazio
           mensagensErro.add("Digite um valor para o campo "+txt.getName());
           txt.setBackground(Color.red);
        }
         
    }
     public static boolean isNumero(String s) {
        
        try{
            int valorConvertido = Integer.parseInt(s);
        }
        catch (NumberFormatException e)
        {
           mensagensErro.add("Falha ao converter o valor em inteiro");
        }
        catch(Exception e)
        {
            mensagensErro.add("Erro genérico ao converter o valor em inteiro");
        }
        
        return true;
    }
     
     public static void ValidarDecimal(JTextField txt) {
        
         try{
             
             if(txt.getText().equals("")){
                 throw new IllegalArgumentException();
             }
             
             double valor = Double.parseDouble(txt.getText().replace(',', '.'));
             txt.setBackground(Color.white);
        }
        catch (NumberFormatException e)
        {
           mensagensErro.add("Falha ao converter o valor do campo "+txt.getName()+" em decimal");
           txt.setBackground(Color.red);
           
        }
        catch (IllegalArgumentException e)
        {
           mensagensErro.add("Digite um valor para o campo "+txt.getName());
           txt.setBackground(Color.red);
        }
        catch(Exception e)
        {
           mensagensErro.add("Falha ao converter o valor do campo "+txt.getName()+" em decimal");
           txt.setBackground(Color.red);
           
        }
         
    }
     
     
    public static void limparMensagesErro() {
        
        mensagensErro.clear();
    }
    
    
}
  
