package com.cg.cbs.pf.dao;

import com.cg.cbs.pf.dto.Booking;
import com.cg.cbs.pf.dto.Report;
import com.cg.cbs.pf.dto.TripDetails;

public interface FeedbackDao {

	Report update(TripDetails tripDetails);
}
