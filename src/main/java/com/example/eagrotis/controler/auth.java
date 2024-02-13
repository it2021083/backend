package com.example.eagrotis.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
//@RequestMapping("/api/auth")
public class auth {

    @GetMapping("/")
    public String login(){
      return "login";
    }
    @GetMapping("/home")
    public String home(){
        return "home";
    }

}
