package com.example.MovieBookingApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.MovieBookingApp.entity.Show;

public interface ShowDao extends JpaRepository<Show, Integer>{
	@Query(value="select *from shows s where s.morningshow=?1 or s.noonshow=?1 or s.eveningshow=?1",nativeQuery=true)
	List<Show> getTheatreDetails(String moviename);
}
