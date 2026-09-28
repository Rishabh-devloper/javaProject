package com.deloitte.client;

import com.deloitte.entity.RBI;

public class classone {

	public static void main(String[] args) {
		RBI bank1= new IciciBank();
		bank1.depositMoney();//this is hidning the implementaion of abstract
	}
}
