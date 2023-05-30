package com.example.hhsprime.models;

public class Show {
    private int id;
    private String name;
    private int seasons;
    private Character mainCharacter;

    public Show() {
    }

    public Show(String name, int seasons) {
        this.name = name;
        this.seasons = seasons;
    }

    public Show(String name, int seasons, Character character) {
        this.name = name;
        this.seasons = seasons;
        this.mainCharacter = character;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public Character getCharacter() {
        return mainCharacter;
    }

    public void setCharacter(Character character) {
        this.mainCharacter = character;
    }

    public String toString(){
        return "This show's name is " + this.name + " and has " + this.mainCharacter + " as main character.";
    }

}
