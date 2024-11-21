package com.to_do.study.repository;

import com.to_do.study.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface TaskRepository extends JpaRepository<Task, Long> {

}
