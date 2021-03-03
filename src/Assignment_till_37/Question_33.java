package Assignment_till_37;

import java.util.Scanner;

public class Question_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many number would you like to enter: ");
        int in = input.nextInt();
        int [] myArray = new int[in];
        for (int i = 0; i < myArray.length; i++){
            System.out.println("Enter the number: ");
            myArray[i] = input.nextInt();
         //   if (myArray[i] > myArray[j])
        }
        int k =0;
        for(int l=0; l<myArray.length;l++) {
            for (int j = l+1; j<myArray.length;j++) {
                if(myArray[l] > myArray[j]) {
                    k = myArray[l];
                    myArray[l] = myArray[j];
                    myArray[j] = k;
                }
            }
            System.out.println(myArray[l]);
        }
    }
}
