package com.dimple.secureconnect.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {

    @NotBlank(message="Name is required.")
    private String Name;

    @Email(message ="Invalid email format")
    @NotBlank(message="Email is required.")
    private String email;

    @Size(min=8, message ="Invalid email format")
    @NotBlank(message="Password is required.")
    private String password;

}
