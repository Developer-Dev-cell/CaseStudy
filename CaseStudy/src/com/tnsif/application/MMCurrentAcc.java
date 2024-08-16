package com.tnsif.application;

import com.tnsif.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}

	public void withdraw(float creditLimit) {
		System.out.println("Your current account balance is: " + getAccBal());
		System.out.println("Your credit limit is: " + creditLimit);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
}
