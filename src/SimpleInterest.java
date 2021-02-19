import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner princ = new Scanner(System.in);
        Scanner time = new Scanner(System.in);
        Scanner rate = new Scanner(System.in);
        System.out.println("Enter the Principle: ");
        double p = princ.nextDouble();
        System.out.println("Enter the time: ");
        double t = time.nextDouble();
        System.out.println("Enter the rate: ");
        double r = rate.nextDouble();
/*
        System.out.println("The principle is: " +p);
        System.out.println("The time is: " +t);
        System.out.println("The rate is :" +r);

 */
        double SI = (p*t*r) /100 ;
        System.out.println("The simple was calculated to be: " +SI);
    }
}
