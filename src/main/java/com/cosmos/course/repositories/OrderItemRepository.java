package com.cosmos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cosmos.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
