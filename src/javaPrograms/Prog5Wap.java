package javaPrograms;

import java.util.Scanner;

public class Prog5Wap {
    public static void main(String[] args) {
        String employeeName;
        double hRA, dA, tA, pF, grossSalary, basicSalary;
        int employeeId;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID:  ");
        employeeId = scanner.nextInt();
        System.out.print("Employee name:   ");
        employeeName = scanner.next();
        System.out.print("Basic Salary: ");
        basicSalary = scanner.nextDouble();
        hRA = (basicSalary * 10 / 100);
        tA = (basicSalary * 9 / 100);
        dA = (basicSalary * 8 / 100);
        pF = (basicSalary * 20 / 100);

        grossSalary = (basicSalary + hRA + tA + dA - pF);
        System.out.println(grossSalary);
        printSalarySlip(employeeName, employeeId, hRA, dA, tA, pF, basicSalary, grossSalary);

    }

    public static void printSalarySlip(String employeeName, int employeeId, double hRA, double tA, double dA, double pF, double basicSalary, double grossSalary) {
        System.out.println("_______________________________");

        System.out.println("|         Salary Slip          |");
        System.out.println("|______________________________|");
        System.out.println("|Employee Id :              "+employeeId+" |");
        System.out.println("|Employee Name:             "+employeeName+"|");
        System.out.println("|______________________________|");
        System.out.println("|Basic Salary :        "+basicSalary+" |");
        System.out.println("|HRA 10% :               "+hRA+"|");
        System.out.println("|TA 9% :                 "+tA+"|");
        System.out.println("|DA 8% :                 "+dA+"|");
        System.out.println("|PF - 20& :              "+pF+"|");
        System.out.println("|______________________________|");
        System.out.println("|Gross Salary :         "+grossSalary+"|");
        System.out.println("|==============================|");

    }
}




















