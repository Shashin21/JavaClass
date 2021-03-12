package Assignment_till_43;

import java.util.Scanner;

public class palindrome_38 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string : ");

        String str = scanner.nextLine();
        String r= "";

        for(int i = str.length() - 1; i >= 0; i--){
            r = r + str.charAt(i);
        }

        if(str.equals(r)){
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
