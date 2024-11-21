package com.to_do.study.controller;

import com.to_do.study.dto.TaskDTO;
import com.to_do.study.dto.UserDTO;
import com.to_do.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDTO> findAll() {
        List<UserDTO> result = userService.findAll();
        return result;
    }
}
