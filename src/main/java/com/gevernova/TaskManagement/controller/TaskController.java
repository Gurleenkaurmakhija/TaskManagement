package com.gevernova.TaskManagement.controller;


import com.gevernova.TaskManagement.dto.TaskRequest;
import com.gevernova.TaskManagement.dto.TaskStatusUpdateRequest;
import com.gevernova.TaskManagement.entity.Task;
import com.gevernova.TaskManagement.service.TaskService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

// Handles REST APIs related to Task
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    // Inject TaskService
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    // Create new task
    @PostMapping
    public Task createTask(@RequestBody TaskRequest request) {
        return taskService.createTask(request);
    }

    // Get all tasks
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    // Get task by ID
    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    // Update task status only
    @PatchMapping("/{id}/status")
    public Task updateTaskStatus(@PathVariable Long id,
                                 @RequestBody TaskStatusUpdateRequest request) {
        return taskService.updateTaskStatus(id, request);
    }
}
