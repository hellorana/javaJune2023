package july22_2023;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int y = scanner.nextInt();
        int[] size = new int[y];

        System.out.println("Enter the value in the Array");
        int i;
        for (i = 0; i < y; i++) size[i] = scanner.nextInt();
        System.out.println();

    }
}
