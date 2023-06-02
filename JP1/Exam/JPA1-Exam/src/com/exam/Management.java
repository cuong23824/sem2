package com.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Management {
    List<Customer> list = new ArrayList<Customer>();

    public void addnew() throws Exception {
        try {
            Customer customer = new Customer();
            customer.input();
            list.add(customer);
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

   Customer findCode() {
       System.out.print("Enter code to find: ");

       Scanner input = new Scanner(System.in);
       String findCode = input.nextLine();

       for (Customer item : list) {
           if (findCode.equals(item.getCode())) {
               item.display();
               return item;
           }
       }
       return null;
   }
       public void update1() throws Exception {
           Customer findCode = findCode();
           try {
               if (findCode != null) {
                   findCode.Deposit();
               } else {
                   System.out.println("Not found");
               }
           }catch (Exception e) {
               throw new Exception(e.getMessage());
           }
       }
    public void update2() throws Exception {
        Customer findCode = findCode();
        try {
            if (findCode != null) {
                findCode.Withdraw();
            } else {
                System.out.println("Not found");
            }
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    public void details(){
        Customer findCode = findCode();
        if(findCode != null){
            findCode.toString();
        }else {
            System.out.println("Not found");
        }
    }
}