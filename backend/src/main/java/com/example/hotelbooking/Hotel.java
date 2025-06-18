package com.example.hotelbooking;

import jakarta.persistence.*;

@Entity
public class Hotel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String location;
  private double pricePerNight;
  private int availableRooms;

  // Getters and setters
}