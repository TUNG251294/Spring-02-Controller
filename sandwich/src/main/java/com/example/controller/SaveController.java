package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SaveController {
    @GetMapping("home")
    String getIndex(){
        return "index";
    }
    @PostMapping("home")
//    @RequestMapping("home")
    String save(@RequestParam("condiment") String aCondiment, Model model){
        model.addAttribute("message",aCondiment);
        return "index";
    }
}
//    @RequestMapping là annotation ánh xạ các HTTP request tới các phương thức xử lý của MVC và REST controller.