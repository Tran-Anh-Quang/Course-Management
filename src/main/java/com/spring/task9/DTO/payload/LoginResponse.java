package com.spring.task9.DTO.payload;

import lombok.Data;

@Data
public class LoginResponse {
    private String token;
    private long expiresIn;
}
