package com.apurva.InventoryMgtSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apurva.InventoryMgtSystem.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
