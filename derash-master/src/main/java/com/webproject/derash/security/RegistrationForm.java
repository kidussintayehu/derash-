package com.webproject.derash.security;

import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.Data;

@Data
public class RegistrationForm {
   private String username;
   private String password;
   private String confirmpassword;
   private String email;

   User toUser(PasswordEncoder encoder) {
       User user = new User();
       user.setUsername(this.username);
       user.setPassword(encoder.encode(this.password));
       user.setConfirmpassword(this.confirmpassword);
       user.setEmail(this.email);
       return user;
   }
}
