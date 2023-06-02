package com.assignment;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        JSONManagement jsonManagement = new JSONManagement();

        do {
            System.out.println("1. Insert ");
            System.out.println("2. Delete ");

            int choose = input.nextInt();
        try {
            switch (choose) {
                case 1: {
                    jsonManagement.readJSON();
                }
                break;
                case 2: {
                    jsonManagement.delete();
                }
                break;
                }
            }catch (Exception e){
              System.out.println(e.getMessage());
            }
        }while (true);
    }
}

