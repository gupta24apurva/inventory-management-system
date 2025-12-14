package com.apurva.InventoryMgtSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apurva.InventoryMgtSystem.models.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContainingOrDescriptionContaining(String name, String description);
}
