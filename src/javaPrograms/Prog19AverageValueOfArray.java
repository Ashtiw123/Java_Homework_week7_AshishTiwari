package javaPrograms;

import java.util.Arrays;

public class Prog19AverageValueOfArray {
    public static void main(String[] args) {
        // Declare and initialize integer array
        int[] nums = { 2, 4, 6, 8, 10,12,14,16 };

        // Use the Arrays.stream() method and the average() method to calculate the average of the array
        double average = Arrays.stream(nums).average().orElse(Double.NaN);

        // Print average of array
        System.out.println("The average of the array is: " + average);
    }
}




