package com.cg.bookingsystem.dto;

public class BookingBean {
	private int registrationId;
	private String flatType;
	private int flatArea;
	private double flatRent;
	private double flatDeposit;
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public String getFlatType() {
		return flatType;
	}
	public void setFlatType(String flatType) {
		this.flatType = flatType;
	}
	public int getFlatArea() {
		return flatArea;
	}
	public void setFlatArea(int flatArea) {
		this.flatArea = flatArea;
	}
	public double getFlatRent() {
		return flatRent;
	}
	public void setFlatRent(double flatRent) {
		this.flatRent = flatRent;
	}
	public double getFlatDeposit() {
		return flatDeposit;
	}
	public void setFlatDeposit(double flatDeposit) {
		this.flatDeposit = flatDeposit;
	}
	@Override
	public String toString() {
		return "BookingBean [registrationId=" + registrationId + ", flatType="
				+ flatType + ", flatArea=" + flatArea + ", flatRent="
				+ flatRent + ", flatDeposit=" + flatDeposit
				+ ", getRegistrationId()=" + getRegistrationId()
				+ ", getFlatType()=" + getFlatType() + ", getFlatArea()="
				+ getFlatArea() + ", getFlatRent()=" + getFlatRent()
				+ ", getFlatDeposit()=" + getFlatDeposit() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
