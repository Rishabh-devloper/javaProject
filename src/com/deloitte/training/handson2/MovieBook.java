package com.deloitte.training.handson2;

public class MovieBook {
	private String custName;
	private String movName;
	private int SeatCount;
	private int bookingAmt;
	private int bookingTyp;
	
	
	
	
	public MovieBook(String custName, String movName, int seatCount, int bookingAmt, int bookingTyp) {
		super();
		this.custName = custName;
		this.movName = movName;
		SeatCount = seatCount;
		this.bookingAmt = bookingAmt;
		this.bookingTyp = bookingTyp;
	}
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getMovName() {
		return movName;
	}
	public void setMovName(String movName) {
		this.movName = movName;
	}
	public int getSeatCount() {
		return SeatCount;
	}
	public void setSeatCount(int seatCount) {
		SeatCount = seatCount;
	}
	public int getBookingAmt() {
		return bookingAmt;
	}
	public void setBookingAmt(int bookingAmt) {
		this.bookingAmt = bookingAmt;
	}
	public int getBookingTyp() {
		return bookingTyp;
	}
	public void setBookingTyp(int bookingTyp) {
		this.bookingTyp = bookingTyp;
	}

	@Override
	public String toString() {
		return "MovieBook [custName=" + custName + ", movName=" + movName + ", SeatCount=" + SeatCount + ", bookingAmt="
				+ bookingAmt + ", bookingTyp=" + bookingTyp + "]";
	}
	
	
}
