package com.class6;

public abstract class Staff {
    int id;

    public abstract void inputData();

    public abstract void display();

    public abstract void updateDataPerson();

    public abstract void updateDataSalary();

    public abstract void totalBonus();
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
}
