package com.company;

public class LabeledPoint extends Point {
    String label;
    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }
    public String getLabel(){
        return this.label;
    }
    public boolean equals(LabeledPoint lp){
        if (super.equals(lp)&&(lp.label.equals(this.label))){
            return true;
        }
        else
        {
            return false;
        }
    }
    public String toString(){
        return super.toString()+" label = "+this.label;
    }
    public int hashCode(){
        return super.hashCode()+label.hashCode();
    }
}
