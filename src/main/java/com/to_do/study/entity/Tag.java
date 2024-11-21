package com.to_do.study.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tag")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "task_id", nullable = false)
    private Task task;

    public Tag() {
    }

    public Tag(Long id, String name, Task task) {
        this.id = id;
        this.name = name;
        this.task = task;
    }
}
