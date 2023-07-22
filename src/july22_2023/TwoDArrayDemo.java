package july22_2023;

public class TwoDArrayDemo {
    public static void main(String[] args) {


        int arr[][]=   {{1,2,3},{1,4,5,6}, {9,4,7,2,6,9,0}};
        for (int i =0; i< arr.length; i++){
            for (int j=0; j< arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
