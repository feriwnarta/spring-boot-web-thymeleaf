package com.ferdev.belajarspringbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class WelcomeController {
    private String message = "Helo From Controller";

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("message", message);
        return "welcome"; // view
    }

    // /hello?name=feri
    @GetMapping("/hello")
    public String mainWithParam( // request param berguna untuk menerima method get di link
            @RequestParam(name = "nama", required = false, defaultValue = "")
            String nama, Model model){
        model.addAttribute("message", nama);
        return "welcome"; // view
    }
}
