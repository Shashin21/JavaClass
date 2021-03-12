package Assignment_till_43;

import java.util.Scanner;

public class String_Reverse_40 {
    public static void reverse(String str){
        byte[] st = str.getBytes();
        byte[] result = new byte[st.length];

        for (int i = 0; i < st.length; i++)
            result[i] = st[st.length - i - 1];

        System.out.println(new String(result));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string to reverse: ");
        String str = in.nextLine();
        reverse(str);
    }
}
