package com.cg.cbs.pf.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.cbs.pf.dto.Customer;
import com.cg.cbs.pf.dto.Payment;
import com.cg.cbs.pf.dto.TripDetails;
import com.cg.cbs.pf.exception.InvalidDetailsException;

@Repository
public class PaymentDaoImpl implements PaymentDao {

	@Autowired
	private EntityManager mgr;
	
	Payment payment = new Payment();
	
	@Override
	public Payment add(TripDetails tripDetails) {
		int pCustId = tripDetails.getCustomerId();
		int pDriverId = tripDetails.getDriverId();
		int pBookingId = tripDetails.getBookingId();
		double pFinalFare = tripDetails.getFinalFare();
		payment.setCustomerId(pCustId);
		payment.setDriverId(pDriverId);
		payment.setBookingId(pBookingId);
		payment.setFinalFare(pFinalFare);
		mgr.persist(payment);
		return payment;
	}
}
