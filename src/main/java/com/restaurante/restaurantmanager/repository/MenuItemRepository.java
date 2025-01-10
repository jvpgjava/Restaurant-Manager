package com.restaurante.restaurantmanager.repository;

import com.restaurante.restaurantmanager.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}
