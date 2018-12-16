/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessgame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kiptoo David
 * 
 * A guess game that asks users to guess a number between 1 and 100
 * After guessing, it gives you a hint on whether the answer is lower or higher
 * if the guess is correct print the number of tries
 */
public class GuessGame {

    public static void main(String[] args) {
        final int MAX = 100;
        int answer;
        int guess;
        int count = 1;
        
        Scanner scan = new Scanner(System.in);
        
        Random generator = new Random();
        answer = generator.nextInt(MAX) + 1;
        
        System.out.println("I am thinking of a number between 1 and " + MAX + " What is it?");
        
        guess = scan.nextInt();
        
        while(guess != answer){
            if(guess > answer){
             System.out.println("Please answer is Lower....");   
            }
            else{
                System.out.println("Please answer is Higher...");
            }
            System.out.println("Try and Guess again please; ");
            guess = scan.nextInt();
            
            count++;
        }
        System.out.println("Congratulation!!! You got it in " + count +"tries");
    }
    
}
