package Assignment;

public class Question31 {
    static void pattern(){
        int j = 0;
        for (int i =0; i <=5 ; i++){
            for (int k = 1; k<=i;k++){
                System.out.println(k);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern();
    }
}
