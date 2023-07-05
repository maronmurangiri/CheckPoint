package com.checkpoint;

public class Triangle {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Double calculateArea(){
        return ((getBase() * getHeight())/2);
    }

    public  static void main(String[] args){
        Triangle triangle = new Triangle(20.5,10.25);
        System.out.println(triangle.calculateArea());
    }
}
