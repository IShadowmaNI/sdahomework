package task.pizza;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Give the number of friends: ");
        int nrFriends = keyboard.nextInt();
        keyboard.nextLine();

        String[] pizzaPortions = new String[nrFriends];
        System.out.println("Enter the portions: ");
        for (int i = 0; i < nrFriends; i++) {
            pizzaPortions[i] = keyboard.next();
            keyboard.nextLine();
        }

        double sum = 0;
        String numerator = "";
        String denominator = "";
        for (int i = 0; i < nrFriends; i++) {
           numerator = pizzaPortions[i].substring(0,1);
           denominator = pizzaPortions[i].substring(2);

           sum+= Double.parseDouble(numerator) / Double.parseDouble(denominator);
        }

        System.out.println("Number of pizza needed: ");
        System.out.println((int)Math.ceil(sum) + 1);
    }
}