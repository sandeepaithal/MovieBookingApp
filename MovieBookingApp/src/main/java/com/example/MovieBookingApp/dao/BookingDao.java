package com.example.MovieBookingApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MovieBookingApp.entity.Booking;

public interface BookingDao extends JpaRepository<Booking, Integer> {

}
