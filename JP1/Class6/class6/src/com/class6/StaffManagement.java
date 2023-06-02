package com.class6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StaffManagement {
    List<Staff> list = new ArrayList<Staff>();
    int currentId = 0;

    public void addNewPerson(){
        System.out.println("1. Add new Director");
        System.out.println("2. Add new Manager");
        System.out.println("3. Add new Employee");
        System.out.print("Please choose: ");
        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();

        Staff newPerson = null;
        switch (choose) {
            case 1: {
                newPerson = new Director();
            }
            break;
            case 2: {
                newPerson = new Manager();
            }
            break;
            case 3: {
                newPerson = new Employee();
            }
            break;
        }

        newPerson.setId(++currentId);
        newPerson.inputData();
        list.add(newPerson);
    }


    public void dislayAll() {
        for (Staff item : list) {
            item.display();
        }
    }

    Staff findPersonById() {
        System.out.print("Enter id to find: ");
        Scanner input = new Scanner(System.in);
        int findId = input.nextInt();

        for (Staff item : list) {
            if(findId == item.getId()) {
                item.display();
                return item;
            }
        }

        return null;
    }
    public void updatePerson() {
        Staff findStaff = this.findPersonById();
        if(findStaff != null) {
            findStaff.updateDataPerson();
        } else {
            System.out.println("Not found");
        }
    }

    public void bonus(){
        Staff findStaff = this.findPersonById();
        if(findStaff != null) {
            findStaff.totalBonus();
        } else {
            System.out.println("Not found");
        }
    }

    public void updateSalary(){
        Staff findStaff = this.findPersonById();
        if(findStaff != null) {
            findStaff.updateDataSalary();
        } else {
            System.out.println("Not found");
        }
    }
}
