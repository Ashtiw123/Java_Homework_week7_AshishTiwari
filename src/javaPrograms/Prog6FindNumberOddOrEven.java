package javaPrograms;

import java.util.Scanner;

public class Prog6FindNumberOddOrEven {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        a= scanner.nextInt();
        int num = a;

        if(num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
            scanner.close();
        }

    }



}
