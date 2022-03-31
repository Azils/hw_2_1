package com.company;

public final class Client extends Employee {
    private int summ;


    public Client(String name, int age, Cheracter cheracter, String company, String position, int summ) {
        super(name, age, cheracter, company, position);
        this.summ = summ;
    }

    public int getSumm() {
        return summ;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\nSumm: "+summ;
    }
}
