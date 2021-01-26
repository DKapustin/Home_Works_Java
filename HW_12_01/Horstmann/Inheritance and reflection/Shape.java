package com.company;

public abstract class Shape {
    Point point = new Point();
    public Shape(){};
    public Shape(Point p){
        this.point=p;
    }
    public void moveBy(double dx, double dy){
        this.point.setX(this.point.getX()+dx);
        this.point.setY(this.point.getY()+dy);
    }
    abstract public Point getCenter();
    public Shape(Shape other){
        this(other.point);
    }
}
