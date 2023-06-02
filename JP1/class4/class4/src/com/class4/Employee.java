package com.class4;

import java.util.Scanner;

public class Employee extends Staff {
    private String skill;
    Employee(String name,String email,int salory,String skill){
        super(name,email,salory);
        this.skill = skill;
    }
    public void inputEmployee(){
        super.setInput();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter skill: " + skill);
        this.skill = input.nextLine();
    }
    public void display(){
            super.display();
            System.out.println("skill: " + this.skill);
        }
    }