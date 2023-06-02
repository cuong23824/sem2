package com.class2;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        DoctorManagement management = new DoctorManagement();
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("------Menu------");
            System.out.println("1. Add doctor");
            System.out.println("2. Update doctor");
            System.out.println("3. Delete doctor");
            System.out.println("4. Search doctor");
            System.out.println("5. View all doctor");
            System.out.println("6. Exit");
            System.out.print("Please choice menu: ");

            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1: {
                    }
                    break;
                    case 2: {

                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}
