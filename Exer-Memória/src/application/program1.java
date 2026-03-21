package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.People;

public class program1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas seram cadastradas?: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		People[] vet = new People[n];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Casastro da " + (i + 1) + "° pessoa");
			System.out.print("Nome da pessoa: ");
			String name = sc.nextLine();
			System.out.print("Idade da pessoa: ");
			int years = sc.nextInt();
			System.out.print("Altura da pessoa: ");
			double height = sc.nextDouble();
			sc.nextLine();
			System.out.println();
			
			vet[i] = new People(name, years, height);
		}
		double soma = 0;
		
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i].getHeight();
		}
		
		double media = soma / vet.length;
		System.out.printf("Média de altura: %.2f", media);
		
		
		for (int i = 0; i < vet.length; i++) {
			if(vet[i].getYears() < 16) {
				
			}
		}
		
		
		sc.close();
		
	}
}
