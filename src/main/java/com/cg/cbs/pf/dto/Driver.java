package com.cg.cbs.pf.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
//@SequenceGenerator(name = "driseq", sequenceName = "dri_seq", allocationSize = 1)
public class Driver {

	@Id
//	@GeneratedValue(generator = "driseq")
	private int id;
	@Column(length = 25)
	private String name;
	@Column(length = 25)
	private String email;
	@Column(length = 25)
	private String password;
	@Column(length = 25)
	private String status;
	@Column
	private Date dob;
	@Column(length = 25)
	private String gender;
	@Column
	private long contactNo;
	@Column(length = 25)
	private String address;
	@Column(length = 25)
	private String DL;
	@Column(length = 25)
	private String vehicleNo;
	@Column
	private double rating;
	@Column
	private int noOfTrips;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDL() {
		return DL;
	}
	public void setDL(String dL) {
		DL = dL;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getNoOfTrips() {
		return noOfTrips;
	}
	public void setNoOfTrips(int noOfTrips) {
		this.noOfTrips = noOfTrips;
	}
}
