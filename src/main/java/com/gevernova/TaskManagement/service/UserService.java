package com.gevernova.TaskManagement.service;

import com.gevernova.TaskManagement.dto.UserRequest;
import com.gevernova.TaskManagement.entity.User;

import java.util.List;

// Defines user-related business operations
public interface UserService {

    // Create a new user
    User createUser(UserRequest request);

    // Fetch all users
    List<User> getAllUsers();

    // Fetch user by ID
    User getUserById(Long userId);

    // Update user details
    User updateUser(Long userId, UserRequest request);

    // Delete user by ID
    void deleteUser(Long userId);
}
