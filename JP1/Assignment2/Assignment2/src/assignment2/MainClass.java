package assignment2;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws Exception {
        TaskManagement taskManagement = new TaskManagement();
        do{
            System.out.println("1. Add Task Type");
            System.out.println("2. Delele Task Type");
            System.out.println("3. Display Taks Type");
            System.out.println("4. Add Task");
            System.out.println("5. Delete Task");
            System.out.println("6. Display Task");
            System.out.println("7. Exit");
            System.out.print("Choose menu: ");
            Scanner input = new Scanner(System.in);
            int choose = input.nextInt();

            switch (choose) {
                case (1):{
                    taskManagement.addTaskType();
                }break;
                case (2):{
                    taskManagement.deleteTaskType();
                }

            }


        }while (true);
    }
}
