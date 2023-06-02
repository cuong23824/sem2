package com.class3;

public class Wallet {
    int ammount;
    int bill;

    public Wallet() {
        this.ammount = 0;
    }

    public boolean payMoney(int money) {
        if(money > this.ammount)
            return false;

        this.ammount -= money;
        System.out.println("Ammout " + this.ammount);

        return true;
    }

    public void depositMoney(int money) {
        this.ammount += money;
    }

    public void compare(int ammount, int bill){
        System.out.print("this is total of bill:" + ammount);
        if(ammount >= bill)
            System.out.println("You can buy it.");
        else
        System.out.println("You can't buy it.");
    }


}
