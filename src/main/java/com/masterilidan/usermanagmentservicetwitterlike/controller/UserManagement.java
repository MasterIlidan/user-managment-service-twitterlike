package com.masterilidan.usermanagmentservicetwitterlike.controller;

import com.masterilidan.usermanagmentservicetwitterlike.dto.UserDto;
import com.masterilidan.usermanagmentservicetwitterlike.entity.Role;
import com.masterilidan.usermanagmentservicetwitterlike.entity.User;
import com.masterilidan.usermanagmentservicetwitterlike.repository.RoleRepository;
import com.masterilidan.usermanagmentservicetwitterlike.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Controller
public class UserManagement {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    UserManagement(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @GetMapping("/user{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable long id) {
        Optional<User> byId = userRepository.findById(id);
        if (byId.isPresent()) {
            UserDto userDto = new UserDto();
            userDto.setId(byId.get().getId());
            userDto.setUsername(byId.get().getUsername());
            userDto.setRoles(byId.get().getRoles());
            return new ResponseEntity<>(userDto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
    @PostMapping("/register")
    public ResponseEntity<UserDto> register(@RequestBody UserDto userDtoIn) {
        Optional<Role> byId = roleRepository.findById(2L);
        User user = new User();
        if (byId.isPresent()) {
            user.setRoles(List.of(byId.get()));
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        user.setUsername(userDtoIn.getUsername());
        user.setPassword(userDtoIn.getPassword());
        userRepository.save(user);
        return new ResponseEntity<>(userDtoIn, HttpStatus.OK);
    }
    @PostMapping("/login")
    public ResponseEntity<UserDto> login(@RequestBody UserDto userDtoIn) {
        Optional<User> byUsername = userRepository.findByUsername(userDtoIn.getUsername());
        if (byUsername.isPresent()) {
            if (byUsername.get().getPassword().equals(userDtoIn.getPassword())) {
                return new ResponseEntity<>(userDtoIn, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.FORBIDDEN);
            }
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
