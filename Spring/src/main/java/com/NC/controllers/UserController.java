package com.NC.controllers;

import com.NC.models.User;
import com.NC.validators.UserValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
        String oldData = "";
        UserValidator uv = new UserValidator();
        if (!uv.ageValidator(form)){return "error";}
        //if (!uv.FirstSecondNameValidator(form)){return "error";}
        try {
            FileReader fr = new FileReader("users.txt");
            Scanner in = new Scanner(fr);
            while (in.hasNextLine()) {
                oldData += in.nextLine() + "\n";
            }
            in.close();
        } catch (FileNotFoundException e1) {
            System.out.println(e1.getMessage());
        }

       try (FileWriter nFile = new FileWriter("users.txt", false)) {
            oldData += form.toString() + "\n";
            nFile.write(oldData);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return "sended";
    }

//    @RequestMapping("/form")
//    public String save(Model model) {
//       model.addAttribute("form", new User());
//       return "save";
//   }
}
