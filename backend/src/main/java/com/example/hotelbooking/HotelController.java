package com.example.hotelbooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hotels")
@CrossOrigin(origins = "*")
public class HotelController {
  @Autowired
  private HotelRepository hotelRepo;

  @GetMapping
  public List<Hotel> getAllHotels() {
    return hotelRepo.findAll();
  }

  @PostMapping
  public Hotel createHotel(@RequestBody Hotel hotel) {
    return hotelRepo.save(hotel);
  }
}