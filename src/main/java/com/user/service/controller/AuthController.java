package com.user.service.controller;

import com.user.service.dto.RegisterRequest;
import com.user.service.dto.RegisterResponse;
import com.user.service.entity.User;
import com.user.service.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(@Valid @RequestBody RegisterRequest request) {

        User savedUser = new User();
        System.out.println("Before save: " + savedUser);
        savedUser = userService.register(request);
        System.out.println("After save: " + savedUser);


        return ResponseEntity.status(HttpStatus.CREATED).body(mapToResponse(savedUser));
    }

    private RegisterResponse mapToResponse(User user) {

        return new RegisterResponse(
                user.getId(),
                user.getUsername(),
                user.getEmail(),
                "User registered successfully"
        );
//        System.out.println("Mapping user to RegisterResponse: " + user);
//        RegisterResponse registerResponse = new RegisterResponse();
//        registerResponse.setId(user.getId());
//        registerResponse.setUsername(user.getUsername());
//        registerResponse.setEmail(user.getEmail());
//        registerResponse.setMessage("User registered successfully");
//        System.out.println(user.getId() + ", " + user.getUsername() + ", " + user.getEmail() + ", User registered successfully");
//        return registerResponse;
    }

}
