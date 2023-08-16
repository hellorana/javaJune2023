package inheritance;

class DetachedHouse extends House {

    boolean detached;
    boolean separate_Basement_entrance;

    public DetachedHouse(int noOfRooms, int noOfWashroom, int parkingSpace, boolean detached, boolean separate_Basement_entrance) {
        super(noOfRooms, noOfWashroom, parkingSpace);
        this.detached = detached;
        this.separate_Basement_entrance = separate_Basement_entrance;
    }

    public void displayDetached() {
        System.out.println( "House is Detached or not: " +detached);
        System.out.println( "House has the Separate Basement entrance or not: "+ separate_Basement_entrance);
    }
}
