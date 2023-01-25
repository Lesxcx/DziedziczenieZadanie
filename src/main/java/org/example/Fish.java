package org.example;

public abstract class Fish extends Animal{
    private final boolean gills = true;

    public Fish(String name, String sex){
        this.setName(name);
        this.setSex(sex);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
