package com.cosmos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cosmos.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
