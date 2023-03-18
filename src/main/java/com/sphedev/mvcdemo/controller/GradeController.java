package com.sphedev.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {
    @GetMapping("/grades")
    public String getGrades(Model model){
        return "grade";
    }
}