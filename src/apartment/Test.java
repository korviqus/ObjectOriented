package apartment;

public class Test {
    public static void main(String[] args) {
        Room guestRoom = new Room("Guest Room",3, 40);
        Building blueHotel = new Building("Blue Hotel",guestRoom, 50);
        System.out.println("Total area of Blue Hotel: " + blueHotel.getTotalArea());

        Owner[] owner_list = new Owner[2];
    }
}
