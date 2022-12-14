package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DecimalFormat;

@Controller
public class CalculateController {
    @GetMapping("home")
    String getIndex(){
        return "index";
    }
    @RequestMapping("home")
    String addition(@RequestParam (name = "number1",defaultValue = "0") double a,@RequestParam(name = "number2",defaultValue = "0") double b,@RequestParam(name = "operator") String cal,Model model){
        double result = 0;
        switch (cal) {
            case "Addition(+)":
                result = a + b;
                cal = "Result Addition";
                break;
            case "Subtraction(-)":
                result = a - b;
                cal = "Result Subtraction";
                break;
            case "Multiplication(X)":
                result = a * b;
                cal = "Result Multiplication";
                break;
            case "Division(/)":
                DecimalFormat df = new DecimalFormat("#.##");
                double resultNon = a / b;

                result = Double.parseDouble(df.format(resultNon));
                cal = "Result Division";
                break;
        }
        model.addAttribute("number1", a);
        model.addAttribute("number2", b);
        model.addAttribute("calculation", cal);
        model.addAttribute("result", result);
        return "index";
    }
}
