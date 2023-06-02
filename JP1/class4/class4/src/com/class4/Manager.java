package com.class4;

import java.util.Scanner;

public class Manager extends Staff{
    private String department;

    Manager(String name,String email,int salory,String department){
        super(name,email,salory);
        this.department = department;
    }

    public void inputManager() {
        super.setInput();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter department: " + department);
        this.department = input.nextLine();
    }
    public void display(){
        super.display();
        System.out.println("department: " + this.department);
    }
}
