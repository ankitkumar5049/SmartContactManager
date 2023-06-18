package com.springboot.scm.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }
    
    @GetMapping("/about")
    public String about(Model m){
        m.addAttribute("about", "About - Smart contact manager");
        return "about";
    }
    
}
