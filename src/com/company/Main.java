package com.company;

public class Main {

    public static void main(String[] args) {
    Employee employee = new Employee("Азамат", 25, Cheracter.EMPLOYEE,"Банк", "Программист");
        System.out.println(employee.getInfo());
        System.out.println("_____________________________________________");

        Client client = new Client("Бакыт", 55, Cheracter.CLIENT, "Школа", "преподаватель", 5000);
        System.out.println(client.getInfo());
        System.out.println("_____________________________________________");
        Client client1 = new Client(" Rasul", 35, Cheracter.CLIENT, "Cafe", "Bissnessman", 1000000);
        System.out.println(client1.getInfo());

    }
}
