package Assignment_till_43;

import java.util.Scanner;

public class Duplicate_letter_41 {
    public static void duplicate(String str) {
        char[] c = str.toCharArray();
        System.out.print("Duplicate Characters are: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (c[i] == c[j]) {
                    System.out.print(c[j] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string to reverse: ");
        String str = in.nextLine();
        duplicate(str);
    }
}
