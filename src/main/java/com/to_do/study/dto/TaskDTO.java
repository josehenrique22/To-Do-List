package com.to_do.study.dto;

import com.to_do.study.entity.Task;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

public class TaskDTO {

    private Long id;

    private String title;

    private String description;

    private boolean completed;

    private LocalDateTime createAt;

    public TaskDTO() {
    }

    public TaskDTO(Task entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }
}
