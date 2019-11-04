package com.cg.cbs.pf.service;

import java.util.List;

import com.cg.cbs.pf.dto.Booking;
import com.cg.cbs.pf.dto.Customer;
import com.cg.cbs.pf.dto.Driver;
import com.cg.cbs.pf.dto.Payment;
import com.cg.cbs.pf.dto.Report;
import com.cg.cbs.pf.dto.TripDetails;
import com.cg.cbs.pf.exception.InvalidDetailsException;

public interface PaymentFeedbackService {

	Payment addPayment (TripDetails tripDetails);
	
	Booking updateBooking(Booking booking);
	
	Report updateReport(TripDetails tripDetails);
	
	Customer updateCustomer(TripDetails tripDetails);
	
}
