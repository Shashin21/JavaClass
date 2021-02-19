import java.util.Scanner;

public class SumAvg {
    public static void main(String[] args){
        System.out.println("hello");
        Scanner number1 = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = number1.nextDouble();
        System.out.println("Enter the second number: ");
        Scanner number2 = new Scanner(System.in);
        double b = number2.nextDouble();
        double sum = a + b;
        double average = sum/2;
        System.out.println("The sum of " +a +" and " +b + " is " + sum);
        System.out.println("The average of the numbers are " + average);

    }
}
