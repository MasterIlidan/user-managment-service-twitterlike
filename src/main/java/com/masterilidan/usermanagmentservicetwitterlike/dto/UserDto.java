package com.masterilidan.usermanagmentservicetwitterlike.dto;

import com.masterilidan.usermanagmentservicetwitterlike.entity.Role;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDto {
    @ToString.Include
    private long id;
    @ToString.Include
    private String username;
    @ToString.Include
    private String email;
    @ToString.Include
    private String password;
    @ToString.Include
    private List<Role> roles;
}
