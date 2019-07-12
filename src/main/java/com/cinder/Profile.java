package com.cinder;

public class Profile {
    private int hiking;
    private int dancing;
    private int sports;
    private int reading;
    private int quietNight;
    private int dining;
    private int debate;
    private int club;
    private int politics;
    private int beach;
    private int parties;

    public Profile() {}

    public Profile(int hiking, int dancing, int sports, int reading, int quietNight, int dining, int debate, int club, int politics, int beach, int parties) {
        this.hiking = hiking;
        this.dancing = dancing;
        this.sports = sports;
        this.reading = reading;
        this.quietNight = quietNight;
        this.dining = dining;
        this.debate = debate;
        this.club = club;
        this.politics = politics;
        this.beach = beach;
        this.parties = parties;
    }

    public int getHiking() {
        return this.hiking;
    }

    public void setHiking(int hiking) {
        this.hiking = hiking;
    }

    public int getDancing() {
        return this.dancing;
    }

    public void setDancing(int dancing) {
        this.dancing = dancing;
    }

    public int getSports() {
        return this.sports;
    }

    public void setSports(int sports) {
        this.sports = sports;
    }

    public int getReading() {
        return this.reading;
    }

    public void setReading(int reading) {
        this.reading = reading;
    }

    public int getQuietNight() {
        return this.quietNight;
    }

    public void setQuietNight(int quietNight) {
        this.quietNight = quietNight;
    }

    public int getDining() {
        return this.dining;
    }

    public void setDining(int dining) {
        this.dining = dining;
    }

    public int getDebate() {
        return this.debate;
    }

    public void setDebate(int debate) {
        this.debate = debate;
    }

    public int getClub() {
        return this.club;
    }

    public void setClub(int club) {
        this.club = club;
    }

    public int getPolitics() {
        return this.politics;
    }

    public void setPolitics(int politics) {
        this.politics = politics;
    }

    public int getBeach() {
        return this.beach;
    }

    public void setBeach(int beach) {
        this.beach = beach;
    }

    public int getParties() {
        return this.parties;
    }

    public void setParties(int parties) {
        this.parties = parties;
    }
}
