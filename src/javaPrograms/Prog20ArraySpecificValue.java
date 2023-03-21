package javaPrograms;

public class Prog20ArraySpecificValue {
    public static boolean contains(int[]arr, int item){
        for(int n: arr){
            if(item ==n){
                return true;
            }
        }
        return false;
    }
    public static void main (String[]args){
        int[]my_array1={
                111,1111,1777,1234,1456,1947,1950};
        System.out.println(contains(my_array1,1777));
        System.out.println(contains(my_array1, 1111));
        }
    }

