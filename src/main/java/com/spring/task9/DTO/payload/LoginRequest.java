package com.spring.task9.DTO.payload;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
