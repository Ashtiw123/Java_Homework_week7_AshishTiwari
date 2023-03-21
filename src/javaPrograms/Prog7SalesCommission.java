package javaPrograms;

import java.util.Scanner;

public class Prog7SalesCommission {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input sales id, seller's name, sales amount, and salary basic
        System.out.print("Enter Sales ID: ");
        int salesId = input.nextInt();
        //input.nextLine(); // Consume newline left-over
        System.out.print("Enter Seller's Name: ");
        String sellerName = input.next();
        System.out.print("Enter Sales Amount: ");
        double salesAmount = input.nextDouble();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = input.nextDouble();
        input.close();
        // Calculate sales commission
        double commission = 0;
        if (salesAmount >= 50000) {
            commission = 0.35 * salesAmount;
        } else if (salesAmount >= 30000) {
            commission = 0.20 * salesAmount;
        } else if (salesAmount >= 20000) {
            commission = 0.10 * salesAmount;
        } else if (salesAmount >= 10000) {
            commission = 0.05 * salesAmount;
        } else {
            commission = 0.02 * salesAmount;
        }

        // Print the result
        System.out.println("Sales ID: " + salesId);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Sales Commission: " + commission);

        // Calculate and print the total salary
        double totalSalary = basicSalary + commission;
        System.out.println("Total Salary: " + totalSalary);

    }

}






