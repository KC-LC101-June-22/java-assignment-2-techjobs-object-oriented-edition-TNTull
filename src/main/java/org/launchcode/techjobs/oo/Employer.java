//Teresa Tull worked on this on 9-26-2022 java auto-graded Assignment 2

package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField {
    //moved to JobField class
//    private int id;
//    private static int nextId = 1;
//    private String value;

    public Employer() {
        super();
        id = nextId;
        nextId++;
    }

    public Employer(String value) {
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
//    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
//        if (this == o) return true;
//        if (!(o instanceof Employer)) return false;
//        Employer employer = (Employer) o;
//        return getId() == employer.getId();
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }

    // Getters and Setters:

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
