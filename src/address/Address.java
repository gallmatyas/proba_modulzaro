package address;

import java.util.ArrayList;
import java.util.List;

public class Address {
    private List<CoworkerAddress> addresses;

    public Address() {
        addresses = new ArrayList<>();
    }

    public void addAddress(CoworkerAddress address) {
        addresses.add(address);
    }

    public List<CoworkerAddress> getAddresses() {
        return addresses;
    }

    public static class CoworkerAddress {
        private String country;
        private String postalCode;
        private String street;
        private String floor;

        public CoworkerAddress(String country, String postalCode, String street, String floor) {
            this.country = country;
            this.postalCode = postalCode;
            this.street = street;
            this.floor = floor;
        }

        public String getCountry() {
            return country;
        }

        public String getPostalCode() {
            return postalCode;
        }

        public String getStreet() {
            return street;
        }

        public String getFloor() {
            return floor;
        }
    }
}
