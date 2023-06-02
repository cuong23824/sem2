package com.class7;

import java.util.Scanner;

public class Number extends all {
    String PhoneNumber;

    public PhoneNumber(){
    }

    public PhoneNumber(String PhoneNumber){
        this.PhoneNumber = PhoneNumber;
    }

    @Override
    public boolean inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        this.PhoneNumber = input.nextLine();

        return false;
    }

    @Override
    public void display() {

    }
}
