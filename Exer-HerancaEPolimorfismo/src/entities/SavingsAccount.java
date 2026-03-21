package entities;

public class SavingsAccount extends account {
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double savingsAccount) {
		super(number, holder, balance);
		this.interestRate = savingsAccount;
	}

	public Double getSavingsAccount() {
		return interestRate;
	}

	public void setSavingsAccount(Double savingsAccount) {
		this.interestRate = savingsAccount;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	
}
