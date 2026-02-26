package com.jatin.eventplatform2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.jatin.eventplatform2.entity.*;
import com.jatin.eventplatform2.repository.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
@RequiredArgsConstructor
public class EventController {

    private final EventRepository eventRepo;
    private final UserRepository userRepo;
    private final RegistrationRepository regRepo;

    // ✅ Create Event
    @PostMapping("/events")
    public Event createEvent(@RequestBody Event event) {
        return eventRepo.save(event);
    }

    // ✅ Get All Events
    @GetMapping("/events")
    public List<Event> getEvents() {
        return eventRepo.findAll();
    }

    // ✅ Register User for Event
    @PostMapping("/register/{eventId}")
    public Registration register(
            @PathVariable Long eventId,
            @RequestBody User user) {

        Event event = eventRepo.findById(eventId)
                .orElseThrow(() -> new RuntimeException("Event not found"));

        User savedUser = userRepo.save(user);

        Registration reg = new Registration();
        reg.setEvent(event);
        reg.setUser(savedUser);
        reg.setTicketNumber("TICKET-" + System.currentTimeMillis());

        return regRepo.save(reg);
    }
}