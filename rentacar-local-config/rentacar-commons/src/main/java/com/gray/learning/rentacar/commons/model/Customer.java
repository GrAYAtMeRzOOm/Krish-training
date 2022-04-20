package com.gray.learning.rentacar.commons.model;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 20-Apr-22
 * Time: 5:45 PM
 * rentcloud-commons
 */


@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String firstName;
    String lastName;
    String dlNumber;
    String zipCode;

    public Customer(int id, String firstName, String lastName, String dlNumber, String zipCode) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dlNumber = dlNumber;
        this.zipCode = zipCode;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDlNumber() {
        return dlNumber;
    }

    public void setDlNumber(String dlNumber) {
        this.dlNumber = dlNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
