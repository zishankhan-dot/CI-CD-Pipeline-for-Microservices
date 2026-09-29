package com.example.authentication.Dto;
import jakarta.validation.constraints.NotBlank; 

public class LoginRequest {
    @NotBlank(message="Username is required")
    private String username;


    @NotBlank(message="Password is required")
    private String password;


    //constructor 
  public  LoginRequest(){};
  public  LoginRequest(String username,String password){
        this.username=username;
        this.password=password;
    };

    //getter

    public String getUsername(){
        return this.username;

    }
    public String getPassword(){
    return this.password;
    }

    //setter 
    public void setUsername(String username){
        this.username=username;
    }
    public void setPassword(String password){
        this.password=password;
    }

}
