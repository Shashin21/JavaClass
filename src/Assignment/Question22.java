package Assignment;

import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number to print the multiplication table: ");
        int n1 = input.nextInt();
        System.out.println("The multiplication table for "+n1+"is: ");
        for (int i = 1; i <= 10; i++) {
            int mul = n1 * i;
            System.out.println(n1 + " * " + i +" = " +mul);
        }
    }
}

