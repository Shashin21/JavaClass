package Assignment;

import java.util.Scanner;

public class Question28 {
    static void isPrimenumber(int i){
        boolean flag = false;
        for (int j = 2; j <= i/2; j++){
            if((i%j) == 0){
                flag = true;
                break;
            }
            }
        if(!flag){
            System.out.println(i + " prime number.");
        }
        else{
            System.out.println(i+" is not a prime number.");
        }
    }

    static void firstNthPrime(int i){
        int x = 2;
        for (int j = 0; j <=i;j++){
            int c = 0;
            for(int k = 1; k<=x;k++){
                if(x%k == 0){
                    c++;
                }
            }
            if(c == 2)
                System.out.println(x + " ");
            x++;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int in = input.nextInt();
        isPrimenumber(in);
        firstNthPrime(in);
    }
}
