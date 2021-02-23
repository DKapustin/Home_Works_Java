package com.NC.controllers;

import com.NC.models.User;
import com.NC.validators.UserValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import java.io.*;
import java.util.Scanner;

@Controller
public class UserController {

    @GetMapping("/form")
    public String greetingFrom(Model model) {
        model.addAttribute("form", new User());
        return "index";
    }

    @PostMapping("/form")
    public String greetingSubmit(User form, BindingResult bindingResult) {
        StringBuffer data =  new StringBuffer();
        UserValidator uv = new UserValidator();
        if (!uv.ageValidator(form)){return "error";}
        try {
            FileReader fr = new FileReader("users.txt");
            Scanner in = new Scanner(fr);
            while (in.hasNextLine()) {
                data.append(in.nextLine()+"\n");
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

       try (FileWriter nFile = new FileWriter("users.txt", false)) {
            data.append(form.toString()+"\n");
            nFile.write(data.toString());
       } catch (IOException e) {
            e.printStackTrace();
       }
       return "sended";
    }
}
