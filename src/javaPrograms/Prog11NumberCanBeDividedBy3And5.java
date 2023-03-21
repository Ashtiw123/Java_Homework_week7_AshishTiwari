package javaPrograms;

public class Prog11NumberCanBeDividedBy3And5 {

        public static void main(String[] args) {
            // Printing numbers between 1 to 100 which are divisible by 3
            System.out.println("Numbers between 1 to 100 which are divisible by 3:");
            for(int i=1; i<=100; i++) {
                if(i%3==0) {
                    System.out.print(i + " ");
                }
            }

            // Printing numbers between 1 to 100 which are divisible by 5
            System.out.println("\nNumbers between 1 to 100 which are divisible by 5:");
            for(int i=1; i<=100; i++) {
                if(i%5==0) {
                    System.out.print(i + " ");
                }
            }
        }
    }


