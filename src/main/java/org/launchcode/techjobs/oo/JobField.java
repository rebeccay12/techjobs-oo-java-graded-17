package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

//    What fields do ALL FOUR of the classes have in common? int id, next id, and value
    public int id;
    public static int nextId = 1;
    public String value;
//    Which constructors are the same in ALL FOUR classes?

    public JobField() {
        this.id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }
//    What getters and setters do ALL of the classes share?

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    //{
       // this.value = value;
   // }

    //    Which custom methods are identical in ALL of the classes?

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
