package javaPrograms;

import java.util.Scanner;

/*Write a java program that tells us that Input number is odd or even?
 * HINT: using ternary operator (? :)
 */
public class Prog1OddOrEven {
    public static void main(String[] args) {
        //declaring variable
        int a;
        //running scanner
        Scanner scanner = new Scanner(System.in);
        //User guidance printing command
        System.out.println("Enter a number");
        //assigning value to scanner
        a = scanner.nextInt();

        /* The ternary operator, also known as the conditional operator, is a shorthand way of
         *writing an if-else statement in Java. It takes three operands: a Boolean expression,
         *a value to return if the Boolean expression is true,
         *and a value to return if the Boolean expression is false.
         *variable when divided by 2 if no remainder variable is declared even
         * variable when divided by 2 if any remainder value is declared odd
         */
         //method         boolean           True                    False
        String message = a % 2 == 0 ? "The number is even." : "The number is odd.";
        System.out.println(message);

        scanner.close();
    }
}
