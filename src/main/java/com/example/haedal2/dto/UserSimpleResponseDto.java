package com.example.haedal2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

// @Data - getter, setter를 다 가짐
@Getter
@AllArgsConstructor
public class UserSimpleResponseDto {
    private Long id;
    private String username;
    private String name;
    private String imageData;
    private Boolean isFollowing;
}
