package org.example;

public class Main {
    public static void main(String[] args) {
        Animal fish = new GoldFish("Goldi", "Female");
        System.out.println(fish);
        Animal human = new Human("Karol", "Male", "Caucasian");
        System.out.println(human);
    }
}