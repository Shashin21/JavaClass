package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question26 {
    static boolean flag = true;
    static void Check(boolean flag) {
        while (flag) {
            int[] myArray = new int[20];
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter the number: ");
            //int k=in.nextInt();
            myArray[1] = in.nextInt();
            if (flag) {
                for (int k = 2; k <= myArray.length; k++) {
                    System.out.println("Do you still want to enter the number: ");
                    String name = in.next();
                    if (name.equals("Y")) {
                        System.out.println("Please enter the number: ");

                        myArray[k] = in.nextInt();
                    } else {
                        flag = false;
                        System.out.println("Please enter the Y for Yes and N for No");
                        break;
                    }
                }
            }
            System.out.println(Arrays.toString(myArray));
        }

    }

    public static void main(String[] args) {
                    //int myArray = new int[];
        //myArray=input.nextInt();
        Check(flag);



    }
}
