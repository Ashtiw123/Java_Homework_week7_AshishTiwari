package javaPrograms;

import java.util.Arrays;

public class Prog17NumericArrayAndStringArray {
    // Numeric array
    public static void main(String[] args) {
        int[] nums = { 1, 2,3,4};
        System.out.println("Original numeric array: " + Arrays.toString(nums));

        // Sort numeric array
        Arrays.sort(nums);
        System.out.println("Sorted numeric array: " + Arrays.toString(nums));

        // String array
        String[] words = {"orange", "apple", "banana", "pear", "grape"};
        System.out.println("Original string array: " + Arrays.toString(words));

        // Sort string array
        Arrays.sort(words);
        System.out.println("Sorted string array: " + Arrays.toString(words));
    }
}

