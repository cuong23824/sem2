package com.class4;

import java.util.Scanner;

public class Directer extends Staff {
    private String roll;
    Directer(String name,String email,int salory,String roll){
        super(name,email,salory);
        this.roll = roll;
    }
    public void inputDirecter(){
        Scanner input = new Scanner(System.in);
        super.setInput();
        System.out.print("Enter roll: " + roll);
        this.roll = input.nextLine();
    }
    public void display(){
        super.display();
        System.out.println("Roll: " + this.roll);
    }
}
