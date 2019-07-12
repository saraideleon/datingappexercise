package com.cinder;

public class Dislikes {
    private int id;
    private int personId;

    public Dislikes() {}

    public Dislikes(int id, int personId) {
        this.id = id;
        this.personId = personId;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonId() {
        return this.personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }
}
