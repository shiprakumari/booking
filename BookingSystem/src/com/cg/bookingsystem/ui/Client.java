package com.cg.bookingsystem.ui;

import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.cg.bookingsystem.dto.BookingBean;
import com.cg.bookingsystem.service.BookServiceImpl;
import com.cg.bookingsystem.service.IBookService;

public class Client {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	IBookService bookService = new BookServiceImpl();
	BookingBean bean = new BookingBean();
	
	List<Integer> ownerList = bookService.getOwnerList(); 
	
	
	
	System.out.println("Select Owner ID");
	System.out.println(ownerList);
	System.out.println("enter owner id");
	int registrationId =(int) (Math.random()*10000);
	bean.setRegistrationId(registrationId);
	
	int choice = scanner.nextInt();
	/*if(choice==1){
		System.out.println("qwner id 1");
	}
	else if(choice==2){
			System.out.println("qwner id 2");
		}
	else if(choice==3){
				System.out.println("qwner id 3");
			}
			else{
				System.err.println("enteer correct option ");
				
		
	}*/
	
	//set flat Type 
	System.out.println("Select the flat type");
	System.out.println("1. 1-BHK \n 2. 2-BHK \n ");
	int type = scanner.nextInt();
	if(type==1){
		bean.setFlatType("1-BHk");
	}else if(type==2){
		bean.setFlatType("2-BHK");
	}
	bookService.flatRegistration(bean);
	//set flat area
	System.out.println("Enter the flat area in sq root");
	//flateArea = scanner.nextInt();
	bean.setFlatArea(650);
	bookService.flatRegistration(bean);
	//
	//set falt rent
	System.out.println("enter the flat rent");
	double flatRent= scanner.nextDouble();
	System.out.println("enter the flat deposit");
	double flatDeposit= scanner.nextDouble();
	if(flatRent<flatDeposit){
		bean.setFlatRent(flatRent);
		bean.setFlatDeposit(flatDeposit);
		bookService.flatRegistration(bean);
		System.out.println("booked with id "+bean.getRegistrationId());
		
	}
	else{
		System.err.println("deposit amount can't be less than rent amount");
	}
	
	
		


	
	
	/*
		System.out.println("Please enter your owner id from the above list");
		int choice= scanner.nextInt();
		int count = 1;
		
		*/
		
	
	
}
}


