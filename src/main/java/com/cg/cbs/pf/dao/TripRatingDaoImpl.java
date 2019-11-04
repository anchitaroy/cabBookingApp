package com.cg.cbs.pf.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.cbs.pf.dto.Booking;
import com.cg.cbs.pf.dto.Driver;
import com.cg.cbs.pf.dto.TripDetails;

@Repository
public class TripRatingDaoImpl implements TripRatingDao {

	@Autowired
	private EntityManager mgr;
	
	@Override
	public Booking updateTripRating(Booking booking) {
		mgr.merge(booking);
		return booking;
	}

}
