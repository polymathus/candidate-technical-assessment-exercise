package com.polymathus.gaggle.domain;

import org.apache.log4j.Logger;

public class Person {
    private static final Logger LOGGER = Logger.getLogger(Person.class);

    private String firstName = "";
    private String lastName = "";
    private String fullName = "";

    /**
     * Public Constructor
     */
    public Person() {

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
