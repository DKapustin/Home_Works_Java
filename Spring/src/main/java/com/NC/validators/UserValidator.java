package com.NC.validators;

import com.NC.models.User;

public class UserValidator {
    public boolean ageValidator(User user){
        if (user.getAge()<18){
            return false;
        }
        return true;
    }
}
