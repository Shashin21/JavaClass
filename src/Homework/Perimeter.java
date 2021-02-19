package Homework;

import java.util.Scanner;

public class Perimeter {
    public static void main (String[] args){
        Scanner radius = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double r = radius.nextDouble();
        double PeriCircle = 2 * 3.14 * r;
        System.out.println("The perimeter of the circle is: "+ PeriCircle);
        Scanner length = new Scanner(System.in);
        Scanner breadth = new Scanner(System.in);
        System.out.println("Enter the length and breadth for the rectangle: ");
        double l = length.nextDouble();
        double b = breadth.nextDouble();
        double PeriRec = 2 * (l+b);
        System.out.println("The area of the rectangle is: " + PeriRec);
        Scanner side1 = new Scanner(System.in);
        Scanner base = new Scanner(System.in);
        Scanner side2 = new Scanner(System.in);
        System.out.println("Enter the two sides and base for the triangle: ");
        double b2 = base.nextDouble();
        double s1 = side1.nextDouble();
        double s2 = side2.nextDouble();
        double PeriTriangle = b2+s1+s2;
        System.out.println("The area of the triangle is: " +PeriTriangle);
    }
}
