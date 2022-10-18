//Teresa Tull worked on this on 9-26-2022 java auto-graded Assignment 2

package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    protected int id;
    protected static int nextId = 1;
    protected String value;

    public JobField(String value) {
        this.value = value;
    }

    public JobField() {
        this.id = nextId;
        nextId++;
    }


    //    public JobField() {
//        this.id = nextId;
//        nextId++;
//    }
//
//    public JobField(String value) {
//        this.value = value;
//    }

    @Override
    public String toString() {
        return value;
    }

    public String getValue() {
        if (value == null || value == "") {
            return ("Data not available");
        }
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
