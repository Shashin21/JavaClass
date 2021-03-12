package Assignment_till_43;

import java.util.Scanner;

public class duplicate_word_42 {
    public static void duplicate(String str) {
        int count;
        str = str.toLowerCase();
        String words[] = str.split(" ");
        System.out.println("Duplicate words in a given string : ");
        for(int i = 0; i < words.length; i++) {
            count = 1;
            for(int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }

            if(count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string to find the duplicate of: ");
        String str = in.nextLine();
        duplicate(str);
    }
}
