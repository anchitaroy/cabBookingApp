package com.cg.cbs.pf.dao;

import com.cg.cbs.pf.dto.Customer;
import com.cg.cbs.pf.dto.TripDetails;

public interface CustomerWalletDao {

	Customer updateCustWallet(double wallet, double finalFare);
	
}