package com.class4;

public class MainClass {
    public static void main(String[] args) {
        Staff staffs[] = new Staff[3];
        staffs[0] = new Directer("Cuong","cuong@.com",1000,"");
        staffs[1] = new Manager("Han","han@.com",50,"IT");
        staffs[2] = new Employee("Ha","ha@.com",10,"JF1");

        for(Staff item:staffs){
            item.display();
        }
    }
}
