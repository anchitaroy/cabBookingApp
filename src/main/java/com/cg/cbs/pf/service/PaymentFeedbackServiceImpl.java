package com.cg.cbs.pf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.cbs.pf.dao.CustomerWalletDao;
import com.cg.cbs.pf.dao.FeedbackDao;
import com.cg.cbs.pf.dao.PaymentDao;
import com.cg.cbs.pf.dao.TripRatingDao;
import com.cg.cbs.pf.dto.Booking;
import com.cg.cbs.pf.dto.Customer;
import com.cg.cbs.pf.dto.Payment;
import com.cg.cbs.pf.dto.Report;
import com.cg.cbs.pf.dto.TripDetails;
import com.cg.cbs.pf.exception.InvalidDetailsException;

@Service
@Transactional(rollbackFor = InvalidDetailsException.class)
public class PaymentFeedbackServiceImpl implements PaymentFeedbackService {

	@Autowired
	private PaymentDao pdao;
	@Autowired
	private FeedbackDao fdao;
	@Autowired
	private TripRatingDao tdao;
	@Autowired
	private CustomerWalletDao cdao;
	
	@Override
	public Payment addPayment(TripDetails tripDetails) {
		updateCustomer(tripDetails);
		return pdao.add(tripDetails);
	}

	@Override
	public Booking updateBooking(Booking booking) {
		return tdao.updateTripRating(booking);
	}
	
	@Override
	public Report updateReport(TripDetails tripDetails) {
		return fdao.update(tripDetails);
	}

	@Override
	public Customer updateCustomer(TripDetails tripDetails) {
		return cdao.updateCustWallet(tripDetails);
	}

}
