/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checknumber;



/**
 *
 * @author ERIC
 */
import java.util.Scanner;
public class Checknumber {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        
        // Check whether the number is positive, negative, or zero
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
        
        scanner.close();
    }
}
