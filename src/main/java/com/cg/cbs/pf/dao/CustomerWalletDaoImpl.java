package com.cg.cbs.pf.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.cbs.pf.dto.Booking;
import com.cg.cbs.pf.dto.Customer;
import com.cg.cbs.pf.dto.TripDetails;

@Repository
public class CustomerWalletDaoImpl implements CustomerWalletDao {

	@Autowired
	private EntityManager mgr;
	
	Customer customer = new Customer();
	
	@Override
	public Customer updateCustWallet(TripDetails tripDetails) {
		double cFinalFare = tripDetails.getFinalFare();
		double cWallet = tripDetails.getWallet();
		double newWallet = cWallet-cFinalFare;
		customer.setWallet(newWallet);
		mgr.merge(customer);
		return customer;
	}

}
