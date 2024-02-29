package com.spring.task9.DTO.payload;

import lombok.Data;

@Data
public class RegistrationRequest {
    private String username;
    private String phone;
    private String email;
    private String password;
}
