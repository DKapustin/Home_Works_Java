package com.company;

public class Circle extends Shape {
    Point center;
    double radius;
    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }
    @Override
    public Point getCenter() {
        return this.center;
    }
    public Circle(Circle other){
        this(other.center,other.radius);
    }
}
