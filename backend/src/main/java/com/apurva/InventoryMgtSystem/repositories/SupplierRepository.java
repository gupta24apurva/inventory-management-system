package com.apurva.InventoryMgtSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apurva.InventoryMgtSystem.models.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
