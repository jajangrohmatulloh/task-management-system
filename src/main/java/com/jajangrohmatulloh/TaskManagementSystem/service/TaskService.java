package com.jajangrohmatulloh.TaskManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jajangrohmatulloh.TaskManagementSystem.entity.Task;
import com.jajangrohmatulloh.TaskManagementSystem.repository.TaskRepository;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Transactional
    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    @Transactional
    public Task create(Task task) {
        return taskRepository.save(task);
    }

    @Transactional
    public Task update(Long id, Task task) {
        Task existingTask = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        existingTask.setTitle(task.getTitle());
        existingTask.setDescription(task.getDescription());
        existingTask.setLatestTime(task.getLatestTime());
        existingTask.setTitle(task.getTitle());
        existingTask.setStatus(task.getStatus());
        return taskRepository.save(existingTask);
    }

    @Transactional
    public void delete(Long id) {
        taskRepository.deleteById(id);
    }

}
