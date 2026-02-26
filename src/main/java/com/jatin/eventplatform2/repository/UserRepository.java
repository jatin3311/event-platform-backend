package com.jatin.eventplatform2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jatin.eventplatform2.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}