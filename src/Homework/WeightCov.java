package Homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WeightCov {
    public static void main(String[] args){
        //Pound to Kg
        Scanner weight = new Scanner(System.in);
        System.out.println("Enter the weight in Pounds: ");
        float w = weight.nextFloat();
        DecimalFormat d = new DecimalFormat("0.#");
        float convKG = (float) (w/2.205);
        System.out.println( d.format(w) + " pound is " +convKG +" kg");


    }
}


