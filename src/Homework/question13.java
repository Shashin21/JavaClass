package Homework;

import java.util.Scanner;

public class question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        double s = input.nextDouble();
        if (s<0) {
            System.out.println("The number is negative: " + s);
        }
        else{
            System.out.println("The number entered is positive");
        }
    }
}
