package org.example;

public class Human extends Mammal{
    private String race;
    public Human(String name, String sex, String race){
        super(name, sex);
        this.race = race;
        System.out.println("Name: " + name
                + "\nSex: " + sex
                + "\nRace: " + race);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
