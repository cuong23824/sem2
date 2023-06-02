package com.class6;

import java.util.Scanner;

public class Manager extends Staff {
    String name;
    int salary;

    int bonus;

    public Manager() {
    }

    public Manager(String name, int salary){
        this.name = name;
        this.salary = salary;
    };

    @Override
    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name:");
        this.name = input.nextLine();

        System.out.print("Enter salary:");
        this.salary = input.nextInt();
    }

    @Override
    public void display() {
        System.out.println("ID = " + this.id);
        System.out.println("Name: "+name);
        System.out.println("This is a Manager");

    }

    @Override
    public void updateDataPerson() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name:");
        this.name = input.nextLine();

        System.out.println("Update Person");
    }

    @Override
    public void updateDataSalary() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter salary: ");
        this.salary = input.nextInt();

        System.out.println("Update Salary");
    }

    @Override
    public void totalBonus() {

        salary = salary * 130 / 100;
        System.out.println("Total bonus of company: " + salary);
    }
}
