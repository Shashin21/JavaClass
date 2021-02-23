package Homework;

import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to swap: ");
        int i = input.nextInt();
        System.out.println("Enter another number to swap: ");
        int j = input.nextInt();
        System.out.println("The value of a before swap is " +i);
        System.out.println("The value of b before the swap is " +j);
        int temp= 0;
        temp = i;
        i = j;
        j = temp;
        System.out.println("The value of a after the swap is: "+i);
        System.out.println("The value of b after the swap is : "+j);
    }
}
