package Assignment;

import java.util.Scanner;

public class Question27 {
    static int sum(int num){
        int add = 0;
        while (num != 0){
            add = add + num %10;
            num = num/10;
        }
        return add;
}
    static int mul(int num){
        int mul =1;
        while (num != 0){
            mul = mul * num%10;
            num = num/10;
        }
        return mul;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        System.out.println(sum(num));
        System.out.println(mul(num));
    }
}
