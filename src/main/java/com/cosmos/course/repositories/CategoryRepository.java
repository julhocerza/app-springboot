package com.cosmos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cosmos.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
