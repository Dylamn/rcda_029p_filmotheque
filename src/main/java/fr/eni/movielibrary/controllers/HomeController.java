package fr.eni.movielibrary.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    @Autowired
    public String home() {
        System.out.println("hi");

        return "home";
    }
}
