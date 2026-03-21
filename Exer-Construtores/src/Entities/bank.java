package Entities;

public class bank {
	private int number;
	private String holder;
	private double balance;

	
	public bank() {	
	}
	
	public bank(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public bank(int number, String name) {
		this.number = number;
		this.holder = name;
	}
	
	public int getAccount() {
		return number;
	}
	
	public String getName() {
		return holder;
	}
	
	public void setName(String holder) {
		this.holder = holder;
	}
	
	public double getDeposit() {
		return balance;
	}
	
	public void deposit(double depositValue) {
		this.balance += depositValue;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + 5;
	}
	
	public String toString() {
		return "Account: " 
		+ number
		+", "
		+ "Name: " 
		+ holder
		+", "
		+"Balance: $" 
		+ 
		String.format("%.2f", balance);

	}
}
	
	

