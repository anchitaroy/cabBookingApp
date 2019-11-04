package com.cg.cbs.pf.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.cbs.pf.dto.Booking;
import com.cg.cbs.pf.dto.Report;
import com.cg.cbs.pf.dto.TripDetails;

@Repository
public class FeedbackDaoImpl implements FeedbackDao {

	@Autowired
	private EntityManager mgr;
	
	Report report = new Report(); 
	
	@Override
	public Report update(TripDetails tripDetails) {
		int fBookingId = tripDetails.getBookingId();
		int fCustomerId = tripDetails.getCustomerId();
		int fDriverId = tripDetails.getDriverId();
		String fIssues = tripDetails.getIssues();
		report.setBookingId(fBookingId);
		report.setCustomerId(fCustomerId);
		report.setDriverId(fDriverId);
		report.setIssues(fIssues);
		mgr.merge(report);
		return report;
	}
}
