package com.class3;

import java.util.Scanner;

public class bt {
    private Wallet wallet;
    int tbill=0;
    public void bt(){
        System.out.print("input number of bill:");
        Scanner input = new Scanner(System.in);
        int soluong = input.nextInt();

        for(int i=0; i<soluong ; i++){
            System.out.print("input value of bill "+(i+1) +":");
            int bill = input.nextInt();
            tbill = tbill+bill;
        }
        System.out.print("input value of wallet:");
        int money = input.nextInt();
        System.out.print("this is total of bill:" + tbill);
        if(money > tbill){
            System.out.println("\nYou can buy it.");
        }else {
        System.out.println("\nYou can't buy it.");
        }
    }
}
