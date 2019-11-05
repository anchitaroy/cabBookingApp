package com.cg.cbs.pf.web;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.cbs.pf.dto.Customer;
import com.cg.cbs.pf.dto.Payment;
import com.cg.cbs.pf.dto.Report;
import com.cg.cbs.pf.dto.TripDetails;
import com.cg.cbs.pf.service.PaymentFeedbackService;

@CrossOrigin(origins = "http://localhost:4200")
@Transactional
@RestController
@RequestMapping("/paymentsfeedback")
public class PaymentsFeedbackController {

	@Autowired
	private PaymentFeedbackService service;
	
	@PostMapping(value="/payment", produces = "application/json", consumes = "application/json")
	public Payment addPayment(@RequestBody TripDetails tripDetails) {
		return service.addPayment(tripDetails);
	}
	
	@PostMapping(value = "/updateFeedback", produces = "application/json", consumes = "application/json")
	public Report updateReport(@RequestBody TripDetails tripDetails) {
		return service.updateReport(tripDetails);
	}
	
}
