package com.task.dtos;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private Long id;

    private String fullName;
    private String email;
    private String mobile;

    private String role;

}
