package com.class2;

import java.util.Scanner;

public class bt {
    public void bt2(){
        int n; int t=0; int d=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer n=");
        n= input.nextInt();
        while (n>=1){
            d= n % 10;
            n= n/10;
            t+=d;
        }
        System.out.println("Sum digit:" +t);
    }

    public void bt1(){
        int arrayInt[];
        int total = 0; int even=0; int odd=0;
        System.out.print("Number of element : ");
        Scanner input = new Scanner(System.in);

        total = input.nextInt();
        arrayInt = new int[total];

        for (int i = 0; i < total; i++) {
            System.out.print("Element " + (i+1) + "=");
            arrayInt[i] = input.nextInt();
        }

        for(int item : arrayInt) {
            if(item % 2 ==0){
                even += item;
            }else {
                odd += item;
            }
        }
        System.out.println("Sum of even:"+ even);
        System.out.println("Sum of odd:"+ odd);
    }
}
