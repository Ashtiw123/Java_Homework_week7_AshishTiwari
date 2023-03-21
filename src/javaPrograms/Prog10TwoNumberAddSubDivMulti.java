package javaPrograms;
import java.util.Scanner;
public class Prog10TwoNumberAddSubDivMulti {
               public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter first number: ");
                double num1 = input.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = input.nextDouble();

                System.out.print("Enter an arithmetic symbol (+, -, *, /): ");
                char symbol = input.next().charAt(0);

                double result;

                if (symbol == '+') {
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                } else if (symbol == '-') {
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                } else if (symbol == '*') {
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                } else if (symbol == '/') {
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero");
                    } else {
                        result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    }
                } else {
                    System.out.println("Invalid arithmetic symbol");
                }
                input.close();
            }

        }









