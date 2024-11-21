package com.to_do.study.dto;

import com.to_do.study.entity.Tag;
import org.springframework.beans.BeanUtils;

public class TagDTO {

    private Long id;

    private String name;

    public TagDTO() {
    }

    public TagDTO(Tag entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
