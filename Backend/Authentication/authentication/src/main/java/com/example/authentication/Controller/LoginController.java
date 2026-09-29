package com.example.authentication.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;

import com.example.authentication.Dto.AuthResponse;
import com.example.authentication.Dto.LoginRequest;
import com.example.authentication.Service.*;

@RestController 
class LoginController{
// initializing the login service 
private final LoginService loginservice;



//constructor for login controller initializing the login service
public LoginController(LoginService loginservice){
    this.loginservice = loginservice;

}


@PostMapping("/login")
public ResponseEntity<?> login(@RequestBody  LoginRequest loginRequest){
    String username=loginRequest.getUsername();
    String password=loginRequest.getPassword();
    boolean isAuthenticated= loginservice.Authenticate(username,password);
    if(isAuthenticated){
    AuthResponse Response=new AuthResponse(username,"Authentication successful");
    return ResponseEntity.ok(Response);
    }
    else{
        return ResponseEntity.status(401).body("Authentication failed");
    }
    


}



}