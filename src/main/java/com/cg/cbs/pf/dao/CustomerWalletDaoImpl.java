package com.cg.cbs.pf.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.cbs.pf.dto.Customer;
import com.cg.cbs.pf.dto.TripDetails;

@Repository
public class CustomerWalletDaoImpl implements CustomerWalletDao {

	@Autowired
	private EntityManager mgr;
	
	Customer customer = new Customer();
	
	@Override
	public Customer updateCustWallet(double wallet, double finalFare) {
		double newWallet = wallet-finalFare;
		customer.setWallet(newWallet);
		mgr.merge(customer);
		return customer;
	}

}
