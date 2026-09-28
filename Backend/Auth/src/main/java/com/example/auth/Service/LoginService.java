package com.example.auth.Service;
import com.example.auth.Entity.User;
import com.example.auth.Repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service 
public class LoginService{
    //injecting userRepo and passwordEncoder and jwtUtil
    private final UserRepository userRepo;
    private final PasswordEncoder passwordEncoder;
   //  private final JwtUtil jwtUtil;


    //constructor for login service
    public LoginService(UserRepository userRepo, PasswordEncoder passwordEncoder) {
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
       // this.jwtUtil = jwtUtil;
    }


   public String Authenticate(String username,String password){
    User user=userRepo.findByUsername(username)
              .orElseThrow(()->new RuntimeException("User not found"));
    if(passwordEncoder.matches(password,user.getPassword())){
        return "Authentication successful";
    }
    else{
        return "Authentication failed";
    }

   }






}

