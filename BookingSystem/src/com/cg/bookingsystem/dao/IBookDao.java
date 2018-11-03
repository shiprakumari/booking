package com.cg.bookingsystem.dao;

import java.util.List;

import com.cg.bookingsystem.dto.BookingBean;

public interface IBookDao {

	List<Integer> getOwnerList();

	void flatRegistration(BookingBean bean);

}
