package com.example.project.entity;

import jakarta.persistence.Entity;



import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class authEntity {
   @Id
   @GeneratedValue(strategy =  GenerationType.IDENTITY)
   private Long id;
    
   @Column(nullable = false, unique = true)
   private String username;

   @Column(nullable = false)
   private String password;

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getUsername() {
    return username;
}

public void setUsername(String username) {
    this.username = username;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

   




}
