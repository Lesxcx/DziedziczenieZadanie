package org.example;

public abstract class Mammal extends Animal{

    public Mammal(String name, String sex){
        this.setName(name);
        this.setSex(sex);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
