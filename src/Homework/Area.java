package Homework;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner radius = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double r = radius.nextDouble();
        double AreaCircle = 3.14 * Math.pow(r,2);
        System.out.println("The area of the circle is: "+ AreaCircle);
        Scanner length = new Scanner(System.in);
        Scanner breadth = new Scanner(System.in);
        System.out.println("Enter the length and breadth for the rectangle: ");
        double l = length.nextDouble();
        double b = breadth.nextDouble();
        double AreaRec = l*b;
        System.out.println("The area of the rectangle is: " + AreaRec);
        Scanner height = new Scanner(System.in);
        Scanner base = new Scanner(System.in);
        System.out.println("Enter the height and base for the triangle: ");
        double h = height.nextDouble();
        double ba = base.nextDouble();
        double AreaTriangle = (h*ba)/2;
        System.out.println("The area of the triangle is: " +AreaTriangle);
    }
}
