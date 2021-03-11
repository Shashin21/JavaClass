package TakeOutProject;

import java.util.Scanner;

public class TakeOut {

    public static void displayMainMenu(){
        System.out.println("CHOOSE TYPE OF MEAL");
        System.out.println("-------------------------");
        System.out.println("1. Italian");
        System.out.println("2. Chinese");
        System.out.println("3. American");
        System.out.println("Choose What type of food you'd like to order: ");
    }
    public static void displayItalianFoodMenu(){
            System.out.println("CHOOSE ONE");
            System.out.println("--------------");
            System.out.println("1.Lasangna Tray - Feeds 5 - 17.99");
            System.out.println("2. Pizza Pack - Feeds 7 - 15.99");
            System.out.println("3. Gazpacho Soup, salad and bread sticks pack - Feeds 4 - 12.99");
            System.out.println("Enter your Choice: ");
    }
    public static void displayChineseFoodMenu(){
        System.out.println("CHOOSE ONE");
        System.out.println("---------------");
        System.out.println("1. Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls) - feeds 7-18.99");
        System.out.println("2. Sweet and Sour Pork Tray (includes 7 hot and sour soups, 7 egg rolls) - feeds 7 - 18.99");
        System.out.println("3. Shrimp Fried Rice Tray (includes 10 egg rolls) - Feeds 5 - 10.99");
        //System.out.println("Enter Choice");
    }
    public static void displayAmericanFoodMenu(){
        System.out.println("CHOOSE ONE");
        System.out.println("---------------");
        System.out.println("1. Hamburger and Hot Dog Tray - includes buns and condiments - feeds 8 - 21.99");
        System.out.println("2. Grilled Chicken Sandwich and Mozzarella Sticks Tray - includes dipping sauces -Feeds 5 - 22.99");
        System.out.println("3. Barbeque Tray - includes buns and peach cobbler - Feeds 10 - 26.99 ");
    }

    public static int determineTrays(int people, int feeds){
        //int total =people+feeds;
        int div = people/feeds;
        int dit = div+1;

        return dit;
    }

    public static double getSubtotal(double price, int trays){
        double total = price * trays;
        return total;
    }

    public static double getTax(double subtotal, double taxrate){
        double tot = subtotal*(taxrate/100);
        return tot;
    }

    public static double getTip(double subtotal, double tipRate){
        double tip = subtotal*(tipRate/100);
        return tip;
    }

    public static double getGrandTotal(double subtotal, double tax, double tip){
        double total = subtotal + tax + tip;
        return total;
    }

    public static double pricePerPerson(double grandTotal, int people){
        double perPerson = grandTotal/people;
        return perPerson;
    }
    public static int determineLeftOvers(int feeds, int trays, int people){
        int left = (trays * feeds) - people;
        return left;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many people do you want the meal for?");
        int people = in.nextInt();
        int feeds = 0;
        double price = 0;
        displayMainMenu();

        int userInput = in.nextInt();
        if (userInput == 1) {
            displayItalianFoodMenu();
            int userIn = in.nextInt();
            if (userIn == 1) {
                feeds = 5;
                price = 17.99;
            } else if (userIn == 2) {
                feeds = 7;
                price = 15.99;
            } else if (userIn == 3) {
                feeds = 4;
                price = 12.99;
            } else {
                System.out.println("Invalid choice");
            }
        } else if (userInput == 2){
            displayChineseFoodMenu();
            int userIn = in.nextInt();
            if (userIn == 1) {
                feeds = 7;
                price = 18.99;
            }
            else if (userIn == 2) {
                feeds = 7;
                price = 18.99;
            } else if (userIn == 3) {
                feeds = 5;
                price = 10.99;
            } else {
                System.out.println("Invalid choice");
            }
        }
        else if(userInput==3) {
            displayAmericanFoodMenu();
            int userIn = in.nextInt();
            if (userIn == 1) {
                feeds = 8;
                price = 21.99;
            } else if (userIn == 2) {
                feeds = 5;
                price = 22.99;
            } else if (userIn == 3) {
                feeds = 10;
                price = 26.99;
            } else {
                System.out.println("Invalid choice");
            }
        }
        else
            System.out.println("Invalid entry.");
        int LeftOvers=0;
        double tip,tax,subTotal,GrandTotal,perPerson;
        subTotal=getSubtotal(price,determineTrays(people,feeds));
        tax = getTax(getSubtotal(price,determineTrays(people,feeds)),7);
        tip = getTip(getSubtotal(price,determineTrays(people,feeds)), 15);
        GrandTotal= subTotal+tax+tip;
        perPerson = GrandTotal/people;
        LeftOvers = determineLeftOvers(feeds,determineTrays(people,feeds),people);

        System.out.println("You will need " +determineTrays(people,feeds)+" trays");
        System.out.println("Price for " +people +" people(" +determineTrays(people,feeds)+"): "+subTotal);
        System.out.println("Tax: "+tax);
        System.out.println("Tip: "+tip);
        System.out.println("Total (food, tax, tip): "+GrandTotal);
        System.out.println("Price per person: "+perPerson);
        System.out.println("Leftover servings for the delivery person: "+LeftOvers);

    }
}
