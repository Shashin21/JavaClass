package Assignment;

import java.util.Scanner;

public class Question24 {
    static void Factorial(int n){
        int fac=1;
        for(int i=1;i<=n;i++){
            fac=fac*i;
            System.out.println("The factorial is :"+ i+ " * "+fac+" = " +fac);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number to find the factorial: ");
        int num = input.nextInt();
        Factorial(num);

    }
}
