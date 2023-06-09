package HotelManager;

public class Main {

    public static void main(String[] args) {

        Guest guest1 = new Guest("Anna", "Margery");
        Guest guest2 = new Guest("Katarzyna", "Nosowska");
        Guest guest3 = new Guest("Krzysztof", "Zalewski");
        Guest guest4 = new Guest("Dawid", "Podsiadło");
        Guest guest5 = new Guest("Jimmy", "Fallon");
        Guest guest6 = new Guest("Leon", "Margery");
        Guest guest7 = new Guest("Jan", "Margery");

        Room room1jh = new Room(1);
        Room room2jh = new Room(2);
        Room room3jh = new Room(3);
        Room room4jh = new Room(4);
        Room room5jh = new Room(5);

        Room room1lh = new Room(1);
        Room room2lh = new Room(2);
        Room room3lh = new Room(3);
        Room room4lh = new Room(4);
        Room room5lh = new Room(5);

        HotelManager hotelManager = new HotelManager();

        Hotel javaHotel = new Hotel("Java Hotel");
        Hotel lazyHotel = new Hotel("Lazy Hotel");

        addingHotelsToHotelManagerSet(hotelManager, javaHotel, lazyHotel);
        addingGuestsToTheHotel(guest1, guest6, guest7, javaHotel, hotelManager);
        addingRoomsToLazyHotel(room1lh, room2lh, room3lh, room4lh, room5lh, hotelManager, lazyHotel);
        addingRoomsToJavaHotel(room1jh, room2jh, room3jh, room4jh, room5jh, hotelManager, javaHotel);

        hotelManager.addGuestToTheRoomInSpecifiedHotel(guest1, javaHotel, room1jh);
        hotelManager.addGuestToTheRoomInSpecifiedHotel(guest6, javaHotel, room1jh);
        hotelManager.addGuestToTheRoomInSpecifiedHotel(guest7, javaHotel, room1jh);

        hotelManager.showGuestInAHotelInfo(javaHotel);
        hotelManager.showHotelAndGuestsInRoomInfo(javaHotel);

        hotelManager.addGuestToTheRoomInSpecifiedHotel(guest5, javaHotel, room4jh);
        hotelManager.showHotelAndGuestsInRoomInfo(javaHotel);

        hotelManager.showGuestInAHotelInfo(lazyHotel);
        hotelManager.addGuestToTheRoomInSpecifiedHotel(guest2, lazyHotel, room1lh);
        hotelManager.addGuestToTheRoomInSpecifiedHotel(guest3, lazyHotel, room3lh);
        hotelManager.addGuestToTheRoomInSpecifiedHotel(guest4, lazyHotel, room5lh);
        hotelManager.showHotelAndGuestsInRoomInfo(lazyHotel);
    }

    private static void addingGuestsToTheHotel(Guest guest1, Guest guest6, Guest guest7, Hotel javaHotel, HotelManager hotelManager) {

        hotelManager.addGuestToTheHotel(guest1, javaHotel);
        hotelManager.addGuestToTheHotel(guest6, javaHotel);
        hotelManager.addGuestToTheHotel(guest7, javaHotel);
    }

    private static void addingHotelsToHotelManagerSet(HotelManager hotelManager, Hotel javaHotel, Hotel lazyHotel) {
        hotelManager.addHotelToHotelsSet(javaHotel);
        hotelManager.addHotelToHotelsSet(lazyHotel);
    }

    private static void addingRoomsToJavaHotel(Room room1jh, Room room2jh, Room room3jh, Room room4jh, Room room5jh, HotelManager hotelManager, Hotel javaHotel) {
        hotelManager.addRoomToTheHotel(room1jh, javaHotel);
        hotelManager.addRoomToTheHotel(room2jh, javaHotel);
        hotelManager.addRoomToTheHotel(room3jh, javaHotel);
        hotelManager.addRoomToTheHotel(room4jh, javaHotel);
        hotelManager.addRoomToTheHotel(room5jh, javaHotel);
    }

    private static void addingRoomsToLazyHotel(Room room1lh, Room room2lh, Room room3lh, Room room4lh, Room room5lh, HotelManager hotelManager, Hotel lazyHotel) {
        hotelManager.addRoomToTheHotel(room1lh, lazyHotel);
        hotelManager.addRoomToTheHotel(room2lh, lazyHotel);
        hotelManager.addRoomToTheHotel(room3lh, lazyHotel);
        hotelManager.addRoomToTheHotel(room4lh, lazyHotel);
        hotelManager.addRoomToTheHotel(room5lh, lazyHotel);
    }


}
