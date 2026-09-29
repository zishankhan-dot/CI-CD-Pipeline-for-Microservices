package com.example.authentication.Dto;


public class AuthResponse{
    private String username;
    private String message;



    //constructor
  public  AuthResponse(){};

  public  AuthResponse(String username,String message){
        this.username=username;
        this.message=message;
    };

    //getter 
    public String getUsername(){
        return this.username;

    }
    public String getMessage(){
        return this.message;

    }

    ///setter
    public void setUsername(String username){
        this.username=username;
    }
    public void setMessage(String message){
        this.message=message;
    }
}
