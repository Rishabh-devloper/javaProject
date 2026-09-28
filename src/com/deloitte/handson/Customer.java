package com.deloitte.handson;

public class Customer {
	private String name;
	private String pNo;
	private String City;
	private int totalOrder;
	private String favCat;
	
	
	
	
	
	public Customer(String name, String pNo, String city, int totalOrder, String favCat) {
		super();
		this.name = name;
		this.pNo = pNo;
		City = city;
		this.totalOrder = totalOrder;
		this.favCat = favCat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getpNo() {
		return pNo;
	}
	public void setpNo(String pNo) {
		this.pNo = pNo;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getTotalOrder() {
		return totalOrder;
	}
	public void setTotalOrder(int totalOrder) {
		this.totalOrder = totalOrder;
	}
	public String getFavCat() {
		return favCat;
	}
	public void setFavCat(String favCat) {
		this.favCat = favCat;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", pNo=" + pNo + ", City=" + City + ", totalOrder=" + totalOrder + ", favCat="
				+ favCat + "]";
	}
	
	
	
	
}
