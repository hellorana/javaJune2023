package july22_2023;

public class mainMethod_Tesla {
    public static void main(String[] args) {
        Tesla t1 =new Tesla();
        t1.model = "Model X";
        t1.colour = "Black";
        t1.price = 60000;
        Tesla.engineType= "Electric";

        Tesla t2 =new Tesla();
        t2.model = "Model Y";
        t2.colour = "White";
        t2.price = 80000;
        Tesla.engineType = "Electric";

        Tesla t3 =new Tesla();
        t3.model = "Model E";
        t3.colour = "Red";
        t3.price = 90000;
        Tesla.engineType= "Electric";

        t1.makeCar();
        t2.makeCar();
        System.out.println(t3);


    }
}
