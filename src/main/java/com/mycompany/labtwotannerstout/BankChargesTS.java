/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labtwotannerstout;
import java.util.Scanner;
/**
 *
 * @author metan
 */
public class BankChargesTS {
    public static void main(String[] args) {
        
        Scanner Keyboard = new Scanner(System.in);
        
        String userInput;
        int userNumberOfChecks;
        double bankServiceFees;
        final double bankBaseFee = 10;
        String serviceFeeOutput;
        
        System.out.println("How many checks were written fro the month?");
        userNumberOfChecks = Keyboard.nextInt();
 
        
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
           System.out.println( serviceFeeOutput );
           
    }
}
