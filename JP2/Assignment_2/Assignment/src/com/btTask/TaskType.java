package com.btTask;

public class TaskType {
    private int id = 0;
    private String name;

    public TaskType(){
    }

    public TaskType(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return this.id + ","+
                this.name;
    }
    public int getTaskTypeId() {
        return id;
    }
    public void setTaskTypeId(int id){
        this.id = id;
    }
    public String getTaskTypeName(){
        return name;
    }
    public  void setName(String name){
        this.name = name;
    }
}
