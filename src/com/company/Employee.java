package com.company;

public class Employee extends Person{
    private String company;
    private String position;

    public Employee(String name, int age,Cheracter cheracter, String company, String position) {
        super(name, age, cheracter);
        this.company = company;
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }


    public String getInfo() {

        return
                super.getInfo()+"\nCompany: "+ company+ "\nPosition: "+ position;
}
}
