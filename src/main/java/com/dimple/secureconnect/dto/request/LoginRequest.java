package com.dimple.secureconnect.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginRequest {
    @Email(message="Invalid email format")
    private String email;

    @Size(min=8 , message="Password must be at least 8 characters")
    @NotBlank(message ="Password is required")
    private String password;

}
