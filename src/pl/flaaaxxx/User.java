package pl.flaaaxxx;

import java.io.Serializable;

public class User extends Address {

    private String name;
    private String lastname;
    private String street;

    public User(String name, String lastname, String street) {
        super(street);
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
