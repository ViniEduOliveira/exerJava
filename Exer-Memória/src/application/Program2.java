package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Rent;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		Rent[] vet = new Rent[10];
		
		System.out.print("How many room will be rentend: ");
		int n = sc.nextInt();
		sc.nextLine();
	
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + (i));
			System.out.print("Name:");
			String name = sc.nextLine();
			System.out.print("Email:");
			String email = sc.nextLine();
			System.out.print("Room:");
			int room = sc.nextInt();
			sc.nextLine();
			
			
			
			vet[room] = new Rent(name, email);
			
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] != null) {
				System.out.println(i + ": " + vet[i]);
			}
		}
		
		
		
		sc.close();
	}

}
