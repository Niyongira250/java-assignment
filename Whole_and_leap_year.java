/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.whole_and_leap_year;

/**
 *
 * @author ERIC
 */
import java.util.Scanner;
public class Whole_and_leap_year {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        // Check if the year is a leap year
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true; // Divisible by 400
                }
            } else {
                isLeapYear = true; // Divisible by 4 but not by 100
            }
        }

        // Output result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}
