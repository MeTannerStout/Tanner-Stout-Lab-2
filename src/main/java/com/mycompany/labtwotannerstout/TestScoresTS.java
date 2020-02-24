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
public class TestScoresTS {
    public static void main(String[] args) {
        //create scanner
        Scanner Keyboard = new Scanner(System.in);
        
        //create variables
        double score1;
        double score2;
        double score3;
        double average;
        
        //get user input
        System.out.println("Please enter the first score");
        score1 = Keyboard.nextDouble();
        System.out.println("Please enter the second score");
        score2 = Keyboard.nextDouble();
        System.out.println("Please enter the third score");
        score3 = Keyboard.nextDouble();
        
        //math
        average = (score1 + score2  + score3) / 3;
        
        //if statement to assign grade to number
        if(average < 60){
            System.out.printf("The average score is: %f. Thats a grade F", average);
            } else if (average < 70){
                System.out.printf("The average score is %f. Thats a grade D", average);
                    } else if (average < 80){
                    System.out.printf("The average score is %f. Thats a grade C", average);
                        } else if (average < 90){
                            System.out.printf("The average score is %f. Thats a grade B", average);
                                } else if (average < 100){
                                    System.out.printf("The average score is %f. Thats a grade A", average);
                                } else {
                                    System.out.println("The average score is " +average+ ". That number is invalid.");
        }
    }
    
}
