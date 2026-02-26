package com.jatin.eventplatform2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jatin.eventplatform2.entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}