package com.to_do.study.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tag")
public class TagEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "task_id", nullable = false)
    private TaskEntity task;

    public TagEntity() {
    }

    public TagEntity(Long id, String name, TaskEntity task) {
        this.id = id;
        this.name = name;
        this.task = task;
    }
}
