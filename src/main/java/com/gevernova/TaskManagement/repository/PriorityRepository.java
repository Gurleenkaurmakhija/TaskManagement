package com.gevernova.TaskManagement.repository;


import com.gevernova.TaskManagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriorityRepository extends JpaRepository<User, Long> {
}
