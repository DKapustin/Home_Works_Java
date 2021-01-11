package com.company;

public class Line extends Shape {
    Point from;
    Point to;
    public Line (Point from, Point to){
        this.from = from;
        this.to = to;
    }
    @Override
    public Point getCenter() {
        Point p = new Point((from.getX()+to.getX()/2),(from.getY()+to.getY()/2));
        return p;
    }
    public Line(Line other){
        this(other.from,other.to);
    }
}
