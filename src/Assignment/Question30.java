package Assignment;

import java.util.Scanner;

public class Question30 {
    static void fibonacci(int num){
        int out = 0;
        int save = 1;
        int output = 0;
        for (int j = 1; j<=num; j++){
            System.out.println(save + " ");
            output = out + save;
            out = save;
            save = output;

            //System.out.println(output);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find the fibonacci series: ");
        int in = input.nextInt();
        fibonacci(in);
    }
}
