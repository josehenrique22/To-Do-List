package com.to_do.study.service;

import com.to_do.study.dto.TaskDTO;
import com.to_do.study.entity.Task;
import com.to_do.study.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Transactional
    public List<TaskDTO> findAll() {
        List<Task> result = taskRepository.findAll();
        List<TaskDTO> dto = result.stream().map(x -> new TaskDTO(x)).toList();
        return dto;
    }
}
