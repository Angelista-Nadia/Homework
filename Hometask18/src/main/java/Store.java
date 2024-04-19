import java.util.ArrayList;

public class Store {
    private int number;
    private String city;
    private String address;
    private String phoneNumber;

    public Store(int number, String city, String address, String phoneNumber) {
        this.number = number;
        this.city = city;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Store{" +
                "number=" + number +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
