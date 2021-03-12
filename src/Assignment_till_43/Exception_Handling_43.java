package Assignment_till_43;

import java.util.Scanner;

public class Exception_Handling_43 {
    public static void main(String[] args) {
        try {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number to divide: ");
        int a = in.nextInt();
        System.out.println("Enter the number to divide by: ");
        int b = in.nextInt();

            double div;
            div = a/b;
            System.out.println("The result is: "+div);
        }
        catch (ArithmeticException e){
            System.out.println("Cannot be divided by 0. Please try with different number. ");
        }


    }
}
