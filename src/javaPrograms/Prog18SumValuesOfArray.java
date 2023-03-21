package javaPrograms;

import java.util.Arrays;

public class Prog18SumValuesOfArray {
    public static void main(String[] args) {
        // Declare int in array
        int[] nums = {2, 4, 6, 8, 10,12,14};

        // Declare and sum variable
        int sum = Arrays.stream(nums).sum();

        // Print total of array
        System.out.println("The sum of the array is: " + sum);
    }
}