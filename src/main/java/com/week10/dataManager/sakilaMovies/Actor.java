package com.week10.dataManager.sakilaMovies;

public class Actor {
    private int actorId;
    private String firstname;
    private String lastName;

    public Actor(int actorId, String firstname, String lastName) {
        this.actorId = actorId;
        this.firstname = firstname;
        this.lastName = lastName;
    }

    public Actor() {

    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actorId=" + actorId +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
