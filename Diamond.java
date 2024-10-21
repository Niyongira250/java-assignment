/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diamond;



/**
 *
 * @author ERIC
 */
import java.util.Scanner;
public class Diamond {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of rows for the diamond: ");
        int rows = scanner.nextInt();

        // Upper part of the diamond
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            // Print spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
