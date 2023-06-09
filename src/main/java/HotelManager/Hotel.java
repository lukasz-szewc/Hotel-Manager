package HotelManager;

import java.util.HashSet;
import java.util.Set;

public class Hotel {

    private String hotelName;
    private Set<Guest> guestInHotel = new HashSet<>();
    private Set<Room> roomsInHotel = new HashSet<>();


    public Hotel(String hotelName, Set<Guest> guestInHotel, Set<Room> roomsInHotel) {
        this.hotelName = hotelName;
        this.guestInHotel = guestInHotel;
        this.roomsInHotel = roomsInHotel;
    }

    public Hotel(String hotelName) {
        this.hotelName = hotelName;
    }


    public Set<Guest> getGuestInHotel() {
        return guestInHotel;
    }

    public void setGuestInHotel(Set<Guest> guestInHotel) {
        this.guestInHotel = guestInHotel;
    }

    public Set<Room> getRoomsInHotel() {
        return roomsInHotel;
    }

    public void setRoomsInHotel(Set<Room> roomsInHotel) {
        this.roomsInHotel = roomsInHotel;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }


}
