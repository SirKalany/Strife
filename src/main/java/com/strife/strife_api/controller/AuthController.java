package com.strife.strife_api.controller;

import com.strife.strife_api.config.JwtConfig;
import com.strife.strife_api.service.JwtService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/admin/auth")
public class AuthController {

    private final JwtConfig jwtConfig;
    private final JwtService jwtService;

    public AuthController(JwtConfig jwtConfig, JwtService jwtService) {
        this.jwtConfig = jwtConfig;
        this.jwtService = jwtService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> body) {
        String username = body.get("username");
        String password = body.get("password");

        if (jwtConfig.getAdmin().getUsername().equals(username)
                && jwtConfig.getAdmin().getPassword().equals(password)) {
            String token = jwtService.generateToken(username);
            return ResponseEntity.ok(Map.of("token", token));
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(Map.of("error", "Invalid credentials"));
    }
}