/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayaverage;

/**
 *
 * @author ERIC
 */
public class Arrayaverage {

    public static void main(String[] args) {
            // Input array
        int[] array = {10, 12, 34, 23, 56, 78};
        
        // Calculate the sum of the array elements
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        
        // Calculate the average
        double average = (double) sum / array.length;
        
        // Print the average
        System.out.println("The average of the array elements is: " + average);
    }
}
