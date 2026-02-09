package com.gevernova.TaskManagement.service;

import com.gevernova.TaskManagement.entity.Priority;
import com.gevernova.TaskManagement.repository.PriorityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// Handles priority-related business logic
@Service
public class PriorityServiceImpl implements PriorityService {

    private final PriorityRepository priorityRepository;

    public PriorityServiceImpl(PriorityRepository priorityRepository) {
        this.priorityRepository = priorityRepository;
    }

    // Saves new priority
    @Override
    public Priority createPriority(Priority priority) {
        return priorityRepository.save(priority);
    }

    // Returns all priorities
    @Override
    public List<Priority> getAllPriorities() {
        return priorityRepository.findAll();
    }

    // Fetch priority by ID
    @Override
    public Priority getPriorityById(Long priorityId) {
        return priorityRepository.findById(priorityId)
                .orElseThrow(() -> new RuntimeException("Priority not found"));
    }

    // Update priority level
    @Override
    public Priority updatePriority(Long priorityId, Priority priority) {
        Priority existing = getPriorityById(priorityId);
        existing.setLevel(priority.getLevel());
        return priorityRepository.save(existing);
    }

    // Delete priority
    @Override
    public void deletePriority(Long priorityId) {
        priorityRepository.deleteById(priorityId);
    }
}
