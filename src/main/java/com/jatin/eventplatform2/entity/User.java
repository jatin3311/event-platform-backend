package com.jatin.eventplatform2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")   // 👈 ADD THIS LINE
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
}