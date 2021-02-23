package Homework;

import java.util.Scanner;

public class question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        double n1 = input.nextDouble();
        System.out.println("Please enter the second number: ");
        double n2 = input.nextDouble();
        if(n1>n2){
            System.out.println(+ n1 + "> " +n2);
        }
        else if(n2>n1){
            System.out.println(+n2 + " > " +n1);
        }
        else{
            System.out.println(+n1 +" == " +n2);
        }
    }
}
