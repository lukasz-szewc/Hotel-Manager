package HotelManager;

import java.util.HashSet;
import java.util.Set;

public class Room {

    private int roomNumber;
    private Set<Guest> guestsInRoom = new HashSet<>();

    public Room(int roomNumber, Set<Guest> guestsInRoom) {
        this.roomNumber = roomNumber;
        this.guestsInRoom = guestsInRoom;
    }

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Set<Guest> getGuestsInRoom() {
        return guestsInRoom;
    }

    public void setGuestsInRoom(Set<Guest> guestsInRoom) {
        this.guestsInRoom = guestsInRoom;
    }

}
