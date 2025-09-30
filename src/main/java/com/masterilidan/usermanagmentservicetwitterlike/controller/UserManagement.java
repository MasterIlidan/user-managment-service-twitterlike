package com.masterilidan.usermanagmentservicetwitterlike.controller;

import com.masterilidan.usermanagmentservicetwitterlike.dto.UserDto;
import com.masterilidan.usermanagmentservicetwitterlike.entity.User;
import com.masterilidan.usermanagmentservicetwitterlike.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserManagement {
    private final UserRepository userRepository;

    UserManagement(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable long id) {
        UserDto userDtoOut = new UserDto(id,"hello", null, null);
        return new ResponseEntity<>(userDtoOut, HttpStatus.OK);
    }
    @PostMapping("/register")
    public ResponseEntity<UserDto> register(@RequestBody UserDto userDtoIn) {
        User user = new User();
        user.setUsername(userDtoIn.getUsername());
        user.setPassword(userDtoIn.getPassword());
        userRepository.save(user);
        return new ResponseEntity<>(userDtoIn, HttpStatus.OK);
    }
    @PostMapping("/login")
    public ResponseEntity<UserDto> login(@RequestBody UserDto userDtoIn) {
        return new ResponseEntity<>(userDtoIn, HttpStatus.OK);
    }

}
