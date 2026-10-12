package com.example.haedal2.controller;

import com.example.haedal2.domain.User;
import com.example.haedal2.dto.UserRegistrationRequestDto;
import com.example.haedal2.dto.UserSimpleResponseDto;
import com.example.haedal2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// 전체 자바 파일에 하나만 존재 (spring-bin)
@RestController
public class UserController {
    // 의존성 주입
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/auth/register")
    public ResponseEntity<UserSimpleResponseDto> registerUser(@RequestBody UserRegistrationRequestDto userRegistrationRequestDto) {
        User user = new User(
                userRegistrationRequestDto.getUsername(),
                userRegistrationRequestDto.getPassword(),
                userRegistrationRequestDto.getName()
        );
        UserSimpleResponseDto savedUser = userService.saveUser(user);

        return ResponseEntity.ok(savedUser);
    }


}
