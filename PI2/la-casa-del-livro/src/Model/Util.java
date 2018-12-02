/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Bruna
 */
public class Util {
    
    public static String formatarDinheiro(double number) {
        Locale meuLocal = new Locale( "pt", "BR" );
        NumberFormat format = NumberFormat.getCurrencyInstance(meuLocal);
        return format.format(number);       
    }
    
    public static String limpaFormatacao(String texto) {
        texto = texto.replaceAll("[^a-zA-Z0-9]", "");
        return texto;
    }
    
    public static String formatarData(Date data) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(data);
    }
}
