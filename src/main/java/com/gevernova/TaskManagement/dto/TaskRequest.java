package com.gevernova.TaskManagement.dto;

public class TaskRequest {

    private String title;
    private String description;
    private Long userId;
    private Long categoryId;
    private Long priorityId;

    // getters & setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public Long getCategoryId() { return categoryId; }
    public void setCategoryId(Long categoryId) { this.categoryId = categoryId; }

    public Long getPriorityId() { return priorityId; }
    public void setPriorityId(Long priorityId) { this.priorityId = priorityId; }
}

