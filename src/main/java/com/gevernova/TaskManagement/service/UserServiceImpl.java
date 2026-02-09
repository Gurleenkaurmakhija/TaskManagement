package com.gevernova.TaskManagement.service;

import com.gevernova.TaskManagement.dto.UserRequest;
import com.gevernova.TaskManagement.entity.User;
import com.gevernova.TaskManagement.exception.UserNotFoundException;
import com.gevernova.TaskManagement.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// Handles business logic related to users
@Service
public class UserServiceImpl implements UserService {

    // Repository to interact with user table
    private final UserRepository userRepository;

    // Constructor-based dependency injection
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Creates and saves a new user
    @Override
    public User createUser(UserRequest request) {
        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        return userRepository.save(user);
    }

    // Returns all users
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Fetches user by ID or throws exception
    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("User not found"));
    }

    // Updates user details
    @Override
    public User updateUser(Long userId, UserRequest request) {
        User user = getUserById(userId);
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        return userRepository.save(user);
    }

    // Deletes user
    @Override
    public void deleteUser(Long userId) {
        userRepository.delete(getUserById(userId));
    }
}
