package com.to_do.study.controller;

import com.to_do.study.dto.TagDTO;
import com.to_do.study.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    TagService tagService;

    @GetMapping
    public List<TagDTO> findAll() {
        List<TagDTO> result = tagService.findAll();
        return result;
    }
}
