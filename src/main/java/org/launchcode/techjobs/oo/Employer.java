package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField {
    //moved to JobField class
//    private int id;
//    private static int nextId = 1;
//    private String value;

    public Employer() {
        id = nextId;
        nextId++;
    }

    public Employer(String value) {
        super(value);
    }

    // Custom toString, equals, and hashCode methods:
    //moved to JobField class
//    @Override
//    public String toString() {
//        return value;
//    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }
    //moved to JobField class
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }
//
    // Getters and Setters:
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
//
//    public void setValue(String value) {
//        this.value = value;
//    }

}
