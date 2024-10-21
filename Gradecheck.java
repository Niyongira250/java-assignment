/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gradecheck;



/**
 *
 * @author ERIC
 */
import java.util.Scanner;
public class Gradecheck {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter your grade (A, B, C, D, F): ");
        char grade = scanner.next().toUpperCase().charAt(0); // Convert to uppercase for consistency
        
        // Determine the message based on the grade using switch statement
        switch (grade) {
            case 'A':
                System.out.println("Excellent! Keep up the great work!");
                break;
            case 'B':
                System.out.println("Well done! Good job!");
                break;
            case 'C':
                System.out.println("You passed! But needs improvement.");
                break;
            case 'D':
                System.out.println("You need to work harder. Don't give up!");
                break;
            case 'F':
                System.out.println("Failing is part of learning. Try again!");
                break;
            default:
                System.out.println("Invalid grade entered. Please enter A, B, C, D, or F.");
        }
        
        scanner.close();
    }
}
