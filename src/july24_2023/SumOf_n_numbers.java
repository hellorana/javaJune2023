package july24_2023;

import java.util.Scanner;

public class SumOf_n_numbers {
    //print the sum of the N natural numbers
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= scanner.nextInt();
        int sum = 0;

        for (int i=1; i<=n; i++){
            sum= sum + i;
        }
        System.out.println("Sum of " + n + " natural numbers : " + sum);
    }
}
