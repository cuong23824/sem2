package com.class5;

public class Circle extends Shape {

    float radius;

    public Circle(){
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) Math.PI * this.radius * this.radius;
    }

    @Override
    public float getPerimeter() {
        return 0;
    }


}

