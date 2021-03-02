package Assignment;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = input.nextInt();
        System.out.println("Enter the third number: ");
        int n3 = input.nextInt();
        System.out.println("\n");
        if(n1>n2 && n1>n3){
            System.out.println(n1+ " is the largest number");
        }
        else if(n2>n1 && n2>n3){
            System.out.println(n2 + " is the largest number.");
        }
        else{
            System.out.println(n3 + " is the largest number.");
        }
    }
}
