package com.to_do.study.controller;

import com.to_do.study.dto.TaskDTO;
import com.to_do.study.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<TaskDTO> findAll() {
        List<TaskDTO> result = taskService.findAll();
        return result;
    }
}