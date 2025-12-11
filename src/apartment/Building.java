package apartment;
import java.util.Date;

public class Building {
    private String name;
    private Room roomType;
    private int numOfRooms;
    private Owner[] owners;

    public Building(String name, Room roomType, int numOfRooms){
        this.name = name;
        this.roomType = roomType;
        this.numOfRooms = numOfRooms;
    }

    public Building(String name, Room roomType, int numOfRooms, Owner[] owners){
        this(name,roomType,numOfRooms);
        this.owners = owners;
    }

    public String getName() {
        return name;
    }

    public Room getRoomType() {
        return roomType;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public Owner[] getOwners() {
        return owners;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoomType(Room roomType) {
        this.roomType = roomType;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public void setOwners(Owner[] owners) {
        this.owners = owners;
    }

    public double getTotalArea(){
        return this.roomType.getSizeM2() * this.numOfRooms;
    }

    public void DisplayAllOwners(){
        System.out.println("Owners:");
        for(int i = 0; i < this.owners.length; i++){
            System.out.println("Name: " + this.owners[i] + "Date: " /* + owners[i].getDate()*/);
        }
    }
}

