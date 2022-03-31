package com.company;

public class Person {

    private Cheracter cheracter;
    private String name;
    private int age;

    public Person(Cheracter cheracter) {
        this.cheracter = cheracter;
    }

    public Person(String name, int age, Cheracter cheracter) {
        this.name = name;
        this.age = age;
        this.cheracter=cheracter;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public String getInfo() {
        return "Name: " + name +
                "\nAge: " + age+
                "\nCheracter: "+ cheracter;
    }
}
