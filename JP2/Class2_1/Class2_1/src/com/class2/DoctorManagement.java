package com.class2;

import java.util.HashMap;
import java.util.Scanner;

public class DoctorManagement {
    HashMap<String, Doctor> mapDoctors;
    DoctorManagement(){
        mapDoctors = new HashMap<>();
    }

    DoctorManagement(HashMap<String,Doctor> map){
        this.mapDoctors = map;
    }
    Scanner input = new Scanner(System.in);

}
