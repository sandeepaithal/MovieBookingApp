package com.example.MovieBookingApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Theatre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer theatreid;
	@Column(nullable=false)
	String theatrename;
	@Column(nullable=false)
	String place;
	public Integer getTheatreid() {
		return theatreid;
	}
	public void setTheatreid(Integer theatreid) {
		this.theatreid = theatreid;
	}
	public String getTheatrename() {
		return theatrename;
	}
	public void setTheatrename(String theatrename) {
		this.theatrename = theatrename;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
}
