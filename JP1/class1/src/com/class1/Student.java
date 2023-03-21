package com.class1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {
    int id;
    String name;
    String email;

    public void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter id:");
        this.id = input.nextInt();
        input.nextLine();

        System.out.print("Enter name:");
        this.name = input.nextLine();

        System.out.print("Enter email:");
        this.email = input.nextLine();
    }
    public void display(){
        System.out.println("id " + this.id);
        System.out.println("Name is " + this.name);
        System.out.println("Email is " + this.email);
    }

}
