package com.example.auth.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.auth.Service.*;

@RestController 
class LoginController{
// initializing the login service 
private final LoginService loginservice;



//constructor for login controller initializing the login service
public LoginController(LoginService loginservice) {
    this.loginservice = loginservice;
}


@PostMapping("/login")
public String login(){
return "login";

}



}