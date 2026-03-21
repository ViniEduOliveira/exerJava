package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.bank;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		bank bk;
		
		
		System.out.printf("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.printf("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.printf("Is there na initial deposit ? (y/n): ");
		char response = sc.next().charAt(0);
		
		
		
		if (response == 'y') {
			System.out.printf("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bk = new bank(number, holder, initialDeposit);
		} else {
			bk = new bank(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bk);
		
		System.out.println();
		System.out.printf("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		bk.deposit(depositValue);
		
		System.out.println();
		System.out.println("Updated data: ");
		System.out.println(bk);
		
		System.out.println();
		System.out.printf("Enter a withdraw value: ");
		double amount = sc.nextDouble();
		bk.withdraw(amount);
		
		System.out.println(bk.getDeposit());
		
		System.out.println();
		System.out.println("Updated data: ");
		System.out.println(bk);
		
		
		sc.close();

	}

}
