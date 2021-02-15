package com.NC.models;

public class User {
    private String FirstName;
    private String SecondName;
    private String Patronymic;
    private Integer Age = 18;
    private Double Salary;
    private String Email;
    private String Work;

    public User(){
//        //this.FirstName = null;
//        this.SecondName = null;
//        this.Patronymic = null;
//        this.Age = null;
//        this.Salary = null;
//        this.Email = null;
//        this.Work = null;
    }

    public User(String SecondName, String FirstName, String Patronymic, Integer Age, Double Salary, String Email, String Work){
        this.FirstName = FirstName;
        this.SecondName = SecondName;
        this.Patronymic = Patronymic;
        this.Age = Age;
        this.Salary = Salary;
        this.Email = Email;
        this.Work = Work;
    }

    public String getFirstName(){
        return this.FirstName;
    }
    public String getSecondName(){
        return this.SecondName;
    }
    public String getPatronymic(){
        return this.Patronymic;
    }
    public Integer getAge(){
        return this.Age;
    }
    public Double getSalary(){
        return this.Salary;
    }
    public String getEmail(){
        return this.Email;
    }
    public String getWork(){
        return this.Work;
    }

    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }
    public void setSecondName(String SecondName){
        this.SecondName = SecondName;
    }
    public void setPatronymic(String Patronymic){
        this.Patronymic = Patronymic;
    }
    public void setAge(Integer Age){
        this.Age = Age;
    }
    public void setSalary(Double Salary){
        this.Salary = Salary;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }
    public void setWork(String Work){
        this.Work = Work;
    }

    @Override
    public String toString(){
        StringBuilder record = new StringBuilder("");
        if (!this.getFirstName().equals("")){record.append(this.FirstName);}
        else {record.append("null");}

        if (!this.getSecondName().equals("")){record.append(" "+this.SecondName);}
        else {record.append(" null");}

        if (!this.getPatronymic().equals("")){record.append(" "+this.Patronymic);}
        else {record.append(" null");}

       if (!(this.getAge() == 0)){record.append(" "+this.Age);}
        else {record.append(" null");}

        if (!(this.getSalary() == null)){record.append(" "+this.Salary);}
        else {record.append(" null");}

        if (!this.getEmail().equals("")){record.append(" "+this.Email);}
        else {record.append(" null");}

        if (!this.getWork().equals("")){record.append(" "+this.Work);}
        else {record.append(" null");}

        return record.toString();
    }


}
