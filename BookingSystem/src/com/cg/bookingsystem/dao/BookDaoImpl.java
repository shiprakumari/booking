package com.cg.bookingsystem.dao;

import java.util.List;

import com.cg.bookingsystem.dto.BookingBean;
import com.cg.bookingsystem.util.Database;

public class BookDaoImpl implements IBookDao {

	@Override
	public List<Integer> getOwnerList() {
		// TODO Auto-generated method stub
		return Database.getOwnerList();
	}

	@Override
	public void flatRegistration(BookingBean bean) {
		// TODO Auto-generated method stub
		 Database.flatRegistration(bean);
	}

}
