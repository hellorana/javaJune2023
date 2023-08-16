package august15_2023;

public class TreeDemo {
    public static void main(String[] args) {
        // we can not make object of interface
        // we can not make object of abstract class
        // we can assign child object to [arent reff.
        Furniture furniture = new Chair();// objet of chair class
        furniture.sit();
        furniture.stand();

    }
}

/// syntax of the call the inner class object
// OuterClassName.InnerClassName obj = outerObjectRef.new InnerClass();


// member inner class
// static inner class
// annoymous inner class
