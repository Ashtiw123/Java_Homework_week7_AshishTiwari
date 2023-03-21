package javaPrograms;

import java.util.Scanner;

public class Prog3MarkSheet {
    public static void main(String[] args) {
        String studentName, result, grade;
        int rollNo, mathMark, englishMark, scienceMark, total, percentage;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Student Name:  ");
        studentName = scanner.next();
        System.out.print("Roll No:  ");
        rollNo = scanner.nextInt();
        System.out.print("Math Mark:  ");
        mathMark = scanner.nextInt();
        if (mathMark < 0 || mathMark > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.println("Please Enter correct mark");
            mathMark = scanner.nextInt();
        }
        System.out.print("Science Mark:  ");
        scienceMark = scanner.nextInt();
        if (scienceMark < 0 || scienceMark > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.println("Please Enter correct mark");
            scienceMark = scanner.nextInt();
        }
        System.out.print("English Mark:  ");
        englishMark = scanner.nextInt();
        if (englishMark < 0 || englishMark > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.println("Please Enter correct mark");
            englishMark = scanner.nextInt();
        }

        total = sum(mathMark, scienceMark, englishMark);
        percentage = (total * 100) / 300;
        result = result(mathMark, scienceMark, englishMark);
        grade = calculateGrade(percentage,result);

        printTheMarkSheet(studentName,rollNo,mathMark,scienceMark,englishMark,total,percentage,result,grade);
        scanner.close();

    }
    // Printing the mark sheet
    public static void printTheMarkSheet(String studentName, int rollNo, int mathMark, int scienceMark, int englishMark, int total, double percentage, String result, String grade) {
        System.out.println("|----------------------------------------|");
        System.out.println("|             MARK SHEET                 |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Name          : " + studentName + "                    |");
        System.out.println("| Roll No       : " + rollNo + "                     |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Subjects      :   Marks                |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Math          : " + mathMark + "                     |");
        System.out.println("| Science       : " + scienceMark + "                     |");
        System.out.println("| English       : " + englishMark + "                     |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Total         : " + total + "                    |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Percentage    : " + percentage + "                   |");
        System.out.println("| Result    : " + result + "                       |");
        System.out.println("| Grade    : " + grade + "                        |");
        System.out.println("|----------------------------------------|");
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static String result(int math, int science, int english) {
        if (math < 35 || science < 35 || english < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    //Calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result){
        String grade = null;
        {if (percentage>=80){
            grade = "A+";
        }else if (percentage>=60){
            grade = "A";
        }else if (percentage>=50){
            grade="B";
        }else if (percentage>=35){
            grade="C";
        }
        else {
            grade = "-";
        } return grade;

    }
}
}

