package com.cursowebservice.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursowebservice.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
