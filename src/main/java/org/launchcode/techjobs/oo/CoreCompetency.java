package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField {
    //moved to JobField class
//    private int id;
//    private static int nextId = 1;
//    private String value;
//
    public CoreCompetency() {
        this.id = nextId;
        nextId++;
    }

    public CoreCompetency(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:
    //moved to JobField class
//    @Override
//    public String toString() {
//        return value;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.

    // Getters and Setters:
    public int getId() {
        return id;
    }

    public String getValue() {
        if (value == null || value == "") {
            return ("Data not available");
        }
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
