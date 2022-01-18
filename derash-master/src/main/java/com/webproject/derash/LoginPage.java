package com.webproject.derash;
import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "user")
public class LoginPage implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Size(min = 5, message = "Name must be at least 5 characters long")
    @Column(nullable = false, unique = true, length = 45)
    @NotBlank(message = "email mustnot be empty")

    private String email;

    @Size(min = 8, message = "password must be atleast 8 character long and atmost 64 character")
    @Column(nullable = false, length = 64)
    @NotBlank(message = "password mustnot be empty")
    private String password;
    
    public int getId() {
        return this.id;
    }
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
