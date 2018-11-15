/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import main.Menu;

/**
 *
 * @author Marcel B. Cardoso
 */
public class Main {

    /**
     * @param args the command line arguments
     */
public static void main( String[] args ) throws UnsupportedLookAndFeelException {
UIManager.setLookAndFeel(new NimbusLookAndFeel());
        // TODO code application logic here
        Menu menuInicial = new Menu();
        menuInicial.setVisible(true);
        menuInicial.setLocationRelativeTo(null);
    }
    
}
