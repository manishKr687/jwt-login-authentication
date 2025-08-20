package com.example.auth.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class LoginRequest {
    @Email @NotBlank
    private String email;
    @NotBlank
    private String password;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class RegisterRequest {
    @Email @NotBlank
    private String email;
    @NotBlank
    private String password;
    @NotBlank
    private String fullName;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class AuthResponse {
    private String token;
    private String email;
    private String fullName;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class ErrorResponse {
    private String message;
}
