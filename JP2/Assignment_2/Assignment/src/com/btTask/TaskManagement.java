package com.btTask;

import java.sql.*;
import java.util.Scanner;

public class TaskManagement {
    int taskTypeID = 0;
    int taskID = 0;
    public void addTaskType() throws Exception{
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-VMGQI7CN\\SQLEXPRESS05;instance=SQLEXPRESS;database=Assignment_JP2;encrypt=true;trustServerCertificate=true","cuong","23082004Ncc");
            PreparedStatement preparedStatement = conn.prepareStatement("insert into TaskType(id, name) values (?,?)");
            Scanner inputTaskType = new Scanner(System.in);

            taskTypeID++ ;
            System.out.print("Enter name: ");
            String taskTypeName = inputTaskType.nextLine();

            TaskType typeTask = new TaskType(taskTypeID, taskTypeName);
            preparedStatement.setInt(1, typeTask.getTaskTypeId());
            preparedStatement.setString(2, typeTask.getTaskTypeName());

            int updated = preparedStatement.executeUpdate();
            if (updated > 0) {
                System.out.println("Insert Task Type success!");
            }
            preparedStatement.close();
            conn.close();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    public void DisplayTaskType() throws Exception{
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-VMGQI7CN\\SQLEXPRESS05;instance=SQLEXPRESS;database=Assignment_JP2;encrypt=true;trustServerCertificate=true","cuong","23082004Ncc");
            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery("SELECT id, name FROM ");

            while (rs.next()){
                System.out.println("=====TaskType=====");
                TaskType taskType = new TaskType(
                        rs.getInt(1),
                        rs.getString(2));

                System.out.println(taskType.toString());
            }
            rs.close();
            statement.close();
            conn.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
    public void addTask() throws Exception{
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-VMGQI7CN\\SQLEXPRESS05;instance=SQLEXPRESS;database=Assignment_JP2;encrypt=true;trustServerCertificate=true","cuong","23082004Ncc");
            PreparedStatement preparedStatement = conn.prepareStatement("insert into Task(id, RequirementName, Date, From, To, Assignee, Reviewer) values (?,?,?,?,?,?,?)");
            Scanner inputTask = new Scanner(System.in);

            taskID++;

            System.out.print("Enter RequirementName: ");
            String requirementName = inputTask.nextLine();

            java.sql.Date date = java.sql.Date.valueOf(inputTask.nextLine());
            System.out.print("Enter From: ");
            Float planFrom = inputTask.nextFloat();
            System.out.print("Enter : ");
            Float planTo = inputTask.nextFloat();

            System.out.print("Enter Assignee: ");
            String Assignee = inputTask.nextLine();
            System.out.print("Enter Reviewer: ");
            String Reviewer = inputTask.nextLine();

            Task task = new Task();
            preparedStatement.setInt(1, task.getTaskID());
            preparedStatement.setString(2, task.getRequirementName());
            preparedStatement.setDate(3, (Date) task.getDate());
            preparedStatement.setFloat(4, task.getPlanFrom());
            preparedStatement.setFloat(5,task.getPlanTo());
            preparedStatement.setString(6, task.getAssignee());
            preparedStatement.setString(7, task.getReviewer());


            int updated = preparedStatement.executeUpdate();
            if (updated > 0) {
                System.out.println("Insert Task Type success!");
            }

            preparedStatement.close();
            conn.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
