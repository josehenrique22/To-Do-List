package com.to_do.study.service;

import com.to_do.study.dto.TagDTO;
import com.to_do.study.entity.Tag;
import com.to_do.study.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {

    @Autowired
    TagRepository tagRepository;

    public List<TagDTO> findAll() {
        List<Tag> result = tagRepository.findAll();
        List<TagDTO> dto = result.stream().map(x -> new TagDTO(x)).toList();
        return dto;
    }

}
