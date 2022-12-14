//Teresa Tull worked on this on 9-26-2022 java auto-graded Assignment 2

package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends JobField {
    //moved to JobField class
//    private int id;
//    private static int nextId = 1;
//    private String value;

    public Location() {
        super();
        id = nextId;
        nextId++;
    }

    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.
    public Location(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:
    //moved to JobField class
//    @Override
//    public String toString() {
//        return value;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Location)) return false;
//        Location location = (Location) o;
//        return getId() == location.getId();
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        if (value == null || value == "") {
//            return ("Data not available");
//        }
//        return value;
//    }

    public void setValue(String value) {
        this.value = value;
    }

}
