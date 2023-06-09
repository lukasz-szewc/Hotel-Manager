package HotelManager;

public class Guest {

    private String guestFirstName;
    private String guestLastName;

    public Guest(String guestFirstName, String guestLastName) {
        this.guestFirstName = guestFirstName;
        this.guestLastName = guestLastName;
    }

    public String getGuestFirstName() {
        return guestFirstName;
    }

    public void setGuestFirstName(String guestFirstName) {
        this.guestFirstName = guestFirstName;
    }

    public String getGuestLastName() {
        return guestLastName;
    }

    public void setGuestLastName(String guestLastName) {
        this.guestLastName = guestLastName;
    }
}
