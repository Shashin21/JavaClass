package Assignment;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a side of the triangle: ");
        int s1 = input.nextInt();
        System.out.println("Please enter a side of the triangle: ");
        int s2 = input.nextInt();
        System.out.println("Please enter a side of the triangle: ");
        int s3 = input.nextInt();
        if(s1 == s2 && s2==s3 && s1==s3){
            System.out.println("The given triangle is equilateral triangle.");
        }
        else if(s1==s2 || s2 == s3 || s1 == s3){
            System.out.println("The given triangle is isosceles triangle.");
        }
        else if(s1==90 || s2 == 90 || s3 == 90){
            System.out.println("The given triangle is right triangle.");
        }
        else if (s1 > 90 && s2 > 90 && s3 > 90){
            System.out.println("The given triangle is acute angle.");
        }

    }
}
