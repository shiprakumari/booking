package com.cg.bookingsystem.service;

import java.util.List;

import com.cg.bookingsystem.dao.BookDaoImpl;
import com.cg.bookingsystem.dao.IBookDao;
import com.cg.bookingsystem.dto.BookingBean;

public class BookServiceImpl implements IBookService {
	IBookDao dao = new BookDaoImpl();

	@Override
	public List<Integer> getOwnerList() {
		// TODO Auto-generated method stub
		return dao.getOwnerList();
	}

	@Override
	public void flatRegistration(BookingBean bean) {
		 dao.flatRegistration(bean);
	}

}
