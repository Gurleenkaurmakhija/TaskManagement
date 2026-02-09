package com.gevernova.TaskManagement.controller;

import com.gevernova.TaskManagement.entity.Priority;
import com.gevernova.TaskManagement.service.PriorityService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

// Handles REST APIs related to Priority
@RestController
@RequestMapping("/api/priorities")
public class PriorityController {

    // Inject PriorityService
    private final PriorityService priorityService;

    public PriorityController(PriorityService priorityService) {
        this.priorityService = priorityService;
    }

    // Create priority
    @PostMapping
    public Priority createPriority(@RequestBody Priority priority) {
        return priorityService.createPriority(priority);
    }

    // Get all priorities
    @GetMapping
    public List<Priority> getAllPriorities() {
        return priorityService.getAllPriorities();
    }

    // Get priority by ID
    @GetMapping("/{id}")
    public Priority getPriorityById(@PathVariable Long id) {
        return priorityService.getPriorityById(id);
    }

    // Update priority
    @PutMapping("/{id}")
    public Priority updatePriority(@PathVariable Long id,
                                   @RequestBody Priority priority) {
        return priorityService.updatePriority(id, priority);
    }

    // Delete priority
    @DeleteMapping("/{id}")
    public void deletePriority(@PathVariable Long id) {
        priorityService.deletePriority(id);
    }
}
