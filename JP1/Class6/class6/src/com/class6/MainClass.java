package com.class6;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        StaffManagement staffManagement = new StaffManagement();

        do {
            System.out.println("----------Menu----------");
            System.out.println("1. Create new person");
            System.out.println("2. Display all");
            System.out.println("3. Find person by ID");
            System.out.println("4. Update person");
            System.out.println("5. Total bonus");
            System.out.println("6. Update salary");
            System.out.println("Choose menu: ");

            Scanner input = new Scanner(System.in);
            int choose = input.nextInt();

            switch (choose) {
                case 1: {
                    staffManagement.addNewPerson();
                }
                break;
                case 2: {
                    staffManagement.dislayAll();
                }
                break;
                case 3: {
                    staffManagement.findPersonById();
                }
                break;
                case 4: {
                    staffManagement.updatePerson();
                }
                break;
                case 5: {
                    staffManagement.bonus();
                }
                break;
                case 6: {
                    staffManagement.updateSalary();
                }
                break;
            }
        } while (true);
    }
}
