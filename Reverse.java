/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reverse;

/**
 *
 * @author ERIC
 */
public class Reverse {

    public static void main(String[] args) {
        // Input array
        int[] array = {3, 4, 6, 1, 9, 7, 5, 8};
        
        // Print original array
        System.out.print("Original Array: ");
        printArray(array);
        
        // Reverse the array using a for loop
        for (int i = 0; i < array.length / 2; i++) {
            // Swap elements
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        
        // Print the reversed array
        System.out.print("Reversed Array: ");
        printArray(array);
    }
    
    // Method to print the array using streams
    public static void printArray(int[] array) {
        // Using Java Streams to print the array
        System.out.println(java.util.Arrays.toString(array));
    }
}
