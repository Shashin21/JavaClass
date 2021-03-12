package Assignment_till_43;

import java.util.Scanner;

public class ShortForm_39 {
    public static void printInitials(String str)
    {
        int length = str.length();
        str = str.trim();
        String t = "";
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                t = t + ch;
            }
            else {
                System.out.print(Character.toUpperCase(t.charAt(0))+ ". ");
                t = "";
            }
        }

        String temp = "";
        for (int j = 0; j < t.length(); j++) {
            if (j == 0)
                temp = temp + Character.toUpperCase(t.charAt(0));
            else
                temp = temp + Character.toLowerCase(t.charAt(j));
        }
        System.out.println(temp);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        //String str = "Shashin Shakya";
        printInitials(str);
    }
}

