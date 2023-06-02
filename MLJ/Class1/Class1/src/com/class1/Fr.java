package com.class1;

import java.util.Date;

public class Fr {
    String name;
    Date dob;
    String p;

    public Fr(){
    }

    public Fr(String name, Date dob, String p){
        this.name = name;
        this.dob = dob;
        this.p = p;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }
}
