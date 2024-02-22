package com.example.MovieBookingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MovieBookingApp.dto.TheatreShowDto;
import com.example.MovieBookingApp.entity.Booking;
import com.example.MovieBookingApp.entity.Movie;
import com.example.MovieBookingApp.entity.Show;
import com.example.MovieBookingApp.entity.Theatre;
import com.example.MovieBookingApp.service.BookingService;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class BookingController {
  
	@Autowired
	BookingService bookingservice;

	@PostMapping(value="/booking/addtheatre")
	public String addTheatreDetails(@RequestBody Theatre theatre) {
		bookingservice.addTheatreDetails(theatre);
		
		return "added successfully";
	}
	@PostMapping("/booking/addmovie")
	public String addMovieDetails(@RequestBody Movie movie) {
		bookingservice.addMovieDetails(movie);
		return "Successfully added";

	}

	@PostMapping("/booking/addshows")
	public String addShowsDetails(@RequestBody Show show) {

		bookingservice.addShowDetails(show);
		return "Successfully added";

	}

	@PostMapping("/booking/addbookingdet")
	public String addBookingDetails(@RequestBody Booking booking) {
		bookingservice.addBookingDetails(booking);
		return "Successfully added";
	}

	@GetMapping("/booking/gettheatredetails/{moviename}")
	public List<TheatreShowDto> getTheatreDetails(@PathVariable(value = "moviename") String moviename) {
		return bookingservice.getTheatreDetails(moviename);
	}

	@GetMapping("/booking/{moviename}/{theatreid}/{showtime}/{userid}")
	public void bookTickets(@PathVariable(value = "moviename") String moviename,
			@PathVariable(value = "theatreid") Integer theatreid,
			@PathVariable(value = "showtime") String showtime,@PathVariable(value = "userid") Integer userid) {
		
		
		bookingservice.bookTickets(moviename,theatreid,showtime,userid);

	}


}
