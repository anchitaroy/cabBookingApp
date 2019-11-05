package com.cg.cbs.pf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.cbs.pf.dao.CustomerWalletDao;
import com.cg.cbs.pf.dao.FeedbackDao;
import com.cg.cbs.pf.dao.PaymentDao;
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
	private CustomerWalletDao cdao;
	
	@Override
	public Payment addPayment(TripDetails tripDetails) {
		double wallet = tripDetails.getWallet();
		double finalFare = tripDetails.getFinalFare();
		updateCustomer(wallet, finalFare);
		return pdao.add(tripDetails);
	}
	
	@Override
	public Report updateReport(TripDetails tripDetails) {
		return fdao.update(tripDetails);
	}

	@Override
	public Customer updateCustomer(double wallet, double finalFare) {
		return cdao.updateCustWallet(wallet, finalFare);
	}

}
