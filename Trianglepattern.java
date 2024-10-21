/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trianglepattern;

/**
 *
 * @author ERIC
 */
public class Trianglepattern {

    public static void main(String[] args) {
        int rows = 7; // Number of rows for the triangle
        
        for (int i = 1; i <= rows; i++) { // Loop for each row
            for (int j = 1; j <= i; j++) { // Loop for printing numbers in each row
                System.out.print(j + ""); // Print numbers from 1 to i
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    }
