package com.example.MovieBookingApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MovieBookingApp.entity.Theatre;

public interface TheatreDao extends JpaRepository<Theatre, Integer> {

}
