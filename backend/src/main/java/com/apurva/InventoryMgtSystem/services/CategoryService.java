package com.apurva.InventoryMgtSystem.services;

import com.apurva.InventoryMgtSystem.dtos.CategoryDTO;
import com.apurva.InventoryMgtSystem.dtos.Response;

public interface CategoryService {

    Response createCategory(CategoryDTO categoryDTO);

    Response getAllCategories();

    Response getCategoryById(Long id);

    Response updateCategory(Long id, CategoryDTO categoryDTO);

    Response deleteCategory(Long id);
}
