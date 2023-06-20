package com.cursowebservice.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursowebservice.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
