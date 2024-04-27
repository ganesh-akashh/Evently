package com.example.evently.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="events")
public class EventsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private String location;
    private LocalDateTime createdAt;
    private String imageUrl;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private String price;
    private boolean isFree;
    private String url;
    private int categoryId;
    private int organizerId;
}
