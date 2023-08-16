package inheritance;

public class House {

int noOfRooms;
int noOfWashroom;
int parkingSpace;

    public House(int noOfRooms, int noOfWashroom, int parkingSpace) {
        this.noOfRooms = noOfRooms;
        this.noOfWashroom = noOfWashroom;
        this.parkingSpace = parkingSpace;
    }

    public void displayHouse(){
    System.out.println( "House have: ");
    System.out.println( "Number of rooms: " + noOfRooms);
    System.out.println( "Number of Washroom : "+ noOfWashroom);
    System.out.println( "Number of Parking Space: "+parkingSpace);
}

}
