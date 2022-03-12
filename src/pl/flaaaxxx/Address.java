package pl.flaaaxxx;

import java.io.Serializable;

public class Address implements Serializable{

    private String street;

    public Address(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}

