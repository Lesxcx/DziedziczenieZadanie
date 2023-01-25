package org.example;

public class GoldFish extends Fish{
    private final String color = "Gold";

    public GoldFish(String name, String sex) {
        super(name, sex);
        System.out.println("Name: " + name
                + "\nSex: " + sex
                + "\nColor: " + color);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
