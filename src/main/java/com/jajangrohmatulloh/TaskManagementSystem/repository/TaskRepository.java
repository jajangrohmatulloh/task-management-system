package com.jajangrohmatulloh.TaskManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jajangrohmatulloh.TaskManagementSystem.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
