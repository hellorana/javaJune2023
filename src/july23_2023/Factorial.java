package july23_2023;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the value for Factorial: ");
        int i;
        int number= scanner.nextInt();
        int fact=1;
        for (i=1; i<=number; i++){
            fact=fact*i;
        }
        System.out.println("Factorial of the " + number+ " : " +fact);

    }
}
