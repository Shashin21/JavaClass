package Assignment;

import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        double n1 = input.nextDouble();
        System.out.println("Please enter the second number: ");
        double n2 = input.nextDouble();
        System.out.println("Please enter operator ");
        String s = input.next();
        switch (s) {
            case "+":
                double add = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " +add);
                break;
            case "-":
                double sub = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " +sub);
                break;
            case "*":
                double mul = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " +mul);
                break;
            case "/":
                double div = n1 / n2;
                System.out.println(n1 + " / " + n2 + " = " +div);
                break;
            default:
                System.out.println("Invalid operator. Please try using +,-,* or / and try again!");
                break;
        }
    }
}
