package application;

import entities.SavingsAccount;
import entities.account;
import entities.buninessAccount;

public class program {

	public static void main(String[] args) {
	
		account acc = new account(1001, "Vinicius", 0.0);
		buninessAccount bacc = new buninessAccount(1002, "Giulia", 0.0, 500.0);
		
		// UPCASTING
		account acc1 = bacc;
		account acc2 = new buninessAccount(1002, "Pedro", 0.0, 200.0);
		account acc3 = new SavingsAccount(1003, "Alex", 300.0, 0.01);
		
		//DOWNCASTING
		buninessAccount acc4 = (buninessAccount)acc2;
		acc4.loan(700.0);
		
		
		
		if (acc3 instanceof buninessAccount) {
			buninessAccount acc5 = (buninessAccount)acc3;
			acc5.loan(500.0);
			System.out.println("loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
		
	}

}
