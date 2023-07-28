package arrayAssignment;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
//        int[] arr= {10,4,6,2,9,5,-1};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the Array: " );
        int input = scanner.nextInt();
        int[] arr = new int[input];

        System.out.println("Enter the values of the Array: ");
        for(int i=0; i<input; i++)
        {
             //reading array elements from the user
            arr[i]=scanner.nextInt();
        }
        System.out.print("Values inside the Array: ");
        for (int i=0; i<input; i++)
        {
            System.out.print("" +arr[i]+ ",");

        }
        System.out.println( " ");

        int max = arr[0];

        for( int i=1; i< arr.length; i++){
            if (max < arr[i])
                max = arr[i];
        }
        System.out.println("Largest number is : " +max);

    }
}
