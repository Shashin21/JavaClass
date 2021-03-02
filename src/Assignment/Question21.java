package Assignment;

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of the week(1-7): ");
        int n1 = input.nextInt();
        switch (n1) {
            case 1:
                System.out.println("The equivalent day of the week is: Sunday");
                break;
            case 2:
                System.out.println("The equivalent day of the week is: Monday");
                break;
            case 3:
                System.out.println("The equivalent day of the week is: Tuesday");
                break;
            case 4:
                System.out.println("The equivalent day of the week is: Wednesday");
                break;
            case 5:
                System.out.println("The equivalent day of the week is: Thursday");
                break;
            case 6:
                System.out.println("The equivalent day of the week is: Friday");
                break;
            case 7:
                System.out.println("The equivalent day of the week is: Saturday");
                break;
            default:
                System.out.println("Wrong number! Please try between 1-7");
        }
    }
}
