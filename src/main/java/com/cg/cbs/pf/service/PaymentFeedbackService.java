package com.cg.cbs.pf.service;

import com.cg.cbs.pf.dto.Customer;
import com.cg.cbs.pf.dto.Payment;
import com.cg.cbs.pf.dto.Report;
import com.cg.cbs.pf.dto.TripDetails;
import com.cg.cbs.pf.exception.InvalidDetailsException;

public interface PaymentFeedbackService {

	Payment addPayment (TripDetails tripDetails);
	
	Report updateReport(TripDetails tripDetails);
	
	Customer updateCustomer(double wallet, double finalFare);
	
}
