package Homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Displacement {
    public static void main(String[] args){
        Scanner velocity = new Scanner(System.in);
        Scanner acc = new Scanner(System.in);
        Scanner time = new Scanner(System.in);
        System.out.println("Enter the velocity: ");
        double u = velocity.nextDouble();
        System.out.println("Enter the acceleration: ");
        double a = acc.nextDouble();
        System.out.println("Enter the time travelled: ");
        double t = time.nextDouble();
        double dis = (u * t) + ((a*Math.pow(t,2))/2);
        DecimalFormat d = new DecimalFormat("0.##");
        System.out.println("The displacement is found to be: " + d.format(dis));
    }
}
