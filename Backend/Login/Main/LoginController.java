package com.company.loginservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class LoginController {

    @GetMapping("/login")
    public String Login(){
        return "Login Successful";
    }

    @GetMapping("/Register")
    public String Register(){
        return "Register Successful";
    }

    @GetMapping("/Logout")
    public String Logout(){
        return "Logout Successful";
    }
}