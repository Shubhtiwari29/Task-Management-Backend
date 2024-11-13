package com.submission.dtos;

import lombok.Data;

@Data
public class UserDto {
    private Long id;

    private String fullName;
    private String email;
    private String mobile;

    private String role;
}
