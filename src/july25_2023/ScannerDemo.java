package july25_2023;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num= scanner.nextInt();
        System.out.println(num);

        scanner.nextLine();

        System.out.println(" Enter the Name: ");
        String name= scanner.nextLine();
        System.out.println(name);

    }
}
