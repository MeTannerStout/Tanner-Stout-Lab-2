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
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        int UserNumber = -1;
        int sum = 0;
        
        while( UserNumber < 1) {
            System.out.println("Please enter a number that is not a negative number or zero: ");
            UserNumber = Keyboard.nextInt();
        }
        for(int number = 1; number <= UserNumber; number ++){
            sum = sum +number;  
        }
        System.out.println("The sum of the numbers from 1 to " + UserNumber + " is " + sum);
    }
    
}
