package com.cg.cbs.pf.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;

@Entity
//@SequenceGenerator(name = "bookseq", sequenceName = "book_seq", allocationSize = 1)
//@NamedQuery(name = "byDriverId" ,query = "SELECT b FROM Booking b WHERE b.driverId=:driverId")
public class Booking {

	@Id
//	@GeneratedValue(generator = "bookseq")
	private int bookingId;
	@Column(length = 25)
	private String source;
	@Column(length = 25)
	private String destination;
	@Column
	private int vehicleSize;
	@Column
	private int driverId;
	@Column
	private int customerId;
	@Column(length = 25)
	private String driverStatus;
	@Column(length = 25)
	private String customerStatus;
	@Column(length = 25)
	private String tripStatus;
	@Column
	private double estimatedFare;
	@Column
	private double estimatedTime;
	@Column
	private double finalFare;
	@Column
	private int rating;
	
	public double getEstimatedFare() {
		return estimatedFare;
	}
	public void setEstimatedFare(double estimatedFare) {
		this.estimatedFare = estimatedFare;
	}
	public double getEstimatedTime() {
		return estimatedTime;
	}
	public void setEstimatedTime(double estimatedTime) {
		this.estimatedTime = estimatedTime;
	}
	public double getFinalFare() {
		return finalFare;
	}
	public void setFinalFare(double finalFare) {
		this.finalFare = finalFare;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getVehicleSize() {
		return vehicleSize;
	}
	public void setVehicleSize(int vehicleSize) {
		this.vehicleSize = vehicleSize;
	}
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getDriverStatus() {
		return driverStatus;
	}
	public void setDriverStatus(String driverStatus) {
		this.driverStatus = driverStatus;
	}
	public String getCustomerStatus() {
		return customerStatus;
	}
	public void setCustomerStatus(String customerStatus) {
		this.customerStatus = customerStatus;
	}
	public String getTripStatus() {
		return tripStatus;
	}
	public void setTripStatus(String tripStatus) {
		this.tripStatus = tripStatus;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
}
