package july24_2023;

import java.util.Scanner;

public class Table_of_Number_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int prod;
        String userInput;
        do {
            System.out.println(" Enter the number for product table");
            int n = scanner.nextInt();
            for (int i = 1; i <= 10; i++) {
                prod = n * i;
                System.out.println(n + " * " + i + " = " + prod);

            }
            System.out.println("Do you want to exit from the System? ");
            System.out.println(" If yes, Press Y. Otherwise, press N");
            userInput = scanner.next();

        } while (userInput.equalsIgnoreCase("N"));


    }
}