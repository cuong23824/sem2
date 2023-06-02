package assignment2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TaskManagement {

    List<Task> listTask;
    String name;
    int TaskTypeId = 0;
    int id;

    public TaskManagement() {
        listTask = new ArrayList<Task>();
    }

    public void addTaskType() throws Exception {
        try{
            Scanner input = new Scanner(System.in);
            System.out.print("Name: ");
            this.name = input.nextLine();
            Task newTask;
            newTask.setId(++TaskTypeId);

            if(name.equals("")){
                throw new Exception("Name can not ");
            }

        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void deleteTaskType() throws Exception {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("ID: ");
            id = input.nextInt();
            listTask.remove(id);

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    private void validateFromTo(String planFrom, String planTo) throws Exception {
        try {
            float from = Float.parseFloat(planFrom);
            float to = Float.parseFloat(planTo);

            if(from >  to) {
                throw new Exception("From can not > to");
            }

        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void addTask(String requirementName, String assignee,
                        String reviewer, String date, String planFrom,
                        String planTo) throws Exception {
        //validation
        if(requirementName.equals("")) {
            throw new Exception("Requirement can not be empty");
        }
        if(assignee.equals("")) {
            throw new Exception("assignee can not be empty");
        }
        if(reviewer.equals("")) {
            throw new Exception("reviewer can not be empty");
        }

        if(date.equals("")) {
            throw new Exception("Datetime can not be empty");
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            sdf.parse(date);
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }

        this.validateFromTo(planFrom, planTo);

        //generate new id
        //using TaskType
        //listTask.add(new Task());

    }
}

