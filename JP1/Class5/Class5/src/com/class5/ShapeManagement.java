package com.class5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeManagement {
    List<Shape> list;
    Shape s = null;

    public ShapeManagement() {
        list = new ArrayList<Shape>();
    }

    public void addNewShape() {
        System.out.print("1. Create a Triangle");
        System.out.print("2. Create a Circle");
        System.out.print("3. Create a Rectangle");
        System.out.println("Please choose");

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        switch (a) {
            case 1: {
                s = new Triangle();
            }
            break;
            case 2: {
                s = new Circle();
            }
            break;
            case 3: {
                s = new Rectangle();
            }
            break;

        }

        s.inputData();
        s.getArea();


    //1.
    //2.
    //3.
//        Shape s = new Triangle();
//        s.inputData();
//
//        list.add( s );
}

    public void dislayAll() {
        //for()
    }

    Shape findShapeById() {
        //input id
        //return found Shape
        return null;
    }

    public void updateShape() {
        //Find shape by id
        //input new data
    }


}