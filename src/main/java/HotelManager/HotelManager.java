package HotelManager;


import java.util.HashSet;
import java.util.Set;

// dodawanie nowego hotelu do kolekcji
// dodawanie nowego gościa do konkretnego hotelu
// dodawanie nowego pokoju do konkretnego hotelu
// przypisywanie gościa do pokoju w konkretnym hotelu
// wyświetlanie listy gości w konkretnym hotelu
//        wyświetlanie listy pokoi w konkretnym hotelu wraz z przypisanymi gośćmi

//        Zaimplementuj te metody w sposób umożliwiający interakcję z użytkownikiem (np. przez konsolę).
//        Przykładowe użycie programu:
// Dodanie hotelu "Hotel A"
// Dodanie gościa "Jan Kowalski" do "Hotel A"
// Dodanie pokoju o numerze 101 do "Hotel A"
//Przypisanie gościa "Jan Kowalski" do pokoju 101 w "Hotel A"
//Wyświetlenie listy gości w "Hotel A"
//        Wyświetlenie listy pokoi wraz z gośćmi w "Hotel A"
//        Utworz 2 hotele. Dodaj 2-3 gości do kazdego hotelu
public class HotelManager {

    private Set<Hotel> hotelsSet = new HashSet<>();

    public HotelManager(Set<Hotel> hotelsSet) {
        this.hotelsSet = hotelsSet;
    }

    public HotelManager() {
    }

    public void addHotelToHotelsSet(Hotel hotelToAdd) {
        if (!hotelsSet.contains(hotelToAdd)) {
            hotelsSet.add(hotelToAdd);
            System.out.printf("Hotel %s has been successfully added into hotels set%n", hotelToAdd.getHotelName());
        } else
            System.out.println("This hotel exists in our hotels set");
    }

    public void addGuestToTheHotel(Guest guestToAdd, Hotel hotel) { //dodawanie nowego gościa do konkretnego hotelu

        if (!hotel.getGuestInHotel().contains(guestToAdd)) {
            hotel.getGuestInHotel().add(guestToAdd);
            System.out.println(String.format("%s %s has been successfully added into %s guests list", guestToAdd.getGuestFirstName(), guestToAdd.getGuestLastName(), hotel.getHotelName()));
        } else {
            System.out.println("This guest has been already added to our hotel guest list");
        }
    }

    public void addRoomToTheHotel(Room roomToAdd, Hotel hotel) { //dodawanie nowego pokoju do konkretnego hotelu
        if (!hotel.getRoomsInHotel().contains(roomToAdd)) {
            hotel.getRoomsInHotel().add(roomToAdd);
            System.out.println(String.format("Room number %d has been successfully added into %s", roomToAdd.getRoomNumber(), hotel.getHotelName()));
        } else {
            System.out.println("This room has been already added to this hotel");
        }
    }

    public void addGuestToTheRoomInSpecifiedHotel(Guest guestToCheckIn, Hotel hotelForAGuest, Room roomForAGuest) { // przypisywanie gościa do pokoju w konkretnym hotelu

        if (hotelForAGuest.getRoomsInHotel().contains(roomForAGuest)) {
            addGuestToTheHotel(guestToCheckIn, hotelForAGuest);
            roomForAGuest.getGuestsInRoom().add(guestToCheckIn);
            System.out.printf("Confirmation of an accommodation: Name: %s %s, Hotel: %s, Room: %d%n", guestToCheckIn.getGuestFirstName(), guestToCheckIn.getGuestLastName(), hotelForAGuest.getHotelName(), roomForAGuest.getRoomNumber());
        } else {
            System.out.println("Something went wrong, please try again");
        }
    }

    public void showGuestInAHotelInfo(Hotel hotelToShow) { //wyświetlanie listy gości w konkretnym hotelu

        if (hotelsSet.contains(hotelToShow)) {
            hotelToShow.getGuestInHotel();
            for (Guest guest : hotelToShow.getGuestInHotel()) {
                System.out.printf("Hotel: %s , Name: %s %s%n", hotelToShow.getHotelName(), guest.getGuestFirstName(), guest.getGuestLastName());
            }
        }
    }

    public void showHotelAndGuestsInRoomInfo(Hotel hotel) { // wyświetlanie listy pokoi w konkretnym hotelu wraz z przypisanymi gośćmi

        if (hotelsSet.contains(hotel)) {
            for (Room room : hotel.getRoomsInHotel()) {
                if (room.getGuestsInRoom().isEmpty())
                    System.out.printf("Hotel: %s , Room: %d%n", hotel.getHotelName(), room.getRoomNumber());
                else {
                    for (Guest guest : room.getGuestsInRoom()) {
                        guest.getGuestFirstName();
                        guest.getGuestLastName();
                        System.out.printf("Hotel: %s , Room: %d, Name: %s %s%n", hotel.getHotelName(), room.getRoomNumber(), guest.getGuestFirstName(), guest.getGuestLastName());
                    }
                }
            }
        }
    }

    public Set<Hotel> getHotelSet() {
        return hotelsSet;
    }

    public void setHotelSet(Set<Hotel> hotelSet) {
        this.hotelsSet = hotelSet;
    }


}
