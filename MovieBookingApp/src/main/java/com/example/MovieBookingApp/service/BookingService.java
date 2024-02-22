package com.example.MovieBookingApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MovieBookingApp.dao.BookingDao;
import com.example.MovieBookingApp.dao.MovieDao;
import com.example.MovieBookingApp.dao.ShowDao;
import com.example.MovieBookingApp.dao.TheatreDao;
import com.example.MovieBookingApp.dto.TheatreShowDto;
import com.example.MovieBookingApp.entity.Booking;
import com.example.MovieBookingApp.entity.Movie;
import com.example.MovieBookingApp.entity.Show;
import com.example.MovieBookingApp.entity.Theatre;


@Service
public class BookingService {
	@Autowired
	TheatreDao theatredao;

	@Autowired
	ShowDao showdao;

	@Autowired
	MovieDao moviedao;

	@Autowired
	BookingDao bookingdao;

	public void addTheatreDetails(Theatre theatre) {
		theatredao.save(theatre);
	}

	public void addMovieDetails(Movie movie) {
		moviedao.save(movie);
	}

	public void addShowDetails(Show show) {
		showdao.save(show);
	}

	public void addBookingDetails(Booking booking) {
		bookingdao.save(booking);
	}
	public List<TheatreShowDto> getTheatreDetails(String moviename) {
		List<Show> showlst=showdao.getTheatreDetails(moviename);
		Theatre th1=new Theatre();
		List<TheatreShowDto> list=new ArrayList();
		for(Show show:showlst)
		{
			
			TheatreShowDto theatreShowDTO=new TheatreShowDto();
			
			Integer theatreid=show.getTheatreid();
			System.out.println(theatreid);
			th1=theatredao.findById(theatreid).orElse(null);
			theatreShowDTO.setPlace(th1.getPlace());
			theatreShowDTO.setTheatrename(th1.getTheatrename());
			theatreShowDTO.setMorningshow(show.getMorningshow());
			theatreShowDTO.setNoonshow(show.getNoonshow());
			theatreShowDTO.setEveningshow(show.getEveningshow());
			list.add(theatreShowDTO);
		}
		   
		 
		 
		 return list;
	}

	public Booking bookTickets(String moviename, Integer theatreid, String showtime,Integer userid) {
		// TODO Auto-generated method stub
		
		
		Theatre theatrelist=theatredao.findById(theatreid).orElse(null); Show show=showdao.findById(theatreid).orElse(null);
		Booking booking=new Booking();
		booking.setBookingid(1);
		booking.setDate("2019-09-12");
		booking.setMoviename(moviename);
		booking.setShowtime(showtime);
		booking.setTheatrename(theatrelist.getTheatrename());
		booking.setUserid(userid);
		
		return bookingdao.save(booking);
		
		
		
		
		
		
		
	}
	


}
