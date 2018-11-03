package com.cg.bookingsystem.util;

import java.util.ArrayList;
import java.util.List;

import com.cg.bookingsystem.dto.BookingBean;

public class Database {
	private static List<Integer> ownerList = new ArrayList<>();
	private static List<Integer> flatBookList = new ArrayList<>();
	public static List<Integer> getOwnerList() {
		ownerList.add(1);
		ownerList.add(2);
		ownerList.add(3);
		return ownerList;
	}

	public static void flatRegistration(BookingBean bean) {
		flatBookList.add(bean.getRegistrationId());
		
	}

}
