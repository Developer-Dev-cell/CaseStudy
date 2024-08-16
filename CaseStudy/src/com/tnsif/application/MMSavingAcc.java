package com.tnsif.application;

import com.tnsif.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{

	private static final float minBal=500.0f;

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
	}
	
	public void withdraw(float accBal) {
		System.out.println("available balance is: " + accBal);
		System.out.println("withdrawl limit: " + (accBal - 500.0f));
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}


}
