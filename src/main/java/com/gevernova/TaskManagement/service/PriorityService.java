package com.gevernova.TaskManagement.service;

import com.gevernova.TaskManagement.entity.Priority;
import java.util.List;

//priority-related business operations
public interface PriorityService {

    // Create new priority
    Priority createPriority(Priority priority);

    // Fetch all priorities
    List<Priority> getAllPriorities();

    // Fetch priority by ID
    Priority getPriorityById(Long priorityId);

    // Update priority details
    Priority updatePriority(Long priorityId, Priority priority);

    // Delete priority by ID
    void deletePriority(Long priorityId);
}
