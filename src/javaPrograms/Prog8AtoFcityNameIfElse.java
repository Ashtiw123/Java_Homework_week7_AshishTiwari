package javaPrograms;

import java.util.Scanner;

public class Prog8AtoFcityNameIfElse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an alphabet from A to F: ");
        String alphabet = input.nextLine();

        if (alphabet.equalsIgnoreCase("A")) {
            System.out.println("City name is Ahmedabad");
        } else if (alphabet.equalsIgnoreCase("B")) {
            System.out.println("City name is Bangalore");
        } else if (alphabet.equalsIgnoreCase("C")) {
            System.out.println("City name is Chennai");
        } else if (alphabet.equalsIgnoreCase("D")) {
            System.out.println("City name is Delhi");
        } else if (alphabet.equalsIgnoreCase("E")) {
            System.out.println("City name is Etawah");
        } else if (alphabet.equalsIgnoreCase("F")) {
            System.out.println("City name is Faridabad");
        } else {
            System.out.println("Invalid entry");
        }
        input.close();
    }
}

