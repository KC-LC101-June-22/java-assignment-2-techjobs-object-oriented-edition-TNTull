package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    protected int id;
    protected static int nextId = 1;
    protected String value;

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
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }

}
