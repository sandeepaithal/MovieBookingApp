package com.example.MovieBookingApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MovieBookingApp.entity.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
