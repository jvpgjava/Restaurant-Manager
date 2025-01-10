package com.restaurante.restaurantmanager.repository;

import com.restaurante.restaurantmanager.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    // Métodos de consulta personalizados adicionados aqui
}
