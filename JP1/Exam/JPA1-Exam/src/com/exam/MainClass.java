package com.exam;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws Exception {
        Management management = new Management();
        do {
            System.out.println("1. Add new customer");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Print account details");
            System.out.println("Choose menu: ");

            Scanner input = new Scanner(System.in);
            int choose = input.nextInt();
try{
    switch (choose) {
        case 1: {
            management.addnew();
        }
        break;
        case 2: {
            management.update1();
        }
        break;
        case 3: {
            management.update2();
        }
        break;
        case 4: {
            management.details();
        }
        break;
    }
}catch (Exception e) {
    System.out.println(e.getMessage());
}

        } while (true);
    }
}


