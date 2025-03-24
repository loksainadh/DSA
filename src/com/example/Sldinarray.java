package com.example;
public class Sldinarray {
    public static void main(String[] args) {
        int[] d = {5, 4, 6, 2, 3}; // Array to be sorted

        // Bubble Sort for Ascending Order
        for (int i = 0; i < d.length - 1; i++) {
            for (int j = 0; j < d.length - 1 - i; j++) {
                if (d[j] > d[j + 1]) {  // Compare adjacent elements
                    // Swap d[j] and d[j+1]
                    int temp = d[j];
                    d[j] = d[j + 1];
                    d[j + 1] = temp;
                    
                }
            }
        }

        // Print the sorted array
        System.out.println(d[d.length-1]);
        for (int num : d) {
            System.out.print(num + " ");
        }
    }
}
