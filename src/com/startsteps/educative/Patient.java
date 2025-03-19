package com.startsteps.educative;

class Patient {
    //Declare member variables here
    private String name;
    private int id;
    private String doctor;

    //Declare Getters and Setters here
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDoctor() {
        return doctor;
    }
}