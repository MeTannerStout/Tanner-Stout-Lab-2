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
public class BankChargesTS {
    public static void main(String[] args) {
        
        String userInput;
        int userNumberOfChecks;
        double bankServiceFees;
        final double bankBaseFee = 10;
        String serviceFeeOutput;
        
        userInput = JOptionPane.showInputDialog("How many checks were written fro the month?");
        userNumberOfChecks = Integer.parseInt(userInput);
        
        if(userNumberOfChecks < 20){
            bankServiceFees = bankBaseFee + (userNumberOfChecks * 0.10);
        } else if(userNumberOfChecks < 40) { 
            bankServiceFees = bankBaseFee + (userNumberOfChecks * 0.08);
        }else if(userNumberOfChecks < 60) { 
            bankServiceFees = bankBaseFee + (userNumberOfChecks * 0.06);
        } else {
            bankServiceFees = bankBaseFee + (userNumberOfChecks * 0.04);
        }
           serviceFeeOutput = String.format("Service Fee; $%,.2f", bankServiceFees);
           JOptionPane.showInputDialog(serviceFeeOutput);
           
           System.exit(0);
    }
}
