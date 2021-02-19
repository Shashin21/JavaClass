package Homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args){
        //Celsius to Fahrenheit
        Scanner temp = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        double tc = temp.nextDouble();
        DecimalFormat d = new DecimalFormat("0.#");
        double convC = ((tc * 9)/5) + 32;
        System.out.println("The temperature in Fahrenheit is " +convC);

        //Fahrenheit to celsius
        Scanner temp2 = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        float tf = temp2.nextFloat();
        float convF = (tf - 32) * (5.f/9.f);
        //System.out.println(convF);
        //String f = String.format("%.2f", convF);
        System.out.println("The temperature in Fahrenheit is " +convF);
    }
}
