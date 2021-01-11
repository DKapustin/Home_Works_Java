package com.company;

public class Rectangle extends Shape {
    Point topLeft;
    double width;
    double height;
    public Rectangle (Point topLeft, double width, double height){
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }
    @Override
    public Point getCenter() {
        Point p = new Point(topLeft.getX()+width/2,topLeft.getY()-height/2);
        return p;
    }
    public Rectangle(Rectangle other){
        this(other.topLeft, other.width, other.height);
    }
}
