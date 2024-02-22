package com.example.MovieBookingApp.entity;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie_show") // Specify a different table name
public class Show {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Showid;
	private LocalDate date;
	private String morningshow, noonshow, eveningshow;
	private int theatreid;
	public int getShowid() {
		return Showid;
	}
	public void setShowid(int showid) {
		Showid = showid;
	}
	public int getTheatreid() {
		return theatreid;
	}
	public void setTheatreid(int theatreid) {
		this.theatreid = theatreid;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getMorningshow() {
		return morningshow;
	}
	public void setMorningshow(String morningshow) {
		this.morningshow = morningshow;
	}
	public String getNoonshow() {
		return noonshow;
	}
	public void setNoonshow(String noonshow) {
		this.noonshow = noonshow;
	}
	public String getEveningshow() {
		return eveningshow;
	}
	public void setEveningshow(String eveningshow) {
		this.eveningshow = eveningshow;
	}

	
}
