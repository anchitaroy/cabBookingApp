package com.cg.cbs.pf.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TripDetails {

	@Id
	int tripId;
	public int getTripId() {
		return tripId;
	}
	public void setTripId(int tripId) {
		this.tripId = tripId;
	}
	int customerId;
	int driverId;
	int bookingId;
	double finalFare;
	double wallet;
	String issues;
	
	public String getIssues() {
		return issues;
	}
	public void setIssues(String issues) {
		this.issues = issues;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public double getFinalFare() {
		return finalFare;
	}
	public void setFinalFare(double finalFare) {
		this.finalFare = finalFare;
	}
	public double getWallet() {
		return wallet;
	}
	public void setWallet(double wallet) {
		this.wallet = wallet;
	}
}
