package july23_2023;

public class FactorialExample {
    public static void main(String[] args) {

    {
            int i;
            int fact = 1;
            int number=6;//It is the number to calculate factorial
            for(i=1;i<=number;i++){
                fact=fact*i;
            }
            System.out.println("Factorial of "+number+" is: "+ fact);
        }
    }
}
