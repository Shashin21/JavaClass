package Assignment_till_37;

import java.util.Scanner;

public class Question_32 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] myArray = new int[5];
        int add = 0;
        System.out.println("Enter five numbers to add up: ");

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = input.nextInt();
           add = add + myArray[i];
        }
        System.out.println(add);
    }

}
