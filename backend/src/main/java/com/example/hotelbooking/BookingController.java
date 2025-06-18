package com.example.hotelbooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "*")
public class BookingController {
  @Autowired
  private BookingRepository bookingRepo;

  @PostMapping
  public Booking createBooking(@RequestBody Booking booking) {
    booking.setStatus("CONFIRMED");
    return bookingRepo.save(booking);
  }

  @GetMapping
  public List<Booking> getAllBookings() {
    return bookingRepo.findAll();
  }
}