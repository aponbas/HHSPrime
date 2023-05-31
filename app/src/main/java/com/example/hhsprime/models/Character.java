package com.example.hhsprime.models;

import java.util.ArrayList;
import java.util.Date;


public class Character {

    private int id;
    private String name;
    private Date dateOfBirth;
    private ArrayList<Show> showList;

    private static int counter = 0;


    public Character() {
        this.id = counter++;
    }

    public Character(String name) {
        this.name = name;
        this.id = counter++;
    }

    public Character(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.id = counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return "This character's name is " + this.name + " and was born on " + this.dateOfBirth.toString() + ".";
    }

    public boolean addShow(Show show) {
        return this.showList.add(show);
    }

    public Show getShow(int index) {
        for (Show show : showList) {
            if (show.getId() == index) {
                return show;
            }
        }
        return null;
    }

    public ArrayList<Show> getAllShows() {
        return showList;
    }
}
