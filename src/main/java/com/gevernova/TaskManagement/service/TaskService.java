package com.gevernova.TaskManagement.service;

import com.gevernova.TaskManagement.dto.TaskRequest;
import com.gevernova.TaskManagement.entity.Task;

import java.util.List;

// Defines task-related business operations
public interface TaskService {

    // Create a new task with user, category and priority
    Task createTask(TaskRequest request);

    // Fetch all tasks
    List<Task> getAllTasks();

    // Fetch task by ID
    Task getTaskById(Long taskId);

    // Update only task status
    Task updateTaskStatus(Long taskId, TaskStatusUpdateRequest request);
}
