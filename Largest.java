/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.largest;

/**
 *
 * @author ERIC
 */
public class Largest {

    public static void main(String[] args) {
       // Input array
        int[] array = {34, 23, 12, 45, 67, 89, 234, 26, 10, 30, 43};
        
        // Initialize the largest element
        int largest = array[0]; // Assume the first element is the largest
        
        // Loop through the array to find the largest element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i]; // Update largest if current element is greater
            }
        }
        
        // Print the largest element
        System.out.println("The largest element in the array is: " + largest);
    }
}
