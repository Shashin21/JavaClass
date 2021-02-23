package Homework;

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int i = input.nextInt();

        if((i % 4) == 0 ){
            System.out.println("The given year is leap year.");
        }
        else{
            System.out.println("The given year is not leap year.");
        }
    }
}
