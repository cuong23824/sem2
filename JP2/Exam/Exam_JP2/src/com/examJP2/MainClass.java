package com.examJP2;

import java.util.Scanner;

import static java.lang.System.exit;

public class MainClass {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ContactManagement contactManagement = new ContactManagement();
        do{ System.out.println("1. Add New Contact");
            System.out.println("2. Find Contact");
            System.out.println("3. Display All Contact");
            System.out.println("4. Exit");

            int choose = input.nextInt();
            try {
                switch (choose){
                    case 1:{
                        contactManagement.addNewContact();
                    }
                    break;
                    case 2:{
                        contactManagement.findContact();
                    }break;
                    case 3:{
                        contactManagement.displayContact();
                    }
                    break;
                }
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while (true);
    }
}
