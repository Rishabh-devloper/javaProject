package com.deloitte.client;

import com.deloitte.entity.RBI;

public class IciciBank implements RBI {

	@Override
	public void depositMoney() {
		// TODO Auto-generated method stub
		System.out.println("min Deposited money is 50000");
	}

	@Override
	public void WithdrawMoney() {
		// TODO Auto-generated method stub
		System.out.println("max withdraw is 50000");
		
	}

	@Override
	public void lockerAccess() {
		// TODO Auto-generated method stub
		System.out.println("yes locker acces provided");
	}
	public void createBank() {
		System.out.println("hi");
	}

}
