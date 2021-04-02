package package_03;

public class Address {
  private int index;
  private String country;
  private String city;
  private String street;
  private int house;
  private int apartment;


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public static void main(String[] args) {
    Address address = new Address();
    //140188, "Russia", "Zhukovsky", "Gagarina", 85, 19

        address.setIndex(140188);
        address.setCountry("Russia");
        address.setCity("Zhukovsky");
        address.setStreet("Gagarina");
        address.setHouse(85);
        address.setApartment(19);

    System.out.println("Index: " + address.getIndex() + " Country: " + address.getCountry() + " City: " + address.getCity() + " Street: " + address.getStreet() + " House: " + address.getHouse() + " Apartment: " + address.getApartment());
  }
}
