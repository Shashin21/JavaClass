package Assignment_till_37;

import java.util.Scanner;

public class Question_37 {
    public static void main(String[] args) {
        final int ROWS = 3;
        final int COLUMNS = 3;
        int [][] myArray = new int[ROWS][COLUMNS];
        Scanner input = new Scanner(System.in);
        for (int i =0; i<ROWS; i++){
            for(int j =0; j<COLUMNS;j++){
                System.out.println("Enter the number: ");
                myArray[i][j] = input.nextInt();
            }
        }
    }
}
