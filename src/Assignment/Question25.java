package Assignment;

import java.util.Scanner;

public class Question25 {
    static void Info(int i){
        String [] myName = new String[i];
        int [] myScore = new int[i];
        for (int j=1;j<=i;j++) {
            Scanner input = new Scanner(System.in);
            System.out.println("------"+j+"----------");
            System.out.println("Enter the name of the student: ");
            //String name = input.next();
            myName[j]=input.nextLine();
            System.out.println("Enter the score of the student: ");
            //int name2 = input.nextInt();
            myScore[j] = input.nextInt();
        }
    }
    /*static void Check(int i){
        int val =0;
        for (int j=1; j<=i;i++){
            //System.out.println(myName[j]);
            // if (myScore[j]>val){
             //   max_val = myScore[j];
            }
        }
    }*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int i = input.nextInt();
        //int [] myArray = new int[i];

        Info(i);
        //Check(i);

    }
}
