package ls;

import java.util.Arrays;
import java.util.Scanner;
public class lab_exam {
    public static void main(String[] args) {
        String[] stringArray = {"orange", "apple", "banana", "grape", "pear"};
        // Display the original array
        System.out.println("Original Array:");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println();

        // Sort the array using bubble sort
        bubbleSort(stringArray);

        // Display the sorted array
        System.out.println("Sorted Array:");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
    }

    public static void bubbleSort(String[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Swap elements
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
