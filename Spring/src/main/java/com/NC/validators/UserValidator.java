package com.NC.validators;

import com.NC.models.User;

public class UserValidator {
    public boolean ageValidator(User user){
        if (user.getAge()<18){
            return false;
        }
        return true;
    }
//    public boolean FirstSecondNameValidator(User user){
//        //String [] letters = new String []{"!","@","#","&","%","*","(",")","^","+","="};
//        if(user.getSecondName().contains("^@#$%&*")||user.getFirstName().contains("^@#$%&*")){
//            return false;
//        }
//        return true;
//    }
}
