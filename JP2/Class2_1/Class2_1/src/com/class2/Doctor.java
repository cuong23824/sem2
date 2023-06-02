package com.class2;

import java.util.Scanner;

public class Doctor {
    private String code, name, specialization;
    private int availability;

    public Doctor() {
    }

    public Doctor(String code) {
        this.code = code;
    }

    public Doctor(String code, String name, String specialization,
                  int availability) {
        this.code = code;
        this.name = name;
        this.specialization = specialization;
        this.availability = availability;
    }
    public void display() {
        System.out.printf( code, name, specialization, availability);
    }
    public void addDoctor(Doctor doctor) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Code: ");
        this.code = input.nextLine();

        System.out.println("Enter Name: ");
        this.name = input.nextLine();

        System.out.println("Enter Specialization");
        this.specialization = input.nextLine();

        System.out.println("Enter Availability");
        this.availability = input.nextInt();
    }
}