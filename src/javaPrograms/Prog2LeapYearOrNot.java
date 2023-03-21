package javaPrograms;

import java.util.Scanner;

public class Prog2LeapYearOrNot {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Year: ");
        year = scanner.nextInt();
        /*We use a series of if-else statements to check if the input year is a leap year or not.
        According to the leap year rule, if a year is divisible by 4, it's a potential leap year.
        However, there are exceptions to this rule. If a year is divisible by 100, it's not a leap year,
        unless it's also divisible by 400. For example, 2000 was a leap year because it's divisible by 400,
        but 1900 was not a leap year because it's divisible by 100 but not by 400.
        We print the result to the console using the System.out.println() method.*/
        // if (year % 4==0){
        //      System.out.println("leap year");
        //  }else{
        //      System.out.println("not a leap year");
        //}

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
            scanner.close();
        }
    }
}

