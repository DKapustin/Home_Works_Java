package com.company;

public class Main {
    public static double average(Measurable [] measurables){
        double summa = 0;
        for (int i=0;i<measurables.length;i++){
            summa+=measurables[i].getMeasure();
        }
        return summa/measurables.length;
    }
    public static Measurable largest(Measurable [] measurables){
        int indexMax = 0;
        double maxSalary = measurables[0].getMeasure();
        for(int i=1;i<measurables.length;i++){
            if (measurables[i].getMeasure()>maxSalary){
                maxSalary = measurables[i].getMeasure();
                indexMax = i;
            }
        }
        return measurables[indexMax];
    }
    public static void main(String[] args) {
        Employee empl1 = new Employee("Lee",1000);
        Employee empl2 = new Employee("Grogu",1600);
        Employee empl3 = new Employee("Kirill",100);
        System.out.println(average(new Measurable[]{empl1,empl2,empl3}));
        System.out.println(((Employee)largest(new Measurable[]{empl1,empl2,empl3})).getName());
    }
}