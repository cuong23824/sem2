package com.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
    String customerCode;
    String customerName;
    String accNumber;
    int amount;


    public Customer(String customerCode,String customerName,String accNumber,int amount){
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.accNumber = accNumber;
        this.amount = amount;
    }
    public Customer(){
        amount = 0;
    }

    public String getCode(){
        return this.customerCode;
    }

    public void display(){
        System.out.println("Code: "+ customerCode);
        System.out.println("Name: "+ customerName);
        System.out.println("Account number: " + accNumber);
        System.out.println("Amount: " + amount);
    }
    public String toString(){
        return this.customerCode + "," + this.customerName + "," + this.accNumber;
    }
    public void input() throws Exception{
        Scanner input = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\d{6}");

        try {
            System.out.print("Enter code: ");
            this.customerCode = input.nextLine();

            if(customerCode.length() != 5) {
                throw new Exception("Code must be charaters");
            }

            System.out.print("Enter name: ");
            this.customerName = input.nextLine();

            System.out.print("Enter account number: ");
            this.accNumber = input.nextLine();

            if(!accNumber.startsWith("100")) {
                throw new Exception("Account number must be start with 100");
            }

            Matcher matcher = pattern.matcher(accNumber);
            if(!matcher.matches()) {
                throw new Exception("Account number must be 6 digits");
            }
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    public void Deposit() throws Exception{
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter deposit amount: ");
            int money = input.nextInt();

            if(money<0){
                throw new Exception("The Amount of money must be a positive number");
            }else {
                this.amount += money;
                System.out.println("Successful transaction!");
            }

        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void Withdraw() throws Exception{
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter withdraw amount: ");
            int money = input.nextInt();

            if(money>=amount || money == 0){
                throw new Exception("The amount of money must be greater than 0 and less than amount");
            }else {
                this.amount -= money;
            }

        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }
}
