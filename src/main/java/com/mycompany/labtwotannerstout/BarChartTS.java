/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labtwotannerstout;
import javax.swing.JOptionPane;
/**
 *
 * @author metan
 */
public class BarChartTS {
    public static void main(String[] args) {
        
        int NumberOfStores = 5;
        String UserStringInput;
        double StoreSales;
        int NumberOfHundredDollarDivisions;
        String OutputString = "Sales Bar Chart\n";
       
        
        for( int store = 1; store <= NumberOfStores; store++ ){
            UserStringInput = JOptionPane.showInputDialog(" Enter today's store sales information" + store);
            StoreSales = Double.parseDouble(UserStringInput);
            NumberOfHundredDollarDivisions = (int) (StoreSales / 100);
            OutputString += "Store " + store + ": ";
            for(int printAsterisk = 1; printAsterisk <= NumberOfHundredDollarDivisions; printAsterisk++ ) {
                OutputString += "*";
            }
            OutputString += "\n";            
    }
    JOptionPane.showMessageDialog( null, OutputString );
    System.exit (0);
    }
}
