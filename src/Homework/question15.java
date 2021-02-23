package Homework;

import java.util.Scanner;

public class question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number between 0-128: ");
        int n = input.nextInt();
        if(n>=0 && n<=128){
            char ch = (char) n;
            System.out.println("The ASCII number is: " +ch);
        }
        else{
            System.out.println("Invalid number!!");
        }
    }
}
