package com.tnsif.application;

import com.tnsif.framework.BankFactory;
import com.tnsif.framework.CurrentAcc;
import com.tnsif.framework.SavingAcc;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		SavingAcc savingacc = new MMSavingAcc(accNo, accNm, accBal, isSalary);
		return savingacc;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc currentacc = new MMCurrentAcc(accNo, accNm, creditLimit, creditLimit);
		return currentacc;
	}

}
