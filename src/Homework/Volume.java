package Homework;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args){
        Scanner radius = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder: ");
        double r = radius.nextDouble();
        Scanner length = new Scanner(System.in);
        System.out.println("Enter the length of the cylinder: ");
        double l = length.nextDouble();
        double volume = 3.14 * Math.pow(r,2) *l;
        System.out.println("The volume of the cylinder is: " +volume);
    }
}
