package com.btTask;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws Exception {
        Scanner inputdata = new Scanner(System.in);
        TaskManagement taskManagement = new TaskManagement();
        do {
            System.out.println("1. Add Task Type");
            System.out.println("2. Display Task Type");
            System.out.println("3. Add Task");
            System.out.println("Choose menu: ");

            Scanner input = new Scanner(System.in);
            int choose = input.nextInt();
            try{
                switch (choose) {
                    case 1: {
                        taskManagement.addTaskType();
                    }
                    break;
                    case 2: {
                        taskManagement.DisplayTaskType();
                    }
                    break;
                    case 3: {
                        taskManagement.addTask();
                    }
                    break;
                }
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } while (true);
    }
}

