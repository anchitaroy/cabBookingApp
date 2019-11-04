package com.cg.cbs.pf.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "payseq", sequenceName = "pay_seq", allocationSize = 1)
@NamedQuery(name = "findAll", query = "SELECT p FROM Payment p")
public class Payment {

	@Id
	@GeneratedValue(generator = "payseq")
	int paymentId;
	@Column
	int customerId;
	@Column
	int driverId;
	@Column
	int bookingId;
	@Column
	double finalFare;
	
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int userId) {
		this.customerId = userId;
	}
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public double getFinalFare() {
		return finalFare;
	}
	public void setFinalFare(double tripFare) {
		this.finalFare = tripFare;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
}
