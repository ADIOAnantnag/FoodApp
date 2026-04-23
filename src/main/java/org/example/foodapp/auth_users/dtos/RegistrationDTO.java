package org.example.foodapp.auth_users.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
public class RegistrationDTO {
    @NotBlank(message = "Required")
    private String name;
    @NotBlank(message = "Required")
    private String email;
    @NotBlank(message = "Required")
    private String password;
    @NotBlank(message = "Required")
    private String address;
    @NotBlank(message = "Required")
    private String phoneNumber;

    private List<String> roles;
}
