package com.jatin.eventplatform2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jatin.eventplatform2.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}