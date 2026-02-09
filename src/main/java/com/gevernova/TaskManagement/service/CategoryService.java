package com.gevernova.TaskManagement.service;

import com.gevernova.TaskManagement.entity.Category;
import java.util.List;

// Defines category-related business operations
public interface CategoryService {

    // Create new category
    Category createCategory(Category category);

    // Fetch all categories
    List<Category> getAllCategories();

    // Fetch category by ID
    Category getCategoryById(Long categoryId);

    // Update category details
    Category updateCategory(Long categoryId, Category category);

    // Delete category by ID
    void deleteCategory(Long categoryId);
}
