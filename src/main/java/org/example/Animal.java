package org.example;

public abstract class Animal {
    private String sex;
    private String name;
    @Override
    public String toString() {
        return super.toString();
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public String setSex(String sex) {
        return this.sex;
    }

    public String setName(String name) {
        return this.name;
    }
}
