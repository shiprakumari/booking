package com.cg.bookingsystem.service;

import java.util.List;

import com.cg.bookingsystem.dto.BookingBean;

public interface IBookService {

	List<Integer> getOwnerList();

	void flatRegistration(BookingBean bean);

}
