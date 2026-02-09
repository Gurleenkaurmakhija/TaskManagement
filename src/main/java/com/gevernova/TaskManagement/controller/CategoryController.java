package com.gevernova.TaskManagement.controller;

import com.gevernova.TaskManagement.entity.Category;
import com.gevernova.TaskManagement.service.CategoryService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

// Handles REST APIs related to Category
@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    // Inject CategoryService
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    // Create category
    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    // Get all categories
    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    // Get category by ID
    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Long id) {
        return categoryService.getCategoryById(id);
    }

    // Update category
    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable Long id,
                                   @RequestBody Category category) {
        return categoryService.updateCategory(id, category);
    }

    // Delete category
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
    }
}
