package com.masterilidan.usermanagmentservicetwitterlike.dto;

import com.masterilidan.usermanagmentservicetwitterlike.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private long id;
    private String username;
    private String email;
    private String password;
    private List<Role> roles;
}
