package com.sphedev.mvcdemo.controller;

import com.sphedev.mvcdemo.repository.Grade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class GradeController {
    List<Grade> studentGrades = Arrays.asList(
            new Grade("Harry","Football","C-",new Grade().getId()),
            new Grade("Kane","Football","A-",new Grade().getId()),
            new Grade("Ten Hag","Football","B",new Grade().getId()),
            new Grade("Kimmich","Football","D",new Grade().getId())
    );
    @GetMapping("/grades")
    public String getGrades(Model model){
        model.addAttribute("grades",studentGrades);
        return "grades";
    }

    @GetMapping
    public String gradeFrom(){
        return "form";
    }

}
