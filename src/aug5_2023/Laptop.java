package aug5_2023;

public class Laptop {
    String brand;
    int screenSize;
    String processor;
    int ram;
    int hardDiskSize;

    public Laptop(String brand, int screenSize, String processor, int ram, int hardDiskSize) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.processor = processor;
        this.ram = ram;
        this.hardDiskSize = hardDiskSize;
    }

    public Laptop() {
    }

    public void specification(){
        System.out.println("Specification of the laptop: " + brand +", Screen Size: "+ screenSize + ", Processor:  "+
                processor + ", RAM:  "+ ram + ", Hard Disk Storage: "+ hardDiskSize);
    }
}
class TLaptop extends Laptop{

    String TouchScreen;

    public TLaptop(String brand, int screenSize, String processor, int ram, int hardDiskSize) {
    }


    public void specification(){
        System.out.println( "Laptop is " + TouchScreen);
    }
}

