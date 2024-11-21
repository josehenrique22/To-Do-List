package com.to_do.study.service;

import com.to_do.study.dto.UserDTO;
import com.to_do.study.entity.User;
import com.to_do.study.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> findAll() {
        List<User> result = userRepository.findAll();
        List<UserDTO> dto = result.stream().map(x -> new UserDTO(x)).toList();
        return dto;
    }
}
