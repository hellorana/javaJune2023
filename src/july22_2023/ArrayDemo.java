package july22_2023;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int y = scanner.nextInt();
        System.out.println("Enter the value in the Array");
        int size[] = new int[y];
        for (int i = 0; i < y; i++) {
            size[i] = scanner.nextInt();
        }
        for (int c=0;c<y;c++) {
            System.out.println(size[c]);
        }
    }
}