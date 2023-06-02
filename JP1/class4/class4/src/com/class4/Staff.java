package com.class4;

import java.util.Scanner;

public class Staff {
    private String name;
    private String email;
    private int salory;
    Staff(String name,String email,int salory){
        this.name = name;
        this.email = email;
        this.salory = salory;
    }
    public void setInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name:");
        this.name = input.nextLine();
        System.out.println("Enter email:");
        this.email = input.nextLine();
        System.out.println("Enter salory:");
        this.salory = input.nextInt();
    }
    public void display(){
        System.out.println("Name is: " + name);
        System.out.println("email is: " + email);
        System.out.println("Salory is: " + salory);
    }

}