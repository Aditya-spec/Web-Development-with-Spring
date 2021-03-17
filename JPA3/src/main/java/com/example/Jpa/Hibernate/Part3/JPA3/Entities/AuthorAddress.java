package com.example.Jpa.Hibernate.Part3.JPA3.Entities;

import javax.persistence.Embeddable;

@Embeddable
public class AuthorAddress {
    private int streetNumber;
    private String location;
    private String State;

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}
