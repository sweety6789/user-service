package com.user.service.dto;

import lombok.Data;

@Data
public class RegisterResponse {

    private String message;
    private Long id;
    private String username;
    private String email;
    private String role;

    public RegisterResponse() {

    }

    public RegisterResponse(Long id, String username, String email, String message) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.message = message;
    }


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setMessage(String user_registered_successfully) {
    }
}
