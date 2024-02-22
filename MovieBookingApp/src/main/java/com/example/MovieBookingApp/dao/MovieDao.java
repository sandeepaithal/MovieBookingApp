package com.example.MovieBookingApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MovieBookingApp.entity.Movie;
@Repository
public interface MovieDao extends JpaRepository<Movie, String> {

}
