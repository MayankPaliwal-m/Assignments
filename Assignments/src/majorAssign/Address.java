package majorAssign;

public class Address {
    private String buildingName;
    private String streetName;
    private String city;
    private String state;
    private int pinCode;

    public Address(String buildingName, String streetName, String city, String state, int pinCode) {
        this.buildingName = buildingName;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }
}
