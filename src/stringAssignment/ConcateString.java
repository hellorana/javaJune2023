package stringAssignment;

import java.util.Scanner;

public class ConcateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Word: ");
        String s1= sc.next();

        System.out.println("Enter the Second Word: ");
        String s2= sc.next();

        String concate = s1.concat(" "+ s2);

        System.out.println("Concatenation of two words:  " +concate);
    }
}
