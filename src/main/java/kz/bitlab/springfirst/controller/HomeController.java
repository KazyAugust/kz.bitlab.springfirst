package kz.bitlab.springfirst.controller;


import kz.bitlab.springfirst.db.DbManager;
import kz.bitlab.springfirst.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage(Model model) {
        List<Student> students = DbManager.getStudents();
        model.addAttribute("studentter", students);
        return "home-page";

    }
}
