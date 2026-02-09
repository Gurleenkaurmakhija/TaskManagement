package com.gevernova.TaskManagement.entity;

public enum TaskStatus {

    /** Task has been created but not started yet */
    PENDING,

    /** Task is currently being worked on */
    IN_PROGRESS,

    /** Task has been completed */
    DONE
}