package com.tyss.custome_exception.customechechkedexception;

public class ATMSimulator {

	double balance = 40000;

	public void withDraw(double amount) throws InsufficientBalanceException {

		if (amount <= 0) {
			throw new InsufficientBalanceException("Invalid Amount");
		} else if (amount <= balance) {
			System.out.println("Withdraw Successful");
		} else {
			throw new InsufficientBalanceException("Insufficient Balance");
		}
	}

}
