package javaPrograms;
import java.util.Scanner;
public class Prog9AtoFcityNameSwitch {

            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter an alphabet from A to F: ");
                String alphabet = input.nextLine();

                switch (alphabet.toUpperCase()) {
                    case "A":
                        System.out.println("City name is Ahmedabad");
                        break;
                    case "B":
                        System.out.println("City name is Bangalore");
                        break;
                    case "C":
                        System.out.println("City name is Chennai");
                        break;
                    case "D":
                        System.out.println("City name is Delhi");
                        break;
                    case "E":
                        System.out.println("City name is Etawah");
                        break;
                    case "F":
                        System.out.println("City name is Faridabad");
                        break;
                    default:
                        System.out.println("Invalid entry");
                }
                input.close();
            }
        }

