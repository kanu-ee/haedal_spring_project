package com.example.haedal2.dto;

import lombok.Getter;

// 외부에서 들어오는 요청을 처리하는 DTO
@Getter
public class UserRegistrationRequestDto {
    private String username;
    private String password;
    private String name;
}
