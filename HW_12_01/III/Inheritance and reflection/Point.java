package com.company;

public class Point {
    private double x;
    private double y;
    public  Point(){};
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return  this.y;
    }
    public void setX(double x){this.x =x;}
    public void setY(double y){this.y =y;}
    public String toString(){
        return "Point (X = "+getX()+"Y = "+getY()+")";
    }
    public boolean equals(Point point){
        if ((this.getX()==point.getX())&&(this.getY()==point.getY())){
            return true;
        }
        else {
            return false;
        }
    }
    public int hashCode(){
        String str = ""+this.x+this.y;
        char [] ch = str.toCharArray();
        int hash = 0;
        int p =31;
        for (int i=0;i<str.length();i++){
            hash+=ch[i]*Math.pow(p,str.length()-i-1);
        }
        return hash;
    }
}