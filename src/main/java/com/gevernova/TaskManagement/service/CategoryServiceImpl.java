package com.gevernova.TaskManagement.service;

import com.gevernova.TaskManagement.entity.Category;
import com.gevernova.TaskManagement.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// Handles category-related business logic
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    // Saves new category
    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    // Returns all categories
    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    // Fetch category by ID
    @Override
    public Category getCategoryById(Long categoryId) {
        return categoryRepository.findById(categoryId)
                .orElseThrow(() -> new RuntimeException("Category not found"));
    }

    // Update category name
    @Override
    public Category updateCategory(Long categoryId, Category category) {
        Category existing = getCategoryById(categoryId);
        existing.setName(category.getName());
        return categoryRepository.save(existing);
    }

    // Delete category
    @Override
    public void deleteCategory(Long categoryId) {
        categoryRepository.deleteById(categoryId);
    }
}
