package com.tnsif.client;


import com.tnsif.application.MMCurrentAcc;
import com.tnsif.application.MMSavingAcc;
import com.tnsif.application.MMBankFactory;
import com.tnsif.framework.BankFactory;
import com.tnsif.framework.CurrentAcc;
import com.tnsif.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		
		SavingAcc sa = new MMSavingAcc(345432344, "Apurva", 4000, false);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		
		CurrentAcc ca = new MMCurrentAcc(543452344, "Ritesh", 50000, 10000);
		ca.withdraw(ca.getCreditLimit());
		ca.toString();

	}

}
