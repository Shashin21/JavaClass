package Assignment;

import java.util.Scanner;

public class Question29 {
    static int Calc(int num) {
        int a = 1;
        for (int i = 2; i <= num; i++) {
            a = a * i;
        }
        return a;
    }

    static int res(int n){
        return Calc(n+1)-1;
    }

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Please enter the number to find: ");
        int in = input.nextInt();
        System.out.println(res(in));
    }
}
