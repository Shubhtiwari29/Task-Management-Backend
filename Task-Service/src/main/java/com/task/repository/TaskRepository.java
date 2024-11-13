package com.task.repository;

import com.task.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Long> {

    public List<Task> findByassignedUserId(Long userId);
}
