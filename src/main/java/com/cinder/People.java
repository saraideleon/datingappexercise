package com.cinder;

public class People {
    private int id;
    private String name;
    private int age;
    private String bio;

    public People() {}

    public People(int id, String name, int age, String bio) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bio = bio;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBio() {
        return this.bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
