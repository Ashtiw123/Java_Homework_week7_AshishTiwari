package javaPrograms;
import java.util.Scanner;
public class Prog12AlphabetNumberOrSymbol {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a value: ");
            String inputStr = scanner.nextLine();

            if (inputStr.matches("[0-9]+")) {
                System.out.println("Input is a number");
            } else if (inputStr.matches("[a-zA-Z]+")) {
                System.out.println("Input is an alphabet");
            } else {
                System.out.println("Input is a symbol");
            } scanner.close();
        }
    }



