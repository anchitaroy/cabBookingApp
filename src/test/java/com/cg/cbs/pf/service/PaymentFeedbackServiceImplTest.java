package com.cg.cbs.pf.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.cbs.pf.dto.TripDetails;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PaymentFeedbackServiceImplTest {
	
	@Autowired
	private PaymentFeedbackService service;

	@Test
	public void testAddPayment() {
		TripDetails trip = new TripDetails();
		trip.setBookingId(1);
		trip.setCustomerId(11);
		trip.setDriverId(111);
		trip.setTripId(7);
		trip.setFinalFare(350.0);
		trip.setIssues("No Issues");
		trip.setWallet(675.0);
		List<TripDetails> tr = new ArrayList<TripDetails>();
		tr.add(trip);
		System.out.println(service.addPayment(trip));
	}

	@Test
	public void testUpdateReport() {
		TripDetails trip = new TripDetails();
		trip.setBookingId(1);
		trip.setCustomerId(11);
		trip.setDriverId(111);
		trip.setTripId(7);
		trip.setFinalFare(350.0);
		trip.setIssues("No Issues");
		trip.setWallet(675.0);
		List<TripDetails> tr = new ArrayList<TripDetails>();
		tr.add(trip);
		System.out.println(service.updateReport(trip));
	}

	@Test
	public void testUpdateCustomer() {
		double finalFare = 350.0;
		double wallet = 675.0;
		System.out.println(service.updateCustomer(wallet, finalFare));
	}

}
