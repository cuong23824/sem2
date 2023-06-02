package assignment2;

import java.util.Date;

public class Task {
    private int id;
    private String requirementName, assignee, reviewer;


    public Task(int id, String requirementName, String assignee, String reviewer, Date date, float planFrom, float planTo) {
        this.id = id;
        this.requirementName = requirementName;
        this.assignee = assignee;
        this.reviewer = reviewer;
        this.date = date;
        this.planFrom = planFrom;
        this.planTo = planTo;
    }


    public void setId(int id) {
        this.id = id;
    }


    private Date date;

    private float planFrom, planTo;
}

