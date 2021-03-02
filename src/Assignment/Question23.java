package Assignment;

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        int add = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number till you want to find the sum: ");
        int n1 = input.nextInt();
        for (int i=0; i <= n1; i++){
            add = add +i;
            System.out.println("The addition till "+n1+ " is "+add);
        }
    }
}
