package com.theironyard.entities;

import javax.persistence.*;

/**
 * Created by emileenmarianayagam on 2/7/17.

  */
@Entity
@Table(name = "agencies")
public class Agency {

    @Id
    @GeneratedValue
    int id;

    @Column
    String name;

    @Column
    String address;

    @Column
    String phoneNumber;

    @Column
    String contactPerson;

    @Column
    String email;

    @Column
    String website;

    @Column
    float latitude;

    @Column
    float longitude;



    public Agency() {
    }

    public Agency(String column, String s, String column1, String s1, String column2) {
    }

    public Agency(int id, String name, String address, String phoneNumber, String contactPerson, String email, String website) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.contactPerson = contactPerson;
        this.email = email;
        this.website = website;
    }

    public Agency(String name, String address, String phoneNumber, String contactPerson, String email, String website) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.contactPerson = contactPerson;
        this.email = email;
        this.website = website;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
