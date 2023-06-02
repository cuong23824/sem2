package com.btTask;

import java.util.Date;

public class Task {
    private int taskID;
    private String requirementName, assignee, reviewer;
    private Date date;

    private float planFrom, planTo;


    public Task(int taskID, String requirementName, Date date, float planFrom, float planTo,String assignee, String reviewer) {
        this.taskID = taskID;
        this.requirementName = requirementName;
        this.assignee = assignee;
        this.reviewer = reviewer;
        this.date = date;
        this.planFrom = planFrom;
        this.planTo = planTo;
    }

    public Task(){
    }


    public int getTaskID(){
        return taskID;
    }
    public void setTaskID()
    {
        this.taskID = taskID;
    }
    public String getRequirementName(){
        return requirementName;
    }
    public void setRequirementName(){
        this.requirementName = requirementName;
    }

    public Date getDate(){
        return date;
    }
    public void setDate(){
        this.date = date;

    }

    public float getPlanFrom(){
        return planFrom;
    }
    public void setPlanFrom(){
        this.planFrom = planFrom;
    }

    public float getPlanTo(){
        return planTo;
    }
    public void setPlanTo(){
        this.planTo = planTo;
    }

    public String getAssignee(){
        return assignee;
    }
    public void setAssignee(){
        this.assignee = assignee;
    }

    public String getReviewer(){
        return reviewer;
    }
    public void setReviewer(){
        this.reviewer = reviewer;
    }
}
