package com.cosmos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cosmos.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
