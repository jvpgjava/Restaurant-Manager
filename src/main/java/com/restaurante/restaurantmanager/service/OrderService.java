package com.restaurante.restaurantmanager.service;

import com.restaurante.restaurantmanager.model.Order;
import com.restaurante.restaurantmanager.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public void updateOrderStatus(Long id, String status) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
        order.setStatus(status); //Atualiza status do pedido
        orderRepository.save(order); //Salva alteração no banco
    }
}